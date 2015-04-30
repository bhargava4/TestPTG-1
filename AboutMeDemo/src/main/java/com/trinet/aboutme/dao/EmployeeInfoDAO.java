package com.trinet.aboutme.dao;

import java.util.List;

import com.trinet.aboutme.beans.Address;

public interface EmployeeInfoDAO {
	
	List<Address> getAddress(Integer employeeId);
}
