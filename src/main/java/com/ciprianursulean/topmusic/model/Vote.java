package com.ciprianursulean.topmusic.model;

import jdk.jfr.Enabled;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@NamedQueries({
        @NamedQuery(
                name = "getAllVotes",
                query = "select v from Vote v"
        ),
        @NamedQuery(
                name = "findVoteWithInfoGiven",
                query = "select v from Vote v where v.userId = :userId and v.songId = :songId"
        )
    }
)
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
