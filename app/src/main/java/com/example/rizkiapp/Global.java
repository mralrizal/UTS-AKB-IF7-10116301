package com.example.rizkiapp;

import java.util.ArrayList;

/**
 * 10116301
 * Muhammad Rizki Alrizal
 * IF-7
 * 23/05/2019
 */

public class Global {
    private static Global instance;

    private ArrayList<Person> data;

    private Global(){}

    public void setData(ArrayList<Person> data){
        this.data=data;
    }

    public ArrayList<Person> getData(){
        return this.data;
    }

    public static synchronized Global getInstance(){
        if(instance == null){
            instance = new Global();
        }
        return instance;
    }

}
