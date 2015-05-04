package com.trinet.aboutme.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Shravan
 *
 */
@Entity
@Table(name="EmployeeProfile")
public class EmployeeProfile {
	@Id
	@Column(name="profileId")
	private int profileId;
	
	@Column(name="business title")
	private String businessTitle;
	
	@Column(name="service date")
	private String serviceDate;
	
	@Column(name="work phone")
	private String workPhone;
	
	@Column(name="work email")
	private String workEmail;
	
	@Column(name="department")
	private String department;

	@Column(name="location")
	private String location;
	
	@Column(name="reports to")
	private String reportsTo;
	
	@Column(name="employeeType")
	private String employeeType;
	
	@Column(name="temporary indicator")
	private String temporaryIndicator;
	
	@Column(name="compensation basis")
	private String compensationBasis;
	
	@Column(name="comprate")
	private String comprate;
	
	@Column(name="standard hours")
	private String standardHours;

	public int getProfileId() {
		return profileId;
	}

	public void setProfileId(int profileId) {
		this.profileId = profileId;
	}

	public String getBusinessTitle() {
		return businessTitle;
	}

	public void setBusinessTitle(String businessTitle) {
		this.businessTitle = businessTitle;
	}

	public String getServiceDate() {
		return serviceDate;
	}

	public void setServiceDate(String serviceDate) {
		this.serviceDate = serviceDate;
	}

	public String getWorkPhone() {
		return workPhone;
	}

	public void setWorkPhone(String workPhone) {
		this.workPhone = workPhone;
	}

	public String getWorkEmail() {
		return workEmail;
	}

	public void setWorkEmail(String workEmail) {
		this.workEmail = workEmail;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getReportsTo() {
		return reportsTo;
	}

	public void setReportsTo(String reportsTo) {
		this.reportsTo = reportsTo;
	}

	public String getEmployeeType() {
		return employeeType;
	}

	public void setEmployeeType(String employeeType) {
		this.employeeType = employeeType;
	}

	public String getTemporaryIndicator() {
		return temporaryIndicator;
	}

	public void setTemporaryIndicator(String temporaryIndicator) {
		this.temporaryIndicator = temporaryIndicator;
	}

	public String getCompensationBasis() {
		return compensationBasis;
	}

	public void setCompensationBasis(String compensationBasis) {
		this.compensationBasis = compensationBasis;
	}

	public String getComprate() {
		return comprate;
	}

	public void setComprate(String comprate) {
		this.comprate = comprate;
	}

	public String getStandardHours() {
		return standardHours;
	}

	public void setStandardHours(String standardHours) {
		this.standardHours = standardHours;
	}
	
	
}
