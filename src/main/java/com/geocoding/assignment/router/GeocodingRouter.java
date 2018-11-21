package com.geocoding.assignment.router;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.gson.GsonDataFormat;
import org.apache.camel.component.jacksonxml.JacksonXMLDataFormat;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class GeocodingRouter extends RouteBuilder {

	@Value("${google_api_key}")
	private String googleApiKey;
	
	@Value("${google_geocoding_api_url}")
	private String googleGeocodeApiUrl;

	@Override
	public void configure() throws Exception {
		from("activemq:queue:google.api.geocode.request")
			.log("${body}");

	}

}
