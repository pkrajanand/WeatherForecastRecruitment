package org.pactera.weatherforecast.openweathermap.model;

/**
 * POJO representation for the weather-part of JSON 
 * weather response from OpenWeatherMap API
 * 
 * @author rajanandpk
 *
 */
public class WeatherResponseWeatherPartModel {

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}