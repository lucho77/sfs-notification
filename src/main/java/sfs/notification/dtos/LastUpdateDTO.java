package sfs.notification.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LastUpdateDTO {
	private String lastUpdate;

	@JsonProperty("ultimaActualizacion")
	public String getLastUpdate() {
		return lastUpdate;
	}

	@JsonProperty("updated_at")
	public void setLastUpdate(String lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

}
