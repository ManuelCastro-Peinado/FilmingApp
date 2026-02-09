package es.studium.filmingapp_4;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetalleActivity extends AppCompatActivity {

    private ImageView imagen;
    private TextView titulo;
    private TextView director;
    private TextView reparto;
    private TextView sinopsis;
    private TextView temporadas; // Solo para series
    private RatingBar ratingBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);
        setTitle("Detalles");
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setHomeButtonEnabled(true);
        }

        // Inicializar vistas
        imagen = findViewById(R.id.imagenDetalle);
        titulo = findViewById(R.id.tituloDetalle);
        director = findViewById(R.id.directorDetalle);
        reparto = findViewById(R.id.repartoDetalle);
        sinopsis = findViewById(R.id.sinopsisDetalle);
        temporadas = findViewById(R.id.temporadasDetalle);
        ratingBar = findViewById(R.id.ratingBar);

        // Recoger datos del Intent
        Intent intent = getIntent();
        int imagenRes = intent.getIntExtra("imagen", 0);
        String tituloText = intent.getStringExtra("titulo");
        String directorText = intent.getStringExtra("director");
        String repartoText = intent.getStringExtra("reparto");
        String sinopsisText = intent.getStringExtra("sinopsis");
        int estrellas = intent.getIntExtra("estrellas", 1);
        int numTemporadas = intent.getIntExtra("temporadas", -1); // si -1, es película

        // Asignar valores a las vistas
        imagen.setImageResource(imagenRes);
        titulo.setText(tituloText);
        director.setText(directorText);
        reparto.setText(repartoText);
        sinopsis.setText(sinopsisText);
        ratingBar.setNumStars(5);
        ratingBar.setRating(estrellas);

        // Mostrar temporadas solo si es una serie
        if (numTemporadas > 0) {
            temporadas.setText("Temporadas: " + numTemporadas);
            temporadas.setVisibility(View.VISIBLE);
        } else {
            temporadas.setVisibility(View.GONE);
        }

        // Click en la imagen, abrir pantalla completa
        imagen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentCompleta = new Intent(DetalleActivity.this, ImagenCompletaActivity.class);
                intentCompleta.putExtra("imagen", imagenRes);
                startActivity(intentCompleta);
            }
        });
    }
    // Flecha funcional
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish(); // vuelve al catálogo
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
