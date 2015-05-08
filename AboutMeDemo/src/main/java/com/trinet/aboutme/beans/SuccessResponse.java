package com.trinet.aboutme.beans;

public class SuccessResponse {
	private String respnoseCode;
	private String successMessage;
	private Integer ID;
	private Integer employeeID;
	
	
	public Integer getID() {
		return ID;
	}
	public void setID(Integer iD) {
		ID = iD;
	}
	public Integer getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(Integer employeeID) {
		this.employeeID = employeeID;
	}
	public String getRespnoseCode() {
		return respnoseCode;
	}
	public void setRespnoseCode(String respnoseCode) {
		this.respnoseCode = respnoseCode;
	}
	public String getSuccessMessage() {
		return successMessage;
	}
	public void setSuccessMessage(String successMessage) {
		this.successMessage = successMessage;
	}
	
}
