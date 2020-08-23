package com.ciprianursulean.topmusic.repository;

import com.ciprianursulean.topmusic.model.Song;
import com.ciprianursulean.topmusic.model.User;
import com.ciprianursulean.topmusic.model.Vote;

import java.util.List;

public interface VoteRepository {
    List<Vote> getAllVotes();
    boolean addVote(int userId, int songId);
    boolean updateVote(int userId, int songId);
    boolean deleteVote(int userId, int songId);
}
