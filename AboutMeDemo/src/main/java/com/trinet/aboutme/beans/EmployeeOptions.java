/**
 * 
 */
package com.trinet.aboutme.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Swathi
 *
 */

@Entity
@Table(name="Employee_Options")
public class EmployeeOptions { 

	@Id
	@Column(name="EmployeeId")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer employeeId;
	
	@Column(name="EmailOption")
	private String emailOption;
	
	@Column(name="OtherNotices")
	private String otherNotices;

	@Column(name="W2Option")
	private String w2Option;

	@Column(name="WorkflowNotifications")
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