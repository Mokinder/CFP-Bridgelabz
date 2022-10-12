package com.bridgelabz.greetingapp.controller;

import com.bridgelabz.greetingapp.entity.Greeting;
import com.bridgelabz.greetingapp.entity.Users;
import com.bridgelabz.greetingapp.service.GreetService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class Greetingcontoller {
    private static final String template="Hello %s";
    private final AtomicLong counter = new AtomicLong();

    @Autowired
    private GreetService greetService;

    @GetMapping(value = {"", "/"})
    public Greeting greeting(@RequestParam(value = "fname", defaultValue = "World") String fname,
                             @RequestParam(value = "lname", defaultValue = "") String lname){
//        return new Greeting(counter.incrementAndGet(), String.format(template, name));
        Users user = new Users();
        user.setFirstname(fname);
        user.setLastname(lname);
        return greetService.addgreeting(user);
    }

    @GetMapping(value = {"/{id}"})
    public Greeting greetingById(@PathVariable("id") Long id){
        return greetService.getGreetingById(id);
    }
}
