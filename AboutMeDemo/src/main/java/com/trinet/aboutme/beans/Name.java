/**
 * 
 */
package com.trinet.aboutme.beans;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Keerthi
 *
 */
@Entity
@Table(name="name")
public class Name {
	
	@Id
	@Column(name="nameID")
	private int nameID;
	
	@Column(name="name")
	private String name;
	
	@Column(name="employeeID")
	private int employeeID;
	
	@Column(name="effectiveDate")
	private Date effectiveDate;
	
	@Column(name="formofaddress")
	private String formofaddress;
	
	@Column(name="firstName")
	private String firstName;
	
	@Column(name="middleName")
	private String middleName;
	
	@Column(name="suffix")
	private String suffix;
	
	@Column(name="lastName")
	private String lastName;
	
	@Column(name="nameType")
	private String nameType;

	public int getNameID() {
		return nameID;
	}

	public void setNameID(int nameID) {
		this.nameID = nameID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public Date getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(Date effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public String getFormofaddress() {
		return formofaddress;
	}

	public void setFormofaddress(String formofaddress) {
		this.formofaddress = formofaddress;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getSuffix() {
		return suffix;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNameType() {
		return nameType;
	}

	public void setNameType(String nameType) {
		this.nameType = nameType;
	}

}
