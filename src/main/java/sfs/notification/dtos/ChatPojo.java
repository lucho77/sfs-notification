package sfs.notification.dtos;

import java.util.Date;

public class ChatPojo {

	int id;
	String de;
	String para;
	String deUID;
	String paraUID;
	String image;
	Date fecha;
	String alias;

	boolean leido = false;
	boolean tomadaPorMi = false;
	
	String caputar;
	String mensaje;

	boolean pasado;
	boolean cerrada;

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
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}
	public boolean isTomadaPorMi() {
		return tomadaPorMi;
	}
	public void setTomadaPorMi(boolean tomadaPorMi) {
		this.tomadaPorMi = tomadaPorMi;
	}
	public boolean isPasado() {
		return pasado;
	}
	public void setPasado(boolean pasado) {
		this.pasado = pasado;
	}
	public boolean isCerrada() {
		return cerrada;
	}
	public void setCerrada(boolean cerrada) {
		this.cerrada = cerrada;
	}

	
	
	
}
