package com.weatherforecast.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.weatherforecast.service.CoverageAvailableCitiesService;

/**
*
 */
@Controller
@RequestMapping("/cities")
public class CityListingController {

	@Autowired
	private CoverageAvailableCitiesService cityListService;

	/**
	 * 
	 * @return
	 */
	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody List<String> getWeatherInfo() {
		return cityListService.getCoveredCities();
	}

}
