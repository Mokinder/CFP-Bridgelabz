package com.bridgelabz.greetingapp.service;

import com.bridgelabz.greetingapp.entity.Greeting;
import com.bridgelabz.greetingapp.entity.Users;
import com.bridgelabz.greetingapp.repository.GreetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;

@Service
public class GreetService implements IGreetService{

    @Autowired
    private GreetRepository repository;

    private static final String template=" Hello %s";
    private final AtomicLong counter=new AtomicLong();

    @Override
    public Greeting addgreeting(Users user) {
        String message= String.format(template,(user.toString().isEmpty()) ? "Hello World ": user.toString());
        return repository.save(new Greeting(counter.incrementAndGet(),message));
    }
    @Override
    public Greeting getGreetingById(long id){
        return repository.findById(id).get();
    }
}
