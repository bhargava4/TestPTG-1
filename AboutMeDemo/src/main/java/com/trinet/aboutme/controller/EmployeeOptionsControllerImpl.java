package com.trinet.aboutme.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.trinet.aboutme.beans.SuccessResponse;
import com.trinet.aboutme.dtos.EmployeeOptionsDTO;
import com.trinet.aboutme.service.EmployeeOptionsService;


@RestController
public class EmployeeOptionsControllerImpl implements EmployeeOptionsController
{
	
	private static final Logger logger = LoggerFactory.getLogger(EmployeeOptionsControllerImpl.class);
	private SuccessResponse successResponse;
	@Autowired
	private EmployeeOptionsService employeeOptionsService;
	
	@Override
	public String updateEmployeeOptions(@RequestBody EmployeeOptionsDTO employeeoptions) {
		employeeOptionsService.updateEmployeeOptions(employeeoptions);
		return "Success"; 
	}
	
}


