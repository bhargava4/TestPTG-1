package com.trinet.aboutme.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate4.HibernateCallback;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import com.trinet.aboutme.beans.SIMDetails;
import com.trinet.aboutme.beans.SIMRoles;
import com.trinet.aboutme.dao.SIMDao;

public class SIMDaoImpl extends HibernateDaoSupport implements SIMDao {

	@Override
	public void createSimDetails(SIMDetails simDetails) {
		try{
		getHibernateTemplate().save(simDetails);
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	@Override
	public void  udpateSimDetails(SIMDetails simDetails) {
		getHibernateTemplate().update(simDetails);
	}
	@Override
	public String getCurrentPassword(final int empId) {
		//final String empid = Integer.toString(empId);
		String currentPwd =  getHibernateTemplate().execute(new HibernateCallback<String>() {

	        public String doInHibernate(Session s) throws HibernateException{
	        	String stringQuery = "select password from SIMPassword where empId = :empId";
	          Query query =  s.createQuery(stringQuery);
	          query.setParameter("empId", empId );
	          return (String) query.uniqueResult();
	         
	        }
	    });
		
		return currentPwd;
	}

	@SuppressWarnings("unchecked")
	@Override
	public int updatePassword(final int empId, final String newPassword) {
		
		int update =  getHibernateTemplate().execute(new HibernateCallback<Integer>() {

	        public Integer doInHibernate(Session s) throws HibernateException{
	        	String stringQuery = "update SIMPassword set password = :newPassword where empId = :empId";
	          Query query =  s.createQuery(stringQuery);
	          query.setParameter("newPassword", newPassword );
	          query.setParameter("empId", empId );
	           
	          return query.executeUpdate();
	        }
	    });
		
		return update;
	}

	@Override
	public void  insertRoles(SIMRoles simRoles) {
		try{
			
				getHibernateTemplate().save(simRoles);
				//getHibernateTemplate().
			
			}catch(Exception e){
				e.printStackTrace();
			}
	}

	@Override
	public int deleteRoles(final int empId, final List<String> roles) {
		int update =  getHibernateTemplate().execute(new HibernateCallback<Integer>() {

	        public Integer doInHibernate(Session s) throws HibernateException{
	        	String stringQuery = "delete from SIMRoles where empId = :empId  and empRole in (:roles)";
	          Query query =  s.createQuery(stringQuery);
	          query.setParameter("empId", empId );
	          query.setParameterList("roles", roles);
	          
	               	           
	          return query.executeUpdate();
	        }
	    });
		
		return update;
	}

	@Override
	public int updateSeceret(final int empId, final String secretQst,
			final String secretAns) {
		int update =  getHibernateTemplate().execute(new HibernateCallback<Integer>() {

	        public Integer doInHibernate(Session s) throws HibernateException{
	        	String stringQuery = "update SIMSecret set secretQst = :secretQst , secretAns=:secretAns where empId = :empId";
	          Query query =  s.createQuery(stringQuery);
	          query.setParameter("empId", empId );
	          query.setParameter("secretQst", secretQst );
	          query.setParameter("secretAns", secretAns );
	           
	          return query.executeUpdate();
	        }
	    });
		
		return update;
	}

}
