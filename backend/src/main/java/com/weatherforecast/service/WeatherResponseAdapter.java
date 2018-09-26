package com.weatherforecast.service;

import com.weatherforecast.model.WeatherResponse;;

/**
 * Define the Weather response object structure to be used for application
 *
 */
public interface WeatherResponseAdapter {

	/**
	 * Get converted {@link WeatherResponse} object.
	 * 
	 * @return
	 */
	WeatherResponse getWeatherResponse();

}
