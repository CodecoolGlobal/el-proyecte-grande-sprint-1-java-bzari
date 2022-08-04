package com.codecool.service.repository;

import com.codecool.model.forum.topic.Post.comment.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {

    Comment getCommentById(Long commentId);
    List<Comment> getCommentsByPostId(Long PostId);
}
