package com.weatherforecast.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.weatherforecast.model.WeatherResponse;
import com.weatherforecast.service.WeatherForecastService;

@Controller
@RequestMapping("/weather")
public class WeatherAppFrontendController {

	@Autowired
	private WeatherForecastService weatherService;

	/**
	 * Get weather Info by city name.
	 * 
	 * @param city
	 *            city name as query parameter.
	 * @return {@linkplain WeatherResponse} for the city
	 */
	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody WeatherResponse getWeatherInfo(@RequestParam String city) {
		return weatherService.getWeatherResponse(city);
	}

}