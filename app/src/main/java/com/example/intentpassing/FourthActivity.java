package com.example.intentpassing;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class FourthActivity extends AppCompatActivity {

    RecyclerView rcViewContact;
    ArrayList<ContactModel> contactModel = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        rcViewContact = findViewById(R.id.rcViewContact);

        Intent fromThird = getIntent();
        String title = fromThird.getStringExtra("title");
        getSupportActionBar().setTitle(title);

        rcViewContact.setLayoutManager(new LinearLayoutManager(this));

        contactModel.add(new ContactModel(R.drawable.a, "Avfbn gggh", "00887653"));
        contactModel.add(new ContactModel(R.drawable.b, "Bggvv bbb", "00887653"));
        contactModel.add(new ContactModel(R.drawable.c, "Ttjn ghghjj", "00887653"));
        contactModel.add(new ContactModel(R.drawable.d, "Wffgg bjjj", "00887653"));
        contactModel.add(new ContactModel(R.drawable.e, "Qrtgtgg vv", "00887653"));
        contactModel.add(new ContactModel(R.drawable.f, "Xvvh iiij", "00887653"));
        contactModel.add(new ContactModel(R.drawable.g, "Mnnb yyyy", "00887653"));
        contactModel.add(new ContactModel(R.drawable.h, "Eeeee bbbb", "00887653"));
        contactModel.add(new ContactModel(R.drawable.i, "IIIII nn", "00887653"));
        contactModel.add(new ContactModel(R.drawable.j, "Qqqeeg vvv", "00887653"));
        contactModel.add(new ContactModel(R.drawable.d, "Wffgg bjjj", "00887653"));
        contactModel.add(new ContactModel(R.drawable.e, "Qrtgtgg vv", "00887653"));
        contactModel.add(new ContactModel(R.drawable.f, "Xvvh iiij", "00887653"));
        contactModel.add(new ContactModel(R.drawable.b, "Bggvv bbb", "00887653"));
        contactModel.add(new ContactModel(R.drawable.c, "Ttjn ghghjj", "00887653"));
        contactModel.add(new ContactModel(R.drawable.g, "Mnnb yyyy", "00887653"));
        contactModel.add(new ContactModel(R.drawable.h, "Eeeee bbbb", "00887653"));
        contactModel.add(new ContactModel(R.drawable.i, "IIIII nn", "00887653"));




    }
}