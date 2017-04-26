package com.noah.sqwmodel.acitvity;

import android.support.v4.view.ViewPager;

import com.bigkoo.convenientbanner.ConvenientBanner;
import com.bigkoo.convenientbanner.holder.CBViewHolderCreator;
import com.bigkoo.convenientbanner.listener.OnItemClickListener;
import com.blankj.utilcode.util.AppUtils;
import com.blankj.utilcode.util.BarUtils;
import com.noah.sqwmodel.R;
import com.noah.sqwmodel.cbholderview.LocalImageHolderView;
import com.noah.sqwmodel.constants.Constants;
import com.noah.sqwmodel.utils.SharedPreferencesUtils;
import com.noah.sqwmodel.utils.ToastUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by noah on 2017/4/21.
 */

public class GuideActivity extends BaseActivity implements ViewPager.OnPageChangeListener,OnItemClickListener{

    private ConvenientBanner convenientBanner;
    private List<Integer> mListLocalImage;


    @Override
    protected int attachLayoutRes() {

        BarUtils.hideStatusBar(this);
        return R.layout.activity_guide;
    }

    @Override
    void viewInit() {

        convenientBanner = (ConvenientBanner) findViewById(R.id.cb);
    }

    @Override
    void dataInit() {

        mListLocalImage = new ArrayList<>();
        mListLocalImage.add(R.mipmap.guide01);
        mListLocalImage.add(R.mipmap.guide01);
        mListLocalImage.add(R.mipmap.guide01);

        convenientBanner.setPages(new CBViewHolderCreator<LocalImageHolderView>() {
            @Override
            public LocalImageHolderView createHolder() {
                return new LocalImageHolderView();
            }
        },mListLocalImage);
        convenientBanner.setPageIndicator(new int[]{R.mipmap.ic_page_indicator,R.mipmap.ic_page_indicator_focused});
        convenientBanner.setCanLoop(false);
        convenientBanner.setOnPageChangeListener(this);
        convenientBanner.setOnItemClickListener(this);

    }

    @Override
    void eventInit() {

    }


    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {

    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    /**
     * @param position
     *
     * 当banner item被点击到时响应
     *
     */
    @Override
    public void onItemClick(int position) {

        if(position == mListLocalImage.size() -1)
        {
            ToastUtils.show(this,"点击到了第"+(position+1)+"个");

            startActivity(MainActivity.class);
            SharedPreferencesUtils.putParam(context, Constants.IS_FIRST_START_GUIDE,false);
            SharedPreferencesUtils.putParam(context,Constants.LAST_VERSION_CODE, AppUtils.getAppVersionCode(context));
            GuideActivity.this.finish();
        }
    }
}
