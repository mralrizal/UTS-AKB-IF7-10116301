package com.example.rizkiapp;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

/**
 * 10116301
 * Muhammad Rizki Alrizal
 * IF-7
 * 23/05/2019
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigator);

        BottomNavigationView  bottomNav = findViewById(R.id.bottom_navigation);
        bottomNav.setOnNavigationItemSelectedListener(navListener);

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                new ProfileFragment()).commit();
    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment selectedFragment = null;

            switch (item.getItemId()){
                case R.id.nav_profile:
                    selectedFragment = new ProfileFragment();
                    break;
                case R.id.nav_contact:
                    selectedFragment = new ContactFragment();
                    break;
                case R.id.nav_friend:
                    selectedFragment = new FriendsFragment();
                    break;
            }

            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                    selectedFragment).commit();

            return true;
        }
    };

    public void telepon (View view) {
        String phone = "082240325610";
        Intent telpIntent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel",phone, null));
        startActivity(telpIntent);
    }

    public void kirimEmail (View view) {
        Intent emailInt = new Intent(Intent.ACTION_SENDTO);
        emailInt.setData(Uri.parse("mailto:mralrizal@email.unikom.ac.id"));
        startActivity(Intent.createChooser(emailInt,"Send Feedback"));
    }

    public void bukaInstagram (View view) {
        Uri uri = Uri.parse("https://instagram.com/_u/mralrizal");
        Intent likeIng = new Intent(Intent.ACTION_VIEW, uri);

        likeIng.setPackage("com.instagram.android");

        try {
            startActivity(likeIng);
        } catch (ActivityNotFoundException e) {
            startActivity(new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://instagram.com/mralrizal")));
        }
    }

    public void bukaTwitter(View view) {
        String url = "https://twitter.com/mralrizal";
        Intent bukaTwitter = new Intent(Intent.ACTION_VIEW);
        bukaTwitter.setData(Uri.parse(url));
        startActivity(bukaTwitter);
    }

}
