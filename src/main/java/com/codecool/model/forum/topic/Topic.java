package com.codecool.model.forum.topic;

import com.codecool.model.forum.topic.Post.Post;
import com.codecool.model.forum.topic.Post.comment.Comment;
import com.codecool.model.user.Users;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

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
	@ManyToOne(cascade = CascadeType.ALL)
	private Users user;
	@OneToMany(mappedBy = "topic", fetch = FetchType.EAGER)
//	@ElementCollection
	private List<Post> posts;
}