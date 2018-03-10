package com.proharvesting.framephvtools.Fragments;


import android.app.Fragment;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.proharvesting.framephvtools.NumericKeyboardPHV.INumericKeyboardFragment;
import com.proharvesting.framephvtools.NumericKeyboardPHV.NumericKeyboardFragment;
import com.proharvesting.framephvtools.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment implements INumericKeyboardFragment {

    TextView textViewTotalSelected;
    Button buttonKeyboardToggle;
    boolean toogleKeyboard;
    ViewGroup secondFragment;
    ViewGroup itemsFragment;

    public MainFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.fragment_main, container, false);
        initComponents(view);
        toogleKeyboard=false;
        NumericKeyboardFragment numericKeyboardFragment = new NumericKeyboardFragment();
        numericKeyboardFragment.setiNumericKeyboardFragment(this);
        getFragmentManager().beginTransaction().add(R.id.secondFragment,numericKeyboardFragment,"NumericKeyboardFragment")
                .commit();

        PackagingItemsFragment packagingItemsFragment =new PackagingItemsFragment();
        getFragmentManager().beginTransaction().add(R.id.itemsFragment,packagingItemsFragment,"PackagingItemsFragment")
                .commit();
        return view;
    }
    public void initComponents(View view){
        secondFragment = view.findViewById(R.id.secondFragment);
        itemsFragment = view.findViewById(R.id.itemsFragment);
        textViewTotalSelected = view.findViewById(R.id.textViewTotalSelected);
        buttonKeyboardToggle = view.findViewById(R.id.buttonKeyboardToggle);
        buttonKeyboardToggle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toogleKeyboard();
            }
        });
        secondFragment.setVisibility(View.GONE);

    }
    public void toogleKeyboard(){
        toogleKeyboard = !toogleKeyboard;
        if(toogleKeyboard){
            secondFragment.setVisibility(View.VISIBLE);
        }
        else{
            secondFragment.setVisibility(View.GONE);
        }

    }

    @Override
    public void setKeyboardValue(double value) {
        textViewTotalSelected.setText(""+value);
    }
}
