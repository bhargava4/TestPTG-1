package com.trinet.aboutme.controller;

import java.util.List;

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
@RequestMapping("/EmployeeProfileAPI")
public interface EmployeeProfileController {
	
	@RequestMapping(value="/workProfile/{employeeNo}", method=RequestMethod.GET)
	public List<EmployeeProfileDTO> getWorkProfile(@PathVariable int employeeNo);

}
