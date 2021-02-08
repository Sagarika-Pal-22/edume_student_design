package com.example.studentperspective.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.tabs.TabLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.example.studentperspective.R;


import java.util.ArrayList;
import java.util.List;

public class ChapterTestReport_Fragment extends Fragment {

    private ViewPager viewPager;
    private TabLayout tabLayout;

    private int[] tabIcons = {
            R.drawable.all,
            R.drawable.maths,
            R.drawable.phys,
            R.drawable.english,
            R.drawable.chem
    };
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.fragment_chapter_test_report,container,false);

        viewPager = view.findViewById(R.id.viewpager);
        tabLayout = view.findViewById(R.id.tabLayout);

        setupViewPager(viewPager);
        tabLayout.setupWithViewPager(viewPager);
        setupTabIcons();
        return view;
    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getChildFragmentManager(),0);
        viewPagerAdapter.addFragment(new All_Fragment_52(), "All");
        viewPagerAdapter.addFragment(new Maths_Fragment(), "Maths");
        viewPagerAdapter.addFragment(new Physics_Fragment(), "Physics");
        viewPagerAdapter.addFragment(new English_Fragment(), "English");
        viewPagerAdapter.addFragment(new Chemistry_Fragment(), "Chemistry");
        viewPager.setAdapter(viewPagerAdapter);
    }

    private void setupTabIcons() {
        tabLayout.getTabAt(0).setIcon(tabIcons[0]);
        tabLayout.getTabAt(1).setIcon(tabIcons[1]);
        tabLayout.getTabAt(2).setIcon(tabIcons[2]);
        tabLayout.getTabAt(3).setIcon(tabIcons[3]);
        tabLayout.getTabAt(4).setIcon(tabIcons[4]);
    }

    private class ViewPagerAdapter extends FragmentPagerAdapter {

        private List<Fragment> fragments = new ArrayList<>();
        private List<String> fragmentTitle = new ArrayList<>();

        public ViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
            super(fm, behavior);
        }

        public void addFragment(Fragment fragment, String title) {
            fragments.add(fragment);
            fragmentTitle.add(title);
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            return fragments.get(position);
        }

        @Override
        public int getCount() {
            return fragments.size();
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            return fragmentTitle.get(position);
        }
    }
}
