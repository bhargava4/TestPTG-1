/**
 * 
 */
package com.trinet.aboutme.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Keerthi
 *
 */
@Entity
@Table(name="personaldata")
public class PersonalData {

	@Id
	@GeneratedValue
	@Column(name="personalID")
	private int personalID;
	
	

	@Column(name="employeeID")
	private int employeeID;
	
	@Column(name="effectiveDate")
	private String effectiveDate;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="martialStatus")
	private String martialStatus;
	
	@Column(name="birthDate")
	private String birthDate;
	
	@Column(name="militaryStatus")
	private String militaryStatus;
	
	@Column(name="ethnicity")
	private String ethnicity;

	public int getPersonalID() {
		return personalID;
	}

	public void setPersonalID(int personalID) {
		this.personalID = personalID;
	}

	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMartialStatus() {
		return martialStatus;
	}

	public void setMartialStatus(String martialStatus) {
		this.martialStatus = martialStatus;
	}


	public String getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(String effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getMilitaryStatus() {
		return militaryStatus;
	}

	public void setMilitaryStatus(String militaryStatus) {
		this.militaryStatus = militaryStatus;
	}

	public String getEthnicity() {
		return ethnicity;
	}

	public void setEthnicity(String ethnicity) {
		this.ethnicity = ethnicity;
	}
	
	
	
}
