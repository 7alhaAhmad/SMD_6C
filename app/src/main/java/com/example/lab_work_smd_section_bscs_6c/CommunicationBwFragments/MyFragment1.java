package com.example.lab_work_smd_section_bscs_6c.CommunicationBwFragments;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.lab_work_smd_section_bscs_6c.R;

public class MyFragment1 extends Fragment {

    ButtonPressListener.onButtonPressListener buttonPressListener;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        return super.onCreateView(inflater, container, savedInstanceState);
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.fragmentonelayout, container, false);

        myFunction(root);

        return root;
    }

    private void myFunction(ViewGroup root) {
        TextView textView = root.findViewById(R.id.fragmentonetextview);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                textView.setText("Message from first Fragment");
                buttonPressListener.onButtonPressed("Message FROM FIRST ACTIVITY");
            }

        });
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        buttonPressListener = (ButtonPressListener.onButtonPressListener) getActivity();
    }
}
