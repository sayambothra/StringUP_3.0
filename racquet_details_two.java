package com.abdul.stringup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class racquet_details_two extends AppCompatActivity {

    Button addracket,checkout;
    ImageView btn_back,btn_home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_racquet_details_two);
        getSupportActionBar().hide();

        addracket=findViewById(R.id.btn_addracket);
        addracket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(racquet_details_two.this,Racquet_details.class);
                startActivity(i);
            }
        });
        checkout=findViewById(R.id.btn_checkout);
        checkout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(racquet_details_two.this,Checkout.class);
                startActivity(i);

            }
        });
        btn_back=findViewById(R.id.btn_back);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(racquet_details_two.this,Racquet_details.class);
                startActivity(i);
            }
        });

        btn_home=findViewById(R.id.homebtn);
        btn_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(racquet_details_two.this,Home.class);
                startActivity(i);
            }
        });

    }
}
