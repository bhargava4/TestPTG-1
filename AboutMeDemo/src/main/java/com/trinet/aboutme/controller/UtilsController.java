package com.trinet.aboutme.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.trinet.aboutme.dtos.SelectItemDTO;

/**
 * @author Bhargava
 *
 */
@RequestMapping("/utils")
public interface UtilsController {

	@RequestMapping(value="/gender", method=RequestMethod.GET)
	List<SelectItemDTO> getGenderList();
	
	@RequestMapping(value="/maritalstatus", method=RequestMethod.GET)
	List<SelectItemDTO> getMaritalStatusList();
	
	@RequestMapping(value="/formofaddress", method=RequestMethod.GET)
	List<SelectItemDTO> getFormOfAddressList();

	@RequestMapping(value="/suffix", method=RequestMethod.GET)
	List<SelectItemDTO> getSuffixList();
	
	@RequestMapping(value="/addresstypes", method=RequestMethod.GET)
	List<SelectItemDTO> getAddressTypesList();
	
	@RequestMapping(value="/media", method=RequestMethod.GET)
	List<SelectItemDTO> getMediaList();
	
	@RequestMapping(value="/militaryStatus", method=RequestMethod.GET)
	List<SelectItemDTO> getMilitaryStatusList();
	
	@RequestMapping(value="/ethnicity", method=RequestMethod.GET)
	List<SelectItemDTO> getEthnicityList();
	
	@RequestMapping(value="/countries", method=RequestMethod.GET)
	List<SelectItemDTO> getCountriesList();
	
	@RequestMapping(value="/countries/{countryId}", method=RequestMethod.GET)
	List<SelectItemDTO> getStatesListByCountry(@PathVariable String countryId);
	
}
