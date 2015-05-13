/**
 * 
 */
package com.trinet.aboutme.utils;

import java.util.ArrayList;
import java.util.List;

import com.trinet.aboutme.beans.ErrorResponse;
import com.trinet.aboutme.beans.SuccessResponse;
import com.trinet.aboutme.constants.UtilConstants;
import com.trinet.aboutme.dtos.SelectItemDTO;

/**
 * @author Bhargava
 *
 */
public class CommonUtils {

	public static List<SelectItemDTO> gender = new ArrayList<SelectItemDTO>();
	
	public static List<SelectItemDTO> maritalStatus = new ArrayList<SelectItemDTO>();
	
	public static List<SelectItemDTO> formOfAddress = new ArrayList<SelectItemDTO>();
	
	public static List<SelectItemDTO> suffix = new ArrayList<SelectItemDTO>();
	
	public static List<SelectItemDTO> addressTypes = new ArrayList<SelectItemDTO>();
	
	public static List<SelectItemDTO> media = new ArrayList<SelectItemDTO>();
	
	public static List<SelectItemDTO> militaryStatus = new ArrayList<SelectItemDTO>();
	
	public static List<SelectItemDTO> ethnicity = new ArrayList<SelectItemDTO>();
	
	public static List<SelectItemDTO> countries = new ArrayList<SelectItemDTO>();
	
	public static List<SelectItemDTO> usstates = new ArrayList<SelectItemDTO>();
	
	public static List<SelectItemDTO> castates = new ArrayList<SelectItemDTO>();
	
	static{
		gender.add(new SelectItemDTO(UtilConstants.male, UtilConstants.male));
		gender.add(new SelectItemDTO(UtilConstants.female, UtilConstants.female));
		
		maritalStatus.add(new SelectItemDTO(UtilConstants.single, UtilConstants.single));
		maritalStatus.add(new SelectItemDTO(UtilConstants.married, UtilConstants.married));
		maritalStatus.add(new SelectItemDTO(UtilConstants.divorced, UtilConstants.divorced));
		maritalStatus.add(new SelectItemDTO(UtilConstants.seperated, UtilConstants.seperated));
		maritalStatus.add(new SelectItemDTO(UtilConstants.widowed, UtilConstants.widowed));
		
		formOfAddress.add(new SelectItemDTO(UtilConstants.Mr, UtilConstants.Mr));
		formOfAddress.add(new SelectItemDTO(UtilConstants.Mrs, UtilConstants.Mrs));
		formOfAddress.add(new SelectItemDTO(UtilConstants.Ms, UtilConstants.Ms));
		formOfAddress.add(new SelectItemDTO(UtilConstants.Miss, UtilConstants.Miss));
		formOfAddress.add(new SelectItemDTO(UtilConstants.Dr, UtilConstants.Dr));
		
		suffix.add(new SelectItemDTO(UtilConstants.ii, UtilConstants.ii));
		suffix.add(new SelectItemDTO(UtilConstants.junior, UtilConstants.junior));
		suffix.add(new SelectItemDTO(UtilConstants.iii, UtilConstants.iii));
		suffix.add(new SelectItemDTO(UtilConstants.senior, UtilConstants.senior));
		
		addressTypes.add(new SelectItemDTO(UtilConstants.home_addr, UtilConstants.home_addr));
		addressTypes.add(new SelectItemDTO(UtilConstants.office_addr, UtilConstants.office_addr));
		
		media.add(new SelectItemDTO(UtilConstants.tele, UtilConstants.tele));
		media.add(new SelectItemDTO(UtilConstants.emailAddr, UtilConstants.emailAddr));
		
		militaryStatus.add(new SelectItemDTO(UtilConstants.active_reserve, UtilConstants.active_reserve));
		militaryStatus.add(new SelectItemDTO(UtilConstants.inactive_reserve, UtilConstants.inactive_reserve));
		militaryStatus.add(new SelectItemDTO(UtilConstants.no_military_service, UtilConstants.no_military_service));
		militaryStatus.add(new SelectItemDTO(UtilConstants.not_a_veteran, UtilConstants.not_a_veteran));
		
		ethnicity.add(new SelectItemDTO(UtilConstants.hispanic_latino, UtilConstants.hispanic_latino));
		ethnicity.add(new SelectItemDTO(UtilConstants.decline_to_specify, UtilConstants.decline_to_specify));
		ethnicity.add(new SelectItemDTO(UtilConstants.white, UtilConstants.white));
		ethnicity.add(new SelectItemDTO(UtilConstants.asian, UtilConstants.asian));
		
		countries.add(new SelectItemDTO(UtilConstants.usa, UtilConstants.usa));
		countries.add(new SelectItemDTO(UtilConstants.ca, UtilConstants.ca));
		
		usstates.add(new SelectItemDTO(UtilConstants.us_ca, UtilConstants.us_ca));
		usstates.add(new SelectItemDTO(UtilConstants.us_wv, UtilConstants.us_wv));
		
		castates.add(new SelectItemDTO(UtilConstants.ca_bc, UtilConstants.ca_bc));
		castates.add(new SelectItemDTO(UtilConstants.ca_on, UtilConstants.ca_on));
		
	}
	
	public static Object sendErrorDetails(String errorMessage,String code) {
		ErrorResponse errorDetails=new ErrorResponse();
		errorDetails.setErrorCode(code);
		errorDetails.setErrorMessage(errorMessage);
		return errorDetails;
	}

	public static Object updatedSuccessfully(Object dto) {
		SuccessResponse responseJson=new SuccessResponse();
		responseJson.setRespnoseCode("200");
		responseJson.setSuccessMessage("Success");
		responseJson.setResource(dto);
		return responseJson;
	}
}
