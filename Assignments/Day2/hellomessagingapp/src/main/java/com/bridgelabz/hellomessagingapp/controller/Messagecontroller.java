package com.bridgelabz.hellomessagingapp.controller;

import com.bridgelabz.hellomessagingapp.entity.Fullname;
import org.springframework.web.bind.annotation.*;

@RestController
public class Messagecontroller {

    @GetMapping("/hello")
    public String hellomessage(){
        return "Hello from Bridgelabz";
    }
    @GetMapping("/query")
    public String  namemessage(@RequestParam String name){
        return "Hello "+name+" from Bridgelaz";
    }

    @GetMapping("/hello/param/{name}")
    public String parammessage(@PathVariable String name){
        return "Hello "+name+" from Bridgelaz";
    }

    @PostMapping("/post")
    public String postmessage(@RequestBody Fullname fullname){
        return "Hello "+ fullname.getFirstname() +" "+ fullname.getLastname() +" from Bridgelabz";
    }

    @PutMapping("/hello/put/{ftname}")
    public String putmessage(@PathVariable String ftname,@RequestParam String ltname){
        return "Hello "+ftname+" "+ltname+" from Bridgelabz";
    }
}
