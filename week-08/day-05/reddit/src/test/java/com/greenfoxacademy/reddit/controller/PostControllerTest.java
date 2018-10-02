package com.greenfoxacademy.reddit.controller;

import com.greenfoxacademy.reddit.controllers.PostController;
import com.greenfoxacademy.reddit.models.Post;
import com.greenfoxacademy.reddit.repositories.PostRepository;
import com.greenfoxacademy.reddit.services.PostService;
import com.greenfoxacademy.reddit.services.PostServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.validation.support.BindingAwareModelMap;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
@WebMvcTest(PostController.class)
public class PostControllerTest {

    @Autowired
    MockMvc mockMvc;

    @MockBean
    PostRepository postRepository;

    @MockBean
    PostService postService;

    @MockBean
    Post post;

    private PostServiceImpl mockPostServiceImpl;

    @Before
    public void before() {
        mockPostServiceImpl = mock(PostServiceImpl.class);
    }

    @Test
    public void addNew() {
        PostController controller = new PostController(mockPostServiceImpl);

        Post expectedPost = new Post();
        when(mockPostServiceImpl.save(new Post())).thenReturn(expectedPost);
        String result = controller.getPostName();

        assertEquals(expectedPost, result);
    }
}
