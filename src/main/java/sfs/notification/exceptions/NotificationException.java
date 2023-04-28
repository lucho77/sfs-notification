package sfs.notification.exceptions;

import javax.ws.rs.core.Response;

import sfs.notification.dtos.ReportStatusDTO;

public class NotificationException extends RuntimeException {

	private static final long serialVersionUID = 8530430896914720708L;
	private final Response.Status status;
	
	private final transient ReportStatusDTO source;
	
	public NotificationException(Response.Status status,ReportStatusDTO source) {
		super(source.getMsg());
		this.status = status;
		this.source = source;
	}

	public NotificationException(Exception e,ReportStatusDTO source) {
		super(e);
		this.status = Response.Status.INTERNAL_SERVER_ERROR;
		this.source = source;
	}
	
	public NotificationException(Response.Status status,Exception e,ReportStatusDTO source) {
		super(e);
		this.status = status;
		this.source = source;
	}

	public Response.Status getStatus() {
		return status;
	}
	
	public ReportStatusDTO getSource() {
		return source;
	}}
