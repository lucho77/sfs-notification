package sfs.notification;



import java.io.InputStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.ObjectMapper;

import sfs.notification.dtos.BuildInfoDTO;
import sfs.notification.dtos.GitInfoDTO;


public class sfsTemplateProviderConfiguration {

    private static final Logger logger = LoggerFactory.getLogger(sfsTemplateProviderConfiguration.class);

	final ObjectMapper mapper = new ObjectMapper();
    
    private static final String APP_NAME = "sfs-ms-template-provider";
    private static final String GIT_PROPERTIES_FILE = "git.properties";

    public sfsTemplateProviderConfiguration() {
    
    }   

    public BuildInfoDTO getBuildInfo() {
		BuildInfoDTO versionInfo = new BuildInfoDTO();
		versionInfo.setApplicationName(APP_NAME);
		try {
			InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream(GIT_PROPERTIES_FILE);
			
			GitInfoDTO gitInfo = mapper.readValue(is, GitInfoDTO.class);
			
			versionInfo.setVersion(gitInfo.getBuildVersion());
			versionInfo.setLastBuild(gitInfo.getBuildTime().toString());
			
			String branchWithCommitId = String.format("%s %s",gitInfo.getCommitIdAbbrev(),gitInfo.getBranch());
			versionInfo.setBranchWithCommitId(branchWithCommitId);
			
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		return versionInfo;
	}
}
