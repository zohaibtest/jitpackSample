package com.consoliads.admob_adapter;

public class AdManger {

    private static final AdManger ourInstance = new AdManger();

    public static AdManger getInstance() {
        return ourInstance;
    }

    private AdManger() {
    }
}
