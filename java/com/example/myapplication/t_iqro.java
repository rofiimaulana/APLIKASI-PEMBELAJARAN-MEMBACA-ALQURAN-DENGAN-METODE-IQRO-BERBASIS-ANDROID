package com.example.myapplication;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class t_iqro extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t_iqro);
        Button butt1=(Button)findViewById(R.id.button1);
        Button butt2=(Button)findViewById(R.id.button2);
        Button butt3=(Button)findViewById(R.id.button3);
        Button butt4=(Button)findViewById(R.id.button4);
        Button butt5=(Button)findViewById(R.id.button5);
        Button butt6=(Button)findViewById(R.id.button6);
        butt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1=new Intent(t_iqro.this, iqroo1.class);
                startActivity(int1);
            }
        });
        butt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int2=new Intent(t_iqro.this, iqroo2.class);
                startActivity(int2);
            }
        });
        butt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int3=new Intent(t_iqro.this, iqroo3.class);
                startActivity(int3);
            }
        });
        butt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int4=new Intent(t_iqro.this, iqroo4.class);
                startActivity(int4);
            }
        });
        butt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int5=new Intent(t_iqro.this, iqroo5.class);
                startActivity(int5);
            }
        });
        butt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int6=new Intent(t_iqro.this, iqroo6.class);
                startActivity(int6);
            }
        });

    }
}
