package com.example.myapplication;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.TextView;

public class t_n_t_iqlab extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t_n_t_iqlab);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        //Untuk Menambahkan Button Suara
        final MediaPlayer BaNunmati = MediaPlayer.create(this, R.raw.ba_nun_mati); //Memanggil nama lagu
        final MediaPlayer BaTanwin = MediaPlayer.create(this, R.raw.ba_tanwin);
        TextView ButtonSuara = (TextView) this.findViewById(R.id.ba_nunmati); //fariabel button
        TextView ButtonSuara2 = (TextView) this.findViewById(R.id.ba_tanwin);
        /*Menghidupkan Suara */
        ButtonSuara.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                BaNunmati.start();
            }
        });

        ButtonSuara2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                BaTanwin.start();
            }
        });

    }
}
