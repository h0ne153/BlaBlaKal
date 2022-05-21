package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public Button button ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button_reg);
        button.setOnClickListener(v -> open_reg());
        button = (Button) findViewById(R.id.button_enter);
        button.setOnClickListener(v -> open_enter());
    }
    public void open_reg(){
        Intent i = new Intent (this, RegActivity.class);
        startActivity(i);
    }
    public void open_enter(){
        Intent i = new Intent (this, EnterActivity.class);
        startActivity(i);
    }
}