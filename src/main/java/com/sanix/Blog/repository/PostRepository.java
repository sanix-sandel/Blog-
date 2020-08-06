package com.sanix.Blog.repository;

//Repositories are responsible to save
// the domain objects into the database.

import com.sanix.Blog.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PostRepository extends JpaRepository<Post, Long> {
}
