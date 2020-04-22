package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button siguiente;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn1 = (Button) findViewById(R.id.btn1);
        siguiente=(Button) findViewById(R.id.btn1);

    } public void Siguiente(View view) {
        String usuario = ((EditText) findViewById(R.id.edtx2)).getText().toString();
        String password = ((EditText) findViewById(R.id.edtx3)).getText().toString();

        if (usuario.equals("T16030549") & password.equals("123")){
            Intent mainIntent = new Intent(MainActivity.this, Perfilusuario.class);
            mainIntent.putExtra("x",usuario);
            mainIntent.putExtra("a",password);
            startActivity(mainIntent);
        }
        else
        {
            Toast.makeText(getApplicationContext(), "Usuario INcorrecto", Toast.LENGTH_SHORT).show();
        }
    }
}

