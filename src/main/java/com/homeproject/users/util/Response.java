package com.homeproject.users.util;

import com.fasterxml.jackson.annotation.JsonProperty;


//we can name this class anything
public class Response {
	
	
    @JsonProperty("RestResponse")
   private RestResponse RestResponse;

	public RestResponse getRestResponse() {
		return RestResponse;
	}

	public void setRestResponse(RestResponse restResponse) {
		RestResponse = restResponse;
	}

	

	@Override
	public String toString() {
		return "Response [RestResponse=" + RestResponse + "]";
	}

}
