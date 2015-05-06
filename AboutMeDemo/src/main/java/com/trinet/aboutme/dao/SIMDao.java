package com.trinet.aboutme.dao;

import java.util.List;

import com.trinet.aboutme.beans.SIMDetails;
import com.trinet.aboutme.beans.SIMRoles;

/**
 * 
 * @author Anitha
 *
 */
public interface SIMDao {
	/*String createCustomLogin(String customId);*/
	int updatePassword(int customId, String newPassword);
	//int updateRoles(String customId , String roles);
	//int deleteRoles(String customId , String roleToDelete);
	int updateSeceret(int empId,  String secretQst, String secretAns);
	
	void createSimDetails(SIMDetails simDetails);
	void udpateSimDetails(SIMDetails simDetails);
	String getCurrentPassword(int empId);
	void insertRoles(SIMRoles role);
	int deleteRoles(int empId, List<String> roles);
	//int deleteRoles(String empId, List<String> roles);
	
}
