package com.abdul.stringup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class String_services extends AppCompatActivity {

    RelativeLayout badminton,tennis,squash;
   ImageView back,btn_home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_string_services);
        getSupportActionBar().hide();
        badminton=findViewById(R.id.ll_badminton);
        tennis=findViewById(R.id.ll_tennis);
        squash=findViewById(R.id.ll_squash);

        badminton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(String_services.this,Racquet_details.class);
                startActivity(i);
            }
        });
        tennis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(String_services.this,Racquet_details.class);
                startActivity(i);

            }
        });
        squash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(String_services.this,Racquet_details.class);
                startActivity(i);

            }
        });
        back=findViewById(R.id.btn_back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(String_services.this,Home.class);
                startActivity(i);
            }
        });
        btn_home=findViewById(R.id.homebtn);
        btn_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(String_services.this,Home.class);
                startActivity(i);
            }
        });
    }
}
