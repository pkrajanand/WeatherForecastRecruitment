/**
 * 
 */
package org.pactera.weatherforecast.openweathermap.service.impl;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.pactera.weatherforecast.model.WeatherResponse;
import org.pactera.weatherforecast.service.WeatherProviderConfiguration;

/**
 * @author rajanandpk
 *
 */
public class WeatherForecastServiceImplTest {
	
	@InjectMocks
	private WeatherForecastServiceImpl weatherForecastServiceImpl;
	
	@Mock
	private WeatherProviderConfiguration weatherProviderConfiguration;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link org.pactera.weatherforecast.openweathermap.service.impl.WeatherForecastServiceImpl#getWeatherResponse(java.lang.String)}.
	 */
	@Test
	public void testGetWeatherResponse() {
		
		when(weatherProviderConfiguration.getAppId()).thenReturn("23a6b6af62a314759f1df5a2c8ffe877");
		when(weatherProviderConfiguration.getUnit()).thenReturn("Imperial");
		when(weatherProviderConfiguration.getUrl()).thenReturn("http://api.openweathermap.org/data/2.5/weather");
		
		WeatherResponse weatherResponse = 
				weatherForecastServiceImpl.getWeatherResponse("Sydney");
		assertNotNull(weatherResponse);
		assertNotNull(weatherResponse.getCity());
		assertNotNull(weatherResponse.getTemperature());
		assertNotNull(weatherResponse.getUpdatedTime());
		assertNotNull(weatherResponse.getWeather());
		assertNotNull(weatherResponse.getWind());
	}

}
