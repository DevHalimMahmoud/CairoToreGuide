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

        Places.add(new Place("Mall of Egypt", "Cairo, Egypt", R.drawable.mall_of_egypt));
        Places.add(new Place("Mall of Arabia", "Cairo, Egypt", R.drawable.mall_of_arabia));
        Places.add(new Place("DownTown Mall", "Cairo, Egypt", R.drawable.downtown_mall));
        Places.add(new Place("City Stars Mall", "Cairo, Egypt", R.drawable.city_stars_mall));
        Places.add(new Place("Cairo Festival City Mall", "Cairo, Egypt", R.drawable.cairo_festival_city_mall));


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
