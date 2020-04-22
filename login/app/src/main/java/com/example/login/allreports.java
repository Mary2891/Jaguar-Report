package com.example.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class allreports extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.misreportes);
    }
    public void report (View view){
        Intent intent = new Intent(this, principal.class);
        startActivity(intent);
    }
    public void princ(View v){
        Intent intent=new Intent(this, Perfilusuario.class);
        startActivity(intent);
    }
    public  void salir(View view){
        Intent intent =new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        intent.setFlags(intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
}