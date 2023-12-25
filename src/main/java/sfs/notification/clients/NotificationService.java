package sfs.notification.clients;



import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import io.smallrye.mutiny.Uni;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import sfs.notification.dtos.ChatResponseDTO;


@Path("/api/framework/dina")
@RegisterRestClient(configKey = "api-framework-rest")
public interface NotificationService {

    @POST
    @Path("/chatUtil")
    @Produces(MediaType.APPLICATION_JSON)
    Uni<ChatResponseDTO>  chatUtil(String datos);

}


