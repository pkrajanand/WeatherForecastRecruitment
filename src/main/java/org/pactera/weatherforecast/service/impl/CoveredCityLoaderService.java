package org.pactera.weatherforecast.service.impl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.pactera.weatherforecast.service.CoverageAvailableCitiesService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.support.DefaultConversionService;
import org.springframework.stereotype.Service;

/**
 * Service to load the cities covered from the configuration
 * files
 * 
 * @author rajanandpk
 *
 */
@Service
public class CoveredCityLoaderService implements CoverageAvailableCitiesService {
    private static final String DELIMITER = "\\,";

    /**
     * Injected city list configuration from externalized configuration file.
     * City list should be '|' delimited string.
     */
    @Value("${weather.cities}")
    private String cityListConfig;

    /**
     * Returns the configured city names
     * 
     * @return
     */
    public String getCityListConfig() {
		return cityListConfig;
	}

	/**
     * Set configured city list. Although this is auto injected generally.
     * This method is still useful on unit testing.
     * @param cityListConfig
     */
    void setCityListConfig(String cityListConfig) {
        this.cityListConfig = cityListConfig;
    }
   
    /**
     * Get list of cities from configuration.
     */
    @Override
    public List<String> getCoveredCities() {
        if (cityListConfig == null) {
            return Collections.emptyList();
        }

        return Arrays.asList(cityListConfig.split(DELIMITER));
    }

}
