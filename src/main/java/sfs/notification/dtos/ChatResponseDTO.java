package sfs.notification.dtos;

import java.util.List;

public class ChatResponseDTO  {
	boolean deploying;
	boolean esUsuario;
	List<String[]> chatsAbiertos;
	List<String> grupos;
	private ChatPojo chatPojo;
	private List<ChatPojo> chatPojos;
	private List<String> usuariosMesa;
	private List<NotificaPojo> notificaPojos;
	private NotificaPojo notificaPojo;
	public boolean isDeploying() {
		return deploying;
	}
	public void setDeploying(boolean deploying) {
		this.deploying = deploying;
	}
	public boolean isEsUsuario() {
		return esUsuario;
	}
	public void setEsUsuario(boolean esUsuario) {
		this.esUsuario = esUsuario;
	}
	public List<String[]> getChatsAbiertos() {
		return chatsAbiertos;
	}
	public void setChatsAbiertos(List<String[]> chatsAbiertos) {
		this.chatsAbiertos = chatsAbiertos;
	}
	public List<String> getGrupos() {
		return grupos;
	}
	public void setGrupos(List<String> grupos) {
		this.grupos = grupos;
	}
	public ChatPojo getChatPojo() {
		return chatPojo;
	}

	public void setChatPojo(ChatPojo chatPojo) {
		this.chatPojo = chatPojo;
	}
	public List<ChatPojo> getChatPojos() {
		return chatPojos;
	}
	public void setChatPojos(List<ChatPojo> chatPojos) {
		this.chatPojos = chatPojos;
	}
	public List<NotificaPojo> getNotificaPojos() {
		return notificaPojos;
	}
	public void setNotificaPojos(List<NotificaPojo> notificaPojos) {
		this.notificaPojos = notificaPojos;
	}
	public NotificaPojo getNotificaPojo() {
		return notificaPojo;
	}
	public void setNotificaPojo(NotificaPojo notificaPojo) {
		this.notificaPojo = notificaPojo;
	}
	public List<String> getUsuariosMesa() {
		return usuariosMesa;
	}
	public void setUsuariosMesa(List<String> usuariosMesa) {
		this.usuariosMesa = usuariosMesa;
	}
	
	
	
}
