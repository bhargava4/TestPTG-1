/**
 * 
 */
package com.trinet.aboutme.dao.impl;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import com.trinet.aboutme.beans.EmployeeOptions;
import com.trinet.aboutme.dao.EmployeeOptionsDAO;



/**
 * @author Swathi
 *
 */
public class EmployeeOptionsDAOImpl extends HibernateDaoSupport implements
		EmployeeOptionsDAO {

	/* (non-Javadoc)
	 * @see com.trinet.aboutme.dao.EmergencyContactDAO#getEmergencyContacts(int)
	 */



	@Override
	public void updateEmployeeOptions(EmployeeOptions employeeoptions) {
		getHibernateTemplate().update(employeeoptions);
	}

	
}
