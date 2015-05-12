package com.trinet.aboutme.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.trinet.aboutme.dtos.UserLandingDTO;
import com.trinet.aboutme.service.UserLandingService;

/**
 * @author Bhargava
 * Handles requests for the application landing page.
 */
@RestController
public class UserLandingControllerImpl implements UserLandingController{
	
	private static final Logger logger = LoggerFactory.getLogger(UserLandingControllerImpl.class);
	
	@Autowired
	private UserLandingService userLandingService;

	@Override
	public List<UserLandingDTO> getImportantNotices(@PathVariable int employeeId) {
		logger.info("in getImpNotices");
		return userLandingService.getImportantNotices(employeeId);
	}

	@Override
	public List<UserLandingDTO> getItemsOfInterest(@PathVariable int employeeId) {
		logger.info("in getItemsOfInterest");
		return userLandingService.getItemsOfInterest(employeeId);
	}
	
}
