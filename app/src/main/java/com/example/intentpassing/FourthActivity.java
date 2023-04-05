package com.example.intentpassing;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class FourthActivity extends AppCompatActivity {

    RecyclerView rcViewContact;
    ArrayList<ContactModel> arrContacts = new ArrayList<>();
    FloatingActionButton btnDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        Intent fromThird = getIntent();
        String title = fromThird.getStringExtra("title");
        getSupportActionBar().setTitle(title);

        rcViewContact = findViewById(R.id.rcViewContact);
        rcViewContact.setLayoutManager(new LinearLayoutManager(this));
        btnDialog = findViewById(R.id.btnDialog);

        arrContacts.add(new ContactModel(R.drawable.a, "Avfbn gggh", "00887653"));
        arrContacts.add(new ContactModel(R.drawable.b, "Bggvv bbb", "00887653"));
        arrContacts.add(new ContactModel(R.drawable.c, "Ttjn ghghjj", "00887653"));
        arrContacts.add(new ContactModel(R.drawable.d, "Wffgg bjjj", "00887653"));
        arrContacts.add(new ContactModel(R.drawable.e, "Qrtgtgg vv", "00887653"));
        arrContacts.add(new ContactModel(R.drawable.f, "Xvvh iiij", "00887653"));
        arrContacts.add(new ContactModel(R.drawable.g, "Mnnb yyyy", "00887653"));
        arrContacts.add(new ContactModel(R.drawable.h, "Eeeee bbbb", "00887653"));
        arrContacts.add(new ContactModel(R.drawable.i, "IIIII nn", "00887653"));
        arrContacts.add(new ContactModel(R.drawable.j, "Qqqeeg vvv", "00887653"));
        arrContacts.add(new ContactModel(R.drawable.d, "Wffgg bjjj", "00887653"));
        arrContacts.add(new ContactModel(R.drawable.e, "Qrtgtgg vv", "00887653"));
        arrContacts.add(new ContactModel(R.drawable.f, "Xvvh iiij", "00887653"));
        arrContacts.add(new ContactModel(R.drawable.b, "Bggvv bbb", "00887653"));
        arrContacts.add(new ContactModel(R.drawable.c, "Ttjn ghghjj", "00887653"));
        arrContacts.add(new ContactModel(R.drawable.g, "Mnnb yyyy", "00887653"));
        arrContacts.add(new ContactModel(R.drawable.h, "Eeeee bbbb", "00887653"));
        arrContacts.add(new ContactModel(R.drawable.i, "IIIII nn", "00887653"));


        RecyclerContactAdapter adapter = new RecyclerContactAdapter(this, arrContacts);
        rcViewContact.setAdapter(adapter);


        btnDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog dialog = new Dialog(FourthActivity.this);
                dialog.setContentView(R.layout.add_update_lay);

                EditText edtName = dialog.findViewById(R.id.edtName);
                EditText edtNumber = dialog.findViewById(R.id.edtNumber);
                Button btnAction = dialog.findViewById(R.id.btnAction);

                btnAction.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String strName = edtName.getEditableText().toString().trim();
                        String strNumber = edtNumber.getEditableText().toString().trim();

                        if (strName.isEmpty()){
                            Toast.makeText(FourthActivity.this, "Please, Enter Contact Name!", Toast.LENGTH_SHORT).show();
                            return;
                        }

                        if (strNumber.isEmpty()){
                            Toast.makeText(FourthActivity.this, "Please, Enter Contact Number!", Toast.LENGTH_SHORT).show();
                            return;
                        }

                        arrContacts.add(new ContactModel(strName, strNumber));
                        adapter.notifyItemInserted(arrContacts.size()-1);
                        rcViewContact.scrollToPosition(arrContacts.size()-1);

                        dialog.dismiss();

                    }
                });


                dialog.show();
            }


        });




    }
}