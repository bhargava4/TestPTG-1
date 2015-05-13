package com.trinet.aboutme.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.trinet.aboutme.dtos.SelectItemDTO;
import com.trinet.aboutme.utils.CommonUtils;

/**
 * @author Bhargava
 * Handles requests for the application home page.
 */
@RestController
public class UtilsControllerImpl implements UtilsController{
	
	private static final Logger logger = LoggerFactory.getLogger(UtilsControllerImpl.class);
	

	/* (non-Javadoc)
	 * @see com.trinet.aboutme.controller.UtilsController#getGender()
	 */
	@Override
	public List<SelectItemDTO> getGenderList() {
		return CommonUtils.gender;
	}

	/* (non-Javadoc)
	 * @see com.trinet.aboutme.controller.UtilsController#getMaritalStatusList()
	 */
	@Override
	public List<SelectItemDTO> getMaritalStatusList() {
		return CommonUtils.maritalStatus;
	}

	/* (non-Javadoc)
	 * @see com.trinet.aboutme.controller.UtilsController#getFormOfAddressList()
	 */
	@Override
	public List<SelectItemDTO> getFormOfAddressList() {
		return CommonUtils.formOfAddress;
	}

	/* (non-Javadoc)
	 * @see com.trinet.aboutme.controller.UtilsController#getSuffixList()
	 */
	@Override
	public List<SelectItemDTO> getSuffixList() {
		return CommonUtils.suffix;
	}

	/* (non-Javadoc)
	 * @see com.trinet.aboutme.controller.UtilsController#getAddressTypesList()
	 */
	@Override
	public List<SelectItemDTO> getAddressTypesList() {
		return CommonUtils.addressTypes;
	}

	/* (non-Javadoc)
	 * @see com.trinet.aboutme.controller.UtilsController#getMediaList()
	 */
	@Override
	public List<SelectItemDTO> getMediaList() {
		return CommonUtils.media;
	}

	/* (non-Javadoc)
	 * @see com.trinet.aboutme.controller.UtilsController#getMilitaryStatusList()
	 */
	@Override
	public List<SelectItemDTO> getMilitaryStatusList() {
		return CommonUtils.militaryStatus;
	}

	/* (non-Javadoc)
	 * @see com.trinet.aboutme.controller.UtilsController#getEthnicityList()
	 */
	@Override
	public List<SelectItemDTO> getEthnicityList() {
		return CommonUtils.ethnicity;
	}

	/* (non-Javadoc)
	 * @see com.trinet.aboutme.controller.UtilsController#getCountriesList()
	 */
	@Override
	public List<SelectItemDTO> getCountriesList() {
		return CommonUtils.countries;
	}

	/* (non-Javadoc)
	 * @see com.trinet.aboutme.controller.UtilsController#getStatesListByCountry(java.lang.String)
	 */
	@Override
	public List<SelectItemDTO> getStatesListByCountry(@PathVariable String countryId) {
		if("us".equalsIgnoreCase(countryId))
			return CommonUtils.usstates;
		else if("ca".equalsIgnoreCase(countryId))
			return CommonUtils.castates;
		return null;
	}

	
	
}
