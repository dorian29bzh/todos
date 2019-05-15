package com.example.mySpring;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class TodoService {

   private List<Todo> todoList =  new ArrayList<>(Arrays.asList(
            new Todo(1,"numero 1",false),
            new Todo(2,"numero 2",false),
            new Todo(3,"numero 3",false)));


   public List<Todo> getAllTodo(){
       return todoList;
   }

   public Todo getTodo(int id){

       for(Todo todo : todoList){
           if (todo.getId() == id){ return todo;}
       }
       throw new NoSuchElementException();


   }

    public void addTodo(Todo todo) {
       todoList.add(todo);

    }

    public void updateTodo(int id, Todo todo) {
       for (Todo t : todoList){
           if (t.getId() == id){
               todoList.set(id-1, todo);
               return;
           }
       }
    }

    public void deleteTodo(int id) {
       for (Todo t : todoList){
           if (t.getId() == id){
               todoList.remove(id);
           }
       }
    }
}
