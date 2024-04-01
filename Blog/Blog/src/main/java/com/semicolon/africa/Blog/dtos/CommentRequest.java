package com.semicolon.africa.Blog.dtos;
import lombok.Data;
@Data
public class CommentRequest {
    private RegisterRequest registerRequest;
    private String comment;
}
