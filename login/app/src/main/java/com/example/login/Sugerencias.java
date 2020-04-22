package com.example.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Sugerencias extends AppCompatActivity {
    TextView tv1, tv2;
    EditText edt1, edt2;
    Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sugerencias);
        tv1=(TextView)findViewById(R.id.nombre);
        tv2=(TextView) findViewById(R.id.num_control);
        edt1=(EditText)findViewById(R.id.nom);
        edt2=(EditText)findViewById(R.id.edtx6);
        btn1=(Button)findViewById(R.id.btn_enviar);

    }
    public void after_enviar (View view){
        Intent ex_intent;
        ex_intent=new Intent(this, misreportes.class);
        String valor1=tv1.getText().toString();
        String valor2=tv2.getText().toString();
        String valor3=edt1.getText().toString();
        String valor4=edt2.getText().toString();
        ex_intent.putExtra("nombre",valor1);
        ex_intent.putExtra("num_control",valor2);
        ex_intent.putExtra("nom_que",valor3);
        ex_intent.putExtra("des_que",valor4);
        startActivity(ex_intent);
        Toast.makeText(this, "Su sugerencia ha sido enviada", Toast.LENGTH_SHORT).show();
    }

    public void cancelar(View view){
        Intent intent=new Intent(this, principal.class);
        startActivity(intent);
    }
}
