package com.example.myapplication;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class t_h_madthobii extends AppCompatActivity {
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t_h_madthobii);
    }
    public void play (View view){
        if (mp == null){
            mp = MediaPlayer.create(this,R.raw.contoh_mad_asli);
            mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    stopMp();
                }
            });
            Toast.makeText(this,"media player play",Toast.LENGTH_SHORT).show();
        }
        mp.start();
    }
    public void pause (View view){
        stopMp();
    }
    private void stopMp(){
        if (mp != null){
            mp.release();
            mp = null;
            Toast.makeText(this,"media player released",Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        stopMp();
    }
}
