package com.robertg.tecii.intents;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;  // Se importan estas últimas librerías para poder realizar el intent.
import android.widget.EditText; // Este nos servirá para mandar un texto sencillo a la otra Actividad.

public class Manzana extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manzana);
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

        Intent i = new Intent(this, Tocino.class);  // Crea el Intent.
        final EditText txtMensaje = (EditText) findViewById(R.id.txtMensaje);   // Obtiene el texto inducido en "Manzanas".
        String MensajeUsuario = txtMensaje.getText().toString();    //  Obtiene el Texto y lo convierte a String.
        i.putExtra("MensajeManzana", MensajeUsuario);   //  Obtiene cualquier dato en forma de llave/valor.
                                                        // en este caso, nombre del String y valor.
        startActivity(i);   // Comienza la clase.
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_manzana, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
