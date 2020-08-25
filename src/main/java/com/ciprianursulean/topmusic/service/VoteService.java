package com.ciprianursulean.topmusic.service;

import com.ciprianursulean.topmusic.model.Vote;
import com.ciprianursulean.topmusic.repository.VoteRepository;
import com.ciprianursulean.topmusic.repository.impl.VoteRepositoryImpl;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@AllArgsConstructor
public class VoteService {
    private final VoteRepositoryImpl voteRepository;

    public List<Vote> getAllVotes() {
        return voteRepository.getAllVotes();
    }

}
