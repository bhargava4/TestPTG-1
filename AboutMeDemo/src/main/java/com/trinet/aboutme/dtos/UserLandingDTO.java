/**
 * 
 */
package com.trinet.aboutme.dtos;

import org.codehaus.jackson.annotate.JsonAutoDetect;

/**
 * @author Bhargava
 *
 */
@JsonAutoDetect
public class UserLandingDTO {

	private String textTokenId;
	private String textToken;
	private Integer auditKey;
	private Integer updateKey;
	private Integer displaySeq;
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
	/**
	 * @return the displaySeq
	 */
	public Integer getDisplaySeq() {
		return displaySeq;
	}
	/**
	 * @param displaySeq the displaySeq to set
	 */
	public void setDisplaySeq(Integer displaySeq) {
		this.displaySeq = displaySeq;
	}
	
}
