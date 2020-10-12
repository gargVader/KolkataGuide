package com.example.kolkataguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ListItemDetailActivity extends AppCompatActivity {

    private String title;
    private String locationArea;
    private int imageResourceId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_item_detail);

        Bundle extras = getIntent().getExtras();

        if(extras==null) return;

        //get data
        title = extras.getString("title");
        locationArea = extras.getString("locationArea");
        imageResourceId = extras.getInt("imageResourceId");

        setTitle(title);

        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        imageView.setImageResource(imageResourceId);

        TextView titleView = (TextView)  findViewById(R.id.title);
        titleView.setText(title);

        TextView locationAreaView = (TextView) findViewById(R.id.locationArea);
        locationAreaView.setText(locationArea);

        TextView overview = (TextView) findViewById(R.id.overview);
        overview.setText(getString(R.string.lorem));



    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
        }

        return(super.onOptionsItemSelected(item));
    }

    public void onClick(View v){

    }

}