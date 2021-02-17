package com.example.studentperspective;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;

import com.example.studentperspective.Fragment.ChapterTestReport_Fragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.snackbar.Snackbar;
import com.weiwangcn.betterspinner.library.material.MaterialBetterSpinner;

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
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Toast;

public class Settings_Activity_75_1 extends AppCompatActivity {

    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle drawerToggle;
    private NavigationView navigationView;
    ImageView img_back;

    MaterialBetterSpinner spin_privacy,spin_chat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings__75_1);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_view);
        img_back = findViewById(R.id.img_back);
        spin_privacy = findViewById(R.id.spin_privacy);
        spin_chat = findViewById(R.id.spin_chat);
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

        img_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        String Privacy[] = {"Public", "Friend", "Only Me"};
        ArrayAdapter<String> arrayAdapter_privacy = new ArrayAdapter<String>(Settings_Activity_75_1.this, android.R.layout.simple_dropdown_item_1line, Privacy);
        spin_privacy.setAdapter(arrayAdapter_privacy);

        String Chat[] = {"Public", "Friend", "Only Me"};
        ArrayAdapter<String> arrayAdapter_chat = new ArrayAdapter<String>(Settings_Activity_75_1.this, android.R.layout.simple_dropdown_item_1line, Chat);
        spin_chat.setAdapter(arrayAdapter_chat);

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
            Intent intent = new Intent(Settings_Activity_75_1.this, MainActivity.class);
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