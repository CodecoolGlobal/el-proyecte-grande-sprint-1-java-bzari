package com.codecool.service.forum;

import com.codecool.model.forum.Comment;
import com.codecool.service.repository.CommentRepository;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Builder
@NoArgsConstructor
@Getter
@Setter
public class CommentService {

    CommentRepository commentRepository;

    @Autowired
    public CommentService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    public void addComment(Comment comment){commentRepository.save(comment);}

    public List<Comment> getPostCommentsByPostId(Long postId){
        return commentRepository.getCommentsByPostId(postId);
    }
}
