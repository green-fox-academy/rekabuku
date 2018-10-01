package com.greenfoxacademy.reddit.controllers;

import com.greenfoxacademy.reddit.models.Post;
import com.greenfoxacademy.reddit.services.PostServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PostController {
    private PostServiceImpl postServiceImpl;

    public PostController(PostServiceImpl postServiceImpl) {
        this.postServiceImpl = postServiceImpl;
    }

    @GetMapping("/reddit")
    public String list(Model model) {
        model.addAttribute("posts", postServiceImpl.list());
        return "main";
    }

    @GetMapping("/newpost")
    public String addNewPost() {
        return "post";
    }
    @PostMapping("/newpost")
    public String getPostName(@RequestParam("post") String post) {
        if (post.isEmpty()) {
            return "post";
        }
        Post newPost = new Post();
        newPost.setTitle(post);
        postServiceImpl.save(newPost);
        return "redirect:/reddit";
    }

    @GetMapping("/reddit/{id}/downvote")
    public String downVote(@PathVariable(value = "id") Long id) {
        Post post = postServiceImpl.findById(id);
        postServiceImpl.downVote(id);
        return "redirect:/reddit";
    }
    @GetMapping("/reddit/{id}/upvote")
    public String upVote(@PathVariable(value = "id") Long id) {
        Post post = postServiceImpl.findById(id);
        postServiceImpl.upVote(id);
        return "redirect:/reddit";
    }



}