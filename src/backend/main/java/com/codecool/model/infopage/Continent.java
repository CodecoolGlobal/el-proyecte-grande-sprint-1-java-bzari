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
	@JsonIgnore
	@OneToMany(mappedBy = "continent", cascade = CascadeType.ALL)
	private List<Location> locations;

//	public List<MapDTO> getAllLocationDTO(){
//		List<MapDTO> allLocationDTO = new ArrayList<>();
//		for (Location location : locations) {
//			allLocationDTO.add(new MapDTO(location.getName(), location.getId()));
//		}
//		return allLocationDTO;
//	}
}

