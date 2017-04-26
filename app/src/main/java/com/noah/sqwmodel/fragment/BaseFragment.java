package com.noah.sqwmodel.fragment;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by noah on 2017/4/21.
 */

public class BaseFragment extends Fragment {


    //上下文
    protected Context context;
    //主布局容器
    protected ViewGroup mViewGroup;
    //布局id
    protected int layoutRes;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {


        mViewGroup = (ViewGroup) inflater.inflate(layoutRes,container,false);
        context = getActivity();
        return mViewGroup;
    }
}
