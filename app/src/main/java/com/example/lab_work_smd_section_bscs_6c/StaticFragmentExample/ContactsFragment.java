package com.example.lab_work_smd_section_bscs_6c.StaticFragmentExample;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.ListFragment;

import com.example.lab_work_smd_section_bscs_6c.R;

public class ContactsFragment extends ListFragment {

    public ListSelectionListener mListener = null;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        mListener = (ListSelectionListener) getActivity();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        getListView().setChoiceMode(ListView.CHOICE_MODE_SINGLE);

        setListAdapter(new ArrayAdapter<String>(getActivity(), R.layout.contacttextview, MyContactsMainActivity.contactsArray));
    }

    @Override
    public void onListItemClick(@NonNull ListView l, @NonNull View v, int position, long id) {
//        super.onListItemClick(l, v, position, id);
        getListView().setItemChecked(position, true);
        mListener.onSelection(position);
    }

    public interface ListSelectionListener {
        void onSelection(int position);
    }
}