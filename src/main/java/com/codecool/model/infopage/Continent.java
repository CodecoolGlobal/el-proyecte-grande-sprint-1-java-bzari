package com.codecool.model.infopage;

import com.codecool.model.DTO.MapDTO;
import com.codecool.model.infopage.location.Location;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.ArrayList;
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

	public List<MapDTO> getAllLocationDTO(){
		List<MapDTO> allLocationDTO = new ArrayList<>();
		for (Location location : locations) {
			allLocationDTO.add(new MapDTO(location.getName(), location.getId()));
		}
		return allLocationDTO;
	}

	public Location getLocationByName(String locationName){
		for (Location location : locations) {
			if (location.getName().equals(locationName)){
				return location;
			}
		}
		return null;
	}
}

