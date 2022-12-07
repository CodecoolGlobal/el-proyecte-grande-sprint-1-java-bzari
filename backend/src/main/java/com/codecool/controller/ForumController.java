package com.codecool.controller;

import com.codecool.model.forum.Post;
import com.codecool.model.forum.Comment;
import com.codecool.model.forum.Topic;
import com.codecool.service.users.ApplicationUserService;
import com.codecool.service.forum.CommentService;
import com.codecool.service.forum.PostService;
import com.codecool.service.forum.TopicService;
import lombok.AllArgsConstructor;
import lombok.Builder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/forum")
@Builder
public class ForumController {

    private TopicService topicService;
    private PostService postService;
    private CommentService commentService;
    private ApplicationUserService usersService;

    @Autowired
    public ForumController(TopicService topicService, PostService postService, CommentService commentService, ApplicationUserService usersService) {
        this.topicService = topicService;
        this.postService = postService;
        this.commentService = commentService;
        this.usersService = usersService;
    }

    @GetMapping(value = "/topics")
    public List<Topic> getAllTopics(){
        return topicService.getAllTopics();
    }

    @PostMapping(value = "/new_topic")
    public void addTopic(@RequestBody Topic topic){
        topicService.addNewTopic(topic);

//        TODO : return to topics page
    }

    @GetMapping(value = "/topics/{topicId}/titles")
    public List<String> getTopicNameByTopicId(@PathVariable Long topicId){return topicService.getTopicNameByTopicId(topicId);}


    @GetMapping(value = "/topics/{topicId}/posts")
    public List<Post> getTopicPostsByTopicId(@PathVariable Long topicId){
        return postService.getPostsByTopicId(topicId);
    }

    @GetMapping(value = "/topics/{topicId}")
    public Topic getTopicById(@PathVariable Long topicId){
        return topicService.getTopicById(topicId);
    }

    //    TODO : edit topic


    @GetMapping(value = "posts/{postId}")
    public Post getPostById(@PathVariable Long postId){
        return postService.getPostById(postId);
    }

    @GetMapping(value = "posts/{postId}/comments")
    public List<Comment> getPostCommentsByPostId(@PathVariable Long postId){
        return commentService.getPostCommentsByPostId(postId);
    }

    //    TODO : edit post
    @PostMapping(value = "/{topicId}/newPost")
    public void addPost(@RequestBody Post post, @PathVariable Long topicId){
        post.setTopic(topicService.getTopicById(topicId));
        post.setUser(usersService.getUsersById(1L));
        postService.addPost(post);
    }

    @PostMapping(value = "/{postId}/new_Comment")
    public void addCommentToPost(@RequestBody Comment comment, @PathVariable Long postId){
        comment.setPost(postService.getPostById(postId));
        comment.setUser(usersService.getUsersById(1L));
        commentService.addComment(comment);
    }
    //    TODO : edit comment


}
