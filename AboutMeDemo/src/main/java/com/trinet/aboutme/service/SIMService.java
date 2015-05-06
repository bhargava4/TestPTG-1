package com.trinet.aboutme.service;

import com.trinet.aboutme.dtos.CustomDetailsDTO;
import com.trinet.aboutme.dtos.PasswordDTO;
import com.trinet.aboutme.dtos.RolesDTO;
import com.trinet.aboutme.dtos.SecretDTO;

/**
 * 
 * @author Anitha
 *
 */
public interface SIMService {
	String createCustomLogin(CustomDetailsDTO loginDetailsDTO);
	
	String updatePassword(PasswordDTO passwordDTO);
	
	String insertRoles(RolesDTO rolesDTO);
	
	String deleteRoles(RolesDTO rolesDTO);
	
	String updateSecretQstAndAns(SecretDTO secretDTO);
}
