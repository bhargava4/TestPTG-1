package com.trinet.aboutme.dtos;


public class SecretDTO extends CustomDetailsDTO {
	String secretQst;
	String secretAns;

	public String getSecretQst() {
		return secretQst;
	}
	public void setSecretQst(String secretQst) {
		this.secretQst = secretQst;
	}
	public String getSecretAns() {
		return secretAns;
	}
	public void setSecretAns(String secretAns) {
		this.secretAns = secretAns;
	}

}
