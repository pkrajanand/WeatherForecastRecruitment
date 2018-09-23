package com.weatherforecast.service.impl;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FlatFileLocationServiceTest {

	private FlatFileLocationService flatFileLocationService; 

	@Before
	public void setUp() throws Exception {
		flatFileLocationService = new FlatFileLocationService("Sydney,Melbourne");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testGetLocations() {
		List<String> locations = flatFileLocationService.getLocations();
		assertTrue(locations.get(0).equals("Sydney"));
		assertTrue(locations.get(1).equals("Melbourne"));
	}
	
	@Test
	public final void testGetLocationsWhenLocationsAreNotInitialized() {
		flatFileLocationService = new FlatFileLocationService();
		
		List<String> locations = flatFileLocationService.getLocations();
		assertTrue(locations.size() == 0);
	}

}
