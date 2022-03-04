package com.example.matcoms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Intro_Screen_Activity2 extends AppCompatActivity {
ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro_screen_activiy2);
        imageView=findViewById(R.id.image_me);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intro_Screen_Activity2.this,Intro_Tutorial_Activity.class);
                startActivity(intent);
            }
        });
    }
}