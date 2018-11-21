package com.geocoding.assignment.transformer;

import com.geocoding.assignment.dto.FormattedAddressResponse;
import com.geocoding.assignment.dto.google.GeocodingResult;
import com.geocoding.assignment.dto.google.GeocodingResultWrapper;

public class GeocodeResultTransformer {

	public FormattedAddressResponse transform(GeocodingResultWrapper geocodeResponse) {
		if (geocodeResponse == null || geocodeResponse.getResult() == null) {
			return null;
		}

		FormattedAddressResponse addressResponse = new FormattedAddressResponse();
		GeocodingResult result = geocodeResponse.getResult();

		addressResponse.setFormattedAddress(result.getFormattedAddress());

		if (result.getGeometry() != null && result.getGeometry().getLocation() != null) {
			addressResponse.setLatitude(result.getGeometry().getLocation().getLatitude());
			addressResponse.setLongitude(result.getGeometry().getLocation().getLongitude());
		}

		return addressResponse;
	}

}