package com.codecool.model.forum.topic;

import com.codecool.model.forum.topic.Post.Post;
import com.codecool.model.user.ApplicationUser;
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
public class Topic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date timestamp;
    @ManyToOne
    private ApplicationUser user;
    @OneToMany(mappedBy = "topic", fetch = FetchType.EAGER)
//	@ElementCollection
    private List<Post> posts;
}