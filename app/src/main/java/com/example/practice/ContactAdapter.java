package com.example.practice;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ViewHolder>{

    ArrayList<ContactsModel> arrContacts;
    Context context;

    ContactAdapter(Context context, ArrayList<ContactsModel> arrContacts){
        this.arrContacts = arrContacts;
        this.context = context;
    }

    @NonNull
    @Override
    public ContactAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.contacts_row, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ContactAdapter.ViewHolder holder,int position) {

        ContactsModel model = (ContactsModel) arrContacts.get(position);
        holder.imgContact.setImageResource(model.img);
        holder.tvName.setText(model.name);
        holder.tvNumber.setText(model.number);

        holder.llrow.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {

                Dialog dialog = new Dialog(context);
                dialog.setContentView(R.layout.add_update_lay);

                EditText edtName = dialog.findViewById(R.id.edtName);
                EditText edtNumber = dialog.findViewById(R.id.edtNumber);
                Button btnAction = dialog.findViewById(R.id.btnAction);
                TextView txtTitle = dialog.findViewById(R.id.txtTitle);

                txtTitle.setText("Update Contact");
                btnAction.setText("Update");

                edtName.setText(arrContacts.get(position).name);
                edtNumber.setText(arrContacts.get(position).number);

                btnAction.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String name = "", number = "";

                        if(!edtName.getText().toString().equals("")){
                            name = edtName.getText().toString();
                        }
                        else {
                            Toast.makeText(context, "Please, Enter Contact Name!", Toast.LENGTH_SHORT).show();
                        }

                        if(!edtNumber.getText().toString().equals("")){
                            name = edtNumber.getText().toString();
                        }
                        else {
                            Toast.makeText(context, "Please, Enter Contact Number!", Toast.LENGTH_SHORT).show();
                        }

                        arrContacts.set(position, new ContactsModel(name, number));
                        notifyItemChanged(position);

                        dialog.dismiss();

                    }
                });

                dialog.show();


            }
        });

    }

    @Override
    public int getItemCount() {
        return arrContacts.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imgContact;
        TextView tvName, tvNumber;
        LinearLayout llrow;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgContact = itemView.findViewById(R.id.imgContact);
            tvName = itemView.findViewById(R.id.tvName);
            tvNumber = itemView.findViewById(R.id.tvNumber);
            llrow = itemView.findViewById(R.id.llRow);
        }
    }
}
