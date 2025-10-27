package com.example.myapplication;

import android.os.Bundle;
import android.widget.Toast;
import com.google.android.material.textfield.TextInputEditText;
import android.view.View;
import com.google.android.material.button.MaterialButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Define o layout XML como conteúdo da tela
        setContentView(R.layout.activity_login);
    }
}
