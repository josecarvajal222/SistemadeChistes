package com.example.sistemadechistes;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class IngresarChisteActivity extends AppCompatActivity {

    Button subirChiste;

    EditText tituloChiste;

    EditText ingresoChiste;

    EditText gradoOportuno;

    EditText gradoNovedad;

    EditText gradoDiversion;

    EditText personajes;

    EditText instrucciones;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingresar_chistes);

        subirChiste = (Button)findViewById(R.id.ButtonSubirChiste);

        tituloChiste = (EditText)findViewById(R.id.txtTituloChiste);

        ingresoChiste = (EditText)findViewById(R.id.txtIngresoChiste);

        gradoOportuno = (EditText)findViewById(R.id.txtGradoOportuno);

        gradoNovedad = (EditText)findViewById(R.id.txtGradoNovedad);

        gradoDiversion = (EditText)findViewById(R.id.txtGradoDiversion);

        personajes = (EditText)findViewById(R.id.txtPersonajes);

        instrucciones = (EditText)findViewById(R.id.txtInstrucciones);

        subirChiste.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



            }
        });


    }

}
