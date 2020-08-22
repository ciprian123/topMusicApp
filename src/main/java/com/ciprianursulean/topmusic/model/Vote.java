package com.ciprianursulean.topmusic.model;

import jdk.jfr.Enabled;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "votes")
@Data
public class Vote {
    @Id
    @GeneratedValue(generator = "sequence")
    @Column(name = "vode_id")
    private int voteId;

    @Column(name = "user_id")
    private int userId;

    @Column(name = "song_id")
    private int songId;

    @Column(name = "created_at")
    private Date createdAt;
}
