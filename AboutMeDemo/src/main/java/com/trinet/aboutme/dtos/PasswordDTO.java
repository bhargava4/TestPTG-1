package com.trinet.aboutme.dtos;

import org.codehaus.jackson.annotate.JsonAutoDetect;


@JsonAutoDetect
public class PasswordDTO extends CustomDetailsDTO {
	
	String  currentPassword;
	String newPassword;
	public String getCurrentPassword() {
		return currentPassword;
	}
	public void setCurrentPassword(String currentPassword) {
		this.currentPassword = currentPassword;
	}
	public String getNewPassword() {
		return newPassword;
	}
	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

}
