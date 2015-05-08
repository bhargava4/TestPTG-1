package com.trinet.aboutme.beans;

public class ErrorResponse {
	private String errorCode;
	private String errorMessage;
	private String errorDetails;
	private String localErrorCode;
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public String getErrorDetails() {
		return errorDetails;
	}
	public void setErrorDetails(String errorDetails) {
		this.errorDetails = errorDetails;
	}
	public String getLocalErrorCode() {
		return localErrorCode;
	}
	public void setLocalErrorCode(String localErrorCode) {
		this.localErrorCode = localErrorCode;
	}
	
}
