package com.example.sistemadechistes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
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

        btnIngresarChiste.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, IngresarChisteActivity.class);

                MainActivity.this.startActivity(intent);

            }
        });

        btnCalificarChiste = (Button)findViewById(R.id.btnCalificarChiste);

        btnChistesRecomendados = (Button)findViewById(R.id.btnChistesRecomendados);

    }
}
