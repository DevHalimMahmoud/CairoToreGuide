package com.example.cairotoreguide;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class Malls extends Fragment {

    public Malls() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);


        final ArrayList<Place> Places = new ArrayList<>();

        Places.add(new Place(getString(R.string.mall_of_egypt), getString(R.string.cairo_egypt), R.drawable.mall_of_egypt));
        Places.add(new Place(getString(R.string.mall_of_arabia), getString(R.string.cairo_egypt), R.drawable.mall_of_arabia));
        Places.add(new Place(getString(R.string.downtown_mall), getString(R.string.cairo_egypt), R.drawable.downtown_mall));
        Places.add(new Place(getString(R.string.city_stars_mall), getString(R.string.cairo_egypt), R.drawable.city_stars_mall));
        Places.add(new Place(getString(R.string.cairo_festival_city_mall), getString(R.string.cairo_egypt), R.drawable.cairo_festival_city_mall));


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
