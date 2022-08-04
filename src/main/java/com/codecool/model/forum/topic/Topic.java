package com.codecool.model.forum.topic;

import com.codecool.model.forum.topic.Post.Post;
import com.codecool.model.user.Users;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Topic {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String title;
	private String description;
	private LocalDate timestamp;
	@ManyToOne
	private Users user;
	@OneToMany(mappedBy = "topic", fetch = FetchType.EAGER)
//	@ElementCollection
	private List<Post> posts;
}