package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class taj_hukum_qalqalah extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taj_hukum_qalqalah);
        Button butt1=(Button)findViewById(R.id.qalqalahsugrha);
        Button butt2=(Button)findViewById(R.id.qalqalahqubra);
        butt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1=new Intent(taj_hukum_qalqalah.this,t_h_qalqalahsugrho.class);
                startActivity(int1);
            }
        });
        butt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int2=new Intent(taj_hukum_qalqalah.this,t_h_qalqalahqubra.class);
                startActivity(int2);
            }
        });
    }
}
