package com.brunoallison.challenge.api.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Tributos {
	
	@JsonProperty("ICMS")
	private ICMS icms;

	public Tributos() {
		
	}

	public ICMS getIcms() {
		return icms;
	}

	public void setIcms(ICMS icms) {
		this.icms = icms;
	}
	
}
