package sfs.notification.clients;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import io.smallrye.mutiny.Uni;
import sfs.notification.dtos.ChatResponseDTO;


@Path("/framework/dina")
@RegisterRestClient(configKey = "ms-provider-report-api")
public interface NotificationService {

    @POST
    @Path("/chatUtil")
    @Produces(MediaType.APPLICATION_JSON)
    Uni<ChatResponseDTO>  chatUtil(String datos) throws Exception;

}


