package com.example.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class principal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.principal);
}

    public void quejas(View v){
        Intent intent=new Intent(this, Quejas.class);
        startActivity(intent);
    }
    public void sugerencias(View v){
        Intent intent=new Intent(this, Sugerencias.class);
        startActivity(intent);
    }
    public void felicitaciones(View v){
        Intent intent=new Intent(this, Felicitaciones.class);
        startActivity(intent);
    }
    public void princ(View v){
        Intent intent=new Intent(this, Perfilusuario.class);
        startActivity(intent);
    }
    public void todosreportes (View view){
        Intent intent = new Intent(this, allreports.class);
        startActivity(intent);
    }

}

