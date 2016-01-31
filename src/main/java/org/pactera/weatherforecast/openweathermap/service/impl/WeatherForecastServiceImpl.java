package org.pactera.weatherforecast.openweathermap.service.impl;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import org.pactera.weatherforecast.model.WeatherResponse;
import org.pactera.weatherforecast.openweathermap.model.WeatherResponseContainerModel;
import org.pactera.weatherforecast.service.WeatherForecastService;
import org.pactera.weatherforecast.service.WeatherProviderConfiguration;

@Service
public class WeatherForecastServiceImpl implements WeatherForecastService {

    private static final String PARAM_APPID = "APPID";
    private static final String PARAM_UNITS = "units";
    private static final String PARAM_Q = "q";

    @Autowired
    private WeatherProviderConfiguration config;

    /**
     * Set the {@link WeatherProviderConfiguration} for this service.
     * @param config
     */
    public void setConfig(WeatherProviderConfiguration config) {
        this.config = config;
    }

    public WeatherProviderConfiguration getConfig() {
        return this.config;
    }
    
    /**
     * Retrieve weather info from Weather Map API.
     */
    @Override
    public WeatherResponse getWeatherResponse(String city) {
        if (config == null) {
            throw new IllegalArgumentException("Config must be provided");
        }
        URI composeUri = composeUri(city);
		final WeatherResponseContainerModel weatherResult = getRestTemplate().getForObject(
                composeUri, WeatherResponseContainerModel.class);
        final WeatherResponseAdapterImpl adapter = new WeatherResponseAdapterImpl(weatherResult, config.getUnit());
        return adapter.getWeatherResponse();
    }

    /**
     * Returns a new RestTemplate Object. 
     * @return a newly created {@link RestTemplate}.
     */
    RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    /**
     * Compose Uri with query parameters.
     * @param city
     * @return composed URI with query parameters.
     */
    private URI composeUri(String city) {
        final UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(config.getUrl())
                .queryParam(PARAM_Q, city)
                .queryParam(PARAM_UNITS, config.getUnit())
                .queryParam(PARAM_APPID, config.getAppId());
        return builder.build().toUri();
    }

}
