package com.codecool.model.user;

import com.codecool.model.forum.topic.Post.Post;
import com.codecool.model.forum.topic.Post.comment.Comment;
import com.codecool.model.forum.topic.Topic;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
	private UserType type;
	@OneToMany(mappedBy = "user")
	private Set<Topic> userTopics;
	@OneToMany(mappedBy = "user")
	private Set<Post> userPosts;
	@OneToMany(mappedBy = "user")
	private Set<Comment> userComments;
//	private List<Location> favorites;

}