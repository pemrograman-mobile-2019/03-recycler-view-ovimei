package com.example.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

public class Mahasiswa{

    private String nama;
    protected String npm;
    private String nohp;

    public Mahasiswa(String nama, String npm, String nohp){
        this.nama;
        this.npm;
        this.nohp;
    }

    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getNpm(){
        return npm;
    }

    public void setNpm(String npm){
        this.npm = npm;
    }

    public String getNohp(){
        return nohp;
    }

    public void setNohp(String nohp){
        this.nohp = nohp;
    }
}