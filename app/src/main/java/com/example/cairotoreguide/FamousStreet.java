package com.example.cairotoreguide;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class FamousStreet extends Fragment {

    public FamousStreet() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);


        final ArrayList<Place> Places = new ArrayList<>();

        Places.add(new Place(getString(R.string.muizz_street), getString(R.string.cairo_egypt), R.drawable.muizz_street));
        Places.add(new Place(getString(R.string.tahrir_square), getString(R.string.cairo_egypt), R.drawable.tahrirsquare));
        Places.add(new Place(getString(R.string.talaat_harb), getString(R.string.cairo_egypt), R.drawable.talaat_harb));
        Places.add(new Place(getString(R.string.qusr_nile), getString(R.string.cairo_egypt), R.drawable.qasr_el_nile_street));
        Places.add(new Place(getString(R.string.saliba_street), getString(R.string.cairo_egypt), R.drawable.saliba_street));


        ArrayAdapter<Place> adaptor = new PlaceAdaptor(getActivity(), Places);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_numbers.xml layout file.
        ListView listView = rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adaptor);


        return rootView;
    }
}
