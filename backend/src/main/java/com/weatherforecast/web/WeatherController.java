package com.weatherforecast.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import com.weatherforecast.model.WeatherResponse;
import com.weatherforecast.service.WeatherForecastService;

@Controller
public class WeatherController {

	@Autowired
	private WeatherForecastService weatherService;

	@GetMapping("/weather/{city}")
	public @ResponseBody WeatherResponse getWeatherInfo(@PathVariable String city) {
		return weatherService.getWeatherResponse(city);
	}

}