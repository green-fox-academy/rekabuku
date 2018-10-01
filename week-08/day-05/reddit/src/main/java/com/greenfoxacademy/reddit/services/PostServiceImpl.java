package com.greenfoxacademy.reddit.services;

import com.greenfoxacademy.reddit.models.Post;
import com.greenfoxacademy.reddit.repositories.PostRepository;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService {
    private PostRepository postRepository;

    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public Iterable<Post> list() {
        return postRepository.findAll();
    }

    @Override
    public Post save(Post post) {
        return postRepository.save(post);
    }

    @Override
    public Post findById(Long id) {
        return postRepository.findById(id).get();
    }


    @Override
    public void downVote(Long id) {
        postRepository.findById(id).get().setRating(postRepository.findById(id).get().getRating() - 1);
        postRepository.save(postRepository.findById(id).get());
    }

    @Override
    public void upVote(Long id) {
        postRepository.findById(id).get().setRating(postRepository.findById(id).get().getRating() + 1);
        postRepository.save(postRepository.findById(id).get());
    }

}
