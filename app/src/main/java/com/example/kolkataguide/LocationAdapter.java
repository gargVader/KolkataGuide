package com.example.kolkataguide;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class LocationAdapter extends ArrayAdapter<Location> {

    private Context context;

    public LocationAdapter(Activity context, ArrayList<Location> arrayList) {

        super(context, 0, arrayList);
        this.context = context;
    }

    /**
     *
     * @param position : Gives position of current list item
     * @param convertView : It is the view that is to be recycled
     * @param parent : The parent ViewGroup that is used for inflation
     * @return
     */

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;

        if(listItemView==null){
            listItemView = LayoutInflater.from(getContext())
                    .inflate(R.layout.list_item, parent, false);
        }

//        Get the object
        final Location currentLocation = getItem(position);
        TextView text1 = listItemView.findViewById(R.id.text1);
        TextView text2 = listItemView.findViewById(R.id.text2);
        ImageView imageView = listItemView.findViewById(R.id.imageView);

        text1.setText(currentLocation.getTitle());
        text2.setText(currentLocation.getLocationArea());
        imageView.setImageResource(currentLocation.getImageResourceId());

        return listItemView;
    }
}
