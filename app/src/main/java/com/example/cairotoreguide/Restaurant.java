package com.example.cairotoreguide;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class Restaurant extends Fragment {

    public Restaurant() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);


        final ArrayList<Place> Places = new ArrayList<>();

        Places.add(new Place("The Blue Restaurant", "Cairo, Egypt", R.drawable.the_blue_restaurant__grill));
        Places.add(new Place("Shogun Japanese restaurant", "Cairo, Egypt", R.drawable.shogun_japanese_restaurant));
        Places.add(new Place("Sachi", "Cairo, Egypt", R.drawable.sachi));
        Places.add(new Place("Raj", "Cairo, Egypt", R.drawable.raj));
        Places.add(new Place("LEXIE'S", "Cairo, Egypt", R.drawable.lexies));


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
