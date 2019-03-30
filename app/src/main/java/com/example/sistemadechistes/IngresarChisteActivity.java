package com.example.sistemadechistes;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.HashMap;
import java.util.Map;

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

        FirebaseFirestore db = FirebaseFirestore.getInstance();

        subirChiste = (Button)findViewById(R.id.ButtonSubirChiste);

        tituloChiste = (EditText)findViewById(R.id.txtTituloChiste);

        ingresoChiste = (EditText)findViewById(R.id.txtIngresoChiste);

        gradoOportuno = (EditText)findViewById(R.id.txtGradoOportuno);

        gradoNovedad = (EditText)findViewById(R.id.txtGradoNovedad);

        gradoDiversion = (EditText)findViewById(R.id.txtGradoDiversion);

        personajes = (EditText)findViewById(R.id.txtPersonajes);

        instrucciones = (EditText)findViewById(R.id.txtInstrucciones);

        final Map<String, Object> chiste = new HashMap<>();

        subirChiste.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                chiste.put("chiste",ingresoChiste.getText().toString());
                chiste.put("gradoDiversion",Integer.parseInt(gradoDiversion.getText().toString()));
                chiste.put("gradoNovedad",Integer.parseInt(gradoNovedad.getText().toString()));
                chiste.put("gradoOportuno",Integer.parseInt(gradoOportuno.getText().toString()));
                chiste.put("instrucciones",instrucciones.getText().toString());
                chiste.put("personajes",personajes.getText().toString());
                chiste.put("titulo",tituloChiste.getText().toString());

            }
        });


    }

}
