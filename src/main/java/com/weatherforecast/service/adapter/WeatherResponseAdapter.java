package com.weatherforecast.service.adapter;

import com.weatherforecast.model.WeatherResponse;;

/**
 * Define the Weather response object structure
 * to be used for application 
 * 
 * @author rajanandpk
 *
 */
public interface WeatherResponseAdapter {

    /**
     * Get converted {@link WeatherResponse} object.
     * @return
     */
    WeatherResponse getWeatherResponse();

}
