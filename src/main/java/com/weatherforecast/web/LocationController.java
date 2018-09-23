package com.weatherforecast.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.weatherforecast.service.LocationService;

@Controller
@RequestMapping("/locations")
public class LocationController {

	@Autowired
    @Qualifier(value = "flatFileLocationService")
	private LocationService locationService;

	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody List<String> getCoveredCities() {
		return locationService.getLocations();
	}
}
