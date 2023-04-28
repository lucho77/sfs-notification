package sfs.notification.enumeration;


public enum MessageErrorEnum {
    FAIL_GENERAL_ERROR("Exception general: ");
    private String description;
    
    private MessageErrorEnum(String descripcion) {
    	this.description = descripcion;
    }
    
	public String getDescription() {
		return description;
	}

    
}
