package sfs.notification.util;

import java.io.IOException;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.ext.Provider;

@Provider   
public class CorsFilter implements ContainerResponseFilter {
  @Override
  public void filter(ContainerRequestContext requestContext, ContainerResponseContext responseContext) throws IOException {
	System.out.println("sfs.framework.rest.CORSResponseFilter: "        + requestContext.getUriInfo().getAbsolutePath());
	System.out.println("sfs.framework.rest.CORSResponseFilter: Method " + requestContext.getMethod());
	String origin = requestContext.getHeaderString("Origin");
	if (origin != null) {
	    responseContext.getHeaders().add("Access-Control-Allow-Origin", origin);
	}
	  //responseContext.getHeaders().add("Access-Control-Allow-Origin", "*");
    responseContext.getHeaders().add("Access-Control-Allow-Headers", "origin, content-type, accept, authorization");
    responseContext.getHeaders().add("Access-Control-Allow-Credentials", "true");
    responseContext.getHeaders().add("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD");
    responseContext.getHeaders().add("Access-Control-Max-Age", "100000");
  }
}
