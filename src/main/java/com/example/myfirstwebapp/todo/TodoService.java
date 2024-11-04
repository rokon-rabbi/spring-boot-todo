package com.example.myfirstwebapp.todo;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
@Service
public class TodoService {
    private static List<Todo>  todos = new ArrayList<>() ;
    private static int todosCount=0;
    static {
        todos.add(new Todo(++todosCount, "in28min", "Learn Dsa", LocalDate.now().plusYears(1), false));
        todos.add(new Todo(++todosCount, "sumit", "Learn Java", LocalDate.now().plusYears(2), false));
        todos.add(new Todo(++todosCount, "programming", "Learn Spring boot", LocalDate.now().plusYears(3), false));
    }
    public List<Todo> findByUsername(String username){
        return todos;
    }
    public void addTodo(String username, String description, LocalDate targetDate, boolean completed ){
        Todo todo= new Todo(++todosCount, username,description,targetDate,completed);
        todos.add(todo);
        ++todosCount;
    }
}
