package com.bridgelabz.firstspringapp.controller;

import com.bridgelabz.firstspringapp.entity.Person;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @RequestMapping(value={"/","/hello","/world"})
    public String welcomeMessage(){

        return "Hello World";
    }

    @RequestMapping(value = {"/hello"},method= RequestMethod.GET)
    public String welcomegetMessage(@RequestParam(value = "name") String name){
        return "hello "+name+" ! ";
    }

    @GetMapping("/hello/{name}")
    public String pathvariable(@PathVariable String name){
        return "Hello "+name+"..";
    }

    @PostMapping("/add-details")
    public String adddetails(@RequestBody Person person){
        return "Name : "+person.getName()+" Age : "+person.getAge()+" Gender : "+person.getGender();
    }
}
