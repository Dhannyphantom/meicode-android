package com.example.meicode;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    private Button snackBtn;
    private RelativeLayout parentLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        snackBtn = findViewById(R.id.snackBtn);
        parentLayout= findViewById(R.id.parentLayout);

        snackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showSnackbar();
            }
        });

    }

    private void showSnackbar () {
        Snackbar.make(parentLayout,"This is a snackbar", Snackbar.LENGTH_INDEFINITE)
                .setAction("Retry", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(MainActivity.this, "Retried", Toast.LENGTH_SHORT).show();
                    }
                })
                .setActionTextColor(Color.GREEN)
                .setTextColor(Color.MAGENTA)
                .setBackgroundTint(Color.CYAN)
                .show();
    }

}