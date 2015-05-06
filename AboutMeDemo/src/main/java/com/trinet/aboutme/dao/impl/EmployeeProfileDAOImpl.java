package com.trinet.aboutme.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import com.trinet.aboutme.beans.Contact;
import com.trinet.aboutme.beans.EmergencyContact;
import com.trinet.aboutme.beans.EmployeeProfile;
import com.trinet.aboutme.beans.Name;
import com.trinet.aboutme.dao.EmployeeProfileDAO;

public class EmployeeProfileDAOImpl extends HibernateDaoSupport implements EmployeeProfileDAO{
	


	@Override
	public List<EmployeeProfile> getWorkProfile(Integer eNo) {

		 DetachedCriteria criteria = DetachedCriteria
					.forClass(EmployeeProfile.class);
		 criteria.add(Restrictions.eq("employeeNo", eNo));
		List<EmployeeProfile> findByCriteria = (List<EmployeeProfile>)getHibernateTemplate().findByCriteria(criteria);
		return findByCriteria;
	}
		
	
	/* (non-Javadoc)
	 * 
	 * 
	 * @see com.trinet.aboutme.dao.EmployeeProfileDAO#saveEmployeeProfile(com.trinet.aboutme.beans.EmployeeProfile)
	 */
	
	@Override
	public void saveEmployeeProfile(EmployeeProfile employeeProfile) {
		getHibernateTemplate().save(employeeProfile);
	}	

	
	/* (non-Javadoc)
	 * @see com.trinet.aboutme.dao.EmployeeProfileDAO#updaeEmployeeProfile(com.trinet.aboutme.beans.EmployeeProfile)
	 */
	@Override
	public void updaeEmployeeProfile(EmployeeProfile employeeProfile) {
		getHibernateTemplate().update(employeeProfile);
	}

}

