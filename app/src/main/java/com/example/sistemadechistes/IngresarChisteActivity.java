package com.example.sistemadechistes;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class IngresarChisteActivity extends AppCompatActivity {

    Button subirChiste;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingresar_chistes);

        subirChiste = (Button)findViewById(R.id.ButtonSubirChiste);

        subirChiste.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });

    }

}
