package com.trinet.aboutme.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.trinet.aboutme.dtos.CustomDetailsDTO;
import com.trinet.aboutme.dtos.PasswordDTO;
import com.trinet.aboutme.dtos.RolesDTO;
import com.trinet.aboutme.dtos.SecretDTO;
import com.trinet.aboutme.service.SIMService;
/**
 * 
 * @author Anitha
 *
 */
@RestController
public class SIMControllerImpl implements SIMController{
	@Autowired
	private SIMService simService;
	
	@Override
	public String createCustomLogin(@RequestBody CustomDetailsDTO loginDetailsDTO) {
		return simService.createCustomLogin(loginDetailsDTO);
		
	}

	@Override
	public String updatePassword(@RequestBody PasswordDTO passwordDTO) {
		return simService.updatePassword(passwordDTO);
	}

	@Override
	public String updateSecret(@RequestBody SecretDTO secretDTO) {
		return simService.updateSecretQstAndAns(secretDTO);
	}
	
	@Override
	public String insertRoles(@RequestBody RolesDTO rolesDTO){
		return simService.insertRoles(rolesDTO);
	}
	
	@Override
	public
	String deleteRoles(@RequestBody RolesDTO rolesDTO){
		return simService.deleteRoles(rolesDTO);
	}

	/*@Override
	public LoginDetailsDTO uGetSecret() {
		// TODO Auto-generated method stub
		LoginDetailsDTO l = new LoginDetailsDTO();
				
		return l;
	}*/

	

}
