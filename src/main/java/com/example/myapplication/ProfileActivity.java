package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

public class ProfileActivity extends AppCompatActivity {
    private ImageButton button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        button = (ImageButton) findViewById(R.id.imageButton_zoom);
        button.setOnClickListener(v -> open_app_zoom());
        button = (ImageButton) findViewById(R.id.imageButton_profile);
        button.setOnClickListener(v -> open_app_profile());
        button = (ImageButton) findViewById(R.id.imageButton_plus);
        button.setOnClickListener(v -> open_app_plus());
    }
    public void open_app_zoom(){
        Intent i = new Intent (this, AppActivity.class);
        startActivity(i);
    }
    public void open_app_profile(){
        Intent i = new Intent (this, ProfileActivity.class);
        startActivity(i);
    }
    public void open_app_plus(){
        Intent i = new Intent (this, MarshrutActivity.class);
        startActivity(i);
    }
}