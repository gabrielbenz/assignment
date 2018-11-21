package com.geocoding.assignment.dto;

import java.io.Serializable;

public class FormattedAddressResponse implements Serializable {

	private static final long serialVersionUID = 1L;

	private String formattedAddress;

	private String latitude;

	private String longitude;

	public String getFormattedAddress() {
		return formattedAddress;
	}

	public void setFormattedAddress(String formattedAddress) {
		this.formattedAddress = formattedAddress;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

}