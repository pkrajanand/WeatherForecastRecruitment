/**
 * 
 */
package com.weatherforecast.openweathermap.service.impl;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.weatherforecast.model.WeatherResponse;
import com.weatherforecast.openweathermap.model.WeatherResponseContainerModel;
import com.weatherforecast.openweathermap.model.WeatherResponseMainPartModel;
import com.weatherforecast.openweathermap.model.WeatherResponseWeatherPartModel;
import com.weatherforecast.openweathermap.model.WeatherResponseWindPartModel;
import com.weatherforecast.openweathermap.service.impl.WeatherResponseAdapterImpl;

/**
 
 *
 */
public class WeatherResponseAdapterImplTest {

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
	 * Test method for
	 * {@link com.weatherforecast.openweathermap.service.impl.WeatherResponseAdapterImpl#getWeatherResponse()}.
	 */
	@Test
	public final void testGetWeatherResponse() {
		WeatherResponseContainerModel weatherResponseContainerModel = createWeatherResponseContainerModel();
		WeatherResponseAdapterImpl weatherResponseAdapterImpl = new WeatherResponseAdapterImpl(
				weatherResponseContainerModel, "metric");

		WeatherResponse weatherResponse = weatherResponseAdapterImpl.getWeatherResponse();

		assertTrue("Speed set is not returned", new BigDecimal(12.0).equals(weatherResponse.getWind().getSpeed()));
		assertTrue("Speed set is not returned",
				new BigDecimal(12.0).equals(weatherResponse.getTemperature().getDegree()));

		assertSame("City set is not returned", "Sydney", weatherResponse.getCity());
		assertSame("Weather set is not returned", "Clouds ready", weatherResponse.getWeather());

	}

	/**
	 * Creating a test model
	 */
	private WeatherResponseContainerModel createWeatherResponseContainerModel() {
		WeatherResponseContainerModel weatherResponseContainerModel = new WeatherResponseContainerModel();

		WeatherResponseMainPartModel main = new WeatherResponseMainPartModel();
		main.setTemp(new BigDecimal(12.0));
		weatherResponseContainerModel.setMain(main);
		weatherResponseContainerModel.setName("Sydney");

		List<WeatherResponseWeatherPartModel> weather = new ArrayList<WeatherResponseWeatherPartModel>();
		WeatherResponseWeatherPartModel weatherResponseWeatherPartModel = new WeatherResponseWeatherPartModel();
		weatherResponseWeatherPartModel.setDescription("Clouds ready");
		weather.add(weatherResponseWeatherPartModel);
		weatherResponseContainerModel.setWeather(weather);

		WeatherResponseWindPartModel wind = new WeatherResponseWindPartModel();
		wind.setSpeed(new BigDecimal(12.0));
		weatherResponseContainerModel.setWind(wind);

		return weatherResponseContainerModel;
	}

}
