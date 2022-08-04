package com.codecool.model.forum.topic.Post;

import com.codecool.model.forum.topic.Post.comment.Comment;
import com.codecool.model.forum.topic.Topic;
import com.codecool.model.user.Users;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String content;
    @OneToMany(mappedBy = "post", fetch = FetchType.EAGER)
    private List<Comment> replies;
    @ManyToOne(cascade = CascadeType.ALL)
    private Users user;
    @ManyToOne
    @JsonIgnore
    private Topic topic;
    private int viewCount;
    private int replyCount;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date timestamp;

}
