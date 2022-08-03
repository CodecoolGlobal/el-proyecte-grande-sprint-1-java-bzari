package com.codecool.service.repositories;

import com.codecool.model.forum.topic.Topic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicRepository extends JpaRepository<Topic, Long> {

    Topic getTopicById(Long id);
    }
