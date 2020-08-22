package com.ciprianursulean.topmusic.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "users")
@Data
public class User {
    @Id
    @GeneratedValue(generator = "sequence")
    @Column(name = "user_id")
    private int userId;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "admin_status")
    private String adminStatus;

    @Column(name = "vote_status")
    private String voteStatus;

    @Column(name = "created_at")
    private Date createdAt;
}
