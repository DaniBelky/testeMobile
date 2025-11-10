package com.example.myapplication.models;

public class User {
    private String name;
    private String email;
    private String senha;

    public User(String name, String email, String senha){
        this.name = name;
        this.email = email;
        this.senha = senha;
    }

    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

    public String getSenha(){
        return senha;
    }
}
