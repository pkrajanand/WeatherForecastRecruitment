package com.weatherforecast.openweathermap.service.impl;

import java.util.Date;

import com.weatherforecast.model.Temperature;
import com.weatherforecast.model.WeatherResponse;
import com.weatherforecast.model.Wind;
import com.weatherforecast.openweathermap.model.WeatherResponseContainerModel;
import com.weatherforecast.service.WeatherResponseAdapter;

/**
 * Adapter implementation to transform the open-weather-map weather response
 * into the weather response model needed by the weather forecast reporting
 * application
 *
 */
public class WeatherResponseAdapterImpl implements WeatherResponseAdapter {
	private final WeatherResponse weatherResponse;

	/**
	 * Create a new Adapter with given parameters.
	 * 
	 * @param model
	 *            The input model to be converted.
	 * @param unit
	 *            The unit of the weather info in system as configured.
	 */
	public WeatherResponseAdapterImpl(WeatherResponseContainerModel model, String unit) {
		if (model == null || unit == null) {
			this.weatherResponse = null;
		} else {
			this.weatherResponse = new WeatherResponse(model.getName(), new Date(), model.getWeather(),
					new Temperature(model.getTemp(), Temperature.HeatScale.unitOf(unit)),
					new Wind(model.getWindSpeed(), Wind.SpeedScale.unitOf(unit)));
		}
	}

	/**
	 * Get converted {@link WeatherResponse} object.
	 */
	@Override
	public WeatherResponse getWeatherResponse() {
		return weatherResponse;
	}

}
