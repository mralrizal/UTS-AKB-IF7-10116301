package com.example.rizkiapp;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * 10116301
 * Muhammad Rizki Alrizal
 * IF-7
 * 23/05/2019
 */

public class Person extends ArrayList<Person> {
    private String nama;
    private String nim;
    private String kelas;
    private String telepon;
    private String email;
    private String instagram;

    public Person(String nama, String telepon) {
        this.nama = nama;
        this.telepon = telepon;
    }

    public Person(String nama, String nim, String kelas, String telepon, String email, String instagram) {
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        this.telepon = telepon;
        this.email = email;
        this.instagram = instagram;
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public String getKelas() {
        return kelas;
    }

    public String getTelepon() {
        return telepon;
    }

    public String getEmail() {
        return email;
    }

    public String getInstagram() {
        return instagram;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }

    @Override
    public Stream<Person> stream() {
        return null;
    }
}
