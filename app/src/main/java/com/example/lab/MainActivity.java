package com.example.lab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //boton para de la actividad inicial
        Button btn = (Button) findViewById(R.id.button);
        //evento click del boton
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //abrir una nueva ventana
                Intent intent = new Intent(v.getContext(), MainActivity2.class/*Clase de la ventana 2*/);
                v.getContext().startActivity(intent);
            }
        });

    }
}