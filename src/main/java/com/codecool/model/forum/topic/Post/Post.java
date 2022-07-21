package com.codecool.model.forum.topic.Post;

import com.codecool.model.forum.topic.Post.comment.Comment;

import java.util.List;

public class Post {
    private String title;
    private String content;
    private List<Comment> replies;
    private int viewCount;
    private int replyCount;
}
