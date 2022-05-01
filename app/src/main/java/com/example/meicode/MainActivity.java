package com.example.meicode;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView citiesList;
    Spinner langSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        citiesList = findViewById(R.id.citiesList);
        langSpinner = findViewById(R.id.langSpinner);

//        ArrayList<String> languages = new ArrayList<>();
//        languages.add("Java");
//        languages.add("Kotlin");
//        languages.add("Swift");
//        languages.add("Python");
//        languages.add("C/C++");
//        languages.add("Javascript");
//
//        ArrayAdapter<String> languagesAdapter = new ArrayAdapter<>(
//                this,
//                android.R.layout.simple_spinner_dropdown_item,
//                languages
//        );
//
//        langSpinner.setAdapter(languagesAdapter);
        langSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, langSpinner.getSelectedItem().toString() + " selected", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(MainActivity.this, "You changed your mind?", Toast.LENGTH_SHORT).show();
            }
        });

        ArrayList<String> cities = new ArrayList<>();
        cities.add("Lagos");
        cities.add("Abuja");
        cities.add("Ibadan");
        cities.add("Jos");
        cities.add("Ekiti");

        ArrayAdapter<String> citiesAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                cities
        );

        citiesList.setAdapter(citiesAdapter);
        citiesList.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, cities.get(i) + " Selected", Toast.LENGTH_SHORT).show();
            }
        });

    }

}