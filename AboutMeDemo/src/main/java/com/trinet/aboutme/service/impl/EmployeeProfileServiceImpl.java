package com.trinet.aboutme.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.trinet.aboutme.beans.EmployeeProfile;
import com.trinet.aboutme.dao.EmployeeProfileDAO;
import com.trinet.aboutme.dtos.EmployeeProfileDTO;
import com.trinet.aboutme.service.EmployeeProfileService;

public class EmployeeProfileServiceImpl implements EmployeeProfileService{
	private EmployeeProfileDAO employeeProfileDao;
	@Override
	public List<EmployeeProfileDTO> getWorkProfile(Integer employeeNo) {
		List<EmployeeProfileDTO> dtosList = new ArrayList<EmployeeProfileDTO>();
		List<EmployeeProfile> list = employeeProfileDao.getWorkProfile(employeeNo);
		for (EmployeeProfile employeeProfile : list) {
			EmployeeProfileDTO profileDTO = new EmployeeProfileDTO(); 
			BeanUtils.copyProperties(employeeProfile, profileDTO);
			dtosList.add(profileDTO);
		}
		return dtosList;
	}

}
