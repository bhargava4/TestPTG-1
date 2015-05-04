/**
 * 
 */
package com.trinet.aboutme.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Keerthi
 *
 */
@Entity
@Table(name="contact")
public class Contact {
	
	@Id
	@Column(name="contactID")
	private int contactID;
	
	@Column(name="employeeID")
	private int employeeID;
	
	@Column(name="accessType")
	private String accessType;
	
	@Column(name="media")
	private String media;
	
	@Column(name="telephoneNo")
	private int telephoneNo;
	
	@Column(name="email")
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
