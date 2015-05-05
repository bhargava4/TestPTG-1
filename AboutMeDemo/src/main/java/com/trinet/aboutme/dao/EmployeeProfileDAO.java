package com.trinet.aboutme.dao;

import java.util.List;

import com.trinet.aboutme.beans.EmployeeProfile;

public interface EmployeeProfileDAO {
	List<EmployeeProfile> getWorkProfile(Integer employeeNo);
	
	void saveEmployeeProfile(EmployeeProfile employeeProfile);
	void updaeEmployeeProfile(EmployeeProfile employeeProfile);
}
