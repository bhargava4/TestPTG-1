package com.trinet.aboutme.dtos;

import org.codehaus.jackson.annotate.JsonAutoDetect;

@JsonAutoDetect
public class CustomDetailsDTO {
	int empId;
	String customId;
	public int getEmpId() {
			return empId;
		}
	
		public void setEmpId(int empId) {
			this.empId = empId;
		}
	public String getCustomId() {
		return customId;
	}
	
	public void setCustomId(String customId) {
		this.customId = customId;
	}

}
