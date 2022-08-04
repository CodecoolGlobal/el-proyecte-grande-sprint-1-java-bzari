package com.codecool.model.user;

import com.codecool.model.forum.topic.Post.Post;
import com.codecool.model.forum.topic.Post.comment.Comment;
import com.codecool.model.forum.topic.Topic;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.hibernate.usertype.UserType;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Users {

	@Id
	@GeneratedValue
	private Long id;
	private String username;
	private String password;
	private String email;
	private UsersType type;
	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	@JsonIgnore
	private Set<Topic> userTopics;
	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	@JsonIgnore
	private Set<Post> userPosts;
	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	@JsonIgnore
	private Set<Comment> userComments;
//	private List<Location> favorites;

}