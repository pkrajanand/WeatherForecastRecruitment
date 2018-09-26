package com.weatherforecast.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Location {
	
	@JsonProperty
	String name;
	
	public Location(String name) {
		this.name = name;
	}
	
}
