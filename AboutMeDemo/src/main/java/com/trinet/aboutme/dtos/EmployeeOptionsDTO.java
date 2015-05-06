package com.trinet.aboutme.dtos;

import org.codehaus.jackson.annotate.JsonAutoDetect;

@JsonAutoDetect
public class EmployeeOptionsDTO {

	private Integer employeeId;
	private String emailOption;
	private String otherNotices;
	private String w2Option;
	private String workflowNotifications;
	
	public Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmailOption() {
		return emailOption;
	}
	public void setEmailOption(String emailOption) {
		this.emailOption = emailOption;
	}
	public String getOtherNotices() {
		return otherNotices;
	}
	public void setOtherNotices(String otherNotices) {
		this.otherNotices = otherNotices;
	}
	public String getW2Option() {
		return w2Option;
	}
	public void setW2Option(String w2Option) {
		this.w2Option = w2Option;
	}
	public String getWorkflowNotifications() {
		return workflowNotifications;
	}
	public void setWorkflowNotifications(String workflowNotifications) {
		this.workflowNotifications = workflowNotifications;
	}
	
	
}
