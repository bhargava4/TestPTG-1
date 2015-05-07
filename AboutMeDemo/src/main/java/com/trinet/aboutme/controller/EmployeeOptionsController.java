package com.trinet.aboutme.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.trinet.aboutme.dtos.EmployeeOptionsDTO;



/**
 * @author Swathi
 *
 */
@RequestMapping("/employeeoptionsapi")
public interface EmployeeOptionsController {



	@RequestMapping(value="/employeeoptions", method=RequestMethod.PUT)
	String updateEmployeeOptions(@RequestBody EmployeeOptionsDTO employeeOptionsDTO);

}
