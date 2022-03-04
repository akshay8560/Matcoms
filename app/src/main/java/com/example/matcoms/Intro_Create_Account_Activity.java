package com.example.matcoms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class Intro_Create_Account_Activity extends AppCompatActivity {
LinearLayout linearLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro_create_account);
        linearLayout=findViewById(R.id.layout15);
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intro_Create_Account_Activity.this,Create_Account_Activity.class);
                startActivity(intent);
            }
        });

    }
}