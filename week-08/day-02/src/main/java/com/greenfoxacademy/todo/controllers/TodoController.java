package com.greenfoxacademy.todo.controllers;

import com.greenfoxacademy.todo.models.Todo;
import com.greenfoxacademy.todo.repositories.TodoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TodoController {
    private TodoRepository todoRepository;

    public TodoController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @GetMapping("/todo")
    public String list(Model model){
        model.addAttribute("todos", todoRepository.findAll());
        return "todolist";
    }


    @RequestMapping(value= {"/todo/list"})
    public String list(@RequestParam ("isActive")Boolean done, Model model){
        model.addAttribute("todos", todoRepository.findAll());
        model.addAttribute("done", done);
        return "activetodo";
    }

    @GetMapping("/todo/add")
    public String addTodo(){
        return "add";
    }

    @PostMapping("/todo/add")
    public String getName(@RequestParam ("todo") String todo){
        if(todo.isEmpty()){
            return "add";

        }
        Todo newTodo = new Todo();
        newTodo.setTitle(todo);
        todoRepository.save(newTodo);
        return "redirect:/todo";
    }
}
