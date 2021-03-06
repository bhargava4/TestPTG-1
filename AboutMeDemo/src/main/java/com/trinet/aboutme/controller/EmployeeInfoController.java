/**
 * 
 */
package com.trinet.aboutme.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.trinet.aboutme.dtos.AddressDTO;
import com.trinet.aboutme.dtos.ContactDTO;
import com.trinet.aboutme.dtos.NameDTO;

/**
 * 
 * interface to provide employee info api's
 * 
 * @author Swathi
 *
 */
@RequestMapping("/employeeinfo")
public interface EmployeeInfoController {

	@RequestMapping(value="/addresses/{employeeId}", method=RequestMethod.GET)
	public AddressDTO getAddress(@PathVariable int employeeId);
	
	@RequestMapping(value="/contacts/{employeeId}", method=RequestMethod.GET)
	public ContactDTO getContact(@PathVariable int employeeId);

	@RequestMapping(value="/name/{employeeId}", method=RequestMethod.GET)
	public NameDTO getName(@PathVariable int employeeId);


	
	
}
