package com.trinet.aboutme.service;

import java.util.List;

import com.trinet.aboutme.dtos.AddressDTO;
import com.trinet.aboutme.dtos.ContactDTO;
import com.trinet.aboutme.dtos.IdentityDTO;
import com.trinet.aboutme.dtos.NameDTO;
import com.trinet.aboutme.dtos.PersonalDataDTO;

public interface EmployeeInfoService {

	List<AddressDTO> getAddress(Integer employeeId);
List<ContactDTO> getContact(Integer employeeId);
	List<NameDTO> getName(Integer employeeId);
	List<IdentityDTO> getIdentity(Integer employeeId);
	List<PersonalDataDTO> getPersonalData(Integer employeeId);
}
