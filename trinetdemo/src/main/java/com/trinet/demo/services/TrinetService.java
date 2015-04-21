package com.trinet.demo.services;

import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.trinet.demo.beans.Employee;
import com.trinet.demo.dao.EmployeeDao;

public class TrinetService {
	
	
	public void getEmployeeInfo(String employeeId){
		
		      
		    Resource r=new ClassPathResource("applicationContext.xml");  
		    @SuppressWarnings("deprecation")
			BeanFactory factory=new XmlBeanFactory(r);  
		      
		    EmployeeDao employee=(EmployeeDao)factory.getBean("employeeDao");  
		      
		    List<Employee> employeeList = employee.getEmployees();
		    for(Employee emp:employeeList){
		    	System.out.println(emp.getFirst_name());
		    }
	}

	public static void main(String args[]){
		TrinetService trinetService = new TrinetService();
		trinetService.getEmployeeInfo("1001");
	}
}
