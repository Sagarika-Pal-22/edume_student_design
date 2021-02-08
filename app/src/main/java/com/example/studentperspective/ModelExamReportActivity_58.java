package com.example.studentperspective;

import android.os.Bundle;

import com.example.studentperspective.Fragment.All_Fragment_57;
import com.example.studentperspective.Fragment.All_Fragment_58;
import com.example.studentperspective.Fragment.Chemistry_Fragment;
import com.example.studentperspective.Fragment.English_Fragment;
import com.example.studentperspective.Fragment.Maths_Fragment;
import com.example.studentperspective.Fragment.Physics_Fragment;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class ModelExamReportActivity_58 extends AppCompatActivity {

    private ViewPager viewPager;
    private TabLayout tabLayout;

    private int[] tabIcons = {
            R.drawable.all,
            R.drawable.maths,
            R.drawable.phys,
            R.drawable.english,
            R.drawable.chem,
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_model_exam_report_58);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        viewPager = findViewById(R.id.viewpager);
        tabLayout = findViewById(R.id.tabLayout);

        setupViewPager(viewPager);
        tabLayout.setupWithViewPager(viewPager);
        setupTabIcons();

    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager(),0);
        viewPagerAdapter.addFragment(new All_Fragment_58(), "All");
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