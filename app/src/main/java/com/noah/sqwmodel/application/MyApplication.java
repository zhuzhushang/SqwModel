package com.noah.sqwmodel.application;

import android.app.Application;
import android.content.Context;

import com.blankj.utilcode.util.Utils;

/**
 * Created by noah on 2017/4/21.
 */

public class MyApplication extends Application{

    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        //暂时retrofitUtils有用到
        context = getApplicationContext();
        initConfig();


    }

    private void initConfig() {

        //工具类初始化
        Utils.init(this);


//        CrashHandler crashHandler = CrashHandler.getInstance();
//        crashHandler.init(getApplicationContext());

    }
}
