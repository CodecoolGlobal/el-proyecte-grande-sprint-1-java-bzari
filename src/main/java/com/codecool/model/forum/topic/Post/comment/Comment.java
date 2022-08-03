package com.codecool.model.forum.topic.Post.comment;

import com.codecool.model.forum.topic.Post.Post;
import com.codecool.model.user.Users;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.PipedOutputStream;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Comment {

	@Id
	@GeneratedValue
	private Long id;
	private LocalDate timestamp;
	private String message;
	private int upvote;
	@ManyToOne(cascade = CascadeType.ALL)
	private Users user;
	@ManyToOne(cascade = CascadeType.ALL)
	@JsonIgnore
	private Post post;

}