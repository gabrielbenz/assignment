package com.geocoding.assignment.dto.google;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Location implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "lat")
	private String latitude;

	@XmlElement(name = "lng")
	private String longitude;

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String lat) {
		this.latitude = lat;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String lng) {
		this.longitude = lng;
	}

}
