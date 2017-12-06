package com.example.placecom;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

public class Recruiters extends FragmentActivity {
    ViewPager viewPager=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recruiters);
        viewPager=(ViewPager) findViewById(R.id.pager);
        FragmentManager fragmentManager= getSupportFragmentManager();
        viewPager.setAdapter(new MyAdapter(fragmentManager));
    }
}


class MyAdapter extends FragmentPagerAdapter{

    public MyAdapter(FragmentManager fm) {
        super(fm);
        // TODO Auto-generated constructor stub
    }

    @Override
    public Fragment getItem(int i) {

        Fragment fragment=null;

        if(i==0)
        {
            fragment= new FragmentA();
        }
        if(i==1)
        {
            fragment= new FragmentB();
        }
        if(i==2)
        {
            fragment= new FragmentC();
        }
        if(i==3)
        {
            fragment= new FragmentD();
        }
        if(i==4)
        {
            fragment= new FragmentE();
        }

        // TODO Auto-generated method stub
        return fragment;
    }

    @Override
    public int getCount() {

        // TODO Auto-generated method stub
        return 5;
    }

    public CharSequence getPageTitle(int position)
    {

        if(position==0)
        {
            return "TAB 1";
        }
        if(position==1)
        {
            return "TAB 2";
        }if(position==2)
    {
        return "TAB 3";
    }
        if(position==3)
        {
            return "TAB 4";
        }
        if(position==4)
        {
            return "TAB 5";
        }

        return null;
    }

}

