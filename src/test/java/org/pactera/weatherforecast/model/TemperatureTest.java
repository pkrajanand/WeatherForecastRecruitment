/**
 * 
 */
package org.pactera.weatherforecast.model;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.pactera.weatherforecast.model.Temperature;
import org.pactera.weatherforecast.model.Temperature.HeatScale;

/**
 * @author rajanandpk
 *
 */
public class TemperatureTest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link org.pactera.weatherforecast.model.Temperature#getDegree()}.
	 */
	@Test
	public final void testGetDegree() {
		Temperature temp = new Temperature (BigDecimal.valueOf(2.0), HeatScale.C);
		assertTrue("Degree set is not returned", BigDecimal.valueOf(2.0).equals(temp.getDegree()));

	}

	/**
	 * Test method for {@link org.pactera.weatherforecast.model.Temperature#getUnitOfMeasure()}.
	 */
	@Test
	public final void testGetUnitOfMeasure() {
		Temperature temp = new Temperature (BigDecimal.valueOf(2.0), HeatScale.C);
		assertSame("Scale set is not returned", HeatScale.C, temp.getUnitOfMeasure());
	}

}
