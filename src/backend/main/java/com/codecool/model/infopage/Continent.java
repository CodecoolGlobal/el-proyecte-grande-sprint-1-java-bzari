package com.codecool.model.infopage;

import com.codecool.model.infopage.location.Location;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
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
	private BigDecimal altitude;
	private BigDecimal longitude;
}

