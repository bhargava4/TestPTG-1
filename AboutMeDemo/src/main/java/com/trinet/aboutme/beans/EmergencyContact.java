/**
 * 
 */
package com.trinet.aboutme.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Bhargava
 *
 */
@Entity
@Table(name="EMERGENCY_CONTACT")
public class EmergencyContact {
	
	@Id
	@Column(name="EMERGENCY_CONTACT_ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer emergencyContactId;
	@Column(name="CONTACT_NAME")
	private String contactName;
	@Column(name="IS_PRIMARY_CONTACT")
	private Boolean primaryContact;
	@Column(name="RELATIONSHIP")
	private String relationship;
	@Column(name="IS_SAME_ADDRESS_AS_EMP")
	private Boolean sameAdressAsEmp;
	@Column(name="COUNTRY")
	private String country;
	@Column(name="ADDRESS_LINE_1")
	private String addressLine1;
	@Column(name="ADDRESS_LINE_2")
	private String addressLine2;
	@Column(name="ADDRESS_LINE_3")
	private String addressLine3;
	@Column(name="CITY")
	private String city;
	@Column(name="STATE")
	private String state;
	@Column(name="POSTAL_CODE")
	private String postalCode;
	@Column(name="SAME_PHONE_AS_EMP")
	private Boolean samePhoneAsEmp;
	@Column(name="TELEPHONE_NO")
	private String telephoneNo;
	@Column(name="TELEPHONE_NO_1")
	private String telephoneNo1;
	@Column(name="TELEPHONE_NO_2")
	private String telephoneNo2;
	@Column(name="TELEPHONE_NO_3")
	private String telephoneNo3;
	@Column(name="EMPLOYEE_ID")
	private Integer employeeId;
	
	/**
	 * @return the emergencyContactId
	 */
	public Integer getEmergencyContactId() {
		return emergencyContactId;
	}
	/**
	 * @param emergencyContactId the emergencyContactId to set
	 */
	public void setEmergencyContactId(Integer emergencyContactId) {
		this.emergencyContactId = emergencyContactId;
	}
	/**
	 * @return the contactName
	 */
	public String getContactName() {
		return contactName;
	}
	/**
	 * @param contactName the contactName to set
	 */
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	/**
	 * @return the isPrimaryContact
	 */
	public Boolean isPrimaryContact() {
		return primaryContact;
	}
	/**
	 * @return the isPrimaryContact
	 */
	public Boolean getPrimaryContact() {
		return primaryContact;
	}
	/**
	 * @param isPrimaryContact the isPrimaryContact to set
	 */
	public void setPrimaryContact(Boolean isPrimaryContact) {
		this.primaryContact = isPrimaryContact;
	}
	/**
	 * @return the relationship
	 */
	public String getRelationship() {
		return relationship;
	}
	/**
	 * @param relationship the relationship to set
	 */
	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}
	/**
	 * @return the isSameAdressAsEmp
	 */
	public Boolean isSameAdressAsEmp() {
		return sameAdressAsEmp;
	}
	/**
	 * @return the isSameAdressAsEmp
	 */
	public Boolean getSameAdressAsEmp() {
		return sameAdressAsEmp;
	}
	/**
	 * @param isSameAdressAsEmp the isSameAdressAsEmp to set
	 */
	public void setSameAdressAsEmp(Boolean isSameAdressAsEmp) {
		this.sameAdressAsEmp = isSameAdressAsEmp;
	}
	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}
	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	/**
	 * @return the addressLine1
	 */
	public String getAddressLine1() {
		return addressLine1;
	}
	/**
	 * @param addressLine1 the addressLine1 to set
	 */
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	/**
	 * @return the addressLine2
	 */
	public String getAddressLine2() {
		return addressLine2;
	}
	/**
	 * @param addressLine2 the addressLine2 to set
	 */
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	/**
	 * @return the addressLine3
	 */
	public String getAddressLine3() {
		return addressLine3;
	}
	/**
	 * @param addressLine3 the addressLine3 to set
	 */
	public void setAddressLine3(String addressLine3) {
		this.addressLine3 = addressLine3;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * @return the postalCode
	 */
	public String getPostalCode() {
		return postalCode;
	}
	/**
	 * @param postalCode the postalCode to set
	 */
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	/**
	 * @return the samePhoneAsEmp
	 */
	public Boolean isSamePhoneAsEmp() {
		return samePhoneAsEmp;
	}
	/**
	 * @return the samePhoneAsEmp
	 */
	public Boolean getSamePhoneAsEmp() {
		return samePhoneAsEmp;
	}
	/**
	 * @param samePhoneAsEmp the samePhoneAsEmp to set
	 */
	public void setSamePhoneAsEmp(Boolean samePhoneAsEmp) {
		this.samePhoneAsEmp = samePhoneAsEmp;
	}
	/**
	 * @return the telephoneNo
	 */
	public String getTelephoneNo() {
		return telephoneNo;
	}
	/**
	 * @param telephoneNo the telephoneNo to set
	 */
	public void setTelephoneNo(String telephoneNo) {
		this.telephoneNo = telephoneNo;
	}
	/**
	 * @return the telephoneNo1
	 */
	public String getTelephoneNo1() {
		return telephoneNo1;
	}
	/**
	 * @param telephoneNo1 the telephoneNo1 to set
	 */
	public void setTelephoneNo1(String telephoneNo1) {
		this.telephoneNo1 = telephoneNo1;
	}
	/**
	 * @return the telephoneNo2
	 */
	public String getTelephoneNo2() {
		return telephoneNo2;
	}
	/**
	 * @param telephoneNo2 the telephoneNo2 to set
	 */
	public void setTelephoneNo2(String telephoneNo2) {
		this.telephoneNo2 = telephoneNo2;
	}
	/**
	 * @return the telephoneNo3
	 */
	public String getTelephoneNo3() {
		return telephoneNo3;
	}
	/**
	 * @param telephoneNo3 the telephoneNo3 to set
	 */
	public void setTelephoneNo3(String telephoneNo3) {
		this.telephoneNo3 = telephoneNo3;
	}
	/**
	 * @return the employeeId
	 */
	public Integer getEmployeeId() {
		return employeeId;
	}
	/**
	 * @param employeeId the employeeId to set
	 */
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

}
