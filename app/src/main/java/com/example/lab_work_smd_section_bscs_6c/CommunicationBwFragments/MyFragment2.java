package com.example.lab_work_smd_section_bscs_6c.CommunicationBwFragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.lab_work_smd_section_bscs_6c.R;

public class MyFragment2 extends Fragment {

    TextView textView;
    View view;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        return super.onCreateView(inflater, container, savedInstanceState);
        view = inflater.inflate(R.layout.fragmentonelayout, container, false);
        return view;
    }

    public void onFragmentInteraction(String Message) {
        textView = view.findViewById(R.id.fragmentonetextview);
        textView.setText(Message);
    }
}
