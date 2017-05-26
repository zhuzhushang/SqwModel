package com.noah.sqwmodel.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.noah.sqwmodel.model.TestModel;

import java.util.List;

/**
 * Created by noah on 2017/5/23.
 */

public class TestAdapter extends RecyclerView.Adapter<TestAdapter.TestHolder>{

    private Context context;
    private List<TestModel> mList;
    private int layoutID;
    private LayoutInflater mInflater;

    public TestAdapter(Context context, List<TestModel> mList, int layoutID) {
        this.context = context;
        this.mList = mList;
        this.layoutID = layoutID;
        mInflater = LayoutInflater.from(context);
    }

    @Override
    public TestHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = mInflater.inflate(layoutID,parent,false);
        TestHolder holder = new TestHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(TestHolder holder, int position) {



    }

    @Override
    public int getItemCount() {
        return mList != null ? mList.size():0;
    }

    public class TestHolder extends RecyclerView.ViewHolder{



        public TestHolder(View itemView) {
            super(itemView);


        }
    }


}
