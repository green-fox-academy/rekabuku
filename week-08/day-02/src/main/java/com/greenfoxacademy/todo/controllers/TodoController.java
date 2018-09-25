package com.greenfoxacademy.todo.controllers;

import com.greenfoxacademy.todo.repositories.TodoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TodoController {
    private TodoRepository todoRepository;

    public TodoController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @RequestMapping(value= {"/todo", "/todo/list"})
    public String list(Model model){
        model.addAttribute("todos", todoRepository.findAll());
        return "todolist";
    }
}
