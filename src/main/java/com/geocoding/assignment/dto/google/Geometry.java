package com.geocoding.assignment.dto.google;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Geometry implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "location_type")
	private String locationType;

	@XmlElement
	private Location location;

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public String getLocationType() {
		return locationType;
	}

	public void setLocationType(String locationType) {
		this.locationType = locationType;
	}

}