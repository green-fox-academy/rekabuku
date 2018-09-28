package com.greenfoxacademy.reddit.services;

import com.greenfoxacademy.reddit.repositories.PostRepository;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService{
    private PostRepository postRepository;

    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }
}
