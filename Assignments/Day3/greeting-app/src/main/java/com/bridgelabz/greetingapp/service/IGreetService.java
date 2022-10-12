package com.bridgelabz.greetingapp.service;

import com.bridgelabz.greetingapp.entity.Greeting;
import com.bridgelabz.greetingapp.entity.Users;

public interface IGreetService {
    Greeting addgreeting(Users user);
    Greeting getGreetingById(long id);
}
