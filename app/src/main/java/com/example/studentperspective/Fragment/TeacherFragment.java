package com.example.studentperspective.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.example.studentperspective.ChatActivity_64_15;
import com.example.studentperspective.ChatRoom_Activity_64_2;
import com.example.studentperspective.R;
import com.example.studentperspective.ScreenHolding_Activity_64_13;
import com.example.studentperspective.ScreenSharing_Activity_64_14;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class TeacherFragment extends Fragment {

    private ViewPager viewPager;
    private TabLayout tabLayout;

    private int[] tabIcons = {
            R.drawable.all,
            R.drawable.maths,
            R.drawable.phys,
            R.drawable.english,
            R.drawable.chem,
    };

    TextView text_tchr,text_chat,text_screen;
    View view_tchr,view_chat,view_screen;
    LinearLayout linear_teacher,linear_chat,linear_screen,lin_chats,lin_screen;
    CardView card_screen_1,card_screen_2;
    Button btn_share,btn_wait,btn_message;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_teacher_93_2,container,false);

        viewPager = view.findViewById(R.id.viewpager);
        tabLayout = view.findViewById(R.id.tabLayout);
        text_tchr = view.findViewById(R.id.text_tchr);
        text_chat = view.findViewById(R.id.text_chat);
        text_screen = view.findViewById(R.id.text_screen);
        view_tchr = view.findViewById(R.id.view_tchr);
        view_chat = view.findViewById(R.id.view_chat);
        view_screen = view.findViewById(R.id.view_screen);
        linear_teacher = view.findViewById(R.id.linear_teacher);
        linear_chat = view.findViewById(R.id.linear_chat);
        linear_screen = view.findViewById(R.id.linear_screen);
        lin_chats = view.findViewById(R.id.lin_chats);
        lin_screen = view.findViewById(R.id.lin_screen);
        card_screen_1 = view.findViewById(R.id.card_screen_1);
        card_screen_2 = view.findViewById(R.id.card_screen_2);
        btn_share = view.findViewById(R.id.btn_share);
        btn_wait = view.findViewById(R.id.btn_wait);
        btn_message = view.findViewById(R.id.btn_message);

        setupViewPager(viewPager);
        tabLayout.setupWithViewPager(viewPager);
        setupTabIcons();

        text_tchr.setTextColor(getResources().getColor(R.color.colorPrimary));
        view_tchr.setVisibility(View.VISIBLE);

        text_tchr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view_tchr.setVisibility(View.VISIBLE);
                text_tchr.setTextColor(getResources().getColor(R.color.colorPrimary));
                view_chat.setVisibility(View.GONE);
                text_chat.setTextColor(getResources().getColor(R.color.colorBlack));
                view_screen.setVisibility(View.GONE);
                text_screen.setTextColor(getResources().getColor(R.color.colorBlack));
                linear_teacher.setVisibility(View.VISIBLE);
                linear_chat.setVisibility(View.GONE);
                linear_screen.setVisibility(View.GONE);
            }
        });
        text_chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view_chat.setVisibility(View.VISIBLE);
                text_chat.setTextColor(getResources().getColor(R.color.colorPrimary));
                view_tchr.setVisibility(View.GONE);
                text_tchr.setTextColor(getResources().getColor(R.color.colorBlack));
                view_screen.setVisibility(View.GONE);
                text_screen.setTextColor(getResources().getColor(R.color.colorBlack));
                linear_teacher.setVisibility(View.GONE);
                linear_screen.setVisibility(View.GONE);
                linear_chat.setVisibility(View.VISIBLE);
            }
        });
        text_screen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view_screen.setVisibility(View.VISIBLE);
                text_screen.setTextColor(getResources().getColor(R.color.colorPrimary));
                view_chat.setVisibility(View.GONE);
                text_chat.setTextColor(getResources().getColor(R.color.colorBlack));
                view_tchr.setVisibility(View.GONE);
                text_tchr.setTextColor(getResources().getColor(R.color.colorBlack));
                linear_screen.setVisibility(View.VISIBLE);
                lin_screen.setVisibility(View.GONE);
                linear_teacher.setVisibility(View.GONE);
                linear_chat.setVisibility(View.GONE);
            }
        });
        card_screen_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                linear_screen.setVisibility(View.GONE);
                lin_screen.setVisibility(View.VISIBLE);
            }
        });
        card_screen_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                linear_screen.setVisibility(View.GONE);
                lin_screen.setVisibility(View.VISIBLE);
            }
        });
        btn_share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), ScreenHolding_Activity_64_13.class));
            }
        });
        btn_wait.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), ScreenSharing_Activity_64_14.class));
            }
        });
        btn_message.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), ChatActivity_64_15.class));
            }
        });
        lin_chats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), ChatRoom_Activity_64_2.class));
            }
        });

        return view;
    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getChildFragmentManager(),0);
        viewPagerAdapter.addFragment(new All_Fragment(), "All");
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
