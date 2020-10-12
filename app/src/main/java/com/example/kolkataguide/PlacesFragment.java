package com.example.kolkataguide;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class PlacesFragment extends Fragment {

    ListView listView;
    ArrayList<Location> arrayList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.location_list_view, container, false);

        arrayList = new ArrayList<Location>();

        arrayList.add(new Location(getString(R.string.places_victoria_memorial_title),
                getString(R.string.places_victoria_memorial_location_area),
                R.drawable.places_victoria_memorial));

        arrayList.add(new Location(getString(R.string.places_howrah_bridge_title),
                getString(R.string.places_howrah_bridge_location_area),
                R.drawable.places_howrah_bridge));

        arrayList.add(new Location(getString(R.string.places_dakshineshwar_temple_title),
                getString(R.string.places_dakshineshwar_temple_location_area),
                R.drawable.places_dakshineshwar_temple));

        arrayList.add(new Location(getString(R.string.places_eden_gardens_title),
                getString(R.string.places_eden_gardens_location_area),
                R.drawable.places_eden_gardens));

        arrayList.add(new Location(getString(R.string.places_eco_park_title),
                getString(R.string.places_eco_park_location_area),
                R.drawable.places_eco_park));

        arrayList.add(new Location(getString(R.string.places_prinsep_ghat_title),
                getString(R.string.places_prinsep_ghat_location_area),
                R.drawable.places_prinsep_ghat));

        arrayList.add(new Location(getString(R.string.places_science_city_title),
                getString(R.string.places_science_city_location_area),
                R.drawable.places_science_city));

        arrayList.add(new Location(getString(R.string.places_birla_planeterium),
                getString(R.string.places_birla_planeterium_location_area),
                R.drawable.places_birla_planetarium));

        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), arrayList);

        listView = (ListView) view.findViewById(R.id.listView);
        listView.setAdapter(locationAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Location currentLocation = arrayList.get(position);
                Intent intent = new Intent(getContext(), ListItemDetailActivity.class);
                intent.putExtra("title", currentLocation.getTitle());
                intent.putExtra("imageResourceId", currentLocation.getImageResourceId());
                intent.putExtra("locationArea", currentLocation.getLocationArea());
                startActivity(intent);
            }
        });

        return view;
    }
}