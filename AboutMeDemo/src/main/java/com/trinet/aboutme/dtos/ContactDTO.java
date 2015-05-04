
package com.trinet.aboutme.dtos;

public class ContactDTO {
	
	private int contactID;
	
	private int employeeID;
	
	private String accessType;
	
	private String media;
	
	private int telephoneNo;
	
	private String email;

	public int getContactID() {
		return contactID;
	}

	public void setContactID(int contactID) {
		this.contactID = contactID;
	}

	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public String getAccessType() {
		return accessType;
	}

	public void setAccessType(String accessType) {
		this.accessType = accessType;
	}

	public String getMedia() {
		return media;
	}

	public void setMedia(String media) {
		this.media = media;
	}

	public int getTelephoneNo() {
		return telephoneNo;
	}

	public void setTelephoneNo(int telephoneNo) {
		this.telephoneNo = telephoneNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}