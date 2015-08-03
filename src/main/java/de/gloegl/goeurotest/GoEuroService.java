package de.gloegl.goeurotest;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

public class GoEuroService {

	private static final String DEFAULT_API_URL = "http://api.goeuro.com/api/v2/";

	private WebTarget citySuggestionService;

	public GoEuroService() {
		this(DEFAULT_API_URL);
	}

	public GoEuroService(String apiBaseUrl) {
		Client client = ClientBuilder.newClient();
		citySuggestionService = client.target(apiBaseUrl).path("position/suggest/en/{cityName}");
	}

	public List<CitySuggestion> getCitySuggestions(String cityName) {
		return Arrays.asList(
				citySuggestionService
				.resolveTemplate("cityName", cityName)
				.request()
				.get(CitySuggestion[].class));
	}
}
