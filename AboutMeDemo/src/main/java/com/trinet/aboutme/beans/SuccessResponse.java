package com.trinet.aboutme.beans;

public class SuccessResponse {
	private String respnoseCode;
	private String successMessage;
	private Object resource;
	
	/**
	 * @return the resource
	 */
	public Object getResource() {
		return resource;
	}
	/**
	 * @param resource the resource to set
	 */
	public void setResource(Object resource) {
		this.resource = resource;
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
