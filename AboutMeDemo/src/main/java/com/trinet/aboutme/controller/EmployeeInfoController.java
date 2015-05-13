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
@RequestMapping("/empIoyeeinfoapi")
public interface EmployeeInfoController {

	@RequestMapping(value = "/addresses/{employeeId}", method = RequestMethod.GET)
	public Object getAddress(@PathVariable int employeeId);

	@RequestMapping(value = "/contacts/{employeeId}", method = RequestMethod.GET)
	public Object getContact(@PathVariable int employeeId);

	@RequestMapping(value = "/names/{employeeId}", method = RequestMethod.GET)
	public Object getName(@PathVariable int employeeId);

	@RequestMapping(value = "/identities/{employeeId}", method = RequestMethod.GET)
	public Object getIdentityByEmployee(@PathVariable int employeeId);

	@RequestMapping(value = "/personaldata/{employeeId}", method = RequestMethod.GET)
	public Object getPersonalData(@PathVariable int employeeId);

	@RequestMapping(value = "/addresses", method = RequestMethod.PUT, consumes = "application/json")
	public Object maintainAddress(@RequestBody AddressDTO addressDTO);

	@RequestMapping(value = "/contacts", method = RequestMethod.PUT, consumes = "application/json")
	public Object maintainContact(@RequestBody ContactDTO contactDTO);

	@RequestMapping(value = "/names", method = RequestMethod.PUT, consumes = "application/json")
	public Object maintainName(@RequestBody NameDTO nameDTO);

	@RequestMapping(value = "/personaldata", consumes = "application/json", method = RequestMethod.PUT)
	public Object maintainPersonalData(@RequestBody PersonalDataDTO personalDataDTO);
	
	@RequestMapping(value="/identities", method=RequestMethod.PUT)
	public Object maintainIdentity(@RequestBody IdentityDTO identityDTO);


	@RequestMapping(value = "/personaldata/{employeeId}", method = RequestMethod.DELETE)
	public String deletePersonalData(@PathVariable int employeeId);
	
	
	

}
