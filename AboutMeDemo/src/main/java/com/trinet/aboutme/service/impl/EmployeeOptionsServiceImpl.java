/**
 * 
 */
package com.trinet.aboutme.service.impl;

import org.springframework.beans.BeanUtils;

import com.trinet.aboutme.beans.EmployeeOptions;
import com.trinet.aboutme.dao.EmployeeOptionsDAO;
import com.trinet.aboutme.dtos.EmployeeOptionsDTO;
import com.trinet.aboutme.service.EmployeeOptionsService;



/**
 * @author Swathi
 *
 */
public class EmployeeOptionsServiceImpl implements EmployeeOptionsService {

	public EmployeeOptionsDAO getEmployeeOptionsDAO() {
		return employeeOptionsDAO;
	}


	public void setEmployeeOptionsDAO(EmployeeOptionsDAO employeeOptionsDAO) {
		this.employeeOptionsDAO = employeeOptionsDAO;
	}


	private EmployeeOptionsDAO employeeOptionsDAO;


	@Override
	public void updateEmployeeOptions(EmployeeOptionsDTO employeeoptionsDTO) {
		EmployeeOptions employeeoptions = new EmployeeOptions();
		BeanUtils.copyProperties(employeeoptionsDTO, employeeoptions);
		employeeOptionsDAO.updateEmployeeOptions(employeeoptions);
	}
	
}
