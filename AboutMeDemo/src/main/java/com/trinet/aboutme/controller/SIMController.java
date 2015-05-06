package com.trinet.aboutme.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.trinet.aboutme.dtos.CustomDetailsDTO;
import com.trinet.aboutme.dtos.PasswordDTO;
import com.trinet.aboutme.dtos.RolesDTO;
import com.trinet.aboutme.dtos.SecretDTO;

@RequestMapping("/SIMAPI")
public interface SIMController {
	@RequestMapping(value="/cLogin", method=RequestMethod.POST,consumes="application/json")
	String createCustomLogin(@RequestBody CustomDetailsDTO loginDetailsDTO);
	
	@RequestMapping(value="/updatePassword", method=RequestMethod.PUT,consumes="application/json")
	String updatePassword(@RequestBody PasswordDTO passwordDTO);
	
	@RequestMapping(value="/updateSecret", method=RequestMethod.PUT, consumes="application/json")
	String updateSecret(@RequestBody SecretDTO secretDTO);
	
	@RequestMapping(value="/insertroles", method=RequestMethod.POST)
	String insertRoles(@RequestBody RolesDTO rolesDTO);
	
	/*@RequestMapping(value="/deleteRoles", method=RequestMethod.DELETE)
	String deleteRoles(@RequestBody RolesDTO rolesDTO);*/
	
	@RequestMapping(value="/deleteRoles", method=RequestMethod.PUT)
	String deleteRoles(@RequestBody RolesDTO rolesDTO);

}
