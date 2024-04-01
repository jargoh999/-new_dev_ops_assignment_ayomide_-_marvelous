package com.semicolon.africa.Blog.services;

import com.semicolon.africa.Blog.data.model.Comment;
import com.semicolon.africa.Blog.dtos.CommentRequest;
import com.semicolon.africa.Blog.dtos.CommentResponse;

public interface CommentServices {
    CommentResponse saveComment(CommentRequest commentRequest);

}
