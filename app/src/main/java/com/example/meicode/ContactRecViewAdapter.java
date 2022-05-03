package com.example.meicode;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ContactRecViewAdapter extends RecyclerView.Adapter<ContactRecViewAdapter.ViewHolder> {

    private ArrayList<Contact> contacts = new ArrayList<>();

    public ContactRecViewAdapter() {

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.contacts_list_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactRecViewAdapter.ViewHolder holder, int position) {
        holder.contactsName.setText(contacts.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return contacts.size();
    }

    public void setContacts(ArrayList<Contact> contacts) {
        this.contacts = contacts;
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
//        DECLARE CLASSES OF COMPONENTS THAT IS NEEDED IN THE VIEW
       private TextView contactsName;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            contactsName = itemView.findViewById(R.id.txtContactName);
        }
    }
}
