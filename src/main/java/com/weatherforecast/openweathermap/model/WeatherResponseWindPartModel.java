package com.weatherforecast.openweathermap.model;

import java.math.BigDecimal;

/**
 * * POJO representation for the wind-part of JSON weather response from
 * OpenWeatherMap API
 *
 */
public class WeatherResponseWindPartModel {

	private BigDecimal speed;

	public BigDecimal getSpeed() {
		return speed;
	}

	public void setSpeed(BigDecimal speed) {
		this.speed = speed;
	}
}