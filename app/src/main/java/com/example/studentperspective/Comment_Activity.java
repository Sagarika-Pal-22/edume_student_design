package com.example.studentperspective;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;

import com.example.studentperspective.Adapter.Comment_Adapter;
import com.example.studentperspective.Model.Model_Comments;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.snackbar.Snackbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Comment_Activity extends AppCompatActivity {

    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle drawerToggle;
    private NavigationView navigationView;
    ImageView img_back;

    RecyclerView rv_comment;
    List<Model_Comments> model_comments;
    Comment_Adapter comment_adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comment_);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_view);
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

        model_comments = new ArrayList<>();

        rv_comment = findViewById(R.id.rv_comment);
        LinearLayoutManager linearLayoutManager_1 = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        rv_comment.setLayoutManager(linearLayoutManager_1);
        rv_comment.setHasFixedSize(true);
        model_comments.add(new Model_Comments("","Arnold Shwarranger","Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s"));
        model_comments.add(new Model_Comments("","Arnold Shwarranger","Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s"));
        comment_adapter = new Comment_Adapter(this,model_comments);
        rv_comment.setAdapter(comment_adapter);
    }

    public class Comment_Adapter extends RecyclerView.Adapter<Comment_Adapter.MyViewHolder> {


        Context context;
        List<Model_Comments> model_comments ;

        public Comment_Adapter(Context context, List<Model_Comments> model_comments) {
            this.context = context;
            this.model_comments = model_comments;
        }

        @NonNull
        @Override
        public Comment_Adapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            LayoutInflater inflater = LayoutInflater.from(context);
            View view = inflater.inflate(R.layout.single_comments, parent, false);
            return new Comment_Adapter.MyViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull final Comment_Adapter.MyViewHolder holder, int position) {

            holder.text_person.setText(model_comments.get(position).getText_person());
            holder.text_comments.setText(model_comments.get(position).getText_comments());

            holder.text_reply.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                     holder.linear_write_comment.setVisibility(View.VISIBLE);
                }
            });
            holder.linear_write_comment.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    holder.linear_reply.setVisibility(View.VISIBLE);
                    holder.linear_write_comment.setVisibility(View.GONE);
                }
            });

        }

        @Override
        public int getItemCount() {
            return model_comments.size();
        }

        public class MyViewHolder extends RecyclerView.ViewHolder {

            ImageView img_person;
            TextView text_person,text_comments,text_reply;
            LinearLayout linear_write_comment,linear_reply;
            public MyViewHolder(@NonNull View itemView) {
                super(itemView);
                text_person = itemView.findViewById(R.id.text_person);
                text_comments = itemView.findViewById(R.id.text_comments);
                img_person = itemView.findViewById(R.id.img_person);
                text_reply = itemView.findViewById(R.id.text_reply);
                linear_write_comment = itemView.findViewById(R.id.linear_write_comment);
                linear_reply = itemView.findViewById(R.id.linear_reply);

            }
        }
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

        if(id == R.id.notification){
            Toast.makeText(this, "Notification", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(this,Notification_Activity.class));
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