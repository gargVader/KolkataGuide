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

public class HotelFragment extends Fragment {

    ListView listView;
    ArrayList<Location> arrayList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.location_list_view, container, false);

        arrayList = new ArrayList<Location>();

        arrayList.add(new Location(getString(R.string.hotel_hindusthan_international_title),
                getString(R.string.hotel_hindusthan_international_location_area),
                R.drawable.hotel_hindusthan_international));

        arrayList.add(new Location(getString(R.string.hotel_novotel_title),
                getString(R.string.hotel_novotel_location_area),
                R.drawable.hotel_novotel));

        arrayList.add(new Location(getString(R.string.hotel_itc_royal_bengal_title),
                getString(R.string.hotel_itc_royal_bengal_location_area),
                R.drawable.hotel_itc_royal_bengal));

        arrayList.add(new Location(getString(R.string.hotel_hyyat_regency_title),
                getString(R.string.hotel_hyyat_regency_location_area),
                R.drawable.hotel_hyyat_regency));

        arrayList.add(new Location(getString(R.string.hotel_hotel_de_sovrani_title),
                getString(R.string.hotel_hotel_de_sovrani_title),
                R.drawable.hotel_hotel_de_sovrani));

        arrayList.add(new Location(getString(R.string.hotel_park_hotel_title),
                getString(R.string.hotel_park_hotel_location_area),
                R.drawable.hotel_park_hotel));

        arrayList.add(new Location(getString(R.string.hotel_jw_marriot_title),
                getString(R.string.hotel_jw_marriot_location_area),
                R.drawable.hotel_jw_marriot));



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