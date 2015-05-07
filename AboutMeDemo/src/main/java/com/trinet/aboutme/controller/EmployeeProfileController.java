package com.trinet.aboutme.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.trinet.aboutme.dtos.EmployeeProfileDTO;
/**
 * 
 * interface to provide employee work profile api's
 * 
 * @author Shravan
 *
 */
@RequestMapping("/employeeprofileapi")
public interface EmployeeProfileController {
	
	@RequestMapping(value="/workprofiles/{employeeNo}", method=RequestMethod.GET, produces="application/json")
	public EmployeeProfileDTO getWorkProfile(@PathVariable int employeeNo);

}
