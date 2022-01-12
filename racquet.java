package com.abdul.stringup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Racquet_details extends AppCompatActivity {
    ImageView back,btn_home;
    Button addracket;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_racquet_details);
        getSupportActionBar().hide();


        back=findViewById(R.id.btn_back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Racquet_details.this,String_services.class);
                startActivity(i);
            }
        });
        addracket=findViewById(R.id.addracket);
        addracket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Racquet_details.this,racquet_details_two.class);
                startActivity(i);
            }
        });
        btn_home=findViewById(R.id.homebtn);
        btn_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Racquet_details.this,Home.class);
                startActivity(i);
            }
        });
    }
}
