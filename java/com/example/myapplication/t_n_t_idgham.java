package com.example.myapplication;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

public class t_n_t_idgham extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t_n_t_idgham);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        final MediaPlayer ya_nunmati = MediaPlayer.create(this, R.raw.ya_nun_mati); //Memanggil nama lagu
        final MediaPlayer ya_tanwin = MediaPlayer.create(this, R.raw.ya_tanwin);
        final MediaPlayer mim_nunmati = MediaPlayer.create(this, R.raw.mim_nun_mati);
        final MediaPlayer mim_tanwin = MediaPlayer.create(this, R.raw.mim_tanwin);
        final MediaPlayer nun_nunmati = MediaPlayer.create(this, R.raw.nun_nun_mati);
        final MediaPlayer nun_tanwin = MediaPlayer.create(this, R.raw.nun_tanwin);
        final MediaPlayer wau_nunmati = MediaPlayer.create(this, R.raw.wau_nun_mati);
        final MediaPlayer wau_tanwin = MediaPlayer.create(this, R.raw.wau_tanwin);
        final MediaPlayer lam_nunmati = MediaPlayer.create(this, R.raw.lam_nun_mati); //Memanggil nama lagu
        final MediaPlayer lam_tanwin = MediaPlayer.create(this, R.raw.lam_tanwin);
        final MediaPlayer ra_nunmati = MediaPlayer.create(this, R.raw.ra_nun_mati);
        final MediaPlayer ra_tanwin = MediaPlayer.create(this, R.raw.ra_tanwin);

        TextView ButtonSuara = (TextView) this.findViewById(R.id.ya_nunmati); //fariabel button
        TextView ButtonSuara2 = (TextView) this.findViewById(R.id.ya_tanwin);
        TextView ButtonSuara3 = (TextView) this.findViewById(R.id.mim_nunmati);
        TextView ButtonSuara4 = (TextView) this.findViewById(R.id.mim_tanwin);
        TextView ButtonSuara5 = (TextView) this.findViewById(R.id.nun_nunmati);
        TextView ButtonSuara6 = (TextView) this.findViewById(R.id.nun_tanwin);
        TextView ButtonSuara7 = (TextView) this.findViewById(R.id.wau_nunmati);
        TextView ButtonSuara8 = (TextView) this.findViewById(R.id.wau_tanwin);
        TextView ButtonSuara9 = (TextView) this.findViewById(R.id.lam_nunmati); //fariabel button
        TextView ButtonSuara10 = (TextView) this.findViewById(R.id.lam_tanwin);
        TextView ButtonSuara11 = (TextView) this.findViewById(R.id.ra_nunmati);
        TextView ButtonSuara12 = (TextView) this.findViewById(R.id.ra_tanwin);

        /*Menghidupkan Suara */
        ButtonSuara.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                ya_nunmati.start();
            }
        });

        ButtonSuara2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                ya_tanwin.start();
            }
        });

        ButtonSuara3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                mim_nunmati.start();
            }
        });

        ButtonSuara4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                mim_tanwin.start();
            }
        });
        ButtonSuara5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                nun_nunmati.start();
            }
        });
        ButtonSuara6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                nun_tanwin.start();
            }
        });
        ButtonSuara7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                wau_nunmati.start();
            }
        });

        ButtonSuara8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                wau_tanwin.start();
            }
        });
        ButtonSuara9.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                lam_nunmati.start();
            }
        });
        ButtonSuara10.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                lam_tanwin.start();
            }
        });
        ButtonSuara11.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                ra_nunmati.start();
            }
        });
        ButtonSuara12.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                ra_tanwin.start();
            }
        });
    }
}
