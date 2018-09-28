package com.greenfoxacademy.reddit;

import com.greenfoxacademy.reddit.models.Post;
import com.greenfoxacademy.reddit.services.PostServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RedditApplication {

    private PostServiceImpl postServiceImpl;

    public RedditApplication(PostServiceImpl postServiceImpl) {
        this.postServiceImpl = postServiceImpl;
    }

    public static void main(String[] args) {
        SpringApplication.run(RedditApplication.class, args);
    }

    public void run(String... args) throws Exception {
        Post post = new Post();
        post.setTitle("Drink coffee");
        post.setRating(3);
        Post post2 = new Post();
        post2.setTitle("Clean the bathroom");
        post2.setRating(5);

        postServiceImpl.save(post);
        postServiceImpl.save(post2);
    }
}
