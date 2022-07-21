package com.codecool.model.forum.topic;

import com.codecool.model.forum.topic.Post.comment.Comment;
import com.codecool.model.user.User;

import java.time.LocalDate;
import java.util.List;

public class Topic {

	private User user;
	private String title;
	private String description;
	private LocalDate timestamp;
	private List<Comment> replies;

}