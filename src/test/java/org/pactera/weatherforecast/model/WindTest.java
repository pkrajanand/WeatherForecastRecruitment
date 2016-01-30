package org.pactera.weatherforecast.model;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.pactera.weatherforecast.model.Wind.SpeedScale;

public class WindTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testGetSpeed() {
		
		Wind wind = new Wind(BigDecimal.valueOf(12.0), SpeedScale.KMH);
		assertTrue("Speed set is not returned", BigDecimal.valueOf(12.0).equals(wind.getSpeed()));
	}

	@Test
	public final void testGetUnitOfMeasure() {
		Wind wind = new Wind(BigDecimal.valueOf(12.0), SpeedScale.KMH);
		assertSame("Speed Scale set is not returned", SpeedScale.KMH, wind.getUnitOfMeasure());
	}

}
