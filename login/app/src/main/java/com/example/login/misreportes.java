package com.example.login;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.security.Principal;

public class misreportes extends AppCompatActivity {
    private TextView tv1, tv2, tv3, tv4;
    private TextView fech;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.misreports);

        tv1=(TextView)findViewById(R.id.tvnom);
        tv2=(TextView)findViewById(R.id.tvnumcon);
        tv3=(TextView)findViewById(R.id.nom_queja);
        tv4=(TextView)findViewById(R.id.desc_queja);
        fech = (TextView) findViewById(R.id.fechas);
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String dato1 = (String) extras.get("nombre");
        tv1.setText(dato1);
        String dato2 = (String) extras.get("num_control");
        tv2.setText(dato2);
        String dato3 = (String) extras.get("nom_que");
        tv3.setText(dato3);
        String dato4 = (String) extras.get("des_que");
        tv4.setText(dato4);
        String dato5 = (String) extras.get("fecha");
        fech.setText("Fecha: " + dato5);
    }
    public void principal(View v){
        Intent intent=new Intent(this, principal.class);
        startActivity(intent);
    }
}
