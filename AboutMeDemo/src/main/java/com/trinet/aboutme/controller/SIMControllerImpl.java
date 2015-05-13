package com.trinet.aboutme.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.trinet.aboutme.beans.SuccessResponse;
import com.trinet.aboutme.dtos.CustomDetailsDTO;
import com.trinet.aboutme.dtos.EmergencyContactDTO;
import com.trinet.aboutme.dtos.PasswordDTO;
import com.trinet.aboutme.dtos.RolesDTO;
import com.trinet.aboutme.dtos.SecretDTO;
import com.trinet.aboutme.service.SIMService;
import com.trinet.aboutme.utils.CommonUtils;
/**
 * 
 * @author Anitha
 *
 */
@RestController
public class SIMControllerImpl implements SIMController{
	private static final Logger LOGGER = LoggerFactory.getLogger(SIMControllerImpl.class);
	private SuccessResponse successResponse;
	@Autowired
	private SIMService simService;
	
	@Override
	public Object createCustomLogin(@RequestBody CustomDetailsDTO loginDetailsDTO) {
		try {
			simService.createCustomLogin(loginDetailsDTO);
		} catch (Exception e) {
			CommonUtils.sendErrorDetails(e.getMessage(),"500");
		}
		
		return CommonUtils.updatedSuccessfully(loginDetailsDTO);
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
	public Object insertRoles(@RequestBody RolesDTO rolesDTO) {
		try {
			simService.insertRoles(rolesDTO);
		} catch (Exception e) {
			CommonUtils.sendErrorDetails(e.getMessage(),"500");
		}
		
		return CommonUtils.updatedSuccessfully(rolesDTO);
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
