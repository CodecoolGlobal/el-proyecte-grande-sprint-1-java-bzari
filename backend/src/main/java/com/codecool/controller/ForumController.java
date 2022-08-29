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
    @Autowired
    private ApplicationUserService usersService;

    @GetMapping(value = "/topics")
    @ResponseBody
    public List<Topic> getAllTopics(){
        return topicService.getAllTopics();
    }

    @PostMapping(value = "/new_topic")
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

    @GetMapping(value = "/topics/{topicId}")
    @ResponseBody
    public Topic getTopicById(@PathVariable Long topicId){
        return topicService.getTopicById(topicId);
    }

    //    TODO : edit topic


    @GetMapping(value = "posts/{postId}")
    @ResponseBody
    public Post getPostById(@PathVariable Long postId){
        return postService.getPostById(postId);
    }

    @GetMapping(value = "posts/{postId}/comments")
    @ResponseBody
    public List<Comment> getPostCommentsByPostId(@PathVariable Long postId){
        return commentService.getPostCommentsByPostId(postId);
    }

    //    TODO : edit post
    @PostMapping(value = "/{topicId}/newPost")
    public String addPost(@RequestBody Post post, @PathVariable Long topicId){
        post.setTopic(topicService.getTopicById(topicId));
        post.setUser(usersService.getUsersById(1L));
        postService.addPost(post);
    return "index";
    }

    @PostMapping(value = "/{postId}/new_Comment")
    public String addCommentToPost(@RequestBody Comment comment, @PathVariable Long postId){
        comment.setPost(postService.getPostById(postId));
        comment.setUser(usersService.getUsersById(1L));
        commentService.addComment(comment);
        return "index";
    }
    //    TODO : edit comment


    @PostMapping(value = "/comments/{commentId}/upVote")
    public void upVoteComment(@PathVariable Long commentId){

    }

}
