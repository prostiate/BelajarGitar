package com.vincent.belajargitar;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    //MENU UTAMA
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //MENU TUTORIAL GITAR
    public void pilihkunci(View v){
        Intent pilihkunci = new Intent(this, PilihkunciActivity.class);
        startActivity(pilihkunci);
    }
    //MENU ABOUT ME
    public void aboutme(View v){
        Intent aboutme = new Intent(this, AboutMeActivity.class);
        startActivity(aboutme);
    }

    //TOMBOL BACK JIKA DI TEKAN
    @Override
    public void onBackPressed() {
        final AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setMessage("Anda yakin mau keluar ?");
        builder.setCancelable(true);
        builder.setNegativeButton("Ya", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                System.exit(0);
            }
        });
        builder.setPositiveButton("Tidak", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }


}
