package com.example.expandedittext;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private AutoResizeEditText mAutoResizeEditText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mAutoResizeEditText = (AutoResizeEditText) findViewById(R.id.rET);



    }
    @Override
    protected void onResume() {
        super.onResume();
        mAutoResizeEditText.setupUI(findViewById(R.id.textInputLayout),mAutoResizeEditText);

    }



}
