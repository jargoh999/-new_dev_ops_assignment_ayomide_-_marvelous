package com.semicolon.africa.Blog.repository;
import com.semicolon.africa.Blog.data.model.Comment;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface Comments extends MongoRepository<Comment,String> {
}
