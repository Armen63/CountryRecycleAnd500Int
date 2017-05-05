package com.example.countryrecycle;

import android.app.Application;
import android.content.Context;

/**
 * Created by Armen on 5/4/2017.
 */

public class MyApplication extends Application {

    private static Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = getApplicationContext();
    }

    public static Context getContext() {
        return mContext;
    }
}
