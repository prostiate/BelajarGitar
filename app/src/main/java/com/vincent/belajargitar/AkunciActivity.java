package com.vincent.belajargitar;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Spinner;

public class AkunciActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner spinner;
    MediaPlayer klik, klik2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akunci);
        spinner = (Spinner) findViewById(R.id.majmina);
        spinner.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        ImageView chord_img = (ImageView) findViewById(R.id.imgpA);
        chord_img.setImageResource(R.drawable.kuncia);
        klik = MediaPlayer.create(this, R.raw.amaj);
        klik2 = MediaPlayer.create(this, R.raw.amin);
        switch (position){
            case 0:
                klik.start();
                chord_img.setImageResource(R.drawable.kuncia);
                chord_img.setOnClickListener(myhandler1);
                break;
            case 1:
                klik2.start();
                chord_img.setImageResource(R.drawable.kunciamin);
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
