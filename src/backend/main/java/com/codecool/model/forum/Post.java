package com.codecool.model.forum;

import com.codecool.model.forum.Topic;
import com.codecool.model.forum.Comment;
import com.codecool.model.user.ApplicationUser;
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
    @ManyToOne
    private ApplicationUser user;
    @ManyToOne
    @JsonIgnore
    private Topic topic;
    private int viewCount;
    private int replyCount;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date timestamp;

}
