package com.codecool.service.forum;

import com.codecool.model.forum.topic.Topic;
import com.codecool.service.repository.TopicRepository;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
@Getter
@Setter
@Builder
@NoArgsConstructor
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

    public TopicService(TopicRepository topicRepository) {
        this.topicRepository = topicRepository;
    }

    public List<Topic> getAllTopics(){
        return topicRepository.findAll();
    }

    public Topic getTopicById(Long id){return topicRepository.getTopicById(id);}

    public void addNewTopic(Topic topic){topicRepository.save(topic);}

    public List<String> getTopicNameByTopicId(Long topicId){
        List<String> titles = new ArrayList<>();
        titles.add(topicRepository.getTopicById(topicId).getTitle());
        return titles;};

}
