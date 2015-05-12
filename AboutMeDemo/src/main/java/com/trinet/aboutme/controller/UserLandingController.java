package com.trinet.aboutme.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.trinet.aboutme.dtos.UserLandingDTO;

/**
 * @author Bhargava
 *
 */
@RequestMapping("/userlandingapi")
public interface UserLandingController {

	@RequestMapping(value="/importantnotices/{employeeId}", method=RequestMethod.GET)
	List<UserLandingDTO> getImportantNotices(@PathVariable int employeeId);
	
	@RequestMapping(value="/itemsofinterest/{employeeId}", method=RequestMethod.GET)
	List<UserLandingDTO> getItemsOfInterest(@PathVariable int employeeId);
}
