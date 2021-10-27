package com.example.coldcallingapp;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class uncalled extends AppCompatActivity {

    private String uncalled_names;

    private static final String UNCALLED_LIST ="com.example.coldcallingapp.uncalled_list";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uncalled);
        TextView tvId = (TextView) findViewById(R.id.uncalled_value_view);
        uncalled_names = getIntent().getStringExtra(UNCALLED_LIST);

        tvId.setText(uncalled_names);
    }

    public static Intent newIntent(Context packageContext, String names_uncalled) {
        Intent i = new Intent(packageContext, uncalled.class);
        i.putExtra(UNCALLED_LIST, ""+names_uncalled);
        return i;
    }


}