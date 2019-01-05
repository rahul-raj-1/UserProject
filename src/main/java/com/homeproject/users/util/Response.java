package com.homeproject.users.util;

import com.fasterxml.jackson.annotation.JsonProperty;

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
