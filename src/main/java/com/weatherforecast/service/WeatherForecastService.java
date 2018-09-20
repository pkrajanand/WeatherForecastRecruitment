package com.weatherforecast.service;

import com.weatherforecast.model.WeatherResponse;

/**
 * This interface defines the behavior for the concrete 
 * service implementations that is depended upon the
 * respective external weather service providers.
 * 
 * @author rajanandpk
 *
 */
public interface WeatherForecastService {

    /**
     * Get {@link WeatherResponse} by given city name.
     * @param city city name for the weather to be retrieved.
     * @return retrieved {@link WeatherResponse} for the city.
     */
    WeatherResponse getWeatherResponse(String city);

}
