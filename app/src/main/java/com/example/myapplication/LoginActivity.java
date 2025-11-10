package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.models.Dados;

public class LoginActivity extends AppCompatActivity {
    EditText editTextEmail, editTextSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        TextView linkCadastro = findViewById(R.id.textViewLinkCadastro);

        linkCadastro.setOnClickListener(v -> {
            Intent intent = new Intent(LoginActivity.this, SignupActivity.class);
            startActivity(intent);
        });

        editTextEmail = findViewById(R.id.editTextEmail);
        editTextSenha = findViewById(R.id.editTextSenha);
    }

    public void Login(android.view.View view){
        String email = editTextEmail.getText().toString();
        String password = editTextSenha.getText().toString();

        boolean valido = Dados.login(email, password);

        if(valido){
            Toast.makeText(this, "Login bem-sucedido", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this, "Credenciais inválidas", Toast.LENGTH_SHORT).show();
        }
    }
    public void cadastro(android.view.View view){
        Intent intent = new Intent(this, SignupActivity.class);
        startActivity(intent);
    }
}

