package com.weatherforecast.openweathermap.model;

import java.math.BigDecimal;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * POJO representation for the JSON weather response
 * from OpenWeatherMap API
 * 
 * A sample JSON response would be like 
 * 		{"coord":{"lon":-80.61,"lat":28.08},
 * 		"weather":[{"id":800,"main":"Clear","description":"sky is clear","icon":"01n"}],
 * 		"base":"stations",
 * 		"main":{"temp":12.14,"pressure":1018,"humidity":62,"temp_min":11,"temp_max":15},
 * 		"visibility":16093,
 * 		"wind":{"speed":2.6,"deg":220},
 * 		"clouds":{"all":1},"dt":1454111880,
 * 		"sys":{"type":1,"id":684,"message":0.0125,"country":"US","sunrise":1454155853,"sunset":1454194847},
 * 		"id":4163971,"name":"Melbourne","cod":200
 * 		}
 * 
 * @author rajanandpk
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherResponseContainerModel {

    private String name;
    private List<WeatherResponseWeatherPartModel> weather;
    private WeatherResponseMainPartModel main;
    private WeatherResponseWindPartModel wind;
    
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public WeatherResponseMainPartModel getMain() {
        return main;
    }


    public void setMain(WeatherResponseMainPartModel main) {
        this.main = main;
    }


    public WeatherResponseWindPartModel getWind() {
        return wind;
    }


    public void setWind(WeatherResponseWindPartModel wind) {
        this.wind = wind;
    }


    public void setWeather(List<WeatherResponseWeatherPartModel> weather) {
        this.weather = weather;
    }

    public String getWeather() {
        if (weather == null || weather.size() < 1) {
            return null;
        }

        return weather.get(0).getDescription();
    }

    public BigDecimal getTemp() {
        return main == null ? null : main.getTemp();
    }

    public BigDecimal getWindSpeed() {
        return wind == null ? null : wind.getSpeed();
    }

}
