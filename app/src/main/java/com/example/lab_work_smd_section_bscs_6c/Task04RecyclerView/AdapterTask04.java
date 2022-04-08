package com.example.lab_work_smd_section_bscs_6c.Task04RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lab_work_smd_section_bscs_6c.R;

import java.util.ArrayList;

public class AdapterTask04 extends RecyclerView.Adapter<AdapterTask04.ViewHolder> {

    ArrayList<Task04WhatsappData> recycleList = new ArrayList<>();

    public AdapterTask04(ArrayList<Task04WhatsappData> recycleList) {
        this.recycleList = recycleList;
    }

    @NonNull
    @Override
    public AdapterTask04.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.task04layoutwhatsapp, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterTask04.ViewHolder holder, int position) {
        Task04WhatsappData data = recycleList.get(position);
        holder.UserName.setText(data.getName());
        holder.UserMessage.setText(data.getMessage());
        holder.UserPicture.setImageResource(data.getPicture());

    }

    @Override
    public int getItemCount() {
        return recycleList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView UserName;
        TextView UserMessage;
        ImageView UserPicture;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            UserName = itemView.findViewById(R.id.whatsappusername);
            UserMessage = itemView.findViewById(R.id.whatsappusermessage);
            UserPicture = itemView.findViewById(R.id.whatsappuserpicture);
        }
    }
}
