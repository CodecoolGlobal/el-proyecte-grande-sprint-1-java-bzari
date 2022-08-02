package com.codecool.model.infopage.location.wildlife;

import com.codecool.model.infopage.location.Location;
import lombok.*;

import javax.persistence.*;
import java.util.UUID;
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Wildlife {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@ManyToOne
	private Location location;
	private String name;
	private String description;
	private double lifetime;
	private String lifetimeInterval;
	private ConservationStatus status;
	private String crisis;
	private WildlifeType type;

	public Wildlife(int id, int locationId, String name, String description, double lifetime,
					String lifetimeInterval, ConservationStatus status,
					String crisis, WildlifeType type) {
		this.id = id;
		this.locationId = locationId;
		this.name = name;
		this.description = description;
		this.lifetime = lifetime;
		this.lifetimeInterval = lifetimeInterval;
		this.status = status;
		this.crisis = crisis;
		this.type = type;
	}

	public int getLocationId() {
		return locationId;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public String getDescription() {
		return description;
	}

	public double getLifetime() {
		return lifetime;
	}

	public String getLifetimeInterval() {
		return lifetimeInterval;
	}

	public ConservationStatus getStatus() {
		return status;
	}

	public String getCrisis() {
		return crisis;
	}

	public WildlifeType getType() {
		return type;
	}
}