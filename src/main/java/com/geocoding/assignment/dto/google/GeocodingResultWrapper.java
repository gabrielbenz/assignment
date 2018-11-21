package com.geocoding.assignment.dto.google;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class GeocodingResultWrapper implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement
	private String status;

	@XmlElement(name = "error_message")
	private String errorMessage;

	@XmlElement
	private GeocodingResult result;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public GeocodingResult getResult() {
		return result;
	}

	public void setResult(GeocodingResult result) {
		this.result = result;
	}

}
