package com.example.myapplication;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class tajwid extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tajwid);
        Button butt1=(Button)findViewById(R.id.taj1);
        Button butt2=(Button)findViewById(R.id.taj2);
        Button butt3=(Button)findViewById(R.id.taj3);
        Button butt4=(Button)findViewById(R.id.taj4);
        Button butt5=(Button)findViewById(R.id.taj5);
        Button butt6=(Button)findViewById(R.id.taj6);
        butt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1=new Intent(tajwid.this,taj_nunmati_tanwin.class);
                startActivity(int1);
            }
        });
        butt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int2=new Intent(tajwid.this,taj_mimmati.class);
                startActivity(int2);
            }
        });
        butt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int3=new Intent(tajwid.this,taj_hukum_mad.class);
                startActivity(int3);
            }
        });
        butt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int4=new Intent(tajwid.this,taj_hukum_idgham.class);
                startActivity(int4);
            }
        });
        butt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int5=new Intent(tajwid.this,taj_hukum_qalqalah.class);
                startActivity(int5);
            }
        });
        butt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int6=new Intent(tajwid.this,taj_tanda_waqof.class);
                startActivity(int6);
            }
        });
    }
}
