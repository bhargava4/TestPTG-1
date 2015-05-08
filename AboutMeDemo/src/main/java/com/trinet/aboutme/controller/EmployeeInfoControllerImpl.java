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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.trinet.aboutme.beans.ErrorResponse;
import com.trinet.aboutme.beans.SuccessResponse;
import com.trinet.aboutme.constants.UtilConstants;
import com.trinet.aboutme.dtos.AddressDTO;
import com.trinet.aboutme.dtos.ContactDTO;
import com.trinet.aboutme.dtos.IdentityDTO;
import com.trinet.aboutme.dtos.NameDTO;
import com.trinet.aboutme.dtos.PersonalDataDTO;
import com.trinet.aboutme.service.EmployeeInfoService;
import com.trinet.aboutme.utils.CommonUtils;

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
		List<AddressDTO> addressList = new ArrayList<AddressDTO>();
		addressList = employeeInfoService.getAddress(employeeId);
		if (CollectionUtils.isNotEmpty(addressList)) {
			addressDTO = addressList.get(0);
		}
		LOGGER.info(" *** end getAddress *****");

		return addressDTO;
	}

	@Override
	public ContactDTO getContact(@PathVariable int employeeId) {
		LOGGER.info(" *** start getContact *****");
		ContactDTO contactDTO = new ContactDTO();
		List<ContactDTO> contactList = new ArrayList<ContactDTO>();
		contactList = employeeInfoService.getContact(employeeId);
		if (CollectionUtils.isNotEmpty(contactList)) {
			contactDTO = contactList.get(0);
		}
		LOGGER.info(" *** end getContact *****");

		return contactDTO;
	}

	@Override
	public NameDTO getName(@PathVariable int employeeId) {
		LOGGER.info(" *** start getName *****");
		NameDTO nameDTO = new NameDTO();
		List<NameDTO> nameList = new ArrayList<NameDTO>();
		nameList = employeeInfoService.getName(employeeId);
		if (CollectionUtils.isNotEmpty(nameList)) {
			nameDTO = nameList.get(0);
		}
		LOGGER.info(" *** end getName *****");

		return nameDTO;
	}

	@Override
	public IdentityDTO getIdentityByEmployee(@PathVariable int employeeId) {
		LOGGER.info(" *** start getIdentity *****");
		IdentityDTO identityDTO = new IdentityDTO();
		List<IdentityDTO> identityList = new ArrayList<IdentityDTO>();
		identityList = employeeInfoService.getIdentityByEmployee(employeeId);
		if (CollectionUtils.isNotEmpty(identityList)) {
			identityDTO = identityList.get(0);
		}
		LOGGER.info(" *** end getIdentity *****");	
		return identityDTO;
	}

	@Override
	public PersonalDataDTO getPersonalData(@PathVariable int employeeId) {
		LOGGER.info(" *** start getPersonalData *****");
		PersonalDataDTO personalDataDTO = new PersonalDataDTO();
		List<PersonalDataDTO> personalDataList = new ArrayList<PersonalDataDTO>();
		personalDataList = employeeInfoService.getPersonalData(employeeId);
		if (CollectionUtils.isNotEmpty(personalDataList)) {
			personalDataDTO = personalDataList.get(0);
		}
		LOGGER.info(" *** end getPersonalData *****");

		return personalDataDTO;
	}

	@Override
	public String maintainAddress(@RequestBody AddressDTO addressDTO) {
		LOGGER.info(" *** start maintainAddress *****");
		List<AddressDTO> addressList = new ArrayList<AddressDTO>();
		String status = UtilConstants.FAILURE;
		addressList = employeeInfoService.maintainAddress(addressDTO);
		if (CollectionUtils.isNotEmpty(addressList)) {
			status = UtilConstants.SUCCESS;
		}
		LOGGER.info(" *** end maintainAddress *****");
		return status;

	}

	@Override
	public String maintainContact(@RequestBody ContactDTO contactDTO) {
		LOGGER.info(" *** Start maintainContact *****");
		String status = UtilConstants.FAILURE;
		List<ContactDTO> contactList = new ArrayList<ContactDTO>();
		contactList = employeeInfoService.maintainContact(contactDTO);
		if (CollectionUtils.isNotEmpty(contactList)) {
			status = UtilConstants.SUCCESS;
		}
		LOGGER.info(" *** end maintainContact *****");
		return status;
	}

	@Override
	public String maintainName(@RequestBody NameDTO nameDTO) {
		LOGGER.info(" *** start maintainName *****");
		String status = UtilConstants.FAILURE;
		List<NameDTO> nameList = new ArrayList<NameDTO>();
		nameList = employeeInfoService.maintainName(nameDTO);
		if (CollectionUtils.isNotEmpty(nameList)) {
			status = UtilConstants.SUCCESS;
		}

		LOGGER.info(" *** end maintainName *****");
		return status;
	}

	@Override
	public String maintainPersonalData(
			@RequestBody PersonalDataDTO personalDataDTO) {
		LOGGER.info(" *** start maintainPersonalData *****");
		String status = UtilConstants.FAILURE;
		List<PersonalDataDTO> personalDataList = new ArrayList<PersonalDataDTO>();
		personalDataList = employeeInfoService
				.maintainPersonalData(personalDataDTO);
		if (CollectionUtils.isNotEmpty(personalDataList)) {
			status = UtilConstants.SUCCESS;
		}

		LOGGER.info(" *** end maintainPersonalData *****");
		return status;
	}

	@Override
	public Object maintainIdentity(@RequestBody IdentityDTO identityDTO) {
		LOGGER.info(" *** start maintainIdentity *****");
		String status = UtilConstants.FAILURE;
		List<IdentityDTO> identityList = new ArrayList<IdentityDTO>();
		identityList = employeeInfoService.maintainIdentity(identityDTO);
		if (CollectionUtils.isNotEmpty(identityList)) {
			LOGGER.info(" *** end maintainIdentity*****");
			return CommonUtils.updatedSuccessfully("Employee Identity Updated Succesfully",identityDTO.getEmployeeID(),identityDTO.getIdentityID());
		}
		return CommonUtils.sendErrorDetails("Employee Identity not Updated Successfully, Please check the Data and Update Once Again");
	}

	

	@Override
	public String deletePersonalData(@PathVariable int employeeId) {
		LOGGER.info(" *** start deletePersonalData *****");
		String status = employeeInfoService.deletePersonalData(employeeId);
		LOGGER.info(" *** end deletePersonalData *****");
		return status;
	}

}
