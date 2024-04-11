package com.KeM90.rest.webservices.restfulwebservices.todo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoHardcodedService {

    private static List<Todo> todos = new ArrayList<>();
    private static int idCounter = 0;


    static {
        todos.add(new Todo(++idCounter, "manager", "vacuum the livingroom", new Date(), false));
        todos.add(new Todo(++idCounter, "manager", "clean up the office", new Date(), false));
        todos.add(new Todo(++idCounter, "manager", "clean the bathroom", new Date(), false));
    }

    public List<Todo> findAll() {
        return todos;
    }
}