package com.weatherforecast.service;

import java.util.List;

import com.weatherforecast.model.Location;

/**
 * Service to retrieve the cities for which the forecasting service is available
 *
 */
public interface LocationService {

	List<Location> getLocations();

}
