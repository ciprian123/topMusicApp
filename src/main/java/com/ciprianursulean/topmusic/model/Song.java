package com.ciprianursulean.topmusic.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Songs")
@Data
public class Song {
    @Id
    @GeneratedValue(generator = "sequence")
    @Column(name = "song_id")
    private int songId;

    @Column(name = "user_id")
    private int userId;

    @Column(name = "title")
    private String title;

    @Column(name = "author")
    private String author;

    @Column(name = "release_year")
    private int releaseYear;

    @Column(name = "genre")
    private String genre;

    @Column(name = "description")
    private String description;

    @Column(name = "url")
    private String url;

    @Column(name = "no_of_votes")
    private String noOfVotes;

    @Column(name = "created_at")
    private Date createdAt;
}
