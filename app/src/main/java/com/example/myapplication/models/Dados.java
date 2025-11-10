package com.example.myapplication.models;

import java.util.ArrayList;

public class Dados {
    private static ArrayList<User> usuarios = new ArrayList<>();

    public static void cadastrar(String nome, String email, String senha){
        usuarios.add(new User(nome, email, senha));
    }

    public static boolean login(String email, String senha){
        for(User u : usuarios){
            if(u.getEmail().equals(email) && u.getSenha().equals(senha)){
                return true;
            }
        }
        return false;
    }
}
