package com.codecool.service.forum;

import com.codecool.model.forum.Comment;
import com.codecool.service.repository.CommentRepository;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
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

    public void addComment(Comment comment){commentRepository.save(comment);}

    public void upVoteComment(Long commentId){
        commentRepository.getCommentById(commentId).getUpvote();
    }
    public List<Comment> getPostCommentsByPostId(Long postId){
        return commentRepository.getCommentsByPostId(postId);
    }
}
