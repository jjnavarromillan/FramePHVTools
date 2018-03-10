package com.proharvesting.framephvtools.Fragments;


import android.app.Fragment;
import android.os.Bundle;

import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

import com.proharvesting.framephvtools.R;

public class PackagingItemsFragment extends Fragment {

    Button buttonShowItems;
    EditText editTextItem;
    ViewGroup layoutItems;
    public PackagingItemsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_packaging_items, container, false);

        buttonShowItems = view.findViewById(R.id.buttonShowItems);
        editTextItem = view.findViewById(R.id.editTextItem);
        layoutItems = view.findViewById(R.id.layoutItems);
        buttonShowItems.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                execButtonShowItems();
            }
        });

        return view;
    }
    public void execButtonShowItems(){
        int max_by_line =6;
        layoutItems.removeAllViews();
        LinearLayout itemsContainer = new LinearLayout(getView().getContext());
        itemsContainer.setOrientation(LinearLayout.HORIZONTAL);

        int value =1;
        try {
            value = Integer.parseInt(editTextItem.getText().toString());
            if(value<=0){
                value=1;
            }
        }
        catch (Exception e){ }
        int row=1;
        int i=0;
        LinearLayout.LayoutParams params= new LinearLayout.
                LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.MATCH_PARENT);
        params.weight = 0.1f;
        for (i=1;i<=value;i++){

            Button button = new Button(getView().getContext());
            button.setText(""+i);
            button.setLayoutParams(params);
            itemsContainer.addView(button);
            if(i % max_by_line == 0 ){
                layoutItems.addView(itemsContainer);
                itemsContainer = new LinearLayout(getView().getContext());
                itemsContainer.setOrientation(LinearLayout.HORIZONTAL);
            }
        }
        if(i-1!=i % max_by_line){
            layoutItems.addView(itemsContainer);
        }

    }


}
