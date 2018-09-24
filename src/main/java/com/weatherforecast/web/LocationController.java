package com.weatherforecast.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.weatherforecast.model.Location;
import com.weatherforecast.service.LocationService;

@Controller
public class LocationController {

	@Autowired
    @Qualifier(value = "flatFileLocationService")
	private LocationService locationService;

	@GetMapping("/locations")
	public @ResponseBody List<Location> getCoveredCities() {
		return locationService.getLocations();
	}
}
