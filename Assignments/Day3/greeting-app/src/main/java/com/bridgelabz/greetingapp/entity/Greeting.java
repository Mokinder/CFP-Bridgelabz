package com.bridgelabz.greetingapp.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Greeting_User")
public class Greeting {
    @Id
    @Column(name = "id",nullable=false)
    public long id;
    private String message;

    public Greeting(long id, String message) {
        this.id = id;
        this.message = message;
    }

    public long getId(){
        return id;
    }

    public void setId(long id){
        this.id=id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
