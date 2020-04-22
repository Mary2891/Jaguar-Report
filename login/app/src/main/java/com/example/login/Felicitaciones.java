package com.example.login;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;
import java.util.Locale;

public class Felicitaciones extends AppCompatActivity {
    TextView tv1, tv2;
    EditText edt1, edt2;
    Button btn1;
    EditText date;
    private int ultimoAnio, ultimoMes, ultimoDiaDelMes;

    private DatePickerDialog.OnDateSetListener listenerDeDatePicker = new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker view, int anio, int mes, int diaDelMes) {

            ultimoAnio = anio;
            ultimoMes = mes;
            ultimoDiaDelMes = diaDelMes;
            refrescarFechaEnEditText();

        }
    };

    public void refrescarFechaEnEditText() {
        String fecha = String.format(Locale.getDefault(), "%02d-%02d-%02d", ultimoAnio, ultimoMes+1, ultimoDiaDelMes);
        date.setText(fecha);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.felicitaciones);


        tv1=(TextView)findViewById(R.id.nombre);
        tv2=(TextView) findViewById(R.id.num_control);
        edt1=(EditText)findViewById(R.id.nom);
        edt2=(EditText)findViewById(R.id.edtx6);
        btn1=(Button)findViewById(R.id.btn_enviar);
        date= (EditText) findViewById(R.id.date);

        final Calendar calendario = Calendar.getInstance();
        ultimoAnio = calendario.get(Calendar.YEAR);
        ultimoMes = calendario.get(Calendar.MONTH);
        ultimoDiaDelMes = calendario.get(Calendar.DAY_OF_MONTH);
        refrescarFechaEnEditText();
        date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatePickerDialog dialogoFecha = new DatePickerDialog(Felicitaciones.this, listenerDeDatePicker, ultimoAnio, ultimoMes, ultimoDiaDelMes);
                dialogoFecha.show();
            }
        });
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
        String valor5=date.getText().toString();
        ex_intent.putExtra("fecha",valor5);
        startActivity(ex_intent);
        Toast.makeText(this, "Tu felicitación se ha enviado", Toast.LENGTH_SHORT).show();
    }

    public void cancelar(View view){
        Intent intent=new Intent(this, principal.class);
        startActivity(intent);
    }
}
