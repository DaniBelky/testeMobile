package com.example.myapplication;

import android.os.Bundle;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Toast;

import com.example.myapplication.models.Dados;
import com.google.android.material.button.MaterialButton;

public class SignupActivity extends AppCompatActivity {

    EditText etName, etEmail, etPassword, etConfirmPassword;
    MaterialButton btnCreate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        etName = findViewById(R.id.etName);
        etEmail = findViewById(R.id.etEmail);
        etPassword = findViewById(R.id.etPassword);
        etConfirmPassword = findViewById(R.id.etConfirmPassword);
    }

    public void cadastro(android.view.View view){
        String nome = etName.getText().toString();
        String email = etEmail.getText().toString();
        String senha = etPassword.getText().toString();
        String confirmSenha = etConfirmPassword.getText().toString();

        if(nome.isEmpty() || email.isEmpty() || senha.isEmpty() || confirmSenha.isEmpty()){
            Toast.makeText(this, "Preencha todos os campos", Toast.LENGTH_SHORT).show();
            return;
        }

        if(!senha.equals(confirmSenha)){
            Toast.makeText(this, "As senhas não conferem", Toast.LENGTH_SHORT).show();
            return;
        }

        Dados.cadastrar(nome, email, senha);
        Toast.makeText(this, "Cadastro realizado com sucesso", Toast.LENGTH_SHORT).show();

        finish();
    }
}
