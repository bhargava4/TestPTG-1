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
@Table(name="SPLASH_CONTENT_SEQ")
public class SplashContentSeq {
	
	@Id
	@Column(name="TEXT_TOKENID")
	private String textTokenId;
	@Column(name="DISPLAY_SEQ")
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