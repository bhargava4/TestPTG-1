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
import com.trinet.aboutme.dtos.EmergencyContactDTO;
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
	private SuccessResponse successResponse;
	
	@Autowired
	private EmployeeInfoService employeeInfoService;
	

	
	@Override
	public Object getAddress(@PathVariable int employeeId) {
		LOGGER.info("Get Employee information of Employee:" + employeeId);
		try {
			if(employeeInfoService.getAddress(new Integer(employeeId)).size()>0)
		return CommonUtils.updatedSuccessfully(employeeInfoService.getAddress(new Integer(employeeId)));
			return CommonUtils.sendErrorDetails("No Record Found, Bad Request","400");
		} catch (Exception e) {
			return CommonUtils.sendErrorDetails(e.getMessage(),"500");
		}
	}

	
	@Override
	public Object getContact(@PathVariable int employeeId) {
		LOGGER.info("Get Employee information of Employee:" + employeeId);
		try {
			if(employeeInfoService.getContact(new Integer(employeeId)).size()>0)
		return CommonUtils.updatedSuccessfully(employeeInfoService.getContact(new Integer(employeeId)));
			return CommonUtils.sendErrorDetails("No Record Found, Bad Request","400");
		} catch (Exception e) {
			return CommonUtils.sendErrorDetails(e.getMessage(),"500");
		}
	}

	
	@Override
	public Object getName(@PathVariable int employeeId) {
		LOGGER.info("Get Employee information of Employee:" + employeeId);
		try {
			if(employeeInfoService.getName(new Integer(employeeId)).size()>0)
		return CommonUtils.updatedSuccessfully(employeeInfoService.getName(new Integer(employeeId)));
			return CommonUtils.sendErrorDetails("No Record Found, Bad Request","400");
		} catch (Exception e) {
			return CommonUtils.sendErrorDetails(e.getMessage(),"500");
		}
	}


	@Override
	public Object getIdentityByEmployee(@PathVariable int employeeId) {
		LOGGER.info("Get Employee information of Employee:" + employeeId);
		try {
			if(employeeInfoService.getIdentityByEmployee(new Integer(employeeId)).size()>0)
		return CommonUtils.updatedSuccessfully(employeeInfoService.getIdentityByEmployee(new Integer(employeeId)));
			return CommonUtils.sendErrorDetails("No Record Found, Bad Request","400");
		} catch (Exception e) {
			return CommonUtils.sendErrorDetails(e.getMessage(),"500");
		}
	}

	
	@Override
	public Object getPersonalData(@PathVariable int employeeId) {
		LOGGER.info("Get Employee information of Employee:" + employeeId);
		try {
			if(employeeInfoService.getPersonalData(new Integer(employeeId)).size()>0)
		return CommonUtils.updatedSuccessfully(employeeInfoService.getPersonalData(new Integer(employeeId)));
			return CommonUtils.sendErrorDetails("No Record Found, Bad Request","400");
		} catch (Exception e) {
			return CommonUtils.sendErrorDetails(e.getMessage(),"500");
		}
	}


	@Override
	public Object maintainAddress(@RequestBody AddressDTO addressDTO) {
		try {
			employeeInfoService.maintainAddress(addressDTO);
		} catch (Exception e) {
			CommonUtils.sendErrorDetails(e.getMessage(),"500");
		}
		
		return CommonUtils.updatedSuccessfully(addressDTO);
	}


	@Override
	public Object maintainContact(@RequestBody ContactDTO contactDTO) {
		try {
			employeeInfoService.maintainContact(contactDTO);
		} catch (Exception e) {
			CommonUtils.sendErrorDetails(e.getMessage(),"500");
		}
		
		return CommonUtils.updatedSuccessfully(contactDTO);
	}
	
	@Override
	public Object maintainName(@RequestBody NameDTO nameDTO) {
		try {
			employeeInfoService.maintainName(nameDTO);
		} catch (Exception e) {
			CommonUtils.sendErrorDetails(e.getMessage(),"500");
		}
		
		return CommonUtils.updatedSuccessfully(nameDTO);
	}
	
	@Override
	public Object maintainPersonalData(@RequestBody PersonalDataDTO personalDataDTO) {
		try {
			employeeInfoService.maintainPersonalData(personalDataDTO);
		} catch (Exception e) {
			CommonUtils.sendErrorDetails(e.getMessage(),"500");
		}
		
		return CommonUtils.updatedSuccessfully(personalDataDTO);
	}
	

	@Override
	public Object maintainIdentity(@RequestBody IdentityDTO identityDTO) {
		try {
			employeeInfoService.maintainIdentity(identityDTO);
		} catch (Exception e) {
			CommonUtils.sendErrorDetails(e.getMessage(),"500");
		}
		
		return CommonUtils.updatedSuccessfully(identityDTO);
	}

	@Override
	public String deletePersonalData(@PathVariable int employeeId) {
		LOGGER.info(" *** start deletePersonalData *****");
		String status = employeeInfoService.deletePersonalData(employeeId);
		LOGGER.info(" *** end deletePersonalData *****");
		return status;
	}

}
