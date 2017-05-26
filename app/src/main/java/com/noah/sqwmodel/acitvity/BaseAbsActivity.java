package com.noah.sqwmodel.acitvity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by noah on 2017/4/19.
 */

public abstract class BaseAbsActivity extends AppCompatActivity{


    protected Context context;
    private int  layoutRes;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        context = this;
        setContentView(attachLayoutRes());
        viewInit();
        dataInit();
        eventInit();

    }

    /**
     * 绑定布局文件
     *
     * @return 布局文件ID
     */
    @LayoutRes
    protected abstract int attachLayoutRes();

    /**
     * 初始化view
     */
    abstract void viewInit();

    /**
     * 初始化数据
     */
    abstract void dataInit();

    /**
     * 初始化事件
     */
    abstract void eventInit();


    public void startActivity(Class<?> activity)
    {
        Intent intent = new Intent(context,activity);
        startActivity(intent);
    }


}
