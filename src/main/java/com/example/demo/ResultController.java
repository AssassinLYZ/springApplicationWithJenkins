package com.example.demo;

//import org.example.Container;
import org.example.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResultController {

    @GetMapping("/result")
    public Container getResult() {
        // Use the method from the library to generate the Container object
        return Main.generateContainer();
    }

    @GetMapping("/test")
    public String getTestString() {
        // Use the method from the library to generate the Container object
        return "Hello World";
    }
}
