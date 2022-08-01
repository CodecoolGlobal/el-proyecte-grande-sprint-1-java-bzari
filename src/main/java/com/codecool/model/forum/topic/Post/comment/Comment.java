package com.codecool.model.forum.topic.Post.comment;

import com.codecool.model.forum.topic.Post.Post;
import com.codecool.model.user.Users;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
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
	@ManyToOne
	private Users user;
	@ManyToOne
	private Post post;

}