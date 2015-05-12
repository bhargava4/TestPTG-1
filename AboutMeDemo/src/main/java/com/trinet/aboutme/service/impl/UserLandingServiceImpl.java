/**
 * 
 */
package com.trinet.aboutme.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.trinet.aboutme.beans.TextToken;
import com.trinet.aboutme.dao.UserLandingDAO;
import com.trinet.aboutme.dtos.UserLandingDTO;
import com.trinet.aboutme.service.UserLandingService;

/**
 * @author Bhargava
 *
 */
public class UserLandingServiceImpl implements UserLandingService {

	private UserLandingDAO userLandingDAO;

	/**
	 * @return the userLandingDAO
	 */
	public UserLandingDAO getUserLandingDAO() {
		return userLandingDAO;
	}

	/**
	 * @param userLandingDAO the userLandingDAO to set
	 */
	public void setUserLandingDAO(UserLandingDAO userLandingDAO) {
		this.userLandingDAO = userLandingDAO;
	}

	/* (non-Javadoc)
	 * @see com.trinet.aboutme.service.UserLandingService#getImportantNotices(int)
	 */
	@Override
	public List<UserLandingDTO> getImportantNotices(int employeeId) {
		List<Object[]> tokens = userLandingDAO.getImportantNotices(employeeId);
		List<UserLandingDTO> importantNotices = new ArrayList<UserLandingDTO>();
		for (Object[] object : tokens) {
			importantNotices.add(getUserLandingDTOObj(object));
		}
		return importantNotices;
	}

	private UserLandingDTO getUserLandingDTOObj(Object[] object) {
		TextToken textToken = (TextToken)object[0];
		UserLandingDTO userLandingDTO = new UserLandingDTO();
		userLandingDTO.setTextTokenId(textToken.getTextTokenId());
		userLandingDTO.setTextToken(textToken.getTextToken());
		userLandingDTO.setAuditKey(textToken.getAuditKey());
		userLandingDTO.setUpdateKey(textToken.getUpdateKey());
		userLandingDTO.setDisplaySeq((Integer)object[1]);
		return userLandingDTO;
	}
	
	@Override
	public List<UserLandingDTO> getItemsOfInterest(int employeeId) {
		List<Object[]> tokens = userLandingDAO.getItemsOfInterest(employeeId);
		List<UserLandingDTO> itemsOfInterest = new ArrayList<UserLandingDTO>();
		for (Object[] object : tokens) {
			itemsOfInterest.add(getUserLandingDTOObj(object));
		}
		return itemsOfInterest;
	}
	
}
