package com.example.rizkiapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * 10116301
 * Muhammad Rizki Alrizal
 * IF-7
 * 23/05/2019
 */

public class FriendsFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_friends,container,false);
        Global g = Global.getInstance();
        ArrayList<Person> teman = g.getData();

        PersonListAdaptor adaptor = new PersonListAdaptor(getContext(),R.layout.adapter_view,teman);

        ListView lvTeman = (ListView) view.findViewById(R.id.list_teman);
        lvTeman.setAdapter(adaptor);
        Button btnTambahTeman = (Button) view.findViewById(R.id.buttonTambahTeman);
        btnTambahTeman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(),TambahTeman.class);
                startActivity(intent);
            }
        });
        return view;
    }
}
