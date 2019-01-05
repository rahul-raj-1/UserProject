package com.homeproject.users.util;

import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.homeproject.users.dto.CountryDto;


public class RestResponse {
	
	private List<String> messages;
	
    @JsonProperty("result")
    private List<CountryDto> results;

    public List<String> getMessages() {
        return messages;
    }

    public void setMessages(List<String> messages) {
        this.messages = messages;
    }

    public List<CountryDto> getResults() {
        return results;
    }

    public void setResults(List<CountryDto> results) {
        this.results = results;
    }
}
