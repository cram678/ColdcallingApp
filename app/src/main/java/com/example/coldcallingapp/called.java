package com.example.coldcallingapp;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class called extends AppCompatActivity {

    private String called_names;

    private static final String CALLED_LIST ="com.example.coldcallingapp.called_list";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_called);
        TextView tvId = (TextView) findViewById(R.id.called_value_view);
        called_names = getIntent().getStringExtra(CALLED_LIST);

        tvId.setText(called_names);
    }

    public static Intent newIntent(Context packageContext, String names_called) {
        Intent i = new Intent(packageContext, called.class);
        i.putExtra(CALLED_LIST, ""+names_called);
        return i;
    }


}