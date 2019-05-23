package com.example.rizkiapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * 10116301
 * Muhammad Rizki Alrizal
 * IF-7
 * 23/05/2019
 */

public class EditDataTeman extends AppCompatActivity {
    private int indexArray;
    Global g = Global.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_edit_data_teman);

        Intent intent = getIntent();
        String index = intent.getStringExtra("data");
        ArrayList<Person> listTeman = g.getData();
        indexArray = Integer.valueOf(index);
        Person teman = listTeman.get(indexArray);

        TextView etEmail = (TextView) findViewById(R.id.etDetailEmail);
        TextView etIg = (TextView) findViewById(R.id.etDetailIg);
        TextView etKelas = (TextView) findViewById(R.id.etDetailKelas);
        TextView etNama = (TextView) findViewById(R.id.etDetailNama);
        TextView etNim = (TextView) findViewById(R.id.etDetailNim);
        TextView etTlp = (TextView) findViewById(R.id.etDetailTlp);

        etEmail.setText(teman.getEmail());
        etIg.setText(teman.getInstagram());
        etKelas.setText(teman.getKelas());
        etNama.setText(teman.getNama());
        etNim.setText(teman.getNim());
        etTlp.setText(teman.getTelepon());
    }

    public void saveChange(View view){
        ArrayList<Person> data = g.getData();
        EditText etEmail = (EditText) findViewById(R.id.etDetailEmail);
        EditText etIg = (EditText) findViewById(R.id.etDetailIg);
        EditText etKelas = (EditText) findViewById(R.id.etDetailKelas);
        EditText etNama = (EditText) findViewById(R.id.etDetailNama);
        EditText etNim = (EditText) findViewById(R.id.etDetailNim);
        EditText etTlp = (EditText) findViewById(R.id.etDetailTlp);


        Person updateData = new Person(
                etNama.getText().toString(),
                etNim.getText().toString(),
                etKelas.getText().toString(),
                etTlp.getText().toString(),
                etEmail.getText().toString(),
                etIg.getText().toString()
        );
        data.set(indexArray,updateData);
        Toast.makeText(this,"Data berhasil dirubah",Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,MainActivity.class);
        intent.putExtra("state","edit");
        this.startActivity(intent);

    }


}


