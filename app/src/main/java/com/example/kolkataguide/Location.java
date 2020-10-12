package com.example.kolkataguide;

public class Location {
    private String title;
    private String locationArea;
    private int imageResourceId;

    public Location(String locationName, String locationArea, int imageResourceId){
        setLocationArea(locationArea);
        setLocationName(locationName);
        setImageResourceId(imageResourceId);
    }

    public String getTitle(){
        return title;
    }

    public String getLocationArea(){
        return locationArea;
    }

    public void setLocationName(String locationName){
        this.title = locationName;
    }

    public void setLocationArea(String locationArea) {
        this.locationArea = locationArea;
    }

    public int getImageResourceId(){
        return imageResourceId;
    }
    public void setImageResourceId(int imageResourceId){
        this.imageResourceId = imageResourceId;
    }
}
