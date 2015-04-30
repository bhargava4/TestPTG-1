package com.trinet.aboutme.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.trinet.aboutme.beans.Address;
import com.trinet.aboutme.dao.EmployeeInfoDAO;
import com.trinet.aboutme.dtos.AddressDTO;
import com.trinet.aboutme.service.EmployeeInfoService;

public class EmployeeInfoServiceImpl implements EmployeeInfoService {
	
	private EmployeeInfoDAO employeeInfoDAO;


	@Override
	public List<AddressDTO> getAddress(Integer employeeId) {
		List<AddressDTO> addressDTOList = new ArrayList<AddressDTO>();
		List<Address> addressList = employeeInfoDAO.getAddress(employeeId);
		for (Address address : addressList) {
			AddressDTO addressDTO = new AddressDTO(); 
			BeanUtils.copyProperties(address, addressDTO);
			addressDTOList.add(addressDTO);
		}
		return addressDTOList;
	}


	public EmployeeInfoDAO getEmployeeInfoDAO() {
		return employeeInfoDAO;
	}


	public void setEmployeeInfoDAO(EmployeeInfoDAO employeeInfoDAO) {
		this.employeeInfoDAO = employeeInfoDAO;
	}

}
