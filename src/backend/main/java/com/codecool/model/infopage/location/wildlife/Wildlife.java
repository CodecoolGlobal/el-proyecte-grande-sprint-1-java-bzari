package com.codecool.model.infopage.location.wildlife;

import com.codecool.model.infopage.location.Location;
import lombok.*;

import javax.persistence.*;

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
	@Lob
	private String description;
	private double lifetime;
	private String lifetimeInterval;
	@Enumerated(EnumType.STRING)
	private ConservationStatus status;
	@Lob
	private String crisis;
	@Enumerated(EnumType.STRING)
	private WildlifeType type;
}