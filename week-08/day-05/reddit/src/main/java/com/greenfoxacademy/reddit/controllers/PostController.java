package com.greenfoxacademy.reddit.controllers;

import com.greenfoxacademy.reddit.services.PostServiceImpl;

public class PostController {
    private PostServiceImpl postServiceImpl;

    public PostController(PostServiceImpl postServiceImpl) {
        this.postServiceImpl = postServiceImpl;
    }


}
