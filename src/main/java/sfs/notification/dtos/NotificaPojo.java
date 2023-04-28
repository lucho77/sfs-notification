package sfs.notification.dtos;

public class NotificaPojo {

	int id;
	String de;
	String para;
	String deUID;
	String paraUID;
	String image;
	String hora;
	String pregunta;
	String opciones;
	String respuesta;
	String avance;
	String idImpresion;
	String idTab;
	
	
	
	String ws;
	String usuario;
	String datasource;

	public String getAvance() {
		return avance;
	}
	public void setAvance(String avance) {
		this.avance = avance;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	boolean leido = false;
	boolean esPregunta= false;
	
	String caputar;
	
	String logs;
	
	
	public boolean isEsPregunta() {
		return esPregunta;
	}
	public void setEsPregunta(boolean esPregunta) {
		this.esPregunta = esPregunta;
	}
	String mensaje;
	public int  getId() {
		return id;
	}
	public boolean isLeido() {
		return leido;
	}
	public void setLeido(boolean leido) {
		this.leido = leido;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDe() {
		return de;
	}
	public void setDe(String de) {
		this.de = de;
	}
	public String getPara() {
		return para;
	}
	public void setPara(String para) {
		this.para = para;
	}
	public String getCaputar() {
		return caputar;
	}
	public void setCaputar(String caputar) {
		this.caputar = caputar;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	public String getDeUID() {
		return deUID;
	}
	public void setDeUID(String deUID) {
		this.deUID = deUID;
	}
	public String getParaUID() {
		return paraUID;
	}
	public void setParaUID(String paraUID) {
		this.paraUID = paraUID;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getLogs() {
		return logs;
	}
	public void setLogs(String logs) {
		this.logs = logs;
	}
	public String getPregunta() {
		return pregunta;
	}
	public void setPregunta(String pregunta) {
		this.pregunta = pregunta;
	}
	public String getOpciones() {
		return opciones;
	}
	public void setOpciones(String opciones) {
		this.opciones = opciones;
	}
	public String getRespuesta() {
		return respuesta;
	}
	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}
	public String getWs() {
		return ws;
	}
	public void setWs(String ws) {
		this.ws = ws;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getDatasource() {
		return datasource;
	}
	public void setDatasource(String datasource) {
		this.datasource = datasource;
	}
	
	public String getIdImpresion() {
		return idImpresion;
	}
	public void setIdImpresion(String idImpresion) {
		this.idImpresion = idImpresion;
	}
	public void setIdTab(String idTab) {
		this.idTab = idTab;
	}
	public String getIdTab() {
		return idTab;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.usuario.toString();
	}
	
}
