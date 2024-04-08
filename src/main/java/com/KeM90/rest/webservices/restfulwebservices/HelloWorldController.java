package com.KeM90.rest.webservices.restfulwebservices;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


//Controller
@CrossOrigin(origins="http://localhost:4200")
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
        throw new RuntimeException("Some Error has Happened! Contact Support at ***-***");
        //return new HelloWorldBean("Hello Worl - Changed");
    }

    //hello-world/path-variable/name
    @GetMapping(path="/hello-world/path-variable/{name}") 
    public HelloWorldBean helloWorldPathVariable(@PathVariable String name){
        return new HelloWorldBean(String.format("Hello World %s", name));
    }
}
