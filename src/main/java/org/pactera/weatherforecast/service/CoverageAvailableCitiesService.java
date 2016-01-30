package org.pactera.weatherforecast.service;

import java.util.List;

/**
 * Service to retrieve the cities for which
 * the forecasting service is available
 * 
 * @author rajanandpk
 *
 */
public interface CoverageAvailableCitiesService {

    /**
     * Return the covered cities.
     * 
     * @return List of city names.
     */
	List<String> getCoveredCities();

}
