package com.weatherforecast.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weatherforecast.model.Location;
import com.weatherforecast.service.LocationService;

@RestController
public class LocationController {

	@Autowired
    @Qualifier(value = "flatFileLocationService")
	private LocationService locationService;

	@GetMapping("/locations")
	public List<Location> getCoveredCities() {
		return locationService.getLocations();
	}
}
