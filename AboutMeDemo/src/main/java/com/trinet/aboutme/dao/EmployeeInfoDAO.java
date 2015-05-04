package com.trinet.aboutme.dao;

import java.util.List;

import com.trinet.aboutme.beans.Address;
import com.trinet.aboutme.beans.Contact;

public interface EmployeeInfoDAO {
	
	List<Address> getAddress(Integer employeeId);
	
	List<Contact> getContact(Integer employeeId);

	
}
