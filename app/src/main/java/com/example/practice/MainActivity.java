package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    FloatingActionButton btnDialog;
    ArrayList<ContactsModel> arrContacts = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        btnDialog = findViewById(R.id.btnDialog);

        arrContacts.add(new ContactsModel("A", "344534665"));
        arrContacts.add(new ContactsModel( "B", "344534665"));
        arrContacts.add(new ContactsModel( "C", "344534665"));
        arrContacts.add(new ContactsModel("D", "344534665"));
        arrContacts.add(new ContactsModel( "E", "344534665"));
        arrContacts.add(new ContactsModel( "F", "344534665"));
        arrContacts.add(new ContactsModel( "G", "344534665"));
        arrContacts.add(new ContactsModel( "H", "344534665"));
        arrContacts.add(new ContactsModel( "I", "344534665"));
        arrContacts.add(new ContactsModel("J", "344534665"));
        arrContacts.add(new ContactsModel( "K", "344534665"));
        arrContacts.add(new ContactsModel( "L", "344534665"));
        arrContacts.add(new ContactsModel( "A", "344534665"));
        arrContacts.add(new ContactsModel( "B", "344534665"));
        arrContacts.add(new ContactsModel("C", "344534665"));
        arrContacts.add(new ContactsModel( "D", "344534665"));
        arrContacts.add(new ContactsModel( "E", "344534665"));
        arrContacts.add(new ContactsModel( "F", "344534665"));
        arrContacts.add(new ContactsModel( "C", "344534665"));
        arrContacts.add(new ContactsModel( "D", "344534665"));
        arrContacts.add(new ContactsModel( "E", "344534665"));
        arrContacts.add(new ContactsModel( "F", "344534665"));


        ContactAdapter adapter = new ContactAdapter(this, arrContacts);
        recyclerView.setAdapter(adapter);

        btnDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Dialog dialog = new Dialog(MainActivity.this);
                dialog.setContentView(R.layout.add_update_lay);

                EditText edtName, edtNumber;
                Button btnAction;

                edtName = dialog.findViewById(R.id.edtName);
                edtNumber = dialog.findViewById(R.id.edtNumber);
                btnAction = dialog.findViewById(R.id.btnAction);

                btnAction.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String name = "", number = "";

                        if(!edtName.getText().toString().equals("")){
                            name = edtName.getText().toString();
                        }
                        else {
                            Toast.makeText(MainActivity.this, "Please, Enter Contact Name!", Toast.LENGTH_SHORT).show();
                        }

                        if(!edtNumber.getText().toString().equals("")){
                            name = edtNumber.getText().toString();
                        }
                        else {
                            Toast.makeText(MainActivity.this, "Please, Enter Contact Number!", Toast.LENGTH_SHORT).show();
                        }

                        arrContacts.add(new ContactsModel(name, number));
                        adapter.notifyItemInserted(arrContacts.size()-1);
                        recyclerView.scrollToPosition(arrContacts.size()-1);


                        dialog.dismiss();

                    }
                });

                dialog.show();




            }
        });



    }
}