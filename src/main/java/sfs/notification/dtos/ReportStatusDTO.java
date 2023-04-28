package sfs.notification.dtos;

import sfs.notification.enumeration.MessageErrorEnum;

public class ReportStatusDTO {

		private MessageErrorEnum status;
		private String msg;

		public static ReportStatusDTO from(MessageErrorEnum status,String message) {
			return new ReportStatusDTO(status,message);
		}
		
		ReportStatusDTO(){
			
		}
		
		ReportStatusDTO(MessageErrorEnum status,String message){
			this.status = status;
			this.msg = message;
		}
		public MessageErrorEnum getStatus() {
			return status;
		}
		public void setStatus(MessageErrorEnum status) {
			this.status = status;
		}
		public String getMsg() {
			return msg;
		}
		public void setMsg(String msg) {
			this.msg = msg;
		}
}
