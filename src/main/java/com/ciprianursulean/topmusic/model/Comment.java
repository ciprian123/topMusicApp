package com.ciprianursulean.topmusic.model;


import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "comments")
@Data
public class Comment {
    @Id
    @GeneratedValue(generator = "sequence")
    @Column(name = "comment_id")
    private int commentId;

    @Column(name = "user_id")
    private int userId;

    @Column(name = "song_id")
    private int songId;

    @Column(name = "content")
    private String content;

    @Column(name = "created_at")
    private Date createdAt;
}
