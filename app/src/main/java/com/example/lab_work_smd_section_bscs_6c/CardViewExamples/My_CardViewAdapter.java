package com.example.lab_work_smd_section_bscs_6c.CardViewExamples;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.lab_work_smd_section_bscs_6c.R;

import java.util.List;

public class My_CardViewAdapter extends RecyclerView.Adapter<My_CardViewAdapter.ViewHolder> {
    Context context;
    List<My_Model> modelList;

    public My_CardViewAdapter(Context context, List<My_Model> modelList) {
        this.context = context;
        this.modelList = modelList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.my_card, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        My_Model my_model = modelList.get(position);
        holder.Name.setText(my_model.getName());
        holder.totalDownloads.setText(String.valueOf(my_model.getTotalDownloads()));
//        holder.thumbnail.setImageResource(my_model.getThumbnails());
        Glide.with(context).load(my_model.getThumbnails()).into(holder.thumbnails);
    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView Name;
        TextView totalDownloads;
        ImageView thumbnails;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            Name = itemView.findViewById(R.id.mycardtxt1);
            totalDownloads = itemView.findViewById(R.id.mycardtxt2);
            thumbnails = itemView.findViewById(R.id.mycardimageview);

        }
    }
}
