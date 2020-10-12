package com.example.kolkataguide;

import android.content.Context;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class CategoryFragmentPageAdapter extends FragmentPagerAdapter {

    private Context context;

    public CategoryFragmentPageAdapter(Context context, @NonNull FragmentManager fm) {
        super(fm);
        this.context = context;


    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        if(position==0){
            return new PlacesFragment();
        }else if(position==1){
            return new FoodFragment();
        }else{
            return new HotelFragment();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if(position==0){
            return "Places";
        }else if(position==1){
            return "Food";
        }else{
            return "Hotel";
        }
    }
}
