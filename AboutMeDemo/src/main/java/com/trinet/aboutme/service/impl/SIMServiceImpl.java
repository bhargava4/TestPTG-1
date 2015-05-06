package com.trinet.aboutme.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.trinet.aboutme.beans.SIMDetails;
import com.trinet.aboutme.beans.SIMRoles;
import com.trinet.aboutme.dao.SIMDao;
import com.trinet.aboutme.dtos.CustomDetailsDTO;
import com.trinet.aboutme.dtos.PasswordDTO;
import com.trinet.aboutme.dtos.RolesDTO;
import com.trinet.aboutme.dtos.Roll;
import com.trinet.aboutme.dtos.SecretDTO;
import com.trinet.aboutme.service.SIMService;

public class SIMServiceImpl implements SIMService{
	@Autowired
	private SIMDao simDao;
	
	public String createCustomLogin(CustomDetailsDTO loginDetailsDTO){
		SIMDetails simDetails = new SIMDetails();
		BeanUtils.copyProperties(loginDetailsDTO, simDetails);
	//	String password = loginDetailsDTO.getCustomId() + "_temp";
	//	simDetails.setPassword(password);
		String returnString = "success";
		try{
			simDao.createSimDetails(simDetails);
		}catch(Exception e){
			returnString = "Failed to Create SIM details";
		}
		return returnString;
	}
	
	public String updatePassword(PasswordDTO passwordDTO){
		String updateStatus = "Success";
		int empId = passwordDTO.getEmpId();
		String newPassword = passwordDTO.getNewPassword();
		String currentPwd = simDao.getCurrentPassword(empId);
		int update = 0;
		if(currentPwd.equals(passwordDTO.getCurrentPassword())){
			update = simDao.updatePassword(empId, newPassword);
		}
		if(update < 1){
			updateStatus = "Failure. PLease check your current password";
		}
		return updateStatus;
	}
	
	public String insertRoles(RolesDTO rolesDTO){
		String updateStatus = "Success";
		List<SIMRoles> rolesList = getEmpRoleList(rolesDTO);
		try{
			// temporary code. Need to modify
			for(SIMRoles role : rolesList)
			{
				simDao.insertRoles(role);
			}
		}catch(Exception e){
			updateStatus = "Failure";
			e.printStackTrace();
		}
		return updateStatus;
	}
	
	public String updateSecretQstAndAns(SecretDTO secretDTO){
		String updateStatus = "Success";
		int empId = secretDTO.getEmpId();
		String secretQuest = secretDTO.getSecretQst();
		String secretAns = secretDTO.getSecretAns();
		
		int update = simDao.updateSeceret(empId, secretQuest,secretAns);
		if(update < 1){
			updateStatus = "Failure";
		}
		return updateStatus;
	}

	public SIMDao getSimDao() {
		return simDao;
	}

	public void setSimDao(SIMDao simDao) {
		this.simDao = simDao;
	}

	@Override
	public String deleteRoles(RolesDTO rolesDTO) {
		String updateStatus = "Success";
		List<String> roles = new ArrayList<String>();
		List<Roll> rolesToDelete = rolesDTO.getRoleNames();
		for(Roll role : rolesToDelete){
			roles.add(role.getRoll());
		}
		int update = simDao.deleteRoles(rolesDTO.getEmpId(), roles);
		if(update < 1){
			updateStatus = "Failure";
		}
		return updateStatus;
	}

	private List<SIMRoles> getEmpRoleList(RolesDTO rolesDTO){
		int empId = rolesDTO.getEmpId();
		
		List<Roll> newRoles = rolesDTO.getRoleNames();
		List<SIMRoles> rolesList = new ArrayList<SIMRoles>();
		SIMRoles simRoles ;
		for(Roll roll : newRoles){
			simRoles = new SIMRoles();
			simRoles.setEmpId(empId);
			simRoles.setEmpRole(roll.getRoll());
			rolesList.add(simRoles);
		}
		return rolesList;
	}
	
}
