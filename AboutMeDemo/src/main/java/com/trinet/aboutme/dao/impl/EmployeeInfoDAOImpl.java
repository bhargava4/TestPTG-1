package com.trinet.aboutme.dao.impl;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import antlr.StringUtils;

import com.trinet.aboutme.beans.Address;
import com.trinet.aboutme.beans.Contact;
import com.trinet.aboutme.beans.Identity;
import com.trinet.aboutme.beans.Name;
import com.trinet.aboutme.beans.PersonalData;
import com.trinet.aboutme.dao.EmployeeInfoDAO;
import com.trinet.aboutme.dtos.AddressDTO;
import com.trinet.aboutme.dtos.ContactDTO;
import com.trinet.aboutme.dtos.IdentityDTO;
import com.trinet.aboutme.dtos.NameDTO;
import com.trinet.aboutme.dtos.PersonalDataDTO;

public class EmployeeInfoDAOImpl extends HibernateDaoSupport implements
		EmployeeInfoDAO {


		@Override
	public List<Address> getAddress(Integer employeeId) {
		 DetachedCriteria criteria = DetachedCriteria
				.forClass(Address.class);
		 criteria.add(Restrictions.eq("employeeID", employeeId));
		List<Address> findByCriteria = (List<Address>)getHibernateTemplate().findByCriteria(criteria);
		return findByCriteria;
	}

	@Override
	public List<Contact> getContact(Integer employeeId) {
		 DetachedCriteria criteria = DetachedCriteria
					.forClass(Contact.class);
		 criteria.add(Restrictions.eq("employeeID", employeeId));
		List<Contact> findByCriteria = (List<Contact>)getHibernateTemplate().findByCriteria(criteria);
		return findByCriteria;
	}

	@Override
	public List<Name> getName(Integer employeeId) {
		 DetachedCriteria criteria = DetachedCriteria
					.forClass(Name.class);
		 criteria.add(Restrictions.eq("employeeID", employeeId));
		List<Name> findByCriteria = (List<Name>)getHibernateTemplate().findByCriteria(criteria);
		return findByCriteria;
	}
	
	@Override
	public List<Identity> getIdentity(Integer employeeId) {
		 DetachedCriteria criteria = DetachedCriteria
					.forClass(Identity.class);
		 criteria.add(Restrictions.eq("employeeID", employeeId));
		List<Identity> findByCriteria = (List<Identity>)getHibernateTemplate().findByCriteria(criteria);
		return findByCriteria;
	}

	@Override
	public List<PersonalData> getPersonalData(Integer employeeId) {
		 DetachedCriteria criteria = DetachedCriteria
					.forClass(PersonalData.class);
		 criteria.add(Restrictions.eq("employeeID", employeeId));
		List<PersonalData> findByCriteria = (List<PersonalData>)getHibernateTemplate().findByCriteria(criteria);
		return findByCriteria;
	}
	
	@Override
	public List<Address> maintaniAddress(AddressDTO addressDTO) {
		List<Address> addressList = getAddressByAddressId(addressDTO.getAddressID());
		Address address= new Address();
		if(CollectionUtils.isNotEmpty(addressList))
		{
			address =  addressList.get(0);
		}
		populateAddress(addressDTO, address);
		getHibernateTemplate().saveOrUpdate(address);
		return getAddress(address.getAddressID());
	}

	private void populateAddress(AddressDTO addressDTO, Address address) {
		if(!addressDTO.getAddressLine1().isEmpty()){
		address.setAddressLine1(addressDTO.getAddressLine1());
		}
		if(!addressDTO.getAddressLine2().isEmpty()){
		address.setAddressLine2(addressDTO.getAddressLine2());
		}
		if(addressDTO.getAddressLine3() != null && !addressDTO.getAddressLine3().isEmpty()){
			address.setAddressLine3(addressDTO.getAddressLine3());
		}
		if(!addressDTO.getAddressType().isEmpty()){
		address.setAddressType(addressDTO.getAddressType());
		}
		if(!addressDTO.getCity().isEmpty()){
			address.setCity(addressDTO.getCity());
		}
		if(null!=addressDTO.getCountry() && !addressDTO.getCountry().isEmpty()){
			address.setCountry(addressDTO.getCountry());
		}
		if(!addressDTO.getCounty().isEmpty()){
			address.setCounty(addressDTO.getCounty());
		}
		if(null!=addressDTO.getEffectiveDate() && !addressDTO.getEffectiveDate().isEmpty()){
			address.setEffectiveDate(addressDTO.getEffectiveDate());
		}
		if(addressDTO.getEmployeeID()!=0)
		{
			address.setEmployeeID(addressDTO.getEmployeeID());
		}
		if(null!=addressDTO.getPostalCode() && !addressDTO.getPostalCode().isEmpty()){
			address.setPostalCode(addressDTO.getPostalCode());
		}
		if(null!=addressDTO.getStateOrProvince() && !addressDTO.getStateOrProvince().isEmpty()){
			address.setStateOrProvince(addressDTO.getStateOrProvince());
		}
	}

	public List<Address> getAddressByAddressId(Integer addrId) {
		 DetachedCriteria criteria = DetachedCriteria
				.forClass(Address.class);
		 criteria.add(Restrictions.eq("addressID", addrId));
		List<Address> addressList = (List<Address>)getHibernateTemplate().findByCriteria(criteria);
		return addressList;
	}
	
	@Override
	public List<Contact> maintaniContact(ContactDTO contactDTO) {
		List<Contact> contactList = getContactByContactId(contactDTO.getContactID());
		Contact contact= new Contact();
		if(CollectionUtils.isNotEmpty(contactList))
		{
			contact =  contactList.get(0);
		}
		populateContact(contactDTO, contact);
		getHibernateTemplate().saveOrUpdate(contact);
		return getContact(contact.getContactID());
	}
	
	private void populateContact(ContactDTO contactDTO, Contact contact) {
		if(contactDTO.getContactID()!=0){
		contact.setContactID(contactDTO.getContactID());
		}
		if(contactDTO.getEmployeeID()!=0)
		{
			contact.setEmployeeID(contactDTO.getEmployeeID());
		}
		if(!contactDTO.getAccessType().isEmpty()){
			contact.setAccessType(contactDTO.getAccessType());
		}
		if(!contactDTO.getMedia().isEmpty()){
			contact.setMedia(contactDTO.getMedia());
		}
		if(contactDTO.getTelephoneNo()!=0){
			contact.setTelephoneNo(contactDTO.getTelephoneNo());
		}
		if(!contactDTO.getEmail().isEmpty()){
			contact.setEmail(contactDTO.getEmail());
		}
		
	}
	
	public List<Contact> getContactByContactId(Integer ctactId) {
		 DetachedCriteria criteria = DetachedCriteria
				.forClass(Contact.class);
		 criteria.add(Restrictions.eq("contactID", ctactId));
		List<Contact> contactList = (List<Contact>)getHibernateTemplate().findByCriteria(criteria);
		return contactList;
	}
	
	@Override
	public List<Name> maintaniName(NameDTO nameDTO) {
		List<Name> nameList = getNameByNameId(nameDTO.getNameID());
		Name name= new Name();
		if(CollectionUtils.isNotEmpty(nameList))
		{
			name =  nameList.get(0);
		}
		populateName(nameDTO, name);
		getHibernateTemplate().saveOrUpdate(name);
		return getName(name.getNameID());
	}
	
	private void populateName(NameDTO nameDTO, Name name) {
		if(nameDTO.getNameID()!=0){
			name.setNameID(nameDTO.getNameID());
		}
		if(!nameDTO.getName().isEmpty()){
			name.setName(nameDTO.getName());
		}
		if(nameDTO.getEmployeeID()!=0)
		{
			name.setEmployeeID(nameDTO.getEmployeeID());
		}
		if(!nameDTO.getFormofaddress().isEmpty()){
			name.setFormofaddress(nameDTO.getFormofaddress());
		}
		if(!nameDTO.getFirstName().isEmpty()){
			name.setFirstName(nameDTO.getFirstName());
		}
		if(!nameDTO.getLastName().isEmpty()){
			name.setLastName(nameDTO.getLastName());
		}
		if(!nameDTO.getMiddleName().isEmpty()){
			name.setMiddleName(nameDTO.getMiddleName());
		}
		if(!nameDTO.getSuffix().isEmpty()){
			name.setSuffix(nameDTO.getSuffix());
		}
		if(!nameDTO.getNameType().isEmpty()){
			name.setNameType(nameDTO.getNameType());
		}
		
	}
	
	public List<Name> getNameByNameId(Integer nId) {
		 DetachedCriteria criteria = DetachedCriteria
				.forClass(Name.class);
		 criteria.add(Restrictions.eq("nameID", nId));
		List<Name> nameList = (List<Name>)getHibernateTemplate().findByCriteria(criteria);
		return nameList;
	}
	
	@Override
	public List<PersonalData> maintaniPersonalData(PersonalDataDTO personalDataDTO) {
		List<PersonalData> personalDataList = getPersonalDataByPersonalDataId(personalDataDTO.getPersonalID());
		PersonalData personalData= new PersonalData();
		if(CollectionUtils.isNotEmpty(personalDataList))
		{
			personalData =  personalDataList.get(0);
		}
		populatePersonalData(personalDataDTO, personalData);
		getHibernateTemplate().saveOrUpdate(personalData);
		return getPersonalData(personalData.getPersonalID());
	}
	
	
	private void populatePersonalData(PersonalDataDTO personalDataDTO, PersonalData personalData) {
		if(personalDataDTO.getPersonalID()!=0){
			personalData.setPersonalID(personalDataDTO.getPersonalID());
		}
		if(personalDataDTO.getEmployeeID()!=0)
		{
			personalData.setEmployeeID(personalDataDTO.getEmployeeID());
		}
		if(!personalDataDTO.getEffectiveDate().isEmpty()){
			personalData.setEffectiveDate(personalDataDTO.getEffectiveDate());
		}
		if(!personalDataDTO.getGender().isEmpty()){
			personalData.setGender(personalDataDTO.getGender());
		}
		if(!personalDataDTO.getMartialStatus().isEmpty()){
			personalData.setMartialStatus(personalDataDTO.getMartialStatus());
		}
		if(!personalDataDTO.getBirthDate().isEmpty()){
			personalData.setBirthDate(personalDataDTO.getBirthDate());
		}
		if(!personalDataDTO.getMilitaryStatus().isEmpty()){
			personalData.setMilitaryStatus(personalDataDTO.getMilitaryStatus());
		}
		if(!personalDataDTO.getEthnicity().isEmpty()){
			personalData.setEthnicity(personalDataDTO.getEthnicity());
		}
		
	}
	
	public List<PersonalData> getPersonalDataByPersonalDataId(Integer pDataId) {
		 DetachedCriteria criteria = DetachedCriteria
				.forClass(PersonalData.class);
		 criteria.add(Restrictions.eq("personalID", pDataId));
		List<PersonalData> personalDataList = (List<PersonalData>)getHibernateTemplate().findByCriteria(criteria);
		return personalDataList;
	}

	@Override
	public List<Identity> maintaniIdentity(IdentityDTO identityDTO) {
		List<Identity> identityList = getIdentityByIdentityId(identityDTO.getIdentityID());
		Identity identity= new Identity();
		if(CollectionUtils.isNotEmpty(identityList))
		{
			identity =  identityList.get(0);
		}
		populateIdentity(identityDTO, identity);
		getHibernateTemplate().saveOrUpdate(identity);
		return getIdentity(identity.getIdentityID());
	}

	
	private void populateIdentity(IdentityDTO identityDTO, Identity identity) {
		if(identityDTO.getIdentityID()!=0)
		{
			identity.setIdentityID(identityDTO.getIdentityID());
		}
		
		if(identityDTO.getEmployeeID()!=0)
		{
			identity.setEmployeeID(identityDTO.getEmployeeID());
		}
		if(!identityDTO.getSsn().isEmpty())
		{
          identity.setSsn(identityDTO.getSsn());
		}
		if(!identityDTO.getEmployeeStatus().isEmpty())
		{
			identity.setEmployeeStatus(identityDTO.getEmployeeStatus());
		}
		if(identityDTO.getAlternateEmployeeID()!=0)
		{
			identity.setAlternateEmployeeID(identityDTO.getAlternateEmployeeID());
		}
		if(!identityDTO.getCitizenshipStatus().isEmpty())
		{
          identity.setCitizenshipStatus(identityDTO.getCitizenshipStatus());
		}
		}
	
	public List<Identity> getIdentityByIdentityId(Integer idtyId) {
		 DetachedCriteria criteria = DetachedCriteria
				.forClass(Identity.class);
		 criteria.add(Restrictions.eq("identityID", idtyId));
		List<Identity> identityList = (List<Identity>)getHibernateTemplate().findByCriteria(criteria);
		return identityList;
	}

	@Override
	public String deletePersonalData(Integer employeeId) {
		PersonalData personalData = new PersonalData();
		List<PersonalData> personalDataList = getPersonalData(employeeId);
		if(CollectionUtils.isNotEmpty(personalDataList)){
			personalData = personalDataList.get(0);
		}
		getHibernateTemplate().delete(personalData);
		return "Successfully deleted";
	}

	

}
