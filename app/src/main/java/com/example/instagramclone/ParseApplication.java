package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("XvTVEY5RD0GQp8fECMiagfJUaTHOWl7NfYUGCqpz")
                .clientKey("0fPEGcx5WOPb5pPW37avmPUvFyLl0gjWOs6lQSCt")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}

