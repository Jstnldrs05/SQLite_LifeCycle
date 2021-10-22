package com.example.sqlite_lifecycle;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {


    Context context;
    private ArrayList _id, fr_name, fr_address, fr_age;


    CustomAdapter(Context context, ArrayList _id, ArrayList fr_name, ArrayList fr_address, ArrayList fr_age) {
            this.context = context;
            this._id = _id;
            this.fr_name = fr_name;
            this.fr_address = fr_address;
            this.fr_age = fr_age;


    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.my_row, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.friend_id_txt.setText(String.valueOf(_id.get(position)));
        holder.friend_name_txt.setText(String.valueOf(fr_name.get(position)));
        holder.friend_address_txt.setText(String.valueOf(fr_address.get(position)));
        holder.friend_age_txt.setText(String.valueOf(fr_age.get(position)));

    }

    @Override
    public int getItemCount() {
        return _id.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView friend_id_txt, friend_name_txt, friend_address_txt, friend_age_txt;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            friend_id_txt = itemView.findViewById(R.id.friend_id_txt);
            friend_name_txt = itemView.findViewById(R.id.friend_name_txt);
            friend_address_txt = itemView.findViewById(R.id.friend_address_txt);
            friend_age_txt = itemView.findViewById(R.id.friend_age_txt);
        }
    }
}
