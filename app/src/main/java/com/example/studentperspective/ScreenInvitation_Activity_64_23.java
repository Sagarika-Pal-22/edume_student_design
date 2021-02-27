package com.example.studentperspective;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;

import com.example.studentperspective.Fragment.AnalyticsFragment;
import com.example.studentperspective.Fragment.ClassroomFragment;
import com.example.studentperspective.Fragment.FavouriteChapter_Fragment_91;
import com.example.studentperspective.Fragment.ProfileFragment_89_4;
import com.example.studentperspective.Fragment.ScreenInvitation_Fragment_64_23;
import com.example.studentperspective.Fragment.TeacherFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.snackbar.Snackbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentTransaction;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.Toast;

public class ScreenInvitation_Activity_64_23 extends AppCompatActivity {

    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle drawerToggle;
    private NavigationView navigationView;

    BottomNavigationView bottom_navigationView;
    ImageView img_back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_invitation__64_23);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawerLayout = findViewById(R.id.drawer_layout);
        drawerToggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.Open, R.string.Close);
        drawerLayout.addDrawerListener(drawerToggle);
        drawerToggle.syncState();

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setHomeAsUpIndicator(R.drawable.hamburger);
        }
        getSupportActionBar().setDisplayShowTitleEnabled(false);
//        getSupportActionBar().setTitle("Report");

        navigationView = findViewById(R.id.nav_view);
        img_back = findViewById(R.id.img_back);

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

        bottom_navigationView = (BottomNavigationView) findViewById(R.id.bottom_nav);

        bottom_navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                int id = menuItem.getItemId();
                if (id == R.id.nav_home) {
//                    FavouriteChapter_Fragment_91 favouriteChapter_fragment = new FavouriteChapter_Fragment_91();
//                    FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
//                    fragmentTransaction.replace(R.id.framLayout, favouriteChapter_fragment);
//                    fragmentTransaction.commit();
                }else if (id == R.id.nav_analytics) {
//                    AnalyticsFragment analyticsFragment = new AnalyticsFragment();
//                    FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
//                    fragmentTransaction.replace(R.id.framLayout, analyticsFragment);
//                    fragmentTransaction.commit();
                }else if (id == R.id.nav_classroom) {
//                    ClassroomFragment classroomFragment = new ClassroomFragment();
//                    FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
//                    fragmentTransaction.replace(R.id.framLayout, classroomFragment);
//                    fragmentTransaction.commit();
                }else if (id == R.id.nav_profile) {
//                    ProfileFragment_89_4 profileFragment894 = new ProfileFragment_89_4();
//                    FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
//                    fragmentTransaction.replace(R.id.framLayout, profileFragment894);
//                    fragmentTransaction.commit();
                }else if (id == R.id.nav_teacher) {
                    ScreenInvitation_Fragment_64_23 screenInvitation_fragment = new ScreenInvitation_Fragment_64_23();
                    FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.framLayout, screenInvitation_fragment);
                    fragmentTransaction.commit();
                }
                return true;
            }
        });
        bottom_navigationView.setSelectedItemId(R.id.nav_teacher);

        img_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_toolbar, menu);
        return true;
    }
    @Override
    public void onBackPressed() {
        DrawerLayout drawer_layout = findViewById(R.id.drawer_layout);

        if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
            drawer_layout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (drawerToggle.onOptionsItemSelected(item)) {
            return true;
        }

        int id = item.getItemId();

        if (id == android.R.id.home) {
            Intent intent = new Intent(ScreenInvitation_Activity_64_23.this, MainActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
            finish();
        }
        else if (id == R.id.cart) {
            Toast.makeText(this, "Cart", Toast.LENGTH_SHORT).show();
//            startActivity(new Intent(this,Notification_Activity.class));
            return true;
        }else if(id == R.id.notification){
            Toast.makeText(this, "Notification", Toast.LENGTH_SHORT).show();
//            startActivity(new Intent(this,HelpSupport_Activity.class));
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(newBase);
        final Configuration override = new Configuration(newBase.getResources().getConfiguration());
        override.fontScale = 1.0f;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
            applyOverrideConfiguration(override);
        }
    }

}