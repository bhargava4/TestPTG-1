package com.trinet.aboutme.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.trinet.aboutme.dtos.EmployeeProfileDTO;
import com.trinet.aboutme.service.EmployeeProfileService;


@RestController
public class EmployeProfileControllerImpl implements EmployeeProfileController {

	@Autowired
	private EmployeeProfileService employeeProfileService;

	/* (non-Javadoc)
	 * @see com.trinet.aboutme.controller.EmployeeProfileController#getWorkProfile(int)
	 */
	@Override
	public EmployeeProfileDTO getWorkProfile(@PathVariable int employeeNo) {
		System.out.println("****** Start getWorkProfile ******* ");
		List<EmployeeProfileDTO> employeeProfileDTOList = employeeProfileService
				.getWorkProfile(employeeNo);
		System.out.println("****** end getWorkProfile ******* ");
		if(employeeProfileDTOList.size()>0){
			return employeeProfileDTOList.get(0);
		}
		return null;
	}

	

}
