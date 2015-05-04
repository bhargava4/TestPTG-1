/**
 * 
 */
package com.trinet.aboutme.dtos;

import javax.persistence.Column;

/**
 * @author Keerthi
 *
 */
public class IdentityDTO {

	private int identityID;
	
	private int employeeID;
	
	private String ssn;
	
	private String employeeStatus;
	
	private int AlternateEmployeeID;

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
		return AlternateEmployeeID;
	}

	public void setAlternateEmployeeID(int alternateEmployeeID) {
		AlternateEmployeeID = alternateEmployeeID;
	}
}
