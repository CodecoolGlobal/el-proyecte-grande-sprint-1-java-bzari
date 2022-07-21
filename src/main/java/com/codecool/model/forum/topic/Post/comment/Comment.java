package com.codecool.model.forum.topic.Post.comment;

import com.codecool.model.user.User;

import java.time.LocalDate;

public class Comment {

	private User user;
	private LocalDate timestamp;
	private String message;
	private int upvote;

}