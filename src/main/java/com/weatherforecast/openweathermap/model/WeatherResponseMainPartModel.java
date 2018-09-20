package com.weatherforecast.openweathermap.model;

import java.math.BigDecimal;

/**
 * POJO representation for the main-part of JSON weather response from
 * OpenWeatherMap API
 *
 */
public class WeatherResponseMainPartModel {

	private BigDecimal temp;

	public BigDecimal getTemp() {
		return temp;
	}

	public void setTemp(BigDecimal temp) {
		this.temp = temp;
	}
}