package com.cohentsedekmultiapp;

import android.app.Application;

import com.cohentsedek.common.MSPV3;

public class MyApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();


        MSPV3.init(this);
    }
}
