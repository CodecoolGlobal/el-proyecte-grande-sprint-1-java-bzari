package com.codecool.model.infopage.location;

import com.codecool.model.infopage.Continent;
import com.codecool.model.infopage.location.wildlife.Wildlife;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.List;
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Location {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@ManyToOne
	private Continent continent;
	private String name;
	private String description;
	@OneToMany(mappedBy = "location", cascade = CascadeType.ALL)
	private List<Wildlife> wildlife;
	private String video;
	private String sound;
	private String climate;
	private String crisis;
	
	public String getName() {
		return name;
	}

	public List<Wildlife> getWildlife() {
		return wildlife;
	}

	public int getId() {
		return id;
	}

//	public int getContinentId() {
//		return continentId;
//	}

	public String getDescription() {
		return description;
	}

	public String getVideo() {
		return video;
	}

	public String getSound() {
		return sound;
	}

	public String getClimate() {
		return climate;
	}

	public String getCrisis() {
		return crisis;
	}
}