package com.example.myapplicationtablayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerAdapter extends FragmentPagerAdapter {
    private final List<Fragment> frglist = new ArrayList<>();
    private final List<String> frgtitle = new ArrayList<>();

    public ViewPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return frglist.get(position);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return frgtitle.get(position);
    }

    @Override
    public int getCount() {
        return frgtitle.size();
    }

    public void AddFragment(Fragment frg,String title)
    {
frgtitle.add(title);
frglist.add(frg);
    }
}
