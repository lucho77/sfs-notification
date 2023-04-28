package sfs.notification.controllers;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import sfs.notification.sfsTemplateProviderConfiguration;
import sfs.notification.services.IHomeService;


@Path("")
public class HomeController {

	@Inject
	IHomeService homeService;
	
	@GET
	@Path("/")
	@Produces(MediaType.TEXT_PLAIN)
    public Object home() {
        return "Hello from SFS MS template provider";
    }

	@GET
	@Path("/ping")
	@Produces(MediaType.TEXT_PLAIN)
    public Object ping() {
        return "Hello from SFS template provider ping";
    }

	@GET
	@Path("/version")
	@Produces(MediaType.APPLICATION_JSON)
    public Object version() {
        return new sfsTemplateProviderConfiguration().getBuildInfo();
    }
	
	@GET
	@Path("/pingServices")
	@Produces(MediaType.TEXT_PLAIN)
    public Object pingServices() {
        return homeService.pingService();
    }

}