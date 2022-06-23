package com.codecool.model.infopage.location;

import com.codecool.model.infopage.location.wildlife.Wildlife;

import java.util.List;

public class Location {
	private int id;
	private int continentId;
	private String name;
	private String description;
	private List<Wildlife> wildlife;
	private String video;
	private String sound;
	private String climate;
	private String crisis;

	public Location(int id, int continentId, String name, String description, List<Wildlife> wildlife,
					String video, String sound, String climate, String crisis) {
		this.id = id;
		this.continentId = continentId;
		this.name = name;
		this.description = description;
		this.wildlife = wildlife;
		this.video = video;
		this.sound = sound;
		this.climate = climate;
		this.crisis = crisis;
	}

	public String getName() {
		return name;
	}

	public List<Wildlife> getWildlife() {
		return wildlife;
	}
}