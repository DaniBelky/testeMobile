package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class InicioActivity extends AppCompatActivity {
    private ImageView btnSearch;
    private EditText etSearch;
    private boolean isSearchVisible = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        btnSearch = findViewById(R.id.btnSearch);
        etSearch = findViewById(R.id.etSearch);

        btnSearch.setOnClickListener(v -> toggleSearch());
    }

    private void toggleSearch() {
        if (isSearchVisible) {
            etSearch.setVisibility(View.GONE);
        } else {
            etSearch.setVisibility(View.VISIBLE);
            etSearch.requestFocus();
        }
        isSearchVisible = !isSearchVisible;
    }

}
