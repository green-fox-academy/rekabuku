package com.greenfoxacademy.reddit.services;

import com.greenfoxacademy.reddit.models.Post;

public interface PostService {

    public Iterable<Post> list();

    public Post save (Post post);

}
