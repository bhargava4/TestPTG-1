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
@Table(name="identity")
public class Identity {
	
	@Id
	@Column(name="identityID")
	private int identityID;
	
	@Column(name="employeeID")
	private int employeeID;
	
	@Column(name="ssn")
	private String ssn;
	
	@Column(name="employeeStatus")
	private String employeeStatus;
	
	@Column(name="AlternateEmployeeID")
	private int alternateEmployeeID;
	
	public int getIdentityID() {
		return identityID;
	}

	public void setIdentityID(int identityID) {
		this.identityID = identityID;
	}

	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getEmployeeStatus() {
		return employeeStatus;
	}

	public void setEmployeeStatus(String employeeStatus) {
		this.employeeStatus = employeeStatus;
	}

	public int getAlternateEmployeeID() {
		return alternateEmployeeID;
	}

	public void setAlternateEmployeeID(int alternateEmployeeID) {
		this.alternateEmployeeID = alternateEmployeeID;
	}

	public String getCitizenshipStatus() {
		return citizenshipStatus;
	}

	public void setCitizenshipStatus(String citizenshipStatus) {
		this.citizenshipStatus = citizenshipStatus;
	}

	@Column(name="citizenshipStatus")
	private String citizenshipStatus;

}
