package com.geocoding.assignment.router;

import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.gson.GsonDataFormat;
import org.apache.camel.component.jacksonxml.JacksonXMLDataFormat;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.geocoding.assignment.dto.google.GeocodingResultWrapper;
import com.geocoding.assignment.transformer.GeocodeResultTransformer;

@Component
public class GeocodingRouter extends RouteBuilder {

	@Value("${google_api_key}")
	private String googleApiKey;
	
	@Value("${google_geocoding_api_url}")
	private String googleGeocodeApiUrl;

	@Override
	public void configure() throws Exception {
		from("activemq:queue:google.api.geocode.request")
			.setHeader(Exchange.HTTP_METHOD, constant(HttpMethod.GET))
			.setHeader(Exchange.HTTP_QUERY, simple("address=${body}&key=" + googleApiKey))
			.enrich("ahc:" + googleGeocodeApiUrl)
				.unmarshal(xmlDataFormat())
			.transform()
				.method(GeocodeResultTransformer.class)
				.marshal(gsonDataFormat());

	}

	private GsonDataFormat gsonDataFormat() {
		return new GsonDataFormat();
	}

	private JacksonXMLDataFormat xmlDataFormat() {
		JacksonXMLDataFormat xmlDataFormat = new JacksonXMLDataFormat(GeocodingResultWrapper.class);
		xmlDataFormat.disableFeature(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);

		return xmlDataFormat;
	}

}
