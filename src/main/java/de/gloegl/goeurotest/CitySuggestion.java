package de.gloegl.goeurotest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CitySuggestion {

	@JsonProperty(value = "_id", required = true)
	private String id;
	@JsonProperty(required = true)
	private String name;
	@JsonProperty(required = true)
	private String type;

	@JsonProperty(value = "geo_position", required=true)
	private GeoPosition location;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public GeoPosition getLocation() {
		return location;
	}

	public void setLocation(GeoPosition location) {
		this.location = location;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}