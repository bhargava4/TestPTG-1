package com.trinet.aboutme.dtos;

import java.sql.Date;

import org.codehaus.jackson.annotate.JsonAutoDetect;

@JsonAutoDetect
public class NameDTO {

private int nameID;
	
	private String name;
	
	private int employeeID;
	
	private String effectiveDate;
	
	private String formofaddress;
	
	private String firstName;
	
	private String middleName;
	
	private String suffix;
	
	private String lastName;
	
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

	

	public String getFormofaddress() {
		return formofaddress;
	}

	public void setFormofaddress(String formofaddress) {
		this.formofaddress = formofaddress;
	}

	public String getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(String effectiveDate) {
		this.effectiveDate = effectiveDate;
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

	private String nameType;
}
