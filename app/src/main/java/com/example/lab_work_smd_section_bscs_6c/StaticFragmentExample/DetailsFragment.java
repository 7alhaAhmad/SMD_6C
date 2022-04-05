package com.example.lab_work_smd_section_bscs_6c.StaticFragmentExample;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.lab_work_smd_section_bscs_6c.R;

public class DetailsFragment extends Fragment {

    TextView textView;
    int currentIndex = -1;
    int arrayLengthVar;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        return super.onCreateView(inflater, container, savedInstanceState);
        return inflater.inflate(R.layout.contactsdetails, container, false);
    }

    public int getShownIndex() {
        return currentIndex;
    }

    public void ContactIndex(int position) {
        if (position < 0 || position > arrayLengthVar) {
            return;
        }
        currentIndex = position;
        textView.setText(MyContactsMainActivity.contactsDetailsArray[position]);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        textView = getActivity().findViewById(R.id.contactdetailtextview);
        arrayLengthVar = MyContactsMainActivity.contactsDetailsArray.length;
    }
}
