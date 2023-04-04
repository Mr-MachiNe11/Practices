package com.example.practice;

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
    public void onBindViewHolder(@NonNull ContactAdapter.ViewHolder holder, int position) {

        holder.imgContact.setImageResource(arrContacts.get(position).img);
        holder.tvName.setText(arrContacts.get(position).name);
        holder.tvNumber.setText(arrContacts.get(position).number);

        holder.llrow.setOnClickListener(new View.OnClickListener() {
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
                btnAction.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                    }
                });


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
