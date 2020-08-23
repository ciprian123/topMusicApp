package com.ciprianursulean.topmusic.repository;

import com.ciprianursulean.topmusic.model.Comment;

import java.util.List;

public interface CommentRepository {
    List<Comment> getAllComments();
    List<Comment> getCommentsBySong(int songId);
    List<Comment> getCommentsBySong(String songName);

    boolean addComment(Comment comment);
    boolean updateComment(int commentId, Comment comment);
    boolean deleteComment(int commendId);
}
