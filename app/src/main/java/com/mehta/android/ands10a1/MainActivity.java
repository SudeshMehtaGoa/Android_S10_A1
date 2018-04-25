package com.mehta.android.ands10a1;


import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.net.Uri;
import android.support.v4.app.FragmentTransaction;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {

    TextView txtValue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtValue = findViewById(R.id.txtMessage);

        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        calculatorFragment calcFragment=new calculatorFragment();
        fragmentTransaction.add(R.id.fragment_container, calcFragment);
        //fragmentTransaction.addToBackStack("FirstFragment");//No hardcoding should be done, Bad Practice
        //Do like this
        //fragmentTransaction.addToBackStack(FirstFragment.FIRST_FRAGMENT);
        fragmentTransaction.commit();
    }

    public void readValues(String strValue)
    {
        txtValue.setText("Value from Fragement : " + strValue);
    }
}
