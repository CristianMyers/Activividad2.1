package com.example.actividad21;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText etNombreFoto;  // Campo de texto para el nombre de la foto
    private Button btnAceptar;      // Botón "ACEPTAR"

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);  // Vincular con el archivo XML de la interfaz

        // Inicializar las vistas (EditText y Button)
        etNombreFoto = findViewById(R.id.et_nombre_foto);
        btnAceptar = findViewById(R.id.btn_aceptar);

        // Configurar el evento OnClick del botón "ACEPTAR"
        btnAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Obtener el texto ingresado en el EditText (nombre de la foto)
                String nombreFoto = etNombreFoto.getText().toString();

                // Crear un Intent para iniciar la segunda Activity (AResultado)
                Intent intent = new Intent(MainActivity.this, AResultado.class);

                // Pasar el nombre de la foto a la segunda Activity
                intent.putExtra("nombre_foto", nombreFoto);

                // Iniciar la nueva Activity
                startActivity(intent);
            }
        });
    }
}