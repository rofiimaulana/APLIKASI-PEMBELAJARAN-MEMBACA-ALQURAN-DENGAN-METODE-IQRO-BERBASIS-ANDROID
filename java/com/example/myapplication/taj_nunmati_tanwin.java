package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class taj_nunmati_tanwin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taj_nunmati_tanwin);
        Button butt1=(Button)findViewById(R.id.izhar);
        Button butt2=(Button)findViewById(R.id.idgham);
        Button butt3=(Button)findViewById(R.id.ikhfa);
        Button butt4=(Button)findViewById(R.id.iqlab);
        butt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1=new Intent(taj_nunmati_tanwin.this,t_n_t_izhar.class);
                startActivity(int1);
            }
        });
        butt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int2=new Intent(taj_nunmati_tanwin.this,t_n_t_idgham.class);
                startActivity(int2);
            }
        });
        butt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int3=new Intent(taj_nunmati_tanwin.this,t_n_t_ikhfa.class);
                startActivity(int3);
            }
        });
        butt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int4=new Intent(taj_nunmati_tanwin.this,t_n_t_iqlab.class);
                startActivity(int4);
            }
        });
    }
}
