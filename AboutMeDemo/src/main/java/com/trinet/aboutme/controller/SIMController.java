package com.trinet.aboutme.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.trinet.aboutme.dtos.CustomDetailsDTO;
import com.trinet.aboutme.dtos.PasswordDTO;
import com.trinet.aboutme.dtos.RolesDTO;
import com.trinet.aboutme.dtos.SecretDTO;

@RequestMapping("/simapi")
public interface SIMController {
	
	@RequestMapping(value = "/customlogin", method = RequestMethod.POST, consumes = "application/json")
	Object createCustomLogin(@RequestBody CustomDetailsDTO loginDetailsDTO);

	@RequestMapping(value = "/password", method = RequestMethod.PUT, consumes = "application/json")
	String updatePassword(@RequestBody PasswordDTO passwordDTO);

	@RequestMapping(value = "/secret", method = RequestMethod.PUT, consumes = "application/json")
	String updateSecret(@RequestBody SecretDTO secretDTO);

	@RequestMapping(value = "/roles", method = RequestMethod.POST)
	Object insertRoles(@RequestBody RolesDTO rolesDTO);

	@RequestMapping(value = "/roles", method = RequestMethod.DELETE)
	String deleteRoles(@RequestBody RolesDTO rolesDTO);

}
