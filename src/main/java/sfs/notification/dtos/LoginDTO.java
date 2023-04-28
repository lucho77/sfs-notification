package sfs.notification.dtos;

public class LoginDTO {

	  private String  username;
	  private String  pass;
	  private String datasource;
	  private Long idUsuarioUra;
	  private Long idAplica;
	  private String webservice;
	  private String packageModel;
	  private String token;
	  private String metodo;
	  private boolean mostrarInfoArea;
	  private boolean usuarioMesa;
	  private String aplicacion;
	  private boolean regionalizacion;
	  private String mail;
	  private String reporteInicio;

	  
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getDatasource() {
		return datasource;
	}
	public void setDatasource(String datasource) {
		this.datasource = datasource;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
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
	public boolean isMostrarInfoArea() {
		return mostrarInfoArea;
	}
	public void setMostrarInfoArea(boolean mostrarInfoArea) {
		this.mostrarInfoArea = mostrarInfoArea;
	}
	public String getMetodo() {
		return metodo;
	}
	public void setMetodo(String metodo) {
		this.metodo = metodo;
	}
	public Long getIdAplica() {
		return idAplica;
	}
	public void setIdAplica(Long idAplica) {
		this.idAplica = idAplica;
	}
	public boolean isUsuarioMesa() {
		return usuarioMesa;
	}
	public void setUsuarioMesa(boolean usuarioMesa) {
		this.usuarioMesa = usuarioMesa;
	}
	public String getAplicacion() {
		return aplicacion;
	}
	public void setAplicacion(String aplicacion) {
		this.aplicacion = aplicacion;
	}
	public boolean isRegionalizacion() {
		return regionalizacion;
	}
	public void setRegionalizacion(boolean regionalizacion) {
		this.regionalizacion = regionalizacion;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getReporteInicio() {
		return reporteInicio;
	}
	public void setReporteInicio(String reporteInicio) {
		this.reporteInicio = reporteInicio;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}

	
	  
}
