package com.codecool.model.infopage;

import com.codecool.model.DTO.MapDTO;
import com.codecool.model.infopage.location.Location;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Continent {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	@OneToMany(mappedBy = "continent", cascade = CascadeType.ALL)
	private List<Location> locations;

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

