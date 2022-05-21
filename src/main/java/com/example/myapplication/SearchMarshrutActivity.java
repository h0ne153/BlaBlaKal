package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

public class SearchMarshrutActivity extends AppCompatActivity {
    public ImageButton button ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_marshrut);

        button = (ImageButton) findViewById(R.id.imageButton_back_app);
        button.setOnClickListener(v -> back_app());
    }

    public void back_app(){
        Intent i = new Intent (this, AppActivity.class);
        startActivity(i);
    }
}