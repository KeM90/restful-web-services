package com.KeM90.rest.webservices.restfulwebservices;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


//Controller
@RestController
public class HelloWorldController {

    //create
    //GET
    //URL - /hello-world
    //method - "Hello World"
    @GetMapping(path="/hello-world")
    public String helloWorld(){
        return "Hello World";
    }

    //hello-world-bean
    @GetMapping(path="/hello-world-bean") 
    public HelloWorldBean helloWorldBean(){
        return new HelloWorldBean("Hello World");
    }

    //hello-world/path-variable/name
    @GetMapping(path="/hello-world/path-variable/{name}") 
    public HelloWorldBean helloWorldPathVariable(@PathVariable String name){
        return new HelloWorldBean(String.format("Hello World %s", name));
    }
}
