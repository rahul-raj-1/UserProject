package com.homeproject.users.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CountryDto {
	
	
	private String countryName;
	
    @JsonProperty("alpha2_code")
	private String alpha2Code;

    @JsonProperty("alpha3_code")
	private String alpha3Code;

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getAlpha2Code() {
		return alpha2Code;
	}

	public void setAlpha2Code(String alpha2Code) {
		this.alpha2Code = alpha2Code;
	}

	public String getAlpha3Code() {
		return alpha3Code;
	}

	public void setAlpha3Code(String alpha3Code) {
		this.alpha3Code = alpha3Code;
	}

	
	@Override
	public String toString() {
		return "CountryDto [countryName=" + countryName + ", alpha2Code=" + alpha2Code + ", alpha3Code=" + alpha3Code
				+ "]";
	}
	
	
	
	
	

	

}
