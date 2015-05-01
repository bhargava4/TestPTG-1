package com.trinet.aboutme.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import com.trinet.aboutme.beans.Address;
import com.trinet.aboutme.dao.EmployeeInfoDAO;

public class EmployeeInfoDAOImpl extends HibernateDaoSupport implements
		EmployeeInfoDAO {

	private DetachedCriteria criteria = DetachedCriteria
			.forClass(Address.class);

	public DetachedCriteria getCriteria() {
		return criteria;
	}

	public void setCriteria(DetachedCriteria criteria) {
		this.criteria = criteria;
	}

	@Override
	public List<Address> getAddress(Integer employeeId) {
		getCriteria().add(Restrictions.eq("employeeID", employeeId));
		List<Address> findByCriteria = (List<Address>)getHibernateTemplate().findByCriteria(criteria);
		return findByCriteria;
	}

}
