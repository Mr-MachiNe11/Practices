package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<ContactsModel> arrContacts = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        arrContacts.add(new ContactsModel(R.drawable.a, "A", "344534665"));
        arrContacts.add(new ContactsModel(R.drawable.b, "B", "344534665"));
        arrContacts.add(new ContactsModel(R.drawable.c, "C", "344534665"));
        arrContacts.add(new ContactsModel(R.drawable.d, "D", "344534665"));
        arrContacts.add(new ContactsModel(R.drawable.e, "E", "344534665"));
        arrContacts.add(new ContactsModel(R.drawable.f, "F", "344534665"));
        arrContacts.add(new ContactsModel(R.drawable.g, "G", "344534665"));
        arrContacts.add(new ContactsModel(R.drawable.h, "H", "344534665"));
        arrContacts.add(new ContactsModel(R.drawable.i, "I", "344534665"));
        arrContacts.add(new ContactsModel(R.drawable.j, "J", "344534665"));
        arrContacts.add(new ContactsModel(R.drawable.k, "K", "344534665"));
        arrContacts.add(new ContactsModel(R.drawable.l, "L", "344534665"));
        arrContacts.add(new ContactsModel(R.drawable.a, "A", "344534665"));
        arrContacts.add(new ContactsModel(R.drawable.b, "B", "344534665"));
        arrContacts.add(new ContactsModel(R.drawable.c, "C", "344534665"));
        arrContacts.add(new ContactsModel(R.drawable.d, "D", "344534665"));
        arrContacts.add(new ContactsModel(R.drawable.e, "E", "344534665"));
        arrContacts.add(new ContactsModel(R.drawable.f, "F", "344534665"));
        arrContacts.add(new ContactsModel(R.drawable.g, "G", "344534665"));
        arrContacts.add(new ContactsModel(R.drawable.h, "H", "344534665"));
        arrContacts.add(new ContactsModel(R.drawable.i, "I", "344534665"));
        arrContacts.add(new ContactsModel(R.drawable.j, "J", "344534665"));
        arrContacts.add(new ContactsModel(R.drawable.k, "K", "344534665"));
        arrContacts.add(new ContactsModel(R.drawable.l, "L", "344534665"));


        ContactAdapter adapter = new ContactAdapter(this, arrContacts);
        recyclerView.setAdapter(adapter);



    }
}