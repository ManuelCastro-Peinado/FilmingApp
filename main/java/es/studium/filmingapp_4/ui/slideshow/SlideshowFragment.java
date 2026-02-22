package es.studium.filmingapp_4.ui.slideshow;

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

import es.studium.filmingapp_4.R;
import es.studium.filmingapp_4.Series;
import es.studium.filmingapp_4.SeriesAdapter;
import es.studium.filmingapp_4.databinding.FragmentSlideshowBinding;

public class SlideshowFragment extends Fragment {

    private FragmentSlideshowBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentSlideshowBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
List<Series> series = new ArrayList<>();

series.add(new Series(
        R.drawable.calamar,
        getString(R.string.calamar_titulo),
        getString(R.string.calamar_director),
        getString(R.string.calamar_reparto),
        getString(R.string.calamar_sinopsis),
        5,
        2
));

series.add(new Series(
        R.drawable.breaking,
        getString(R.string.breaking_titulo),
        getString(R.string.breaking_director),
        getString(R.string.breaking_reparto),
        getString(R.string.breaking_sinopsis),
        5,
        5
));

series.add(new Series(
        R.drawable.simpsons,
        getString(R.string.simpsons_titulo),
        getString(R.string.simpsons_director),
        getString(R.string.simpsons_reparto),
        getString(R.string.simpsons_sinopsis),
        4,
        33
));

series.add(new Series(
        R.drawable.merlin,
        getString(R.string.merlin_titulo),
        getString(R.string.merlin_director),
        getString(R.string.merlin_reparto),
        getString(R.string.merlin_sinopsis),
        4,
        5
));

series.add(new Series(
        R.drawable.kingdom,
        getString(R.string.kingdom_titulo),
        getString(R.string.kingdom_director),
        getString(R.string.kingdom_reparto),
        getString(R.string.kingdom_sinopsis),
        5,
        4
));


        SeriesAdapter adapter = new SeriesAdapter(series);
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
