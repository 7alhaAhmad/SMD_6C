package com.example.lab_work_smd_section_bscs_6c.Task03ListView;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.lab_work_smd_section_bscs_6c.R;

public class listViewAdapter extends ArrayAdapter<String> {
    Activity activity;
    String[] text;
    String[] textLikes;
    String[] textButton;
    int[] img;
    int[] dill;

    public listViewAdapter(@NonNull Activity activity, String[] text, String[] textLikes, String[] textButton, int[] img, int[] dill)
    {
        super(activity, R.layout.imgvewforlstvewt3, text);
        this.activity = activity;
        this.text = text;
        this.textLikes = textLikes;
        this.textButton = textButton;
        this.img = img;
        this.dill = dill;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
    {
        LayoutInflater layoutInflater = activity.getLayoutInflater();
        View viewHolder = layoutInflater.inflate(R.layout.imgvewforlstvewt3, null);

        TextView textViewCities, textViewLikes;
        ImageView imageViewCities, imageViewLikes;
        Button visitButton;

        textViewCities = viewHolder.findViewById(R.id.citynameonimg);
        textViewLikes = viewHolder.findViewById(R.id.likestxt);
        imageViewCities = viewHolder.findViewById(R.id.imgonlist);
        imageViewLikes = viewHolder.findViewById(R.id.dillimg);
        visitButton = viewHolder.findViewById(R.id.visitbutton);

        textViewCities.setText(text[position]);
        textViewLikes.setText(textLikes[position]);
        imageViewCities.setImageResource(img[position]);
        imageViewLikes.setImageResource(dill[position]);
        visitButton.setText(textButton[position]);


        return viewHolder;
    }

}
