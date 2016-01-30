/**
 * 
 */
package org.pactera.weatherforecast.openweathermap.model;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author rajanandpk
 *
 */
public class WeatherResponseContainerModelTest {

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
	 * Test method for {@link org.pactera.weatherforecast.openweathermap.model.WeatherResponseContainerModel#getMain()}.
	 */
	@Test
	public final void testGetWeatherResponseContainerModel() {
		WeatherResponseContainerModel weatherResponseContainerModel = 
				new WeatherResponseContainerModel ();
		
		WeatherResponseMainPartModel main = new WeatherResponseMainPartModel();
		main.setTemp(new BigDecimal(12.0));
		weatherResponseContainerModel.setMain(main);
		weatherResponseContainerModel.setName("Sydney");
		
		List<WeatherResponseWeatherPartModel> weather = 
				new ArrayList<WeatherResponseWeatherPartModel>();
		WeatherResponseWeatherPartModel weatherResponseWeatherPartModel =
				new WeatherResponseWeatherPartModel ();
		weatherResponseWeatherPartModel.setDescription("Clouds ready");
		weather.add(weatherResponseWeatherPartModel);
		weatherResponseContainerModel.setWeather(weather);
		
		WeatherResponseWindPartModel wind = new WeatherResponseWindPartModel ();
		wind.setSpeed(new BigDecimal(12.0));
		weatherResponseContainerModel.setWind(wind);
		
		assertTrue("Speed set is not returned", new BigDecimal(12.0).equals(weatherResponseContainerModel.getWind().getSpeed()));
		
		assertSame("City set is not returned", "Sydney", weatherResponseContainerModel.getName());
		assertSame("Weather info set is not returned", "Clouds ready", weatherResponseContainerModel.getWeather());
		assertTrue("Temp set is not returned", new BigDecimal(12.0).equals(weatherResponseContainerModel.getMain().getTemp()));
		
	}

}
