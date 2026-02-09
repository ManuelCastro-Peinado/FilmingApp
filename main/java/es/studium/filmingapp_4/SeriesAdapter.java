package es.studium.filmingapp_4;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class SeriesAdapter extends RecyclerView.Adapter<SeriesAdapter.SeriesViewHolder> {

    private List<Series> items;

    public SeriesAdapter(List<Series> items) {
        this.items = items;
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    @Override
    public SeriesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.serie_card, parent, false);
        return new SeriesViewHolder(v);
    }

    @Override
    public void onBindViewHolder(SeriesViewHolder holder, int position) {
        final Series s = items.get(position);

        // Mostrar imagen y nombre en la card
        holder.imagen.setImageResource(s.getImagen());
        holder.nombre.setText(s.getNombre());

        // Abrir DetalleActivity
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), DetalleActivity.class);

                // Pasar datos de la serie al detalle
                intent.putExtra("imagen", s.getImagen());
                intent.putExtra("titulo", s.getNombre());
                intent.putExtra("director", s.getDirector());
                intent.putExtra("reparto", s.getReparto());
                intent.putExtra("sinopsis", s.getSinopsis());
                intent.putExtra("estrellas", s.getEstrellas());
                intent.putExtra("temporadas", s.getTemporadas()); // solo series

                v.getContext().startActivity(intent);
            }
        });
    }

    static class SeriesViewHolder extends RecyclerView.ViewHolder {

        ImageView imagen;
        TextView nombre;

        SeriesViewHolder(View v) {
            super(v);
            imagen = v.findViewById(R.id.imagenSerie);
            nombre = v.findViewById(R.id.nombreSerie);
        }
    }
}
