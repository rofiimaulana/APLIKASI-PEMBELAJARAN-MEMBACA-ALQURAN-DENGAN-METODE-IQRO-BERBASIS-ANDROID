package com.example.myapplication;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

public class t_n_t_idgham_bilagunah extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t_n_t_idgham_bilagunah);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        final MediaPlayer SuaraAlif = MediaPlayer.create(this, R.raw.contoh_idghambi_la_ghunnah); //Memanggil nama lagu
        final MediaPlayer SuaraBa = MediaPlayer.create(this, R.raw.ba);
        final MediaPlayer SuaraTa = MediaPlayer.create(this, R.raw.ta);
        final MediaPlayer SuaraSa = MediaPlayer.create(this, R.raw.sa);

        TextView ButtonSuara = (TextView) this.findViewById(R.id.lam_nunmati); //fariabel button
        TextView ButtonSuara2 = (TextView) this.findViewById(R.id.lam_tanwin);
        TextView ButtonSuara3 = (TextView) this.findViewById(R.id.ra_nunmati);
        TextView ButtonSuara4 = (TextView) this.findViewById(R.id.ra_tanwin);

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
    }
}
