package com.trinet.aboutme.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.trinet.aboutme.beans.SuccessResponse;
import com.trinet.aboutme.dtos.UserLandingDTO;
import com.trinet.aboutme.service.UserLandingService;
import com.trinet.aboutme.utils.CommonUtils;

/**
 * @author Bhargava
 * Handles requests for the application landing page.
 */
@RestController
public class UserLandingControllerImpl implements UserLandingController{
	
	private static final Logger logger = LoggerFactory.getLogger(UserLandingControllerImpl.class);
	private SuccessResponse successResponse;
	@Autowired
	private UserLandingService userLandingService;

	/*@Override
	public List<UserLandingDTO> getImportantNotices(@PathVariable int employeeId) {
		logger.info("in getImpNotices");
		return userLandingService.getImportantNotices(employeeId);
	}*/
	@Override
	public Object getImportantNotices(@PathVariable int employeeId) {
		logger.info("Get user landing of Employee:" + employeeId);
		try {
			if(userLandingService.getImportantNotices(new Integer(employeeId)).size()>0)
		return CommonUtils.updatedSuccessfully(userLandingService.getImportantNotices(new Integer(employeeId)));
			return CommonUtils.sendErrorDetails("No Record Found, Bad Request","400");
		} catch (Exception e) {
			return CommonUtils.sendErrorDetails(e.getMessage(),"500");
		}
	}

	
	@Override
	public Object getItemsOfInterest(@PathVariable int employeeId) {
		logger.info("Get user landing of Employee:" + employeeId);
		try {
			if(userLandingService.getItemsOfInterest(new Integer(employeeId)).size()>0)
		return CommonUtils.updatedSuccessfully(userLandingService.getItemsOfInterest(new Integer(employeeId)));
			return CommonUtils.sendErrorDetails("No Record Found, Bad Request","400");
		} catch (Exception e) {
			return CommonUtils.sendErrorDetails(e.getMessage(),"500");
		}
	}
}
