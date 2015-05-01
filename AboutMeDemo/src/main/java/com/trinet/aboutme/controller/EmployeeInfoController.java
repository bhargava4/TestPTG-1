/**
 * 
 */
package com.trinet.aboutme.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.trinet.aboutme.dtos.AddressDTO;

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
	
}
