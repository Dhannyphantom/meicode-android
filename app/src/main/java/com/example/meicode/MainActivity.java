package com.example.meicode;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView contactsRecView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contactsRecView = findViewById(R.id.contactsRecView);

        ArrayList<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact("Daniel", "danny@gmail.com", "http://image.jph"));
        contacts.add(new Contact("Josh", "josh@gmail.com", "http://image.jph"));
        contacts.add(new Contact("Nicky", "nicky@gmail.com", "http://image.jph"));
        contacts.add(new Contact("Beck", "beck@gmail.com", "http://image.jph"));
        contacts.add(new Contact("Rebecca", "rebecca@gmail.com", "http://image.jph"));

        ContactRecViewAdapter contactRecViewAdapter = new ContactRecViewAdapter();
        contactRecViewAdapter.setContacts(contacts);

        contactsRecView.setAdapter(contactRecViewAdapter);
//        contactsRecView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        contactsRecView.setLayoutManager(new GridLayoutManager(this,2));
    }

}