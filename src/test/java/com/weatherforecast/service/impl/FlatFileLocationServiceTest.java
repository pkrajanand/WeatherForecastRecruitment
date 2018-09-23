package com.weatherforecast.service.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.weatherforecast.model.Location;

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
		List<Location> locations = flatFileLocationService.getLocations();
		assertEquals(new Location("Sydney"), locations.get(0));
		assertEquals(new Location("Melbourne"), locations.get(1));
	}
	
	@Test
	public final void testGetLocationsWhenLocationsAreNotInitialized() {
		flatFileLocationService = new FlatFileLocationService();
		
		List<Location> locations = flatFileLocationService.getLocations();
		assertTrue(locations.size() == 0);
	}

}
