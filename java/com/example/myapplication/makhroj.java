package com.example.myapplication;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class makhroj extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_makhroj);
        Button butt1=(Button)findViewById(R.id.halqi_gho);
        Button butt2=(Button)findViewById(R.id.halqi_kho);
        Button butt3=(Button)findViewById(R.id.halqi_ain);
        Button butt4=(Button)findViewById(R.id.halqi_hakecil);
        Button butt5=(Button)findViewById(R.id.halqi_habesar);
        Button butt6=(Button)findViewById(R.id.halqi_alif);
        Button butt7=(Button)findViewById(R.id.halqi_hamzah);
        Button butt8=(Button)findViewById(R.id.lisani_qo);
        Button butt9=(Button)findViewById(R.id.lisani_kaf);
        Button butt10=(Button)findViewById(R.id.lisani_sya);
        Button butt11=(Button)findViewById(R.id.lisani_ja);
        Button butt12=(Button)findViewById(R.id.lisani_ya);
        Button butt13=(Button)findViewById(R.id.lisani_dho);
        Button butt14=(Button)findViewById(R.id.lisani_lam);
        Button butt15=(Button)findViewById(R.id.lisani_nun);
        Button butt16=(Button)findViewById(R.id.lisani_ra);
        Button butt17=(Button)findViewById(R.id.lisani_ta);
        Button butt18=(Button)findViewById(R.id.lisani_tho);
        Button butt19=(Button)findViewById(R.id.lisani_daa);
        Button butt20=(Button)findViewById(R.id.lisani_so);
        Button butt21=(Button)findViewById(R.id.lisani_jha);
        Button butt22=(Button)findViewById(R.id.lisani_sa);
        Button butt23=(Button)findViewById(R.id.lisani_djal);
        Button butt24=(Button)findViewById(R.id.lisani_tsa);
        Button butt25=(Button)findViewById(R.id.lisani_dzo);
        Button butt26=(Button)findViewById(R.id.syafawi_faa);
        Button butt27=(Button)findViewById(R.id.syafawi_mim);
        Button butt28=(Button)findViewById(R.id.syafawi_baa);
        Button butt29=(Button)findViewById(R.id.syafawi_waa);
        Button butt30=(Button)findViewById(R.id.jaufi_alif);
        Button butt31=(Button)findViewById(R.id.jaufi_waa);
        Button butt32=(Button)findViewById(R.id.jaufi_ya);
        Button butt33=(Button)findViewById(R.id.khaisyum_mim);
        Button butt34=(Button)findViewById(R.id.khaisyum_nun);
        butt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1=new Intent(makhroj.this,mak_halqi_gho.class);
                startActivity(int1);
            }
        });
        butt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int2=new Intent(makhroj.this,mak_halqi_kho.class);
                startActivity(int2);
            }
        });
        butt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int3=new Intent(makhroj.this,mak_halqi_ain.class);
                startActivity(int3);
            }
        });
        butt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int4=new Intent(makhroj.this,mak_halqi_hakecil.class);
                startActivity(int4);
            }
        });
        butt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int5=new Intent(makhroj.this,mak_halqi_habesar.class);
                startActivity(int5);
            }
        });
        butt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int6=new Intent(makhroj.this, mak_halqi_alif.class);
                startActivity(int6);
            }
        });
        butt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int7=new Intent(makhroj.this,mak_halqi_hamzah.class);
                startActivity(int7);
            }
        });
        butt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int8=new Intent(makhroj.this,mak_lisani_qo.class);
                startActivity(int8);
            }
        });
        butt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int9=new Intent(makhroj.this,mak_lisani_kaf.class);
                startActivity(int9);
            }
        });
        butt10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int10=new Intent(makhroj.this,mak_lisani_sya.class);
                startActivity(int10);
            }
        });
        butt11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int11=new Intent(makhroj.this,mak_lisani_ja.class);
                startActivity(int11);
            }
        });
        butt12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int12=new Intent(makhroj.this,mak_lisani_ya.class);
                startActivity(int12);
            }
        });
        butt13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int13=new Intent(makhroj.this, mak_lisani_dho.class);
                startActivity(int13);
            }
        });
        butt14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int14=new Intent(makhroj.this,mak_lisani_lam.class);
                startActivity(int14);
            }
        });
        butt15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int15=new Intent(makhroj.this,mak_lisani_nun.class);
                startActivity(int15);
            }
        });
        butt16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int16=new Intent(makhroj.this,mak_lisani_ra.class);
                startActivity(int16);
            }
        });
        butt17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int17=new Intent(makhroj.this,mak_lisani_ta.class);
                startActivity(int17);
            }
        });
        butt18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int18=new Intent(makhroj.this,mak_lisani_tho.class);
                startActivity(int18);
            }
        });
        butt19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int19=new Intent(makhroj.this,mak_lisani_daa.class);
                startActivity(int19);
            }
        });
        butt20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int20=new Intent(makhroj.this, mak_lisani_so.class);
                startActivity(int20);
            }
        });
        butt21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int21=new Intent(makhroj.this,mak_lisani_jha.class);
                startActivity(int21);
            }
        });
        butt22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int22=new Intent(makhroj.this,mak_lisani_sa.class);
                startActivity(int22);
            }
        });
        butt23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int23=new Intent(makhroj.this,mak_lisani_djal.class);
                startActivity(int23);
            }
        });
        butt24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int24=new Intent(makhroj.this,mak_lisani_tsa.class);
                startActivity(int24);
            }
        });
        butt25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int25=new Intent(makhroj.this,mak_lisani_dzo.class);
                startActivity(int25);
            }
        });
        butt26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int26=new Intent(makhroj.this,mak_syafawi_faa.class);
                startActivity(int26);
            }
        });
        butt27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int27=new Intent(makhroj.this,mak_syafawi_mim.class);
                startActivity(int27);
            }
        });
        butt28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int28=new Intent(makhroj.this,mak_syafawi_baa.class);
                startActivity(int28);
            }
        });
        butt29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int29=new Intent(makhroj.this,mak_syafawi_waa.class);
                startActivity(int29);
            }
        });
        butt30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int30=new Intent(makhroj.this,mak_halqi_alif.class);
                startActivity(int30);
            }
        });
        butt31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int31=new Intent(makhroj.this,mak_syafawi_waa.class);
                startActivity(int31);
            }
        });
        butt32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int32=new Intent(makhroj.this,mak_lisani_ya.class);
                startActivity(int32);
            }
        });
        butt33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int33=new Intent(makhroj.this,mak_syafawi_mim.class);
                startActivity(int33);
            }
        });
        butt34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int34=new Intent(makhroj.this,mak_lisani_nun.class);
                startActivity(int34);
            }
        });
    }
}






















