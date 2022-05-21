package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

public class CreateMarshrutActivity extends AppCompatActivity {
    public Button button;
    public ImageButton button_img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_marshrut);

        button_img = (ImageButton) findViewById(R.id.imageButton_back_app);
        button_img.setOnClickListener(v -> back_app());
    }

    public void back_app(){
        Intent i = new Intent (this, MarshrutActivity.class);
        startActivity(i);
    }
}