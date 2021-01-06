package com.example.myapplication;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
public class t_n_t_izhar extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t_n_t_izhar);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        final MediaPlayer AlifNunmati = MediaPlayer.create(this, R.raw.alif_nun_mati); //Memanggil nama lagu
        final MediaPlayer AlifTanwin = MediaPlayer.create(this, R.raw.alif_tanwin);
        final MediaPlayer HaNunmati = MediaPlayer.create(this, R.raw.ha_kecil_nun_mati);
        final MediaPlayer HaTanwin = MediaPlayer.create(this, R.raw.ha_kecil_tanwin);
        final MediaPlayer KhoNunmati = MediaPlayer.create(this, R.raw.kho_nun_mati);
        final MediaPlayer KhoTanwin = MediaPlayer.create(this, R.raw.kho_tanwin);
        final MediaPlayer AinNunmati = MediaPlayer.create(this, R.raw.ain_nun_mati);
        final MediaPlayer AinTanwin = MediaPlayer.create(this, R.raw.ain_tanwin);
        final MediaPlayer GhoNunmati = MediaPlayer.create(this, R.raw.gho_nun_mati);
        final MediaPlayer GhoTanwin = MediaPlayer.create(this, R.raw.gho_tanwin);
        final MediaPlayer HaBesarNunmati = MediaPlayer.create(this, R.raw.ha_besar_nun_mati);
        final MediaPlayer HaBesarTanwin = MediaPlayer.create(this, R.raw.ha_besar_tanwin);
        TextView ButtonSuara = (TextView) this.findViewById(R.id.alif_nunmati); //fariabel button
        TextView ButtonSuara2 = (TextView) this.findViewById(R.id.alif_tanwin);
        TextView ButtonSuara3 = (TextView) this.findViewById(R.id.ha_nunmati);
        TextView ButtonSuara4 = (TextView) this.findViewById(R.id.ha_tanwin);
        TextView ButtonSuara5 = (TextView) this.findViewById(R.id.kho_nunmati);
        TextView ButtonSuara6 = (TextView) this.findViewById(R.id.kho_tanwin);
        TextView ButtonSuara7 = (TextView) this.findViewById(R.id.ain_nunmati);
        TextView ButtonSuara8 = (TextView) this.findViewById(R.id.ain_tanwin);
        TextView ButtonSuara9 = (TextView) this.findViewById(R.id.ghoin_nunmati);
        TextView ButtonSuara10 = (TextView) this.findViewById(R.id.ghoin_tanwin);
        TextView ButtonSuara11 = (TextView) this.findViewById(R.id.habesar_nunmati);
        TextView ButtonSuara12 = (TextView) this.findViewById(R.id.habesar_tanwin);

        /*Menghidupkan Suara */
        ButtonSuara.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                AlifNunmati.start();
            }
        });

        ButtonSuara2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                AlifTanwin.start();
            }
        });

        ButtonSuara3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                HaNunmati.start();
            }
        });

        ButtonSuara4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                HaTanwin.start();
            }
        });
        ButtonSuara5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                KhoNunmati.start();
            }
        });
        ButtonSuara6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                KhoTanwin.start();
            }
        });
        ButtonSuara7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                AinNunmati.start();
            }
        });

        ButtonSuara8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                AinTanwin.start();
            }
        });

        ButtonSuara9.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                GhoNunmati.start();
            }
        });
        ButtonSuara10.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                GhoTanwin.start();
            }
        });
        ButtonSuara11.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                HaBesarNunmati.start();
            }
        });

        ButtonSuara12.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                HaBesarTanwin.start();
            }
        });
    }
}
