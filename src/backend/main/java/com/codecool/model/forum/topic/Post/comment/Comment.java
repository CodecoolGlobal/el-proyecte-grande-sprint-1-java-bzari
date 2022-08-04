package com.codecool.model.forum.topic.Post.comment;

import com.codecool.model.forum.topic.Post.Post;
import com.codecool.model.user.Users;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Comment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	private Date timestamp;
	private String message;
	private int upvote;
	@ManyToOne
	private Users user;
	@ManyToOne
	@JsonIgnore
	private Post post;

}