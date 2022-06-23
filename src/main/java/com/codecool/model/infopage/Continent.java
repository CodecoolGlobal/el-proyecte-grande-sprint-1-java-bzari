package com.codecool.model.infopage;

import com.codecool.model.infopage.location.Location;
import com.codecool.service.locations.LocationStorage;

import java.util.List;

public class Continent {

	private int id;
	private String name;
	private LocationStorage locations;

	public Continent(int id, String name, LocationStorage locations) {
		this.id = id;
		this.name = name;
		this.locations = locations;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public LocationStorage getLocations() {
		return locations;
	}
}

