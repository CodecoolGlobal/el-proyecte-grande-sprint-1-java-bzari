package com.codecool.service.repository;

import com.codecool.model.forum.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

    Post getPostById(Long id);
    List<Post> getPostsByTopicId(Long topicId);
}
