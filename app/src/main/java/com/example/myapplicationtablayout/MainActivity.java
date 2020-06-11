package com.example.myapplicationtablayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.TableLayout;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
        private TabLayout t1;
        private ViewPager v1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1= (TabLayout) findViewById(R.id.t1);
        v1=(ViewPager) findViewById(R.id.v1);
        ViewPagerAdapter adapter=new ViewPagerAdapter(getSupportFragmentManager());
        adapter.AddFragment(new BlankFragment1(),"b1");
        adapter.AddFragment(new BlankFragment2(),"b2");
        adapter.AddFragment(new BlankFragment3(),"b3");

        v1.setAdapter(adapter);
        t1.setupWithViewPager(v1);
    }
}