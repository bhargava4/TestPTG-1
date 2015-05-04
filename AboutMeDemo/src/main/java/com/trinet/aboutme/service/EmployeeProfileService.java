package com.trinet.aboutme.service;

import java.util.List;

import com.trinet.aboutme.dtos.EmployeeProfileDTO;

public interface EmployeeProfileService {
	List<EmployeeProfileDTO> getWorkProfile(Integer employeeNo);
}
