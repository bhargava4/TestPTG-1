/**
 * 
 */
package com.trinet.aboutme.service;

import java.util.List;

import com.trinet.aboutme.dtos.UserLandingDTO;


/**
 * @author Bhargava
 *
 */
public interface UserLandingService {

	List<UserLandingDTO> getImportantNotices(int employeeId);

	List<UserLandingDTO> getItemsOfInterest(int employeeId);

}
