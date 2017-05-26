package com.noah.sqwmodel.acitvity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.widget.RadioGroup;

import com.noah.sqwmodel.R;
import com.noah.sqwmodel.fragment.TabFiveFragment;
import com.noah.sqwmodel.fragment.TabFourFragment;
import com.noah.sqwmodel.fragment.TabOneFragment;
import com.noah.sqwmodel.fragment.TabThreeFragment;
import com.noah.sqwmodel.fragment.TabTwoFragment;

public class MainActivity extends BaseAbsActivity implements RadioGroup.OnCheckedChangeListener{

    //切换需要的fragment
    private TabOneFragment mTabOneFragment;
    private TabTwoFragment mTabTwoFragment;
    private TabThreeFragment mTabThreeFragment;
    private TabFourFragment mTabFourFragment;
    private TabFiveFragment mTabFiveFragment;

    //存储fragment的数组
    private Fragment fragmentArray[];
    //radiogroup 用来切换radiobutton
    private RadioGroup hp_rg;
    /**当前选中的id*/
    private int currentCheckId = R.id.homepage_tab_1;
    /**当前选中的下标*/
    private int currentIndex = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    protected int attachLayoutRes() {
        return R.layout.activity_main;
    }

    @Override
    void viewInit() {

        hp_rg = (RadioGroup) findViewById(R.id.hp_rg);
    }

    @Override
    void dataInit() {

        mTabOneFragment = new TabOneFragment();
        mTabTwoFragment = new TabTwoFragment();
        mTabThreeFragment = new TabThreeFragment();
        mTabFourFragment = new TabFourFragment();
        mTabFiveFragment = new TabFiveFragment();

        //此过程将fragment添加到container里面
        fragmentArray = new Fragment[]{ mTabOneFragment,mTabTwoFragment,mTabThreeFragment,mTabFourFragment,mTabFiveFragment};
        FragmentTransaction transAction = getSupportFragmentManager().beginTransaction();
        for (int i = 0; i < fragmentArray.length; i++) {

            transAction.add(R.id.container,fragmentArray[i]);
            transAction.hide(fragmentArray[i]);
        }
        transAction.show(fragmentArray[currentIndex]);
        transAction.commit();
    }

    @Override
    void eventInit() {

        hp_rg.setOnCheckedChangeListener(this);

    }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int i) {

        if(currentCheckId == i)
        {
            return;
        }

        FragmentTransaction transAction = getSupportFragmentManager().beginTransaction();

        int index = 2;

        switch (i)
        {
            case R.id.homepage_tab_1:

                index = 0;

                break;
            case R.id.homepage_tab_2:

                index = 1;
                break;
            case R.id.homepage_tab_3:
                index = 2;

                break;
            case R.id.homepage_tab_4:

                index = 3;

                break;
            case R.id.homepage_tab_5:

                index = 4;
                break;
        }


        transAction.show(fragmentArray[index]).hide(fragmentArray[currentIndex]).commit();
        currentIndex = index;
        currentCheckId = i;

    }

    /* activity销毁时 让fragment一起销毁  不保存 */
    @Override
    protected void onSaveInstanceState(Bundle outState) {
//        super.onSaveInstanceState(outState);
    }
}
