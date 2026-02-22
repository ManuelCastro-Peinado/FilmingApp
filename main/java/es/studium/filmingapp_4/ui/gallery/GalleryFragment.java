package es.studium.filmingapp_4.ui.gallery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import es.studium.filmingapp_4.Peliculas;
import es.studium.filmingapp_4.PeliculasAdapter;
import es.studium.filmingapp_4.R;
import es.studium.filmingapp_4.databinding.FragmentGalleryBinding;

public class GalleryFragment extends Fragment {

    private FragmentGalleryBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentGalleryBinding.inflate(inflater, container, false);
        View root = binding.getRoot();


List<Peliculas> items = new ArrayList<>();

items.add(new Peliculas(
        R.drawable.dragon,
        getString(R.string.dragon_titulo),
        getString(R.string.dragon_director),
        getString(R.string.dragon_reparto),
        getString(R.string.dragon_sinopsis),
        4
));

items.add(new Peliculas(
        R.drawable.broly,
        getString(R.string.broly_titulo),
        getString(R.string.broly_director),
        getString(R.string.broly_reparto),
        getString(R.string.broly_sinopsis),
        3
));

items.add(new Peliculas(
        R.drawable.jumanji,
        getString(R.string.jumanji_titulo),
        getString(R.string.jumanji_director),
        getString(R.string.jumanji_reparto),
        getString(R.string.jumanji_sinopsis),
        4
));

items.add(new Peliculas(
        R.drawable.piratas,
        getString(R.string.piratas_titulo),
        getString(R.string.piratas_director),
        getString(R.string.piratas_reparto),
        getString(R.string.piratas_sinopsis),
        5
));

items.add(new Peliculas(
        R.drawable.ready,
        getString(R.string.ready_titulo),
        getString(R.string.ready_director),
        getString(R.string.ready_reparto),
        getString(R.string.ready_sinopsis),
        4
));

        PeliculasAdapter adapter = new PeliculasAdapter(items);


        RecyclerView recyclerView = binding.myRecyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(adapter);

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
