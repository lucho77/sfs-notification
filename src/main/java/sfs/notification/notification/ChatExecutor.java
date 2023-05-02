package sfs.notification.notification;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;
import javax.inject.Inject;

import org.eclipse.microprofile.reactive.messaging.Channel;
import org.eclipse.microprofile.reactive.messaging.Emitter;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.jboss.resteasy.reactive.multipart.FileUpload;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.quarkus.scheduler.Scheduled;
import sfs.notification.clients.NotificationService;
import sfs.notification.clients.UploadResource;
import sfs.notification.dtos.ChatResponseDTO;
import sfs.notification.dtos.LoginDTO;

@ApplicationScoped
public class ChatExecutor {
	Logger log = LoggerFactory.getLogger(ChatExecutor.class);
	List<LoginDTO> users = new ArrayList<>();
	@RestClient
	NotificationService notificationService;
	@RestClient
	UploadResource uploadResource;
	@Inject
	@Channel("idDeploying")
	Emitter<ChatResponseDTO> emitter;

	@Channel("getNewNotifica")
	Emitter<ChatResponseDTO> emitterNotifica;

	@Scheduled(every = "30s")
	public void isDeploying() {
		
		String fileName = null;
		File file = new File("/tmp/Ticket.pdf");
		try {
		    InputStream targetStream = new FileInputStream(file);
			uploadResource.multipart( "impresion-poliza-ms-dev","nuevo",targetStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


	
	/*
	@Scheduled(every = "1600s")
	public void isDeploying() {

		if (users.size() > 0) {

			ChatUtilDTO chatUtilDTO = new ChatUtilDTO();
			chatUtilDTO.setMetodo(ChatEnum.ISDEPLOYING.name());

			Config config = ConfigProvider.getConfig();
			chatUtilDTO.setDataSource(config.getValue("data.datasource", String.class));
			chatUtilDTO.setUsername(config.getValue("data.username", String.class));
			chatUtilDTO.setWebservice(config.getValue("data.webservice", String.class));
			chatUtilDTO.setPackageModel(config.getValue("data.packageModel", String.class));
			chatUtilDTO.setIdUsuarioUra(config.getValue("data.idUsuarioUra", Long.class));

			Gson gson = new Gson();
			String datosRequest = gson.toJson(chatUtilDTO, ChatUtilDTO.class);
			notificationService.chatUtil(datosRequest).subscribe().with(r -> {
				log.info("notification success isDeploying {} ", r.isDeploying());
				emitter.send(r);
			}, f -> {
				log.error(f.getMessage());
			});

		}
	}

	@Scheduled(every = "1230s")
	public void getNotificas() {

		if(users.size()>0) {
			//solo los datasources distintos
			List<LoginDTO> listDatasource = users.stream().map( l-> l.getDatasource())
                    .distinct().map(username-> users.stream().filter(u-> u.getDatasource().equalsIgnoreCase(username))).findFirst().get()
                    .collect(Collectors.toList());
			
			listDatasource.forEach(l ->{
				ChatUtilDTO chatUtilDTO = new ChatUtilDTO();
				chatUtilDTO.setMetodo(ChatEnum.GETNEWNOTIFICA.name());
				chatUtilDTO.setDataSource(l.getDatasource());
				chatUtilDTO.setUsername(l.getUsername());
				chatUtilDTO.setWebservice(l.getWebservice());
				chatUtilDTO.setPackageModel(l.getPackageModel());
				chatUtilDTO.setIdUsuarioUra(l.getIdUsuarioUra());

				Gson gson = new Gson();
				String datosRequest = gson.toJson(chatUtilDTO, ChatUtilDTO.class);
				notificationService.chatUtil(datosRequest).subscribe().with(r -> {
					log.info("notification success isDeploying {} ", r.isDeploying());
					emitterNotifica.send(r);
				}, f -> {
					log.error(f.getMessage());
				});
				
			});
			
			
		}
		

	}
*/
	public void adduser(@Observes LoginDTO loginDTO) {
		if (loginDTO.isDelete()) {
			users.remove(loginDTO);

		} else {
			users.add(loginDTO);

		}
	}
}
