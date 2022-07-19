package com.codecool.model.infopage;

import com.codecool.model.infopage.location.Location;

import java.util.List;

public class Continent {

	private int id;
	private String name;
	private List<Location> locations;

	public Continent(int id, String name, List<Location> locations) {
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

	public List<Location> getLocations() {
		return locations;
	}
}

