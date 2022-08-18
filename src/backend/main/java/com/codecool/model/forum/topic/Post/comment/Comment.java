package com.codecool.model.forum.topic.Post.comment;

import com.codecool.model.forum.topic.Post.Post;
import com.codecool.model.user.ApplicationUser;
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
	private ApplicationUser user;
	@ManyToOne
	@JsonIgnore
	private Post post;

}