package com.codecool.service.repositories;

import com.codecool.model.forum.topic.Post.comment.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
