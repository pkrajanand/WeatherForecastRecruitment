package com.weatherforecast.service;

import java.util.List;

/**
 * Service to retrieve the cities for which the forecasting service is available
 *
 */
public interface LocationService {

	List<String> getLocations();

}
