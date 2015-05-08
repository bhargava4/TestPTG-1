/**
 * 
 */
package com.trinet.aboutme.dtos;

import com.trinet.aboutme.beans.SuccessResponse;

/**
 * @author Keerthi
 *
 */
public class IdentityDTO{

	private int identityID;
	
	private int employeeID;
	
	private String ssn;
	
	private String employeeStatus;
	
	private int alternateEmployeeID;
	
	private String citizenshipStatus;

	public String getCitizenshipStatus() {
		return citizenshipStatus;
	}

	public void setCitizenshipStatus(String citizenshipStatus) {
		this.citizenshipStatus = citizenshipStatus;
	}

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
		alternateEmployeeID = alternateEmployeeID;
	}
}
