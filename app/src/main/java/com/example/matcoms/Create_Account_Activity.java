package com.example.matcoms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class Create_Account_Activity extends AppCompatActivity {
LinearLayout linearLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creeare_count);
        linearLayout =findViewById(R.id.linear_layout7);
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Create_Account_Activity.this,Log_In_Activity.class);
                startActivity(intent);

            }
        });

    }
}