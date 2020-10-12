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

public class FoodFragment extends Fragment {

    ListView listView;
    ArrayList<Location> arrayList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.location_list_view, container, false);

        arrayList = new ArrayList<Location>();

        arrayList.add(new Location(getString(R.string.food_oh_calcutta_title),
                getString(R.string.food_oh_calcutta_type),
                R.drawable.food_oh_calcutta));

        arrayList.add(new Location(getString(R.string.food_arsalan_title),
                getString(R.string.food_arsalan_type),
                R.drawable.food_arsalan));

        arrayList.add(new Location(getString(R.string.food_kusum_rolls_title),
                getString(R.string.food_kusum_rolls_type),
                R.drawable.food_kusum_rolls));

        arrayList.add(new Location(getString(R.string.food_kwality_title),
                getString(R.string.food_kwality_type),
                R.drawable.food_kwality));

        arrayList.add(new Location(getString(R.string.food_anand_restraunt_title),
                getString(R.string.food_anand_restraunt_type),
                R.drawable.food_anand_restraunt));

        arrayList.add(new Location(getString(R.string.food_peter_cat_titile),
                getString(R.string.food_peter_cat_type),
                R.drawable.food_peter_cat));

        arrayList.add(new Location(getString(R.string.food_mocambo_title),
                getString(R.string.food_mocambo_type),
                R.drawable.food_mocambo));

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