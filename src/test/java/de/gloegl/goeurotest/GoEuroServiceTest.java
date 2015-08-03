package de.gloegl.goeurotest;

import static org.junit.Assert.*;

import java.util.List;

import javax.ws.rs.NotFoundException;

import org.junit.Test;


public class GoEuroServiceTest {
	
	@Test
	public void testCitiesCanBeQueried() {
		GoEuroService service = new GoEuroService();
		List<CitySuggestion> citySuggestions = service.getCitySuggestions("Berlin");
		assertTrue(citySuggestions.size() > 0);
		assertTrue(citySuggestions.get(0).getId()!= null);
	}
	
	@Test(expected=NotFoundException.class)
	public void test404IsHandled()  {
		GoEuroService service = new GoEuroService("http://www.heise.de/");
		service.getCitySuggestions("Horido");
	}
	
	@Test
	public void testCitiesHaveLocations() {
		GoEuroService service = new GoEuroService();
		List<CitySuggestion> citySuggestions = service.getCitySuggestions("Berlin");
		assertTrue(citySuggestions.get(0).getLocation() != null);
	}

}
