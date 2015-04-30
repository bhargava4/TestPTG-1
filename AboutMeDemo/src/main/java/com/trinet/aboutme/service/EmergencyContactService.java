/**
 * 
 */
package com.trinet.aboutme.service;

import java.util.List;

import com.trinet.aboutme.dtos.EmergencyContactDTO;

/**
 * @author Bhargava
 *
 */
public interface EmergencyContactService {

	List<EmergencyContactDTO> getEmergencyContacts(Integer employeeId);

	void createEmergencyContact(EmergencyContactDTO contactDTO);

	void updateEmergencyContact(EmergencyContactDTO contactDTO);
	
}
