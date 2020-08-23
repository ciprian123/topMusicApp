package com.ciprianursulean.topmusic.repository;

import com.ciprianursulean.topmusic.model.Comment;
import com.ciprianursulean.topmusic.model.Song;

import java.util.List;

public interface SongRepository {
    List<Song> getAllSongs();
    List<Song> getSongByGenre(String genre);
    List<Song> getSongsTop();
    List<Song> getSongsTopByGenre();

    List<Comment> getSongComments(int songId);
    List<Comment> getSongComments(String songName);

    int getSongNoOfVotes(int songId);
    int getSongNoOfVotes(String name);

    boolean addSong(Song song);
    boolean updateSong(int songId, Song song);
    boolean deleteSong(int songId);
    boolean deleteSong(String name);
}
