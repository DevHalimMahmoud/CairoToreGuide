package com.example.cairotoreguide;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class HistoricalPlaces extends Fragment {

    public HistoricalPlaces() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);


        final ArrayList<Place> Places = new ArrayList<>();

        Places.add(new Place("Cairo Tower", "Cairo, Egypt", R.drawable.cairo_tower));
        Places.add(new Place("Prince Mohamed Ali Palace", "Cairo, Egypt", R.drawable.prince_mohamed_ali_palace));
        Places.add(new Place("Khan Al Khalili", "Cairo, Egypt", R.drawable.khan_al_khalili_of_cairo));
        Places.add(new Place("Queen Hatshepsut Temple", "Egypt", R.drawable.queen_hatshepsut_temple));
        Places.add(new Place("Pyramid's of Giza", "Giza, Egypt", R.drawable.giza_pyramid));


        ArrayAdapter adaptor = new PlaceAdaptor(getActivity(), Places);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_numbers.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adaptor);


        return rootView;
    }
}
