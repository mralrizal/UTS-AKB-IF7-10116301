package com.example.rizkiapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

/**
 * 10116301
 * Muhammad Rizki Alrizal
 * IF-7
 * 22/05/2019
 */

public class SplashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        final ArrayList<Person> teman =  new ArrayList<>();

        Person person1 = new Person("Muhammad Rizki Alrizal","10116301","IF-7","082240325610","rizki.alrizal@yahoo.co.id","@mralrizal");
        Person person2 = new Person("Asep Rizal","10116292","IF-7","089235432775","test@gmail.com","@ayawe");
        Person person3 = new Person("Awong","101162913","IF-3","089522342345","adadaja@gmail.com","@test12345");
        Person person4 = new Person("M Ilhan Sidiq","10116297","IF-1","089535346135","hamun98@gmail.com","@endgame");
        Person person5 = new Person("Maman Rancung","10116234","IF-4","089234125135","admin12345@gmail.com","@test12345");

        Global g = Global.getInstance();
        teman.add(person1);
        teman.add(person2);
        teman.add(person3);
        teman.add(person4);
        teman.add(person5);
        g.setData(teman);

        Thread thread = new Thread() {
            public void run() {
                try {
                    sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    startActivity(new Intent(SplashActivity.this, ViewPagerActivity.class));
                    finish();
                }
            }
        };
        thread.start();
    }
}
