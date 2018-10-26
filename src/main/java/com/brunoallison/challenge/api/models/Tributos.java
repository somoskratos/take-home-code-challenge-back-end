package com.brunoallison.challenge.api.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Tributos {
	private ICMS icms;

	public Tributos() {
		
	}

	@JsonProperty("ICMS")
	public ICMS getIcms() {
		return icms;
	}

	public void setIcms(ICMS icms) {
		this.icms = icms;
	}
	
}
