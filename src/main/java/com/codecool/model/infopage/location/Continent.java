package com.codecool.model.infopage.location;

import java.util.List;

public class Continent {

	private String name;
	private List<Location> locations;

	public Continent(String name, List<Location> locations) {
		this.name = name;
		this.locations = locations;
	}
}