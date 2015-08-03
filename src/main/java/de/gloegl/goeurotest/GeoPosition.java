package de.gloegl.goeurotest;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GeoPosition {

	@JsonProperty(required = true)
	private String latitude;
	@JsonProperty(required = true)
	private String longitude;
	
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
