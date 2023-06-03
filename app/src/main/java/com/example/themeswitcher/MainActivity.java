package com.example.themeswitcher;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    private ToggleButton tg_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.Theme1);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "Bienvenido a mi Aplicacion", Toast.LENGTH_SHORT).show();
        tg_btn= findViewById(R.id.tg_btn);
    }
}