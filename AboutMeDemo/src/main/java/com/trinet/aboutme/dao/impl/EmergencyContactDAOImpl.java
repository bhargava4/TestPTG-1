/**
 * 
 */
package com.trinet.aboutme.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import com.trinet.aboutme.beans.EmergencyContact;
import com.trinet.aboutme.dao.EmergencyContactDAO;

/**
 * @author Bhargava
 *
 */
public class EmergencyContactDAOImpl extends HibernateDaoSupport implements
		EmergencyContactDAO {
	DetachedCriteria criteria = DetachedCriteria.forClass(EmergencyContact.class);	
	/* (non-Javadoc)
	 * @see com.trinet.aboutme.dao.EmergencyContactDAO#getEmergencyContacts(int)
	 */
	@Override
	public List<EmergencyContact> getEmergencyContacts(Integer employeeId) {
		criteria.add(Restrictions.eq("employeeId", employeeId));
		return (List<EmergencyContact>)getHibernateTemplate().findByCriteria(criteria);
	}

}
