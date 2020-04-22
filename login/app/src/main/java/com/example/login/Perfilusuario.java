package com.example.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Perfilusuario extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.perfilusuario);
        }
        public void report (View view){
            Intent intent = new Intent(this, principal.class);
            startActivity(intent);
        }
    public void todosreportes (View view){
        Intent intent = new Intent(this, allreports.class);
        startActivity(intent);
    }
}
