/**
 * 
 */
package com.trinet.aboutme.dao;

import java.util.List;

import com.trinet.aboutme.beans.TextToken;

/**
 * @author Bhargava
 *
 */
public interface UserLandingDAO {

	List<Object[]> getImportantNotices(Integer employeeId);

	List<Object[]> getItemsOfInterest(Integer employeeId);

}
