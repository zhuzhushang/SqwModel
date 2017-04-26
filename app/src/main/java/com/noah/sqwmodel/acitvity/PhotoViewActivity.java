package com.noah.sqwmodel.acitvity;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.noah.sqwmodel.R;

/**
 * Created by noah on 2017/4/21.
 */

public class PhotoViewActivity extends BaseActivity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_photoview);
    }

    @Override
    protected int attachLayoutRes() {
        return 0;
    }

    @Override
    void viewInit() {

    }

    @Override
    void dataInit() {

    }

    @Override
    void eventInit() {

    }
}
