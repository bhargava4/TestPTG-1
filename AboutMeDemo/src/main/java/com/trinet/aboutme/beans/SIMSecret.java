package com.trinet.aboutme.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SIM_SECRET")
public class SIMSecret {
	@Id
	@Column(name="emp_id")
	int empId;
	@Column(name="secret_qst")
	String secretQst;
	@Column(name="secret_ans")
	String secretAns;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
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
	}
	

}
