package com.greenfoxacademy.reddit;

import com.greenfoxacademy.reddit.models.Post;
import com.greenfoxacademy.reddit.services.PostServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RedditApplication implements CommandLineRunner {

    private PostServiceImpl postServiceImpl;

    public RedditApplication(PostServiceImpl postServiceImpl) {
        this.postServiceImpl = postServiceImpl;
    }

    public static void main(String[] args) {
        SpringApplication.run(RedditApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Post post = new Post();
        post.setTitle("Daily news");
        post.setRating(3);
        post.setUrl("https://index.hu/");
        Post post2 = new Post();
        post2.setTitle("Have some fun!");
        post2.setUrl("https://9gag.com/");
        post2.setRating(5);

        postServiceImpl.save(post);
        postServiceImpl.save(post2);
        System.out.println(postServiceImpl.list());
    }
}
