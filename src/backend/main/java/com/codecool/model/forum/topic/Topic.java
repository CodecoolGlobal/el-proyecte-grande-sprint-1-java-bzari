package com.codecool.model.forum.topic;

import com.codecool.model.forum.topic.comment.Comment;
import com.codecool.model.user.User;

import java.time.LocalDate;
import java.util.List;

public class Topic {

	private User user;
	private String title;
	private String message;
	private LocalDate timestamp;
	private int view;
	private int repliesCount;
	private List<Comment> replies;
	private TopicStatus status;

}