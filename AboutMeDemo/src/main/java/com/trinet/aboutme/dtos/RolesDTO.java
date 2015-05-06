package com.trinet.aboutme.dtos;

import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.annotate.JsonAutoDetect;

@JsonAutoDetect
public class RolesDTO extends CustomDetailsDTO{

	//private int roleId;
	private List<Roll> roleNames = new ArrayList<Roll>();
	
	/*public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}*/
	public List<Roll> getRoleNames() {
		return roleNames;
	}
	public void setRoleNames(List<Roll> roleNames) {
		this.roleNames = roleNames;
	}
	
	
}
