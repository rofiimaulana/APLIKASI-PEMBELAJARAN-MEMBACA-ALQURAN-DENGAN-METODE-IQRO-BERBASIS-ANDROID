package com.example.myapplication;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

public class t_n_t_idgham_bigunah extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t_n_t_idgham_bigunah);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        final MediaPlayer SuaraAlif = MediaPlayer.create(this, R.raw.contoh_idgham_bighunnah); //Memanggil nama lagu
        final MediaPlayer SuaraBa = MediaPlayer.create(this, R.raw.ba);
        final MediaPlayer SuaraTa = MediaPlayer.create(this, R.raw.ta);
        final MediaPlayer SuaraSa = MediaPlayer.create(this, R.raw.sa);
        final MediaPlayer SuaraJim = MediaPlayer.create(this, R.raw.jim);
        final MediaPlayer SuaraHa = MediaPlayer.create(this, R.raw.ha);
        final MediaPlayer SuaraKho = MediaPlayer.create(this, R.raw.kho);
        final MediaPlayer SuaraDal = MediaPlayer.create(this, R.raw.dal);

        TextView ButtonSuara = (TextView) this.findViewById(R.id.ya_nunmati); //fariabel button
        TextView ButtonSuara2 = (TextView) this.findViewById(R.id.ya_tanwin);
        TextView ButtonSuara3 = (TextView) this.findViewById(R.id.mim_nunmati);
        TextView ButtonSuara4 = (TextView) this.findViewById(R.id.mim_tanwin);
        TextView ButtonSuara5 = (TextView) this.findViewById(R.id.nun_nunmati);
        TextView ButtonSuara6 = (TextView) this.findViewById(R.id.nun_tanwin);
        TextView ButtonSuara7 = (TextView) this.findViewById(R.id.wau_nunmati);
        TextView ButtonSuara8 = (TextView) this.findViewById(R.id.wau_tanwin);

        /*Menghidupkan Suara */
        ButtonSuara.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                SuaraAlif.start();
            }
        });

        ButtonSuara2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                SuaraBa.start();
            }
        });

        ButtonSuara3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                SuaraTa.start();
            }
        });

        ButtonSuara4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                SuaraSa.start();
            }
        });
        ButtonSuara5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                SuaraJim.start();
            }
        });
        ButtonSuara6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                SuaraHa.start();
            }
        });
        ButtonSuara7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                SuaraKho.start();
            }
        });

        ButtonSuara8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                SuaraDal.start();
            }
        });
    }
}
