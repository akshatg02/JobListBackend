package com.jobs.joblisting.controller;

import com.jobs.joblisting.repository.PostRepository;
import com.jobs.joblisting.model.Post;
import com.jobs.joblisting.repository.SearchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class PostController
{
    @Autowired
    PostRepository repo;

    @Autowired
    SearchRepository sRepo;
    @GetMapping("/allPosts")
    @CrossOrigin
    public List<Post> getAllPosts() {

        return repo.findAll();
    }

    @GetMapping("/posts/{text}")
    @CrossOrigin
    public List<Post> search(@PathVariable String text) {

        return sRepo.findByText(text);
    }

    @PostMapping("/post")
    @CrossOrigin
    public ResponseEntity<Post> addPost(@RequestBody Post post) {
        if (post.getProfile().isEmpty() || post.getTechs().length == 0 || post.getDesc().isEmpty()) {
            return ResponseEntity.badRequest().build();
        }
        Post savedPost = repo.save(post);
        return ResponseEntity.ok(savedPost);
    }

}
