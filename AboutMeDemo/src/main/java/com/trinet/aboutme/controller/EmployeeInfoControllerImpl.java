/**
 * 
 */
package com.trinet.aboutme.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.trinet.aboutme.dtos.AddressDTO;
import com.trinet.aboutme.dtos.ContactDTO;
import com.trinet.aboutme.dtos.NameDTO;
import com.trinet.aboutme.service.EmployeeInfoService;

/**
 * @author Swathi
 *
 */
@RestController
public class EmployeeInfoControllerImpl implements EmployeeInfoController {
	private static final Logger LOGGER = LoggerFactory
			.getLogger(EmployeeInfoControllerImpl.class);
	
	@Autowired
	private EmployeeInfoService employeeInfoService;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.trinet.aboutme.controller.EmployeeInfoController#getAddress(int)
	 */
	@Override
	public AddressDTO getAddress(@PathVariable int employeeId) {
		LOGGER.info(" *** start getAddress *****");
		AddressDTO addressDTO = new AddressDTO();
		List<AddressDTO> addressList= new ArrayList<AddressDTO>();
		addressList = employeeInfoService.getAddress(employeeId);
		if(CollectionUtils.isNotEmpty(addressList)){
		addressDTO=  addressList.get(0);
		}
		LOGGER.info(" *** end getAddress *****");
		
		return addressDTO;
	}

	@Override
	public ContactDTO getContact(@PathVariable int employeeId) {
		LOGGER.info(" *** start getAddress *****");
		ContactDTO contactDTO = new ContactDTO();
		List<ContactDTO> contactList= new ArrayList<ContactDTO>();
		contactList = employeeInfoService.getContact(employeeId);
		if(CollectionUtils.isNotEmpty(contactList)){
		contactDTO=  contactList.get(0);
		}
		LOGGER.info(" *** end getAddress *****");
		
		return contactDTO;
	}
	
	@Override
	public NameDTO getName(@PathVariable int employeeId) {
		LOGGER.info(" *** start getName *****");
		NameDTO nameDTO = new NameDTO();
		List<NameDTO> nameList= new ArrayList<NameDTO>();
		nameList = employeeInfoService.getName(employeeId);
		if(CollectionUtils.isNotEmpty(nameList)){
		nameDTO=  nameList.get(0);
		}
		LOGGER.info(" *** end getName *****");
		
		return nameDTO;
	}

}
