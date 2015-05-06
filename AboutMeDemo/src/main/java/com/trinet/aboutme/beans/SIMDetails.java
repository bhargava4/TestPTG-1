package com.trinet.aboutme.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author Anitha
 *
 */
@Entity
@Table(name = "SIM_CUSTOM" )
public class SIMDetails {
	@Id
	@Column(name="emp_id")
	int empId;
	@Column(name="custom_id")
	String customId;
	
	/*@Column(name="password")
	String password;
	@Column(name="roles")
	String roles;
	@Column(name="secret_qst")
	String secretQst;
	@Column(name="secret_ans")
	String secretAns;*/
	
	public String getCustomId() {
		return customId;
	}
	public void setCustomId(String customId) {
		this.customId = customId;
	}
	/*public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRoles() {
		return roles;
	}
	public void setRoles(String roles) {
		this.roles = roles;
	}
	public String getSecretQst() {
		return secretQst;
	}
	public void setSecretQst(String secretQst) {
		this.secretQst = secretQst;
	}
	public String getSecretAns() {
		return secretAns;
	}
	public void setSecretAns(String secretAns) {
		this.secretAns = secretAns;
	}*/
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	

}
