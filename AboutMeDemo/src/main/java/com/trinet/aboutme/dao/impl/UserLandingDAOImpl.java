/**
 * 
 */
package com.trinet.aboutme.dao.impl;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import com.trinet.aboutme.beans.TextToken;
import com.trinet.aboutme.dao.UserLandingDAO;

/**
 * @author Bhargava
 *
 */
public class UserLandingDAOImpl extends HibernateDaoSupport implements
	UserLandingDAO {

	@Override
	public List<Object[]> getImportantNotices(Integer employeeId) {
		SQLQuery q = getHibernateTemplate().getSessionFactory().getCurrentSession()
				.createSQLQuery("select t1.*,t2.DISPLAY_SEQ as displaySeq from text_tokens t1, splash_content_seq t2 where t1.text_tokenid=t2.text_tokenid order by t2.display_seq");
		q.addEntity(TextToken.class);
		q.addScalar("displaySeq");
		List<Object[]> list = q.list();
		return (list.size()>9)?list.subList(0, 9):list;
	}
	
	@Override
	public List<Object[]> getItemsOfInterest(Integer employeeId) {
		SQLQuery q = getHibernateTemplate().getSessionFactory().getCurrentSession()
				.createSQLQuery("select t1.*,t2.DISPLAY_SEQ as displaySeq from text_tokens t1, splash_content_seq t2 where t1.text_tokenid=t2.text_tokenid order by t2.display_seq");
		q.addEntity(TextToken.class);
		q.addScalar("displaySeq");
		List<Object[]> list = q.list();
		return list;
	}
	
}
