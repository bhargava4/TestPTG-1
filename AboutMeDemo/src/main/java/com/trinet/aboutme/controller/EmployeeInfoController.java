/**
 * 
 */
package com.trinet.aboutme.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.trinet.aboutme.dtos.AddressDTO;
import com.trinet.aboutme.dtos.ContactDTO;
import com.trinet.aboutme.dtos.IdentityDTO;
import com.trinet.aboutme.dtos.NameDTO;
import com.trinet.aboutme.dtos.PersonalDataDTO;

/**
 * 
 * interface to provide employee info api's
 * 
 * @author Swathi
 *
 */
@RequestMapping("/employeeinfo")
public interface EmployeeInfoController {

	@RequestMapping(value = "/addresses/{employeeId}", method = RequestMethod.GET)
	public AddressDTO getAddress(@PathVariable int employeeId);

	@RequestMapping(value = "/contacts/{employeeId}", method = RequestMethod.GET)
	public ContactDTO getContact(@PathVariable int employeeId);

	@RequestMapping(value = "/name/{employeeId}", method = RequestMethod.GET)
	public NameDTO getName(@PathVariable int employeeId);

	@RequestMapping(value = "/identity/{employeeId}", method = RequestMethod.GET)
	public IdentityDTO getIdentity(@PathVariable int employeeId);

	@RequestMapping(value = "/personalData/{employeeId}", method = RequestMethod.GET)
	public PersonalDataDTO getPersonalData(@PathVariable int employeeId);

	@RequestMapping(value = "/address", method = RequestMethod.PUT, consumes = "application/json")
	public AddressDTO maintainAddress(@RequestBody AddressDTO addressDTO);

	@RequestMapping(value = "/contact", method = RequestMethod.PUT, consumes = "application/json")
	public ContactDTO maintainContact(@RequestBody ContactDTO contactDTO);

	@RequestMapping(value = "/names", method = RequestMethod.PUT, produces="application/json", consumes = "application/json")
	public NameDTO maintainName(@RequestBody NameDTO nameDTO);

	@RequestMapping(value = "/personaldata", produces="application/json", consumes = "application/json", method = RequestMethod.PUT)
	public PersonalDataDTO maintainPersonalData(@RequestBody PersonalDataDTO personalDataDTO);
	
	@RequestMapping(value="/identities", method=RequestMethod.PUT)
	public IdentityDTO maintainIdentity(@RequestBody IdentityDTO identityDTO);


	@RequestMapping(value = "/personaldata/{employeeId}", method = RequestMethod.DELETE)
	public String deletePersonalData(@PathVariable int employeeId);
	
	
	

}
