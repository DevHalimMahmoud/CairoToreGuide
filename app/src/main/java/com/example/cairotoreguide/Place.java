package com.example.cairotoreguide;

public class Place {

    private String mName;
    private String mAddress;
    private int mPhoto;


    Place(String Name, String Address, int Photo) {

        this.mName = Name;
        this.mAddress = Address;
        this.mPhoto = Photo;
    }

    public String getmName() {
        return mName;
    }

    public String getmAddress() {
        return mAddress;
    }

    public int getmPhoto() {
        return mPhoto;
    }
}
