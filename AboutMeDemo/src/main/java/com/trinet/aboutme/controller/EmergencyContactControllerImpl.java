package com.trinet.aboutme.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.trinet.aboutme.dtos.EmergencyContactDTO;
import com.trinet.aboutme.service.EmergencyContactService;

/**
 * @author Bhargava
 * Handles requests for the application home page.
 */
@RestController
public class EmergencyContactControllerImpl implements EmergencyContactController{
	
	private static final Logger LOGGER = LoggerFactory.getLogger(EmergencyContactControllerImpl.class);

	@Autowired
	private EmergencyContactService emergencyContactService;
	

	@Override
	public List<EmergencyContactDTO> getEmergencyContacts(@PathVariable int employeeNo) {
		LOGGER.info("Get Emergency Contacts of Employee:" + employeeNo);
		return emergencyContactService.getEmergencyContacts(new Integer(employeeNo));
	}
	
	/* (non-Javadoc)
	 * @see com.trinet.aboutme.EmergencyContactController#createEmergencyContact(com.trinet.aboutme.dtos.EmergencyContactDTO)
	 */
	@Override
	public String createEmergencyContact(@RequestBody EmergencyContactDTO contactDTO) {
		emergencyContactService.createEmergencyContact(contactDTO);
		return "Successfully Added";
	}

	/* (non-Javadoc)
	 * @see com.trinet.aboutme.EmergencyContactController#updateEmergencyContact(com.trinet.aboutme.dtos.EmergencyContactDTO)
	 */
	@Override
	public String updateEmergencyContact(@RequestBody EmergencyContactDTO contactDTO) {
		emergencyContactService.updateEmergencyContact(contactDTO);
		return "Successfully Updated";
	}
}
