package com.example.matcoms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Intro_Tutorial_Activity extends AppCompatActivity {
TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro_tutorial);
        textView=findViewById(R.id.txt_mastering_emotions2);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intro_Tutorial_Activity.this,Intro_Create_Account_Activity.class);
                startActivity(intent);
            }
        });
    }
}