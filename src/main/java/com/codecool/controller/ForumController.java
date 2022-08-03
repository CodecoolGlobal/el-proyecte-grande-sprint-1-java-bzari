package com.codecool.controller;

import com.codecool.model.forum.topic.Post.Post;
import com.codecool.model.forum.topic.Post.comment.Comment;
import com.codecool.model.forum.topic.Topic;
import com.codecool.service.implementation.forum.CommentService;
import com.codecool.service.implementation.forum.PostService;
import com.codecool.service.implementation.forum.TopicService;
import lombok.AllArgsConstructor;
import lombok.Builder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@Controller
@RequestMapping(value = "/forum")
@Builder
@AllArgsConstructor
public class ForumController {

    @Autowired
    private TopicService topicService;
    @Autowired
    private PostService postService;
    @Autowired
    private CommentService commentService;

    @GetMapping(value = "/topics")
    @ResponseBody
    public List<Topic> getAllTopics(){
        return topicService.getAllTopics();
    }
    @PostMapping(value = "/topics/new")
    public String addTopic(@RequestBody Topic topic){
        topicService.addNewTopic(topic);
        return "index";
//        TODO : return to topics page
    }

    @GetMapping(value = "/topics/{topicId}/titles")
    public List<String> getTopicNameByTopicId(@PathVariable Long topicId){return topicService.getTopicNameByTopicId(topicId);}


    @GetMapping(value = "/topics/{topicId}/posts")
    @ResponseBody
    public List<Post> getTopicPostsByTopicId(@PathVariable Long topicId){
        return postService.getPostsByTopicId(topicId);
    }

    //    TODO : edit topic


    @GetMapping(value = "posts/{postId}")
    @ResponseBody
    public Post getPostById(@PathVariable Long postId){
        return postService.getPostById(postId);
    }

    //    TODO : edit post
    @PostMapping(value = "/{topicId}/newPost")
    public String addPost(@RequestBody Post post, @PathVariable Long topicId){
        post.setTopic(topicService.getTopicById(topicId));
        postService.addPost(post);
    return "index";
    }

    @PostMapping(value = "/{topicId}/{postId}/newComment")
    public void addCommentToPost(@RequestBody Comment comment, @PathVariable Long topicId, @PathVariable Long postId){

    }
    //    TODO : edit comment


    @PostMapping(value = "/comments/{commentId}/upVote")
    public void upVoteComment(@PathVariable Long commentId){

    }

}
