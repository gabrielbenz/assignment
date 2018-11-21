package com.geocoding.assignment.dto.google;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;

public class GeocodingResult implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement
	private Geometry geometry;

	@XmlElement(name = "formatted_address")
	private String formattedAddress;

	@XmlElement
	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getFormattedAddress() {
		return formattedAddress;
	}

	public void setFormattedAddress(String formattedAddress) {
		this.formattedAddress = formattedAddress;
	}

	public Geometry getGeometry() {
		return geometry;
	}

	public void setGeometry(Geometry geometry) {
		this.geometry = geometry;
	}

}