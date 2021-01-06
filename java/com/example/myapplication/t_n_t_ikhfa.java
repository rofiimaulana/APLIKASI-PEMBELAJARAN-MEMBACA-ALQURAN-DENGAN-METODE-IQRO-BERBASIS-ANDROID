package com.example.myapplication;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.TextView;


public class t_n_t_ikhfa extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t_n_t_ikhfa);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        //Untuk Menambahkan Button Suara
        final MediaPlayer TaNunmati = MediaPlayer.create(this, R.raw.ta_nun_mati); //Memanggil nama lagu
        final MediaPlayer TaTanwin = MediaPlayer.create(this, R.raw.ta_tanwin);
        final MediaPlayer TsaNunmati = MediaPlayer.create(this, R.raw.tsa_nun_mati);
        final MediaPlayer TsaTanwin = MediaPlayer.create(this, R.raw.tsa_tanwin);
        final MediaPlayer JaNunmati = MediaPlayer.create(this, R.raw.ja_nun_mati);
        final MediaPlayer JaTanwin = MediaPlayer.create(this, R.raw.ja_tanwin);
        final MediaPlayer DaNunmati = MediaPlayer.create(this, R.raw.da_nun_mati);
        final MediaPlayer DaTanwin = MediaPlayer.create(this, R.raw.da_tanwin);
        final MediaPlayer DzaNunmati = MediaPlayer.create(this, R.raw.dza_nun_mati);
        final MediaPlayer DzaTanwin = MediaPlayer.create(this, R.raw.dza_tanwin);
        final MediaPlayer djaNunmati = MediaPlayer.create(this, R.raw.jha_nun_mati);
        final MediaPlayer djaTanwin = MediaPlayer.create(this, R.raw.jha_tanwin);
        final MediaPlayer SaNunmati = MediaPlayer.create(this, R.raw.sa_nun_mati);
        final MediaPlayer SaTanwin = MediaPlayer.create(this, R.raw.sa_tanwin);
        final MediaPlayer SyaNunmati = MediaPlayer.create(this, R.raw.sya_nun_mati);
        final MediaPlayer SyaTanwin = MediaPlayer.create(this, R.raw.sya_tanwin);
        final MediaPlayer SoNunmati = MediaPlayer.create(this, R.raw.so_nun_mati);
        final MediaPlayer SoTanwin = MediaPlayer.create(this, R.raw.so_tanwin);
        final MediaPlayer DhoNunmati = MediaPlayer.create(this, R.raw.dho_nun_mati);
        final MediaPlayer DhoTanwin = MediaPlayer.create(this, R.raw.dho_tanwin);
        final MediaPlayer ThoNunmati = MediaPlayer.create(this, R.raw.to_nun_mati);
        final MediaPlayer ThoTanwin = MediaPlayer.create(this, R.raw.to_tanwin);
        final MediaPlayer DzoNunmati = MediaPlayer.create(this, R.raw.djo_nun_mati);
        final MediaPlayer DzoTanwin = MediaPlayer.create(this, R.raw.djo_tanwin);
        final MediaPlayer FaNunmati = MediaPlayer.create(this, R.raw.fa_nun_mati);
        final MediaPlayer FaTanwin = MediaPlayer.create(this, R.raw.fa_tanwin);
        final MediaPlayer QoNunmati = MediaPlayer.create(this, R.raw.qo_nun_mati);
        final MediaPlayer QaTanwin = MediaPlayer.create(this, R.raw.qo_tanwin);
        final MediaPlayer KafNunmati = MediaPlayer.create(this, R.raw.ka_nun_mati);
        final MediaPlayer KafTanwin = MediaPlayer.create(this, R.raw.ka_tanwin);

        TextView ButtonSuara = (TextView) this.findViewById(R.id.ta_nunmati); //fariabel button
        TextView ButtonSuara2 = (TextView) this.findViewById(R.id.ta_tanwin);
        TextView ButtonSuara3 = (TextView) this.findViewById(R.id.tsa_nunmati);
        TextView ButtonSuara4 = (TextView) this.findViewById(R.id.tsa_tanwin);
        TextView ButtonSuara5 = (TextView) this.findViewById(R.id.jim_nunmati);
        TextView ButtonSuara6 = (TextView) this.findViewById(R.id.jim_tanwin);
        TextView ButtonSuara7 = (TextView) this.findViewById(R.id.da_nunmati);
        TextView ButtonSuara8 = (TextView) this.findViewById(R.id.da_tanwin);
        TextView ButtonSuara9 = (TextView) this.findViewById(R.id.dzal_nunmati);
        TextView ButtonSuara10 = (TextView) this.findViewById(R.id.dzal_tanwin);
        TextView ButtonSuara11 = (TextView) this.findViewById(R.id.za_nunmati);
        TextView ButtonSuara12 = (TextView) this.findViewById(R.id.za_tanwin);
        TextView ButtonSuara13 = (TextView) this.findViewById(R.id.sa_nunmati);
        TextView ButtonSuara14 = (TextView) this.findViewById(R.id.sa_tanwin);
        TextView ButtonSuara15 = (TextView) this.findViewById(R.id.sya_nunmati);
        TextView ButtonSuara16 = (TextView) this.findViewById(R.id.sya_tanwin);
        TextView ButtonSuara17 = (TextView) this.findViewById(R.id.so_nunmati);
        TextView ButtonSuara18 = (TextView) this.findViewById(R.id.so_tanwin);
        TextView ButtonSuara19 = (TextView) this.findViewById(R.id.shod_nunmati);
        TextView ButtonSuara20 = (TextView) this.findViewById(R.id.shod_tanwin);
        TextView ButtonSuara21 = (TextView) this.findViewById(R.id.to_nunmati);
        TextView ButtonSuara22 = (TextView) this.findViewById(R.id.to_tanwin);
        TextView ButtonSuara23 = (TextView) this.findViewById(R.id.dzo_nunmati);
        TextView ButtonSuara24 = (TextView) this.findViewById(R.id.dzo_tanwin);
        TextView ButtonSuara25 = (TextView) this.findViewById(R.id.fa_nunmati);
        TextView ButtonSuara26 = (TextView) this.findViewById(R.id.fa_taniwn);
        TextView ButtonSuara27 = (TextView) this.findViewById(R.id.qof_nunmati);
        TextView ButtonSuara28 = (TextView) this.findViewById(R.id.qof_tanwin);
        TextView ButtonSuara29 = (TextView) this.findViewById(R.id.kaf_nunmati);
        TextView ButtonSuara30 = (TextView) this.findViewById(R.id.kaf_tanwin);

        /*Menghidupkan Suara */
        ButtonSuara.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TaNunmati.start();
            }
        });

        ButtonSuara2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TaTanwin.start();
            }
        });

        ButtonSuara3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TsaNunmati.start();
            }
        });

        ButtonSuara4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TsaTanwin.start();
            }
        });
        ButtonSuara5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                JaNunmati.start();
            }
        });
        ButtonSuara6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                JaTanwin.start();
            }
        });
        ButtonSuara7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                DaNunmati.start();
            }
        });

        ButtonSuara8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                DaTanwin.start();
            }
        });

        ButtonSuara9.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                DzaNunmati.start();
            }
        });
        ButtonSuara10.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                DzaTanwin.start();
            }
        });
        ButtonSuara11.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                djaNunmati.start();
            }
        });

        ButtonSuara12.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                djaTanwin.start();
            }
        });
        ButtonSuara13.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                SaNunmati.start();
            }
        });
        ButtonSuara14.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                SaTanwin.start();
            }
        });

        ButtonSuara15.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                SyaNunmati.start();
            }
        });
        ButtonSuara16.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                SyaTanwin.start();
            }
        });
        ButtonSuara17.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                SoNunmati.start();
            }
        });
        ButtonSuara18.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                SoTanwin.start();
            }
        });

        ButtonSuara19.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                DhoNunmati.start();
            }
        });
        ButtonSuara20.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                DhoTanwin.start();
            }
        });
        ButtonSuara21.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                ThoNunmati.start();
            }
        });
        ButtonSuara22.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                ThoTanwin.start();
            }
        });
        ButtonSuara23.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                DzoNunmati.start();
            }
        });

        ButtonSuara24.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                DzoTanwin.start();
            }
        });
        ButtonSuara25.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                FaNunmati.start();
            }
        });
        ButtonSuara26.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                FaTanwin.start();
            }
        });
        ButtonSuara27.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                QoNunmati.start();
            }
        });
        ButtonSuara28.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                QaTanwin.start();
            }
        });
        ButtonSuara27.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                KafNunmati.start();
            }
        });
        ButtonSuara28.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                KafTanwin.start();
            }
        });
    }
}
