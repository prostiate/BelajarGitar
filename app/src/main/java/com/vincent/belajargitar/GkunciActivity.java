package com.vincent.belajargitar;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Spinner;

public class GkunciActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner spinner;
    MediaPlayer klik, klik2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gkunci);
        spinner = (Spinner) findViewById(R.id.majming);
        spinner.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        ImageView chord_img = (ImageView) findViewById(R.id.imgpG);
        chord_img.setImageResource(R.drawable.kuncig);
        klik = MediaPlayer.create(this, R.raw.gmaj);
        klik2 = MediaPlayer.create(this, R.raw.gmin);
        switch (position){
            case 0:
                klik.start();
                chord_img.setImageResource(R.drawable.kuncig);
                chord_img.setOnClickListener(myhandler1);
                break;
            case 1:
                klik2.start();
                chord_img.setImageResource(R.drawable.kuncigmin);
                chord_img.setOnClickListener(myhandler2);
                break;
        }
    }

    View.OnClickListener myhandler1 = new View.OnClickListener() {
        public void onClick(View v) {
            klik.start();
        }
    };

    View.OnClickListener myhandler2 = new View.OnClickListener() {
        public void onClick(View v) {
            klik2.start();
        }
    };

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
