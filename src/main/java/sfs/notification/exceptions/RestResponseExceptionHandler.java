package sfs.notification.exceptions;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Provider
public class RestResponseExceptionHandler implements ExceptionMapper<NotificationException> 
{
    private static final Logger logger = LoggerFactory.getLogger(RestResponseExceptionHandler.class);

	public Response toResponse(NotificationException exception) {
        String validationErrorMsg = exception.getMessage();

        logger.info("Report Provider Exception Message: {}",validationErrorMsg);

    	return Response.status(exception.getStatus()).entity(exception.getSource()).build();  
	}
}