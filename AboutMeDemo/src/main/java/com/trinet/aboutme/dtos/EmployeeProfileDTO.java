package com.trinet.aboutme.dtos;

import org.codehaus.jackson.annotate.JsonAutoDetect;

@JsonAutoDetect
public class EmployeeProfileDTO {
	
	private String businessTitle;
	private String serviceDate;
	private String workPhone;
	private String workEmail;
	private String department;
	private String location;
	private String reportsTo;
	private String employeeType;
	private String temporaryIndicator;
	private String compensationBasis;
	private String comprate;
	private String standardHours;
	private int profileId;
	
	
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
