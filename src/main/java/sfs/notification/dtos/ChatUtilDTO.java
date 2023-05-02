package sfs.notification.dtos;

import java.util.List;

public class ChatUtilDTO {

	private String username;
	private String dataSource;
	private Long idUsuarioUra;
	private String webservice;
	private String packageModel;
	private String token;

	private String metodo;
	private String para;
	private String mensaje;
	private String idSession;
	private boolean activo;
	private NotificaPojo notificaPojo;
	private ChatPojo chatPojo;
	private List<ChatPojo> chatPojos;
	private List<String> users;

	public String getMetodo() {
		return metodo;
	}

	public void setMetodo(String metodo) {
		this.metodo = metodo;
	}

	public String getIdSession() {
		return idSession;
	}

	public void setIdSession(String idSession) {
		this.idSession = idSession;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	public String getPara() {
		return para;
	}

	public void setPara(String para) {
		this.para = para;
	}

	public NotificaPojo getNotificaPojo() {
		return notificaPojo;
	}

	public void setNotificaPojo(NotificaPojo notificaPojo) {
		this.notificaPojo = notificaPojo;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public ChatPojo getChatPojo() {
		return chatPojo;
	}

	public void setChatPojo(ChatPojo chatPojo) {
		this.chatPojo = chatPojo;
	}

	public List<String> getUsers() {
		return users;
	}

	public void setUsers(List<String> users) {
		this.users = users;
	}

	public List<ChatPojo> getChatPojos() {
		return chatPojos;
	}

	public void setChatPojos(List<ChatPojo> chatPojos) {
		this.chatPojos = chatPojos;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}


	public Long getIdUsuarioUra() {
		return idUsuarioUra;
	}

	public void setIdUsuarioUra(Long idUsuarioUra) {
		this.idUsuarioUra = idUsuarioUra;
	}

	public String getWebservice() {
		return webservice;
	}

	public void setWebservice(String webservice) {
		this.webservice = webservice;
	}

	public String getPackageModel() {
		return packageModel;
	}

	public void setPackageModel(String packageModel) {
		this.packageModel = packageModel;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getDataSource() {
		return dataSource;
	}

	public void setDataSource(String dataSource) {
		this.dataSource = dataSource;
	}

	
}
