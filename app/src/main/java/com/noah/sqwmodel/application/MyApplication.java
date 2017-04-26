package com.noah.sqwmodel.application;

import android.app.Application;

import com.blankj.utilcode.util.Utils;

/**
 * Created by noah on 2017/4/21.
 */

public class MyApplication extends Application{


    @Override
    public void onCreate() {
        super.onCreate();

        Utils.init(this);

    }
}
