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
                "Juego del Calamar",
                "Director: Hwang Dong-hyuk",
                "Reparto: Lee Jung-jae, Park Hae-soo, Jung Ho-yeon",
                "Sinópsis: El Juego del Calamar es una serie de suspense distópico de Netflix donde 456 personas con graves apuros financieros compiten en juegos infantiles tradicionales coreanos por un premio de 45.600 millones de wones. El protagonista, Seong Gi-hun, arriesga su vida en retos mortales donde perder significa la ejecución inmediata. ",
                5,
                2
        ));

        series.add(new Series(
                R.drawable.breaking,
                "Breaking Bad",
                "Director: Vince Gilligan",
                "Reparto: Bryan Cranston, Aaron Paul, Anna Gunn",
                "Sinópsis: Breaking Bad narra la transformación de Walter White, un frustrado profesor de química de secundaria diagnosticado con cáncer de pulmón inoperable. Para asegurar el futuro económico de su familia, se alía con su exalumno Jesse Pinkman para producir y vender metanfetamina de gran pureza, adentrándose en el peligroso mundo criminal. ",
                5,
                5
        ));

        series.add(new Series(
                R.drawable.simpsons,
                "Los Simpsons",
                "Director: Matt Groening",
                "Reparto: Homer(Dan Castallenata), Marge(Julie Kavner), Bart(Nancy Cartwright), Lisa(Yeardley Smith).",
                "Sinópsis: Los Simpson es una icónica serie de animación y sátira de la sociedad estadounidense, centrada en una peculiar familia de clase media —Homer, Marge, Bart, Lisa y Maggie— que reside en la ciudad ficticia de Springfield. A través de su vida cotidiana, la serie retrata de manera cómica y crítica la cultura, política y valores de la América media.",
                4,
                33
        ));

        series.add(new Series(
                R.drawable.merlin,
                "Merlin",
                "Director: Chris Chibnall",
                "Reparto: Colin Morgan, Bradley James, Katie McGrath",
                "Sinópsis: Merlín es una serie británica de fantasía que reimagina la leyenda artúrica, enfocándose en la juventud del mago cuando llega a Camelot. Allí, debe ocultar sus poderes mágicos, prohibidos por el rey Uther, mientras protege al príncipe Arturo, convirtiéndose en su sirviente y, eventualmente, en su mejor amigo. ",
                4,
                5
        ));

        series.add(new Series(
                R.drawable.kingdom,
                "The Last Kingdom",
                "Director: Peter Hoar",
                "Reparto: Alexander Dreymon, David Dawson, Emily Cox",
                "The Last Kingdom narra la historia de Uhtred de Bebbanburg en el siglo IX, un sajón criado por vikingos daneses tras ser capturado. En medio de la lucha por la unificación de Inglaterra, Uhtred debe dividir su lealtad entre su origen y su familia adoptiva mientras busca recuperar su hogar ancestral. ",
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
