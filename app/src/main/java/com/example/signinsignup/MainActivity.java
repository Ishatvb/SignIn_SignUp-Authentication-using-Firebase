package com.example.signinsignup;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationItemView;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottom_navigation_view);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                int id = item.getItemId();

                if(id == R.id.nav_home){
                    loadFrag(new HomeFragment(), true);
                }
                else if(id == R.id.nav_history){
                    loadFrag(new HistoryFragment(), false);
                }
                else if(id == R.id.nav_about){
                    loadFrag(new AboutFragment(), false);
                }
                else if(id == R.id.nav_weather){
                    loadFrag(new WeatherFragment(), false);
                }
                else if(id == R.id.nav_userprofile){
                    loadFrag(new UserFragment(), false);
                }
                    return true;
            }
        });

        bottomNavigationView.setSelectedItemId(R.id.nav_home);

    }
    public void loadFrag(Fragment fragment, boolean flag){
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        if (flag){
            ft.add(R.id.container_frame_layout, fragment);
        }
        else {
            ft.replace(R.id.container_frame_layout,fragment);
        }
        ft.commit();
    }
}