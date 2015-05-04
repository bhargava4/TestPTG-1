package com.trinet.aboutme.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.trinet.aboutme.dtos.EmployeeProfileDTO;
import com.trinet.aboutme.service.EmployeeProfileService;

public class EmployeProfileControllerImpl implements EmployeeProfileController{

	@Autowired
	private EmployeeProfileService employeeProfileService;
	
	
	@Override
	public List<EmployeeProfileDTO> getWorkProfile(int employeeNo) {
		return employeeProfileService.getWorkProfile(employeeNo);
	}

	
}
