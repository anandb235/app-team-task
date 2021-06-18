package com.anand.appteaminterview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.myViewHolder>{

    ArrayList<Model> model;

    public Adapter(ArrayList<Model> model) {
        this.model = model;
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row,parent,false);
        return new myViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {
        holder.image.setImageResource(model.get(position).getImage());
        holder.time.setText(model.get(position).getTiming());
        holder.name.setText(model.get(position).getName());
        holder.address.setText(model.get(position).getAddress());
        holder.type.setText(model.get(position).getType());
        String rate = model.get(position).getRating();
        holder.rating.setText(rate);
        int rating = 1 + (int) Double.parseDouble(rate);
        if(rating == 5)
            holder.rating.setBackgroundResource(R.drawable.five_star);
        else if(rating == 4)
            holder.rating.setBackgroundResource(R.drawable.four_star);
        else if(rating == 3)
            holder.rating.setBackgroundResource(R.drawable.three_star);
        else if(rating == 2)
            holder.rating.setBackgroundResource(R.drawable.two_star);
        else
            holder.rating.setBackgroundResource(R.drawable.one_star);
    }

    @Override
    public int getItemCount() {
        return model.size();
    }

    class myViewHolder extends RecyclerView.ViewHolder {
        ImageView image;
        TextView time,name,address,type;
        TextView rating;

        public myViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.food_image);
            time = itemView.findViewById(R.id.timing);
            name = itemView.findViewById(R.id.rest_name);
            address = itemView.findViewById(R.id.address);
            type = itemView.findViewById(R.id.food_type);
            rating = itemView.findViewById(R.id.rating);
        }
    }
}