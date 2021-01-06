package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class taj_hukum_mad extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taj_hukum_mad);
        Button butt1=(Button)findViewById(R.id.madthobii);
        Button butt2=(Button)findViewById(R.id.madwajibmuttasil);
        Button butt3=(Button)findViewById(R.id.madjaizmunfasil);
        Button butt4=(Button)findViewById(R.id.madlin);
        Button butt5=(Button)findViewById(R.id.madbadal);
        Button butt6=(Button)findViewById(R.id.madtamkin);
        Button butt7=(Button)findViewById(R.id.madiwadh);
        Button butt8=(Button)findViewById(R.id.madaridlissukun);
        Button butt9=(Button)findViewById(R.id.madfarq);
        Button butt10=(Button)findViewById(R.id.madsilahqasirah);
        Button butt11=(Button)findViewById(R.id.madsilahtawilah);
        Button butt12=(Button)findViewById(R.id.madlazimmuthaqqalkalimi);
        Button butt13=(Button)findViewById(R.id.madlazimmukhaffafkalimi);
        Button butt14=(Button)findViewById(R.id.madlazimmuthaqqalharfi);
        Button butt15=(Button)findViewById(R.id.madlazimmukffafharfi);
        butt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1=new Intent(taj_hukum_mad.this,t_h_madthobii.class);
                startActivity(int1);
            }
        });
        butt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int2=new Intent(taj_hukum_mad.this,t_h_madwajibmuttasil.class);
                startActivity(int2);
            }
        });
        butt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int3=new Intent(taj_hukum_mad.this,t_h_madjaizmunfasil.class);
                startActivity(int3);
            }
        });
        butt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int3=new Intent(taj_hukum_mad.this,t_h_madlin.class);
                startActivity(int3);
            }
        });
        butt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int3=new Intent(taj_hukum_mad.this,t_h_madbadal.class);
                startActivity(int3);
            }
        });
        butt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int3=new Intent(taj_hukum_mad.this,t_h_madtamkin.class);
                startActivity(int3);
            }
        });
        butt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int3=new Intent(taj_hukum_mad.this,t_h_madiwadh.class);
                startActivity(int3);
            }
        });
        butt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int3=new Intent(taj_hukum_mad.this,t_h_madaridlissukun.class);
                startActivity(int3);
            }
        });
        butt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int3=new Intent(taj_hukum_mad.this,t_h_madfarq.class);
                startActivity(int3);
            }
        });
        butt10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int3=new Intent(taj_hukum_mad.this,t_h_madsilahqasirah.class);
                startActivity(int3);
            }
        });
        butt11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int3=new Intent(taj_hukum_mad.this,t_h_madsilahtawilah.class);
                startActivity(int3);
            }
        });
        butt12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int3=new Intent(taj_hukum_mad.this,t_h_madlazimmuthaqqalkalimi.class);
                startActivity(int3);
            }
        });
        butt13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int3=new Intent(taj_hukum_mad.this,t_h_madlazimmukhoffafkalimi.class);
                startActivity(int3);
            }
        });
        butt14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int3=new Intent(taj_hukum_mad.this,t_h_madlazimmuthaqqalharfi.class);
                startActivity(int3);
            }
        });
        butt15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int3=new Intent(taj_hukum_mad.this,t_h_madlazimmukhoffafharfi.class);
                startActivity(int3);
            }
        });
    }
}
