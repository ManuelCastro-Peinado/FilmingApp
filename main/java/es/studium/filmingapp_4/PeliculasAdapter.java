package es.studium.filmingapp_4;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PeliculasAdapter
        extends RecyclerView.Adapter<PeliculasAdapter.PeliculasViewHolder> {

    private List<Peliculas> items;

    public PeliculasAdapter(List<Peliculas> items) {
        this.items = items;
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    @Override
    public PeliculasViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.pelicula_card, parent, false);
        return new PeliculasViewHolder(v);
    }

    @Override
    public void onBindViewHolder(PeliculasViewHolder holder, int position) {
        Peliculas p = items.get(position);

        holder.imagen.setImageResource(p.getImagen());
        holder.nombre.setText(p.getNombre());

        // Abrir DetalleActivity
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), DetalleActivity.class);
                intent.putExtra("imagen", p.getImagen());
                intent.putExtra("titulo", p.getNombre());
                intent.putExtra("director", p.getDirector());
                intent.putExtra("reparto", p.getReparto());
                intent.putExtra("sinopsis", p.getSinopsis());
                intent.putExtra("estrellas", p.getEstrellas());

                v.getContext().startActivity(intent);
            }
        });
    }

    static class PeliculasViewHolder extends RecyclerView.ViewHolder {
        ImageView imagen;
        TextView nombre;

        PeliculasViewHolder(View v) {
            super(v);
            imagen = v.findViewById(R.id.imagen);
            nombre = v.findViewById(R.id.nombre);
        }
    }
}
