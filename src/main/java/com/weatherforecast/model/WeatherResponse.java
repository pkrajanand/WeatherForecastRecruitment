package com.weatherforecast.model;

import java.util.Date;

/**
 * Class to hold the weather response.
 * 
 * @author rajanandpk
 *
 */
public class WeatherResponse {

    private final String city;
    private final Date updatedTime;
    private final String weather;
    private final Temperature temperature;
    private final Wind wind;

    /**
     * Construct a {@link WeatherResponse} object by given parameters.
     * @param city city of this weather info.
     * @param updatedTime update time of this weather info.
     * @param weather weather description of this weather info.
     * @param temperature temperature of this weather info.
     * @param wind wind of this weather info.
     */
    public WeatherResponse(String city, Date updatedTime, String weather, Temperature temperature, Wind wind) {
        this.city = city;
        this.updatedTime = updatedTime;
        this.weather = weather;
        this.temperature = temperature;
        this.wind = wind;
    }

    /**
     * Get city name of this weather info.
     * @return
     */
    public String getCity() {
        return city;
    }

    /**
     * Get update time of this weather info.
     * @return
     */
    public Date getUpdatedTime() {
        return updatedTime;
    }

    /**
     * Get weather description from this weather info.
     * @return
     */
    public String getWeather() {
        return weather;
    }

    /**
     * Get temperature info from this weather info.
     * @return
     */
    public Temperature getTemperature() {
        return temperature;
    }

    /**
     * Get wind info from this weather info.
     * @return
     */
    public Wind getWind() {
        return wind;
    }

}
