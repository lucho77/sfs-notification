package sfs.notification.dtos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GitInfoDTO {
	
	@JsonProperty("git.branch")
	private String branch;

	@JsonProperty("git.build.host")
	private String buildHost; 
	@JsonProperty("git.build.time")
	private String buildTime; 
	@JsonProperty("git.build.user.email") 
	private String buildUserEmail;

	@JsonProperty("git.build.user.name") 
	private String buildUsername;

	@JsonProperty("git.build.version")
	private String buildVersion;

	@JsonProperty("git.closest.tag.commit.count") 
	private String closestTagCommitCount;

	@JsonProperty("git.closest.tag.name") 
	private String closestTagName;

	@JsonProperty("git.commit.id") 
	private String commitId;

	@JsonProperty("git.commit.id.abbrev") 
	private String commitIdAbbrev;

	@JsonProperty("git.commit.id.describe") 
	private String commitIdDescribe;

	@JsonProperty("git.commit.id.describe-short") 
	private String commitIdDescribeShort;

	@JsonProperty("git.commit.message.full") 
	private String commitMessageFull;

	@JsonProperty("git.commit.message.short") 
	private String commitMessageShort;

	@JsonProperty("git.commit.time") 
	private String commitTime;

	@JsonProperty("git.commit.user.email") 
	private String commitUserEmail;

	@JsonProperty("git.commit.user.name") 
	private String commitUsername;

	@JsonProperty("git.dirty") 
	private String dirty;

	@JsonProperty("git.remote.origin.url") 
	private String remoteOriginUrl;

	@JsonProperty("git.tags") 
	private String tags;

	
	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getBuildHost() {
		return buildHost;
	}

	public void setBuildHost(String buildHost) {
		this.buildHost = buildHost;
	}

	public String getBuildTime() {
		return buildTime;
	}

	public void setBuildTime(String buildTime) {
		this.buildTime = buildTime;
	}

	public String getBuildUserEmail() {
		return buildUserEmail;
	}

	public void setBuildUserEmail(String buildUserEmail) {
		this.buildUserEmail = buildUserEmail;
	}

	public String getBuildUsername() {
		return buildUsername;
	}

	public void setBuildUsername(String buildUsername) {
		this.buildUsername = buildUsername;
	}

	public String getBuildVersion() {
		return buildVersion;
	}

	public void setBuildVersion(String buildVersion) {
		this.buildVersion = buildVersion;
	}

	public String getClosestTagCommitCount() {
		return closestTagCommitCount;
	}

	public void setClosestTagCommitCount(String closestTagCommitCount) {
		this.closestTagCommitCount = closestTagCommitCount;
	}

	public String getClosestTagName() {
		return closestTagName;
	}

	public void setClosestTagName(String closestTagName) {
		this.closestTagName = closestTagName;
	}

	public String getCommitId() {
		return commitId;
	}

	public void setCommitId(String commitId) {
		this.commitId = commitId;
	}

	public String getCommitIdAbbrev() {
		return commitIdAbbrev;
	}

	public void setCommitIdAbbrev(String commitIdAbbrev) {
		this.commitIdAbbrev = commitIdAbbrev;
	}

	public String getCommitIdDescribe() {
		return commitIdDescribe;
	}

	public void setCommitIdDescribe(String commitIdDescribe) {
		this.commitIdDescribe = commitIdDescribe;
	}

	public String getCommitIdDescribeShort() {
		return commitIdDescribeShort;
	}

	public void setCommitIdDescribeShort(String commitIdDescribeShort) {
		this.commitIdDescribeShort = commitIdDescribeShort;
	}

	public String getCommitMessageFull() {
		return commitMessageFull;
	}

	public void setCommitMessageFull(String commitMessageFull) {
		this.commitMessageFull = commitMessageFull;
	}

	public String getCommitMessageShort() {
		return commitMessageShort;
	}

	public void setCommitMessageShort(String commitMessageShort) {
		this.commitMessageShort = commitMessageShort;
	}

	public String getCommitTime() {
		return commitTime;
	}

	public void setCommitTime(String commitTime) {
		this.commitTime = commitTime;
	}

	public String getCommitUserEmail() {
		return commitUserEmail;
	}

	public void setCommitUserEmail(String commitUserEmail) {
		this.commitUserEmail = commitUserEmail;
	}

	public String getCommitUsername() {
		return commitUsername;
	}

	public void setCommitUsername(String commitUsername) {
		this.commitUsername = commitUsername;
	}

	public String getDirty() {
		return dirty;
	}

	public void setDirty(String dirty) {
		this.dirty = dirty;
	}

	public String getRemoteOriginUrl() {
		return remoteOriginUrl;
	}

	public void setRemoteOriginUrl(String remoteOriginUrl) {
		this.remoteOriginUrl = remoteOriginUrl;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

}