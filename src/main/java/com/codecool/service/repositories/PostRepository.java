package com.codecool.service.repositories;

import com.codecool.model.forum.topic.Post.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {

    Post getPostById(Long id);
}
