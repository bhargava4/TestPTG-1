package com.trinet.aboutme.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import com.trinet.aboutme.beans.Address;
import com.trinet.aboutme.beans.Contact;
import com.trinet.aboutme.beans.Name;

import com.trinet.aboutme.dao.EmployeeInfoDAO;

public class EmployeeInfoDAOImpl extends HibernateDaoSupport implements
		EmployeeInfoDAO {


		@Override
	public List<Address> getAddress(Integer employeeId) {
		 DetachedCriteria criteria = DetachedCriteria
				.forClass(Address.class);
		 criteria.add(Restrictions.eq("employeeID", employeeId));
		List<Address> findByCriteria = (List<Address>)getHibernateTemplate().findByCriteria(criteria);
		return findByCriteria;
	}

	@Override
	public List<Contact> getContact(Integer employeeId) {
		 DetachedCriteria criteria = DetachedCriteria
					.forClass(Contact.class);
		 criteria.add(Restrictions.eq("employeeID", employeeId));
		List<Contact> findByCriteria = (List<Contact>)getHibernateTemplate().findByCriteria(criteria);
		return findByCriteria;
	}

	@Override
	public List<Name> getName(Integer employeeId) {
		 DetachedCriteria criteria = DetachedCriteria
					.forClass(Name.class);
		 criteria.add(Restrictions.eq("employeeID", employeeId));
		List<Name> findByCriteria = (List<Name>)getHibernateTemplate().findByCriteria(criteria);
		return findByCriteria;
	}


}
