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
                "Cómo entrenar a tu dragón",
                "Director: Dean DeBlois",
                "Reparto: Jay Baruchel, America Ferrera",
                "Sinópsis: La adaptación live-action de \"Cómo entrenar a tu dragón\" (2025), dirigida por Dean DeBlois, narra la historia de Hipo, un joven vikingo que no encaja en la tradición de cazar dragones de su tribu en la Isla Mema. Su vida cambia al entablar amistad con Desdentao, un Furia Nocturna, revelando la verdadera naturaleza de los dragones y desafiando la sociedad vikinga. ",
                4

        ));

        items.add(new Peliculas(
                R.drawable.broly,
                "Dragon Ball Super: Broly",
                "Director: Tatsuya Nagamine",
                "Reparto: Goku(Mario Castañeda), Vegeta(René García), Broly(José Meco)",
                "Sinópsis: La paz ha regresado una vez más a la Tierra tras el Torneo de Poder. Al descubrir que en los diferentes universos hay seres increíblemente poderosos que aún no ha visto, Goku tiene intención de seguir entrenando para hacerse aún más fuerte. Entonces, un día, un saiyan llamado Broly al que nunca antes han visto se presenta ante Goku y Vegeta.",
                3
        ));

        items.add(new Peliculas(
                R.drawable.jumanji,
                "Jumanji",
                "Director: Joe Johnston",
                "Reparto: Robin Williams, Bonnie Hunt",
                "Sinópsis: Alan Parris queda atrapado en un juego de mesa mágico y muy antiguo llamado Jumanji. Nadie cree a su compañera de juego cuando cuenta lo ocurrido. Veinticinco años más tarde, es liberado por dos niños, pero una manada de animales exóticos queda también en libertad.",
                4
        ));

        items.add(new Peliculas(
                R.drawable.piratas,
                "Piratas del Caribe",
                "Director: Gore Verbinski",
                "Reparto: Johnny Depp, Orlando Bloom, Keira Knightley",
                "Sinópsis: El capitán Barbossa le roba el barco al pirata Jack Sparrow y secuestra a Elizabeth, amiga de Will Turner. Barbossa y su tripulación son víctimas de un conjuro que los condena a vivir eternamente y a transformarse cada noche en esqueletos vivientes.",
                5
        ));

        items.add(new Peliculas(
                R.drawable.ready,
                "Ready Player One",
                "Director: Steven Spielberg",
                "Reparto: Tye Sheridan, Olivia Cooke",
                "Sinópsis: Año 2045. El adolescente Wade Watts es solo una de los millones de personas que se evaden del sombrío mundo real para sumergirse en un mundo utópico virtual donde todo es posible: OASIS. Wade participa en la búsqueda del tesoro que el creador de este mundo imaginario dejó oculto en su obra. No obstante, hay gente muy peligrosa compitiendo contra él.",
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
