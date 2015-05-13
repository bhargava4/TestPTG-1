/**
 * 
 */
package com.trinet.aboutme.dao;

import java.util.List;

import com.trinet.aboutme.beans.EmergencyContact;
/**
 * @author Bhargava
 *
 */
public interface EmergencyContactDAO {
	
	List<EmergencyContact> getEmergencyContacts(Integer employeeId);

	void saveEmergencyContact(EmergencyContact emergencyContact) throws Exception;

	void updaeEmergencyContact(EmergencyContact emergencyContact);
}
