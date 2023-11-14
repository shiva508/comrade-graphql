package com.comrade.controller;

import com.comrade.model.Greeting;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class GreetingController {
    @QueryMapping
    public Greeting welcomeGreeting(){
        return new Greeting("Hi!, Welcome ");
    }
}
