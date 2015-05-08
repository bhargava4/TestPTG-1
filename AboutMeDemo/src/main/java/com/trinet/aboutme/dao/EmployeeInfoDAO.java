package com.trinet.aboutme.dao;

import java.util.List;

import com.trinet.aboutme.beans.Address;
import com.trinet.aboutme.beans.Contact;
import com.trinet.aboutme.beans.Identity;
import com.trinet.aboutme.beans.Name;
import com.trinet.aboutme.beans.PersonalData;
import com.trinet.aboutme.dtos.AddressDTO;
import com.trinet.aboutme.dtos.ContactDTO;
import com.trinet.aboutme.dtos.IdentityDTO;
import com.trinet.aboutme.dtos.NameDTO;
import com.trinet.aboutme.dtos.PersonalDataDTO;
public interface EmployeeInfoDAO {
	
	List<Address> getAddress(Integer employeeId);
	
	List<Contact> getContact(Integer employeeId);

	List<Name> getName(Integer employeeId);
	
	List<Identity> getIdentity(Integer identityId);
	
	List<Identity> getIdentityByEmployee(Integer employeeId);
	
	List<PersonalData> getPersonalData(Integer employeeId);

	List<Address> maintaniAddress(AddressDTO addressDTO);
	
	List<Contact> maintaniContact(ContactDTO contactDTO);
	
	List<Name> maintaniName(NameDTO nameDTO);
	
	List<PersonalData> maintaniPersonalData(PersonalDataDTO personalDataDTO);
	
	List<Identity> maintaniIdentity(IdentityDTO identityDTO);

	String deletePersonalData(Integer employeeId);


}
