package com.trinet.aboutme.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.trinet.aboutme.dtos.EmergencyContactDTO;

/**
 * @author Bhargava
 *
 */
@RequestMapping("/emergencycontactapi")
public interface EmergencyContactController {

	
	@RequestMapping(value="/contactdetails/{employeeNo}", method=RequestMethod.GET)
	Object getEmergencyContacts(@PathVariable int employeeNo);
	
	@RequestMapping(value="/contactdetails", method=RequestMethod.POST)
	Object createEmergencyContact(@RequestBody EmergencyContactDTO contactDTO);
	
	@RequestMapping(value="/contactdetails", method=RequestMethod.PUT)
	Object updateEmergencyContact(@RequestBody EmergencyContactDTO contactDTO);
	
	
}
