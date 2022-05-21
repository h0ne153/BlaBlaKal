package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class EnterActivity extends AppCompatActivity {public void open_app(){
    Intent i = new Intent (this, AppActivity.class);
    startActivity(i);
}
    public Button button ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter);

        button = (Button) findViewById(R.id.button_app);
        button.setOnClickListener(v -> open_app());
    }

}