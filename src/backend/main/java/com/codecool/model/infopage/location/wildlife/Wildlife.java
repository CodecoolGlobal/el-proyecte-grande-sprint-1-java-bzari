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
	private Long id;
	@ManyToOne
	private Location location;
	private String name;
	private String description;
	private double lifetime;
	private String lifetimeInterval;
	private ConservationStatus status;
	private String crisis;
	private WildlifeType type;
}