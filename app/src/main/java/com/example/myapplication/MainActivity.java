package com.example.myapplication;

import android.os.Bundle;
import android.widget.Toast;
import com.google.android.material.textfield.TextInputEditText;
import android.view.View;
import com.google.android.material.button.MaterialButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private TextInputEditText etPassword, etConfirm;
    private MaterialButton btnCreate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Define o layout XML como conteúdo da tela
        setContentView(R.layout.activity_signup);

        etPassword = findViewById(R.id.etPassword);
        etConfirm = findViewById(R.id.etConfirm);
        btnCreate = findViewById(R.id.btnCreate);

        btnCreate.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                validarSenhas();
            }
        });
    }

    private void validarSenhas(){
        String senha = etPassword.getText().toString();
        String confirm = etConfirm.getText().toString();

        if(senha.isEmpty() || confirm.isEmpty()){
            Toast.makeText(this, "Preencha ambos os campos de senha", Toast.LENGTH_SHORT).show();
            return;
        }

        if(!senha.equals(confirm)){
            etConfirm.setError("As senhas não coincidem");
            Toast.makeText(this, "As senhas não são iguais", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
        }

    }


}
