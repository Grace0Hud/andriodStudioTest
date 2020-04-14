package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void backOnClick(View view)
    {
        Log.i("Info", "the back button was clicked");
        startActivity(new Intent(Main2Activity.this, MainActivity.class));
    }//end back on click
}
