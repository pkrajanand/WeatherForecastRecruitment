package com.weatherforecast.model;

import java.math.BigDecimal;

/**
 * Class to hold the temperature related info from
 * the Weather response
 * 
 * @author rajanandpk
 *
 */
public class Temperature {

	/**
	 * 
	 * Enumerated Heat Scale Units
	 *
	 */
	public enum HeatScale {
	    C("celsius", "metric"), F("fahrenheit", "imperial");

	    private String description;
	    private String unit;

	    /**
	     * Construct a {@link HeatScale} enum value.
	     * @param description long description of the temperature unit of measure.
	     * @param unit unit system of this unit of measure.
	     */
	    private HeatScale(String description, String unit) {
	        this.description = description;
	        this.unit = unit;
	    }

	    /**
	     * Get long description for this temperature unit of measure.
	     * @return
	     */
	    public String getDescription() {
	        return description;
	    }

	    /**
	     * Get unit system of this temperature unit of measure.
	     * @return
	     */
	    public String getUnit() {
	        return unit;
	    }

	    /**
	     * Get a {@link HeatScale} by its unit system.
	     * @param unit unit system, valid values are 'metric' and 'imperial'.
	     * @return
	     */
	    public static HeatScale unitOf(String unit) {
	        if (C.getUnit().equals(unit)) {
	            return C;
	        }

	        if (F.getUnit().equals(unit)) {
	            return F;
	        }
	        return null;
	    }
	}
	
    private final BigDecimal degree;
    private final HeatScale UnitOfMeasure;

    /**
     * Construct a {@link Temperature} object by given parameters.
     * @param degree numeric value of temperature degree.
     * @param unitOfMeasure unit of measure for the temperature.
     */
    public Temperature(BigDecimal degree, HeatScale unitOfMeasure) {
        this.degree = degree;
        UnitOfMeasure = unitOfMeasure;
    }

    /**
     * Numeric temperature degree.
     */
    public BigDecimal getDegree() {
        return degree;
    }

    /**
     * Unit of measure for temperature.
     */
    public HeatScale getUnitOfMeasure() {
        return UnitOfMeasure;
    }

}
