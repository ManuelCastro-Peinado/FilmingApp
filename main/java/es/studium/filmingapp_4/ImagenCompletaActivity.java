package es.studium.filmingapp_4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class ImagenCompletaActivity extends AppCompatActivity {

    private ImageView imagen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imagen_completa);
        setTitle("Imagen completa");

        // Inicializar ImageView
        imagen = findViewById(R.id.imagenCompleta);

        // Recoger el drawable enviado desde DetalleActivity
        Intent intent = getIntent();
        int imagenRes = intent.getIntExtra("imagen", 0);

        // Mostrar imagen
        imagen.setImageResource(imagenRes);

        // Click sobre la imagen, volver a DetalleActivity
        imagen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); // Cierra esta Activity y vuelve a DetalleActivity
            }
        });
    }
}
