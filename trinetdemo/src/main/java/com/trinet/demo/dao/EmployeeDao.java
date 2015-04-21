package com.trinet.demo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.trinet.demo.beans.Employee;

public class EmployeeDao{
	HibernateTemplate templateName;

	public HibernateTemplate getTemplate() {
		return templateName;
	}

	public EmployeeDao() {
		System.out.println("Default Contructor....");
	}

	public void setTemplate(HibernateTemplate template) {
		this.templateName = templateName;
	}

	// method to save employee
	public void saveEmployee(Employee e) {
		templateName.save(e);
	}

	// method to update employee
	public void updateEmployee(Employee e) {
		templateName.update(e);
	}

	// method to delete employee
	public void deleteEmployee(Employee e) {
		templateName.delete(e);
	}

	// method to return one employee of given id
	public Employee getById(int id) {
		Employee e = (Employee) templateName.get(Employee.class, id);
		return e;
	}

	// method to return all employees
	public List<Employee> getEmployees() {
		List<Employee> list = new ArrayList<Employee>();
		list = templateName.loadAll(Employee.class);
		return list;
	}
}
