package com.noah.sqwmodel.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.noah.sqwmodel.R;

/**
 * Created by noah on 2017/4/21.
 */

public class TestFragment extends BaseFragment{


    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        layoutRes = R.layout.fragment_test;

        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
