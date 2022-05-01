package com.example.meicode;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ProgressBar;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox checkBoxHarry, checkBoxJoker, checkBoxMatrix;
    RadioGroup radioGender;
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBoxHarry = findViewById(R.id.checkboxHarryporter);
        radioGender = findViewById(R.id.rgGender);
        progressBar = findViewById(R.id.progressBar);

        Thread progressThread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    progressBar.incrementProgressBy(10);
                    SystemClock.sleep(600);
                }
            }
        });
        progressThread.start();

        radioGender.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @SuppressLint("NonConstantResourceId")
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i) {
                    case R.id.rbMale:
                        progressBar.setVisibility(View.VISIBLE);
                        break;
                    case R.id.rbFemale:
                        progressBar.setVisibility(View.GONE);
                        break;
                    case R.id.rbOther:
                        Toast.makeText(MainActivity.this, "What the heck are you!", Toast.LENGTH_SHORT).show();
                        break;
                    default:
                        break;
                }
            }
        });
        checkBoxHarry.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    Toast.makeText(MainActivity.this, "Watched", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Not watched", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }


}