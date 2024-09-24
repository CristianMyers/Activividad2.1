package com.example.actividad21;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class AResultado extends AppCompatActivity {

    private TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        tvResultado = findViewById(R.id.tv_resultado);

        // Obtener el Intent y el nombre de la foto
        Intent intent = getIntent();
        String nombreFoto = intent.getStringExtra("nombre_foto");

        // Mostrar el nombre de la foto en el TextView
        tvResultado.setText("Nombre de la foto: " + nombreFoto);
    }
}

