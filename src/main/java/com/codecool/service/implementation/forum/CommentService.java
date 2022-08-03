package com.codecool.service.implementation.forum;

import com.codecool.model.forum.topic.Post.comment.Comment;
import com.codecool.service.repositories.CommentRepository;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CommentService {

    @Autowired
    CommentRepository commentRepository;

    public Comment getCommentById(Long commentId){
        return commentRepository.getCommentById(commentId);
    }

    public void upVoteComment(Long commentId){
        commentRepository.getCommentById(commentId).getUpvote() ;
    }
}
