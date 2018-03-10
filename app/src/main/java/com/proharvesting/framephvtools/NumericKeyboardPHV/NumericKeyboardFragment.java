package com.proharvesting.framephvtools.NumericKeyboardPHV;


import android.app.Fragment;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.proharvesting.framephvtools.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class NumericKeyboardFragment extends Fragment implements View.OnClickListener {

    INumericKeyboardFragment iNumericKeyboardFragment;
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button btn9;
    Button btn0;
    Button btnBack;
    Button buttonKeyboardToggle;
    KeyboardNumeric KeyboardNumeric;

    public NumericKeyboardFragment() {
        // Required empty public constructor
    }

    public void setiNumericKeyboardFragment(INumericKeyboardFragment iNumericKeyboardFragment){
        this.iNumericKeyboardFragment = iNumericKeyboardFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_numeric_keyboard, container, false);
        KeyboardNumeric = new KeyboardNumeric(999);
        initComponents(view);
        return view;
    }
    private void initComponents(View view){
        btn1 = view.findViewById(R.id.btn1);
        btn2 = view.findViewById(R.id.btn2);
        btn3 = view.findViewById(R.id.btn3);
        btn4 = view.findViewById(R.id.btn4);
        btn5 = view.findViewById(R.id.btn5);
        btn6 = view.findViewById(R.id.btn6);
        btn7 = view.findViewById(R.id.btn7);
        btn8 = view.findViewById(R.id.btn8);
        btn9 = view.findViewById(R.id.btn9);
        btn0 = view.findViewById(R.id.btn0);
        btnBack = view.findViewById(R.id.btnBack);
        buttonKeyboardToggle = view.findViewById(R.id.buttonKeyboardToggle);
        initEvents();
    }

    private void initEvents(){
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btn0.setOnClickListener(this);
        btnBack.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view == btn1){
            setTotalValue(KeyboardNumeric.click1());
        }
        if(view == btn2){
            setTotalValue(KeyboardNumeric.click2());
        }
        if(view == btn3){
            setTotalValue(KeyboardNumeric.click3());
        }
        if(view == btn4){
            setTotalValue(KeyboardNumeric.click4());
        }
        if(view == btn5){
            setTotalValue(KeyboardNumeric.click5());
        }
        if(view == btn6){
            setTotalValue(KeyboardNumeric.click6());
        }
        if(view == btn7){
            setTotalValue(KeyboardNumeric.click7());
        }
        if(view == btn8){
            setTotalValue(KeyboardNumeric.click8());
        }
        if(view == btn9){
            setTotalValue(KeyboardNumeric.click9());
        }
        if(view == btn0){
            setTotalValue(KeyboardNumeric.click0());
        }
        if(view == btnBack){
            setTotalValue(KeyboardNumeric.clickBack());
        }
    }
    private void setTotalValue(double value){
        //textViewTotalSelected.setText(""+value);
        iNumericKeyboardFragment.setKeyboardValue(value);


    }
}
