package com.semicolon.africa.Blog.dtos;
import lombok.Data;
@Data
public class CommentResponse {
    private RegisterResponse registerResponse;
    private String comment;
}
