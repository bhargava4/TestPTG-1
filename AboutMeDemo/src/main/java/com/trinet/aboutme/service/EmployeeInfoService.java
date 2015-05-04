package com.trinet.aboutme.service;

import java.util.List;

import com.trinet.aboutme.dtos.AddressDTO;
import com.trinet.aboutme.dtos.ContactDTO;

public interface EmployeeInfoService {

	List<AddressDTO> getAddress(Integer employeeId);
	List<ContactDTO> getContact(Integer employeeId);
}
