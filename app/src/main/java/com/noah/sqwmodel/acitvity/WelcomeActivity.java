package com.noah.sqwmodel.acitvity;

import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.widget.ImageView;

import com.blankj.utilcode.util.AppUtils;
import com.blankj.utilcode.util.BarUtils;
import com.noah.sqwmodel.R;
import com.noah.sqwmodel.constants.Constants;
import com.noah.sqwmodel.utils.SharedPreferencesUtils;

/**
 * Created by noah on 2017/4/21.
 */

public class WelcomeActivity extends BaseActivity {

    private ImageView welcome_img;
    private Handler handler;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    protected int attachLayoutRes() {

        BarUtils.hideStatusBar(this);

        return R.layout.activity_welcome;
    }

    @Override
    void viewInit() {

    }

    @Override
    void dataInit() {

        handler = new Handler();
        handler.postDelayed(runnable, 2400);


    }

    @Override
    void eventInit() {


    }


    @Override
    protected void onDestroy() {
        super.onDestroy();

        if (handler != null) {

            handler.removeCallbacks(runnable);
        }

    }

    private Runnable runnable = new Runnable() {
        @Override
        public void run() {

            boolean isFirstStart = (boolean) SharedPreferencesUtils.getParam(WelcomeActivity.this, Constants.IS_FIRST_START_GUIDE, true);
            int lastVersionCode = (int) SharedPreferencesUtils.getParam(WelcomeActivity.this, Constants.LAST_VERSION_CODE, 1);
            int currentVersionCode = AppUtils.getAppVersionCode(context);
            boolean isNewVersion = currentVersionCode > lastVersionCode ? true : false;
            if (isFirstStart || isNewVersion) {
                startActivity(GuideActivity.class);
            } else {
                startActivity(MainActivity.class);
            }

            WelcomeActivity.this.finish();
        }
    };


}
