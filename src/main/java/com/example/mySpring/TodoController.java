package com.example.mySpring;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TodoController {

    @RequestMapping("/todos")
    public List<Todo> getAllTodos(){
        return Arrays.asList(
                new Todo(1,"numero 1",false),
                new Todo(2,"numero 2",false),
                new Todo(3,"numero 3",false)


        );
    }
}
