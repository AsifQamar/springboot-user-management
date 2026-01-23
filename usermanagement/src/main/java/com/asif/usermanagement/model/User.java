package com.asif.usermanagement.model;
import jakarta.persistence.*;

@Entity
@Table(name = "users")// this class is database table
public class User {
    @Id //PRIMARY KEY
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String name;
    private String email;

    public User(){}

    public User(String name, String email){
        this.name = name;
        this.email = email;

    }
    public Long getId(){
        return Id;
    }

    public String getName(){
        return name;
    }

    public void setName(){
        this.name=name;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
