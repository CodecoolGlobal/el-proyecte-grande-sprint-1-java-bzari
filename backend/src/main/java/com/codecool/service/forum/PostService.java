package com.codecool.service.forum;

import com.codecool.model.forum.Post;
import com.codecool.service.repository.PostRepository;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Builder
@NoArgsConstructor
public class PostService {

    private PostRepository postRepository;

    @Autowired
    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public Post getPostById(Long postId){
        return postRepository.getPostById(postId);
    }

    public void addPost(Post post){
        postRepository.save(post);
    }

    public List<Post> getPostsByTopicId(Long topicId){return postRepository.getPostsByTopicId(topicId);}

}
