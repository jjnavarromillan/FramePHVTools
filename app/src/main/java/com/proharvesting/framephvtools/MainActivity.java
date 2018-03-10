package com.proharvesting.framephvtools;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.proharvesting.framephvtools.Fragments.MainFragment;
import com.proharvesting.framephvtools.NumericKeyboardPHV.INumericKeyboardFragment;

public class MainActivity extends Activity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MainFragment mainFragment = new MainFragment();


        getFragmentManager().beginTransaction()
                .add(R.id.MainLayout,mainFragment,"MainFragment").commit();

    }




}
