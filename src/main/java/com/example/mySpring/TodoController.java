package com.example.mySpring;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class TodoController {

    @Autowired
    private TodoService todoService;

    @RequestMapping("/todos")
    public List<Todo> getAllTodos(){
        return todoService.getAllTodo();
    }

    @RequestMapping("/todos/{id}")
    public Todo getTodo(@PathVariable int id){
        return todoService.getTodo(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/todos")
    public void addTodo(@RequestBody Todo todo){
        todoService.addTodo(todo);

    }
}
