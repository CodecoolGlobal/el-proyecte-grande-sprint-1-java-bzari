package com.codecool.model.forum.topic.Post;

import com.codecool.model.forum.topic.Post.comment.Comment;
import com.codecool.model.forum.topic.Topic;
import com.codecool.model.user.Users;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Post {

    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String content;
    @OneToMany(mappedBy = "post")
    private List<Comment> replies;
    @ManyToOne(cascade = CascadeType.ALL)
    private Users user;
    @ManyToOne
    private Topic topic;
    private int viewCount;
    private int replyCount;
}
