package com.weatherforecast.model;

import lombok.Data;

@Data
public class Location {
	
	String name;
	
	public Location(String name) {
		this.name = name;
	}
	
}
