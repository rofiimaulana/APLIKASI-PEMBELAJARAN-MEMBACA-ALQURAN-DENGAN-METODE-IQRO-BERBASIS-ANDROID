package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class taj_hukum_idgham extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taj_hukum_idgham);
        Button butt1=(Button)findViewById(R.id.idghammutamasilain);
        Button butt2=(Button)findViewById(R.id.idghammutajanisain);
        Button butt3=(Button)findViewById(R.id.idghammutaqaribain);
        butt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1=new Intent(taj_hukum_idgham.this,t_h_idgham_mutamasilain.class);
                startActivity(int1);
            }
        });
        butt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int2=new Intent(taj_hukum_idgham.this,t_h_idgham_mutajanisain.class);
                startActivity(int2);
            }
        });
        butt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int3=new Intent(taj_hukum_idgham.this,t_h_idgham_mutaqaribain.class);
                startActivity(int3);
            }
        });
    }
}
