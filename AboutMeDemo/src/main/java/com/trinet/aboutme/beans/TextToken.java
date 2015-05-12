/**
 * 
 */
package com.trinet.aboutme.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author Bhargava
 *
 */
@Entity
@Table(name="TEXT_TOKENS")
public class TextToken {
	
	@Id
	@Column(name="TEXT_TOKENID")
	private String textTokenId;
	@Column(name="TEXT_TOKEN")
	private String textToken;
	@Column(name="AUDIT_KEY")
	private Integer auditKey;
	@Column(name="UPDATE_KEY")
	private Integer updateKey;
	/**
	 * @return the textTokenId
	 */
	public String getTextTokenId() {
		return textTokenId;
	}
	/**
	 * @param textTokenId the textTokenId to set
	 */
	public void setTextTokenId(String textTokenId) {
		this.textTokenId = textTokenId;
	}
	/**
	 * @return the textToken
	 */
	public String getTextToken() {
		return textToken;
	}
	/**
	 * @param textToken the textToken to set
	 */
	public void setTextToken(String textToken) {
		this.textToken = textToken;
	}
	/**
	 * @return the auditKey
	 */
	public Integer getAuditKey() {
		return auditKey;
	}
	/**
	 * @param auditKey the auditKey to set
	 */
	public void setAuditKey(Integer auditKey) {
		this.auditKey = auditKey;
	}
	/**
	 * @return the updateKey
	 */
	public Integer getUpdateKey() {
		return updateKey;
	}
	/**
	 * @param updateKey the updateKey to set
	 */
	public void setUpdateKey(Integer updateKey) {
		this.updateKey = updateKey;
	}
	
}