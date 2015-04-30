/**
 * 
 */
package com.trinet.aboutme.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.trinet.aboutme.beans.Address;
import com.trinet.aboutme.service.EmergencyContactService;
import com.trinet.aboutme.service.EmployeeInfoService;

/**
 * @author Swathi
 *
 */
public class EmployeeInfoControllerImpl implements EmployeeInfoController {
	private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeInfoControllerImpl.class);
	@Autowired
	private EmployeeInfoService employeeInfoService;
	

	/* (non-Javadoc)
	 * @see com.trinet.aboutme.controller.EmployeeInfoController#getAddress(int)
	 */
	@Override
	public Address getAddress(int employeeId) {
		LOGGER.info(" *** start getAddress *****");
		// TODO Auto-generated method stub
		employeeInfoService.getAddress(employeeId);
		LOGGER.info(" *** end getAddress *****");
		return null;
	}

}
