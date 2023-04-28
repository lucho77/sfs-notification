package sfs.notification.notification;

import javax.enterprise.context.ApplicationScoped;
import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;

import sfs.notification.dtos.LoginDTO;

@ServerEndpoint("/sfs-websocket")
@ApplicationScoped
public class NotificationSocket {

    @OnOpen
    public void onOpen(Session session, LoginDTO loginDTO) {
    }

    @OnClose
    public void onClose(Session session, LoginDTO loginDTO) {
    }
    public void onError(Session session, @PathParam("name") String name, Throwable throwable) {
    }

    @OnMessage
    public void onMessage(String message, LoginDTO loginDTO) {
    }
}
