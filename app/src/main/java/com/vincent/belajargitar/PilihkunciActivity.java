package com.vincent.belajargitar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PilihkunciActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilihkunci);
    }

    public void kuncia(View v){
        Intent kuncia = new Intent(this, AkunciActivity.class);
        startActivity(kuncia);
    }

    public void kuncib(View v){
        Intent kuncib = new Intent(this, BkunciActivity.class);
        startActivity(kuncib);
    }

    public void kuncic(View v){
        Intent kuncic = new Intent(this, CkunciActivity.class);
        startActivity(kuncic);
    }

    public void kuncid(View v){
        Intent kuncid = new Intent(this, DkunciActivity.class);
        startActivity(kuncid);
    }

    public void kuncie(View v){
        Intent kuncie = new Intent(this, EkunciActivity.class);
        startActivity(kuncie);
    }

    public void kuncif(View v){
        Intent kuncif = new Intent(this, FkunciActivity.class);
        startActivity(kuncif);
    }

    public void kuncig(View v){
        Intent kuncig = new Intent(this, GkunciActivity.class);
        startActivity(kuncig);
    }

}
