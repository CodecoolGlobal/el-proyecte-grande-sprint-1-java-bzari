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
	private Long id;
	@JsonIgnore
	@ManyToOne
	private Continent continent;
	private String name;
	@Lob
	private String description;
	@JsonIgnore
	@OneToMany(mappedBy = "location", cascade = CascadeType.ALL)
	private List<Wildlife> wildlife;
	private String video;
	private String sound;
	@Lob
	private String climate;
	@Lob
	private String crisis;
}