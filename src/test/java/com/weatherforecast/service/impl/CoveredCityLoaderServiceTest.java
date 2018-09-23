package com.weatherforecast.service.impl;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.weatherforecast.service.impl.CoveredCityLoaderService;

public class CoveredCityLoaderServiceTest {

	private CoveredCityLoaderService coveredCityLoaderService = new CoveredCityLoaderService();

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for
	 * {@link com.weatherforecast.service.impl.CoveredCityLoaderService#getCoveredCities()}.
	 */
	@Test
	public final void testGetCoveredCities() {
		coveredCityLoaderService.setCityListConfig("Sydney,Melbourne");

		List<String> coveredCities = coveredCityLoaderService.getCoveredCities();
		assertTrue(coveredCities.get(0).equals("Sydney"));
		assertTrue(coveredCities.get(1).equals("Melbourne"));

	}
}
