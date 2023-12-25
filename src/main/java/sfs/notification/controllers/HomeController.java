package sfs.notification.controllers;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
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