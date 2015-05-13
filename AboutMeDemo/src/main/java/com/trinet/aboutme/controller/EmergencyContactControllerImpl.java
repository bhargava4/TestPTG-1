package com.trinet.aboutme.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.trinet.aboutme.beans.SuccessResponse;
import com.trinet.aboutme.dtos.EmergencyContactDTO;
import com.trinet.aboutme.service.EmergencyContactService;
import com.trinet.aboutme.utils.CommonUtils;

/**
 * @author Bhargava
 * Handles requests for the application home page.
 */
@RestController
public class EmergencyContactControllerImpl implements EmergencyContactController{
	
	private static final Logger LOGGER = LoggerFactory.getLogger(EmergencyContactControllerImpl.class);
	private SuccessResponse successResponse;
	@Autowired
	private EmergencyContactService emergencyContactService;
	

	@Override
	public Object getEmergencyContacts(@PathVariable int employeeNo) {
		LOGGER.info("Get Emergency Contacts of Employee:" + employeeNo);
		try {
			if(emergencyContactService.getEmergencyContacts(new Integer(employeeNo)).size()>0)
		return CommonUtils.updatedSuccessfully(emergencyContactService.getEmergencyContacts(new Integer(employeeNo)));
			return CommonUtils.sendErrorDetails("No Record Found, Bad Request","400");
		} catch (Exception e) {
			return CommonUtils.sendErrorDetails(e.getMessage(),"500");
		}
	}
	
	/* (non-Javadoc)
	 * @see com.trinet.aboutme.EmergencyContactController#createEmergencyContact(com.trinet.aboutme.dtos.EmergencyContactDTO)
	 */
	@Override
	public Object createEmergencyContact(@RequestBody EmergencyContactDTO contactDTO) {
		try {
			emergencyContactService.createEmergencyContact(contactDTO);
		} catch (Exception e) {
			CommonUtils.sendErrorDetails(e.getMessage(),"500");
		}
		
		return CommonUtils.updatedSuccessfully(contactDTO);
	}

	/* (non-Javadoc)
	 * @see com.trinet.aboutme.EmergencyContactController#updateEmergencyContact(com.trinet.aboutme.dtos.EmergencyContactDTO)
	 */
	@Override
	public Object updateEmergencyContact(@RequestBody EmergencyContactDTO contactDTO) {
		emergencyContactService.updateEmergencyContact(contactDTO);
		return CommonUtils.updatedSuccessfully(contactDTO);
	}
}
