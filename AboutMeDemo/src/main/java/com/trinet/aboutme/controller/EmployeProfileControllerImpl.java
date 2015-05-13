package com.trinet.aboutme.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.trinet.aboutme.beans.SuccessResponse;
import com.trinet.aboutme.dtos.EmployeeProfileDTO;
import com.trinet.aboutme.service.EmployeeProfileService;
import com.trinet.aboutme.utils.CommonUtils;


@RestController
public class EmployeProfileControllerImpl implements EmployeeProfileController {

	private static final Logger LOGGER = LoggerFactory.getLogger(EmployeProfileControllerImpl.class);
	private SuccessResponse successResponse;
	@Autowired
	private EmployeeProfileService employeeProfileService;
	

	

	@Override
	public Object getWorkProfile(@PathVariable int employeeNo) {
		LOGGER.info("Get employee profile  detailes of Employee:" + employeeNo);
		try {
			if(employeeProfileService.getWorkProfile(new Integer(employeeNo)).size()>0)
		return CommonUtils.updatedSuccessfully(employeeProfileService.getWorkProfile(new Integer(employeeNo)));
			return CommonUtils.sendErrorDetails("No Record Found, Bad Request","400");
		} catch (Exception e) {
			return CommonUtils.sendErrorDetails(e.getMessage(),"500");
		}
	}
	

}
