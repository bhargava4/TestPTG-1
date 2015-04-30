/**
 * 
 */
package com.trinet.aboutme.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.trinet.aboutme.beans.EmergencyContact;
import com.trinet.aboutme.dao.EmergencyContactDAO;
import com.trinet.aboutme.dtos.EmergencyContactDTO;
import com.trinet.aboutme.service.EmergencyContactService;

/**
 * @author Bhargava
 *
 */
public class EmergencyContactServiceImpl implements EmergencyContactService {

	private EmergencyContactDAO emergencyContactDAO;

	/**
	 * @return the emergencyContactDAO
	 */
	public EmergencyContactDAO getEmergencyContactDAO() {
		return emergencyContactDAO;
	}

	/**
	 * @param emergencyContactDAO the emergencyContactDAO to set
	 */
	public void setEmergencyContactDAO(EmergencyContactDAO emergencyContactDAO) {
		this.emergencyContactDAO = emergencyContactDAO;
	}

	/* (non-Javadoc)
	 * @see com.trinet.aboutme.service.EmergencyContactService#getEmergencyContacts(int)
	 */
	@Override
	public List<EmergencyContactDTO> getEmergencyContacts(Integer employeeId) {
		List<EmergencyContactDTO> dtosList = new ArrayList<EmergencyContactDTO>();
		List<EmergencyContact> list = emergencyContactDAO.getEmergencyContacts(employeeId);
		for (EmergencyContact emergencyContact : list) {
			EmergencyContactDTO contactDTO = new EmergencyContactDTO(); 
			BeanUtils.copyProperties(emergencyContact, contactDTO);
			dtosList.add(contactDTO);
		}
		return dtosList;
	}
	
}
