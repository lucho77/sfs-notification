package sfs.notification.exceptions;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;

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