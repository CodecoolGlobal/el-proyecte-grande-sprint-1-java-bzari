package com.codecool.service.implementation.forum;

import com.codecool.model.forum.topic.Post.Post;
import com.codecool.model.forum.topic.Topic;
import com.codecool.service.repositories.PostRepository;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public Post getPostById(Long postId){
        return postRepository.getPostById(postId);
    }

    public void addPost(Post post){
        postRepository.save(post);
    }

    public List<Post> getPostsByTopicId(Long topicId){return postRepository.getPostsByTopicId(topicId);}

}
