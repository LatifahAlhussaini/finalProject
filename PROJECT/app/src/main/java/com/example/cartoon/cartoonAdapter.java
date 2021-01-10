package com.example.cartoon;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;

public class cartoonAdapter extends RecyclerView.Adapter {

    ArrayList<CartooN> cArray;
    Context context;

    public cartoonAdapter(LinearLayout LL, LinearLayout ll, ArrayList<CartooN> cArray, Context context) {
        this.cArray = cArray;
        this.context = context;
    }

    public cartoonAdapter(ArrayList<CartooN> cArray, Context context) {
        this.cArray = cArray;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cartoon_list_item, parent, false);
        ViewHolder VH = new ViewHolder(v);
        return VH;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ((ViewHolder) holder).img.setImageResource(cArray.get(position).getImage());
        ((ViewHolder) holder).name.setText(cArray.get(position).getName());
        ((ViewHolder) holder).rating.setText(cArray.get(position).getRating() + "");
        ((ViewHolder) holder).view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(context, Details.class);
                i.putExtra("cartoon", cArray.get(position));
                context.startActivity(i);

            }
        });
    }

    @Override
    public int getItemCount() {
        return cArray.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        public ImageView img;
        public TextView name;
        public TextView rating;
        public View view;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            view = itemView;
            img = itemView.findViewById(R.id.image1);
            name = itemView.findViewById(R.id.textView_name);
            rating = itemView.findViewById(R.id.textView_rating);


        }
    }
}
