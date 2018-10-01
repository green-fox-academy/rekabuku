package com.greenfoxacademy.reddit.services;

import com.greenfoxacademy.reddit.models.Post;

import java.util.List;

public interface PostService {

    public Iterable<Post> list();

    public Post save(Post post);

    public Post findById(Long id);

    public void downVote(Long id);

    public void upVote (Long id);

}
