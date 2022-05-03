package com.example.meicode;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.card.MaterialCardView;

public class MainActivity extends AppCompatActivity {

    private MaterialCardView cdUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cdUser = findViewById(R.id.cdUser);
        cdUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Clicked", Toast.LENGTH_LONG).show();
            }
        });

    }

}