package com.codecool.model.infopage.location.wildlife;

public class Wildlife {

	private String name;
	private String description;
	private double lifetime;
	private String lifetimeInterval;
	private ConservationStatus status;
	private String crisis;
	private WildlifeType type;

	public Wildlife(String name, String description, double lifetime, String lifetimeInterval, ConservationStatus status, String crisis, WildlifeType type) {
		this.name = name;
		this.description = description;
		this.lifetime = lifetime;
		this.lifetimeInterval = lifetimeInterval;
		this.status = status;
		this.crisis = crisis;
		this.type = type;
	}
}