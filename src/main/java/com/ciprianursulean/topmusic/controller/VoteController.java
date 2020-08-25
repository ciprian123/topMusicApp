package com.ciprianursulean.topmusic.controller;

import com.ciprianursulean.topmusic.model.Vote;
import com.ciprianursulean.topmusic.service.VoteService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@AllArgsConstructor
public class VoteController {
    private final VoteService voteService;

    @GetMapping("/votes")
    public ResponseEntity<List<Vote>> getAllVotes() {
        return new ResponseEntity<>(voteService.getAllVotes(), HttpStatus.OK);
    }
}
