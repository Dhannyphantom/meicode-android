package com.example.meicode;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
   private TextView txtMessage;
   private EditText edtTxtName;
    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnSubmit:
                handleSubmit(view);
                break;
            case R.id.edTxtName:
                Toast.makeText(this, "Input focused", Toast.LENGTH_SHORT).show();
            default:
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button submitBtn = findViewById(R.id.btnSubmit);
        txtMessage = findViewById(R.id.txtMessage);
        edtTxtName = findViewById(R.id.edTxtName);

        edtTxtName.setOnClickListener(this);
        submitBtn.setOnClickListener(this);

    }

    public void handleSubmit (View v) {
        txtMessage.setText(edtTxtName.getText().toString());
    }

}