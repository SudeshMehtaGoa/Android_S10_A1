package com.mehta.android.ands10a1;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class calculatorFragment extends Fragment {

    EditText txtValue;
    Button btnClick;
    public calculatorFragment(){

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_calculator, container, false);
        txtValue = (EditText) v.findViewById(R.id.txtValue);
        btnClick = (Button)v.findViewById(R.id.btnClick);

        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strValue = txtValue.getText().toString();
                MainActivity m = (MainActivity)getActivity();
                m.readValues(strValue);
            }
        });

        return v;
    }


}
