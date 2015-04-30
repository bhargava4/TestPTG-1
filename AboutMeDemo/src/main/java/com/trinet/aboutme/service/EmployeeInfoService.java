package com.trinet.aboutme.service;

import java.util.List;

import com.trinet.aboutme.dtos.AddressDTO;

public interface EmployeeInfoService {

	List<AddressDTO> getAddress(Integer employeeId);
}
