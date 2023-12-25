//package sfs.notification.clients;
//
//import java.io.InputStream;
//
//import javax.ws.rs.Consumes;
//import javax.ws.rs.DELETE;
//import javax.ws.rs.POST;
//import javax.ws.rs.Path;
//import javax.ws.rs.Produces;
//import javax.ws.rs.QueryParam;
//import javax.ws.rs.core.MediaType;
//import javax.ws.rs.core.Response;
//
//import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
//import org.jboss.resteasy.reactive.PartType;
//import org.jboss.resteasy.reactive.RestForm;
//
//@Path("/s3/bm")
//@RegisterRestClient(configKey = "api-provider-file", baseUri = "http://localhost:9325/ms_provider_file")
//public interface UploadResource {
//
//	@DELETE
//	@Path("/deleteObject")
//	@Consumes(MediaType.APPLICATION_JSON)
//	@Produces(MediaType.APPLICATION_JSON)
//	public Response deleteFile(@QueryParam("bucketName") String bucketName, @QueryParam("fileName") String fileName);
//
//	@POST
//    @Path("/upload")
//    @Consumes(MediaType.MULTIPART_FORM_DATA)
//    @Produces(MediaType.APPLICATION_JSON)
//    public void multipart(@RestForm String bucketName,@RestForm String fileName,
//            @RestForm("file") @PartType(MediaType.APPLICATION_OCTET_STREAM) InputStream file); 
//	
//}
