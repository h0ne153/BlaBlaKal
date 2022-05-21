package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

public class AppActivity extends AppCompatActivity {
    public ImageButton button_img;
    public Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app);

        button_img = (ImageButton) findViewById(R.id.imageButton_zoom);
        button_img.setOnClickListener(v -> open_app_zoom());
        button_img = (ImageButton) findViewById(R.id.imageButton_profile);
        button_img.setOnClickListener(v -> open_app_profile());
        button_img = (ImageButton) findViewById(R.id.imageButton_plus);
        button_img.setOnClickListener(v -> open_app_plus());
        button = (Button) findViewById(R.id.button_search);
        button.setOnClickListener(v -> open_search());
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
    public void open_search(){
        Intent i = new Intent (this, SearchMarshrutActivity.class);
        startActivity(i);
    }
}