/**
 * 
 */
package org.pactera.weatherforecast.model;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.pactera.weatherforecast.model.Temperature.HeatScale;
import org.pactera.weatherforecast.model.Wind.SpeedScale;

/**
 * @author rajanandpk
 *
 */
public class WeatherResponseTest {

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
	 * Test method for {@link org.pactera.weatherforecast.model.WeatherResponse#getCity()}.
	 */
	@Test
	public final void testWeatherResponse() {
		Temperature temperature = new Temperature (BigDecimal.valueOf(2.0), HeatScale.C);
		Wind wind = new Wind(BigDecimal.valueOf(12.0), SpeedScale.KMH);
		
		Date theDate = new Date();
		WeatherResponse weatherResponse = new WeatherResponse
				("Sydney", theDate, "Cloudy", temperature, wind);
		
		assertTrue("Speed set is not returned", BigDecimal.valueOf(12.0).equals(weatherResponse.getWind().getSpeed()));
		assertTrue("Speed set is not returned", BigDecimal.valueOf(2.0).equals(weatherResponse.getTemperature().getDegree()));

		assertSame("City set is not returned", "Sydney", weatherResponse.getCity());
		assertSame("Updated Time set is not returned", theDate, weatherResponse.getUpdatedTime());
		assertSame("Weather set is not returned", "Cloudy", weatherResponse.getWeather());
		
	}

}
