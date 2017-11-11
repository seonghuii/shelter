package com.example.hee.shelter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by hee on 2017-11-11.
 */

public class SecondActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeButtonEnabled(true);


        TextView shName = (TextView)findViewById(R.id.shelterNameView2);
        TextView shLocation = (TextView)findViewById(R.id.shelterLocationView2);
        TextView shProvider = (TextView)findViewById(R.id.shelterProviderView2);
        ImageView shImage = (ImageView)findViewById(R.id.shelterImageView2);

        Intent intent = getIntent();
        shImage.setImageResource(intent.getIntExtra("image",0));
        shLocation.setText(intent.getStringExtra("location"));
        shName.setText(intent.getStringExtra("name"));
        shProvider.setText(intent.getStringExtra("provider"));



    }



}

