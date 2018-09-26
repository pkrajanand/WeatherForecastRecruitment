package com.weatherforecast.model;

import java.math.BigDecimal;

/**
 * Class to hold the wind-related information from the weather response
 *
 */
public class Wind {

	/**
	 * Enumerated wind speed scales.
	 * 
	 *
	 * 
	 */
	public enum SpeedScale {
		KMH("km/h", "metric"), MH("m/h", "imperial");

		private String description;
		private String unit;

		/**
		 * Construct a {@link SpeedScale} by given parameters.
		 * 
		 * @param description
		 *            text description of this unit of measure.
		 * @param unit
		 *            unit system of this unit of measure.
		 */
		private SpeedScale(String description, String unit) {
			this.description = description;
			this.unit = unit;
		}

		/**
		 * Get text description of this unit of measure.
		 * 
		 * @return
		 */
		public String getDescription() {
			return description;
		}

		/**
		 * Get unit system of this unit of measure.
		 * 
		 * @return
		 */
		public String getUnit() {
			return unit;
		}

		/**
		 * Get a {@link SpeedScale} by unit system.
		 * 
		 * @param unit
		 *            unit system, valid values are 'metric' and 'imperial'.
		 * @return
		 */
		public static SpeedScale unitOf(String unit) {
			if (KMH.getUnit().equals(unit)) {
				return KMH;
			}

			if (MH.getUnit().equals(unit)) {
				return MH;
			}
			return null;
		}
	}

	private final BigDecimal speed;
	private final SpeedScale unitOfMeasure;

	/**
	 * Construct a {@link Wind} object by given parameters.
	 * 
	 * @param speed
	 *            numeric value for speed of wind.
	 * @param unitOfMeasure
	 *            unit of measure for the speed of wind.
	 */
	public Wind(BigDecimal speed, SpeedScale unitOfMeasure) {
		this.speed = speed;
		this.unitOfMeasure = unitOfMeasure;
	}

	/**
	 * Get speed of wind.
	 * 
	 * @return
	 */
	public BigDecimal getSpeed() {
		return speed;
	}

	/**
	 * Get unit of measure of wind speed.
	 * 
	 * @return
	 */
	public SpeedScale getUnitOfMeasure() {
		return unitOfMeasure;
	}
}
