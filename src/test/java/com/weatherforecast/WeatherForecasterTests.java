package com.weatherforecast;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.weatherforecast.WeatherForecaster;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = WeatherForecaster.class)
public class WeatherForecasterTests {

	@Test
	public void contextLoads() {
	}

}
