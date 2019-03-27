package com.example.sistemadechistes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnIngresarChiste;
    Button btnCalificarChiste;
    Button btnChistesRecomendados;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnIngresarChiste = (Button)findViewById(R.id.btnIngresarChiste);

        btnCalificarChiste = (Button)findViewById(R.id.btnCalificarChiste);

        btnChistesRecomendados = (Button)findViewById(R.id.btnChistesRecomendados);

    }
}
