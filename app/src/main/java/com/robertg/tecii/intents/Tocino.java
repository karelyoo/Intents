package com.robertg.tecii.intents;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.content.Intent;  // Se importan ambas últimas librerías para poder realizar el intent.
import android.widget.TextView; // Este nos servirá para colocar el mensaje enviado al Texto en la actividad "Tocino".

public class Tocino extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tocino);

        Bundle InfoManzanas = getIntent().getExtras(); // Con este método se obtienen los extras mandados de la actividad que se envió.

        if (InfoManzanas==null) {
            return;     // Con esta condición delimitamos el envío de información desde otro recurso. Ej, desde otra actividad.
        }

        String MensajeManzana = InfoManzanas.getString("MensajeManzana");   // Se obtiene el texto que se escribió en "Manzanas".
        final TextView txtTocino = (TextView) findViewById(R.id.txtTocino); // Se obtiene la referencia del TextView.
        txtTocino.setText(MensajeManzana);  //  Se pone el texto que el usuario colocó en "MensajeManzana".
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    public void onClick(View view){  // El método onClick para brincar al otro Intent.
        Intent i = new Intent(this, Manzana.class); // Los amo :)
        startActivity(i);

    }

}
