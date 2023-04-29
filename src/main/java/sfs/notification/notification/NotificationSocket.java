package sfs.notification.notification;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.enterprise.context.ApplicationScoped;
import javax.websocket.EndpointConfig;
import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

import com.google.gson.Gson;

import sfs.notification.dtos.LoginDTO;

@ServerEndpoint(value = "/sfs-websocket" )
@ApplicationScoped
public class NotificationSocket {
	Map<Session, LoginDTO> sessions = new ConcurrentHashMap<>(); 
    
	
	@OnOpen
    public void onOpen(Session session, EndpointConfig config) {
        //String login = (String) session.getUserProperties().get("login");
		sessions.put(session, new LoginDTO());
		
		System.out.println("a ver");
	}

    @OnClose
    public void onClose(Session session) {
    	sessions.remove(session);
    }
    public void onError(Session session,Throwable throwable) {
    }

    @OnMessage
    public void onMessage(Session session,String message) {
    	Gson gson = new Gson();
    	LoginDTO loginDTO = gson.fromJson(message, LoginDTO.class);
		System.out.println("mensaje: "+ loginDTO.getUsername());
		sessions.put(session, loginDTO);
		

    }
}
