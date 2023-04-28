package sfs.notification.dtos;

public class BuildInfoDTO {

	private String applicationName;
	private String version;
	private String lastBuild;
	private String branchWithCommitId;
	
	public String getVersion() {
		return version;
	}

	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}

	public String getApplicationName() {
		return applicationName;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getLastBuild() {
		return lastBuild;
	}

	public void setLastBuild(String lastBuild) {
		this.lastBuild = lastBuild;
	}

	public void setBranchWithCommitId(String branchWithCommitId) {
		this.branchWithCommitId = branchWithCommitId;
	}
	
	public String getBranchWithCommitId() {
		return branchWithCommitId;
	}
}


