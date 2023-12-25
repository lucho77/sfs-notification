package sfs.notification.notification;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.eclipse.microprofile.reactive.messaging.Incoming;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.Gson;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.event.Event;
import jakarta.inject.Inject;
import jakarta.websocket.EndpointConfig;
import jakarta.websocket.OnClose;
import jakarta.websocket.OnMessage;
import jakarta.websocket.OnOpen;
import jakarta.websocket.Session;
import jakarta.websocket.server.ServerEndpoint;
import sfs.notification.dtos.ChatResponseDTO;
import sfs.notification.dtos.LoginDTO;

@ServerEndpoint(value = "/sfs-websocket" )
@ApplicationScoped
public class NotificationSocket {
	@Inject 
	Event<LoginDTO> loginDtoAddedEvent;

	Map<Session, LoginDTO> sessions = new ConcurrentHashMap<>(); 
	Logger log = LoggerFactory.getLogger(NotificationSocket.class);
	
	@OnOpen
    public void onOpen(Session session, EndpointConfig config) {
		sessions.put(session, new LoginDTO());
	}

    @OnClose
    public void onClose(Session session) {
    	log.info("usuario {} ha perdido la conexion socket ", sessions.get(session).getUsername());
    	sessions.get(session).setDelete(true);
    	loginDtoAddedEvent.fire(sessions.get(session));
    	sessions.remove(session);
    }
    public void onError(Session session,Throwable throwable) {
    }

    @OnMessage
    public void onMessage(Session session,String message) {
    	Gson gson = new Gson();
    	LoginDTO loginDTO = gson.fromJson(message, LoginDTO.class);
    	loginDtoAddedEvent.fire(loginDTO);
    	log.info("usuario {} ",loginDTO.getUsername());
		sessions.put(session, loginDTO);
		

    }
    @Incoming("idDeploying")
    public void idDeploying(ChatResponseDTO chatResponseDTO) {
    	if(chatResponseDTO.isDeploying()) {
    		broadcast(chatResponseDTO);
    	}
    }

    @Incoming("getNewNotifica")
    public void getNewNotifica(ChatResponseDTO chatResponseDTO) {
    	if(chatResponseDTO.isDeploying()) {
    		broadcast(chatResponseDTO);
    	}
    }

    
    
    
    public void broadcast(ChatResponseDTO chatResponseDTO) {
        for (Session session : sessions.keySet()) {
            session.getAsyncRemote().sendObject(chatResponseDTO);
        }
    }
}
