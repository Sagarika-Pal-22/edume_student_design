package com.example.studentperspective;

import android.os.Bundle;

import com.example.studentperspective.Fragment.ChapterTestReport_Fragment;
import com.example.studentperspective.Fragment.LessonTitle_Fragment_77;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.snackbar.Snackbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentTransaction;

import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

public class LessonTitle_Activity_77 extends AppCompatActivity {

    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle drawerToggle;
    private NavigationView navigationView;
    BottomNavigationView bottom_navigationView;
    ImageView img_back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_title__77);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_view);
        bottom_navigationView = (BottomNavigationView) findViewById(R.id.bottom_nav);
        img_back = findViewById(R.id.img_back);
        drawerToggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.Open, R.string.Close);
        drawerLayout.addDrawerListener(drawerToggle);
        drawerToggle.syncState();

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setHomeAsUpIndicator(R.drawable.hamburger);
        }
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected( MenuItem menuItem) {

                int id = menuItem.getItemId();
                switch (id) {
                    case R.id.nav_home:
//                        startActivity(new Intent(MainActivity.this,AccountHolderDetails_Activity.class));
                        break;
                    case R.id.nav_profile:
//                        startActivity(new Intent(MainActivity.this, MoneyTransferSetting_Activity.class));
                        break;
                    case R.id.nav_connect_desktop:
//                        startActivity(new Intent(MainActivity.this,CashbackOffers_Activity.class));
                        break;
                    case R.id.nav_feedback:
//                        startActivity(new Intent(MainActivity.this,Settings_Activity.class));
                        break;
                    case R.id.nav_my_account:
//                        startActivity(new Intent(MainActivity.this, HelpSupport_Activity.class));
                        break;
                    case R.id.nav_connect_tv:
//                        startActivity(new Intent(MainActivity.this, Feedback_Activity.class));
                        break;
                    case R.id.nav_settings:
//                        startActivity(new Intent(MainActivity.this, Feedback_Activity.class));
                        break;
                    case R.id.nav_friend:
//                        startActivity(new Intent(MainActivity.this, Feedback_Activity.class));
                        break;
                    case R.id.nav_about_us:
//                        startActivity(new Intent(MainActivity.this, Feedback_Activity.class));
                        break;
                    case R.id.nav_help:
//                        startActivity(new Intent(MainActivity.this, Feedback_Activity.class));
                        break;
                    case R.id.nav_contact:
//                        startActivity(new Intent(MainActivity.this, Feedback_Activity.class));
                        break;
                    default:
                        return true;
                }
                return true;
            }
        });


        bottom_navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                int id = menuItem.getItemId();
                if (id == R.id.nav_home) {
//                    HomeFragment home_fragment = new HomeFragment();
//                    FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
//                    fragmentTransaction.replace(R.id.framLayout, home_fragment);
//                    fragmentTransaction.commit();
                }else if (id == R.id.nav_analytics) {
//                    ChapterTestReport_Fragment chapterTestReport_fragment = new ChapterTestReport_Fragment();
//                    FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
//                    fragmentTransaction.replace(R.id.framLayout, chapterTestReport_fragment);
//                    fragmentTransaction.commit();
                }else if (id == R.id.nav_classroom) {
                    LessonTitle_Fragment_77 lessonTitle_fragment_77 = new LessonTitle_Fragment_77();
                    FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.framLayout, lessonTitle_fragment_77);
                    fragmentTransaction.commit();
                }else if (id == R.id.nav_profile) {
//                    ProfileFragment profileFragment = new ProfileFragment();
//                    FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
//                    fragmentTransaction.replace(R.id.framLayout, profileFragment);
//                    fragmentTransaction.commit();
                }else if (id == R.id.nav_teacher) {
//                    TeacherFragment teacherFragment = new TeacherFragment();
//                    FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
//                    fragmentTransaction.replace(R.id.framLayout, teacherFragment);
//                    fragmentTransaction.commit();
                }
                return true;
            }
        });
        bottom_navigationView.setSelectedItemId(R.id.nav_classroom);

        img_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });


    }
}