package com.bridgelabz.greetingapp.repository;

import com.bridgelabz.greetingapp.entity.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GreetRepository extends JpaRepository<Greeting,Long> {

}
