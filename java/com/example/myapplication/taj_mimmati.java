package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class taj_mimmati extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taj_mimmati);
        Button butt1=(Button)findViewById(R.id.ikhfasyafawi);
        Button butt2=(Button)findViewById(R.id.idghammislain);
        Button butt3=(Button)findViewById(R.id.idzharsyafawi);
        butt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1=new Intent(taj_mimmati.this,t_m_m_ikhfasyafawi.class);
                startActivity(int1);
            }
        });
        butt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int2=new Intent(taj_mimmati.this,t_m_m_idghammislain.class);
                startActivity(int2);
            }
        });
        butt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int3=new Intent(taj_mimmati.this,t_m_m_idzharsyafawi.class);
                startActivity(int3);
            }
        });
    }
}
