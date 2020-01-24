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
        mAutoResizeEditText.setEnabled(true);
        mAutoResizeEditText.setFocusableInTouchMode(true);
        mAutoResizeEditText.setFocusable(true);
        mAutoResizeEditText.setEnableSizeCache(false);
        mAutoResizeEditText.setMovementMethod(null);
        // can be added after layout inflation; it doesn't have to be fixed
        // value
        mAutoResizeEditText.setMaxHeight(330);


    }
    @Override
    protected void onResume() {
        super.onResume();
        mAutoResizeEditText.setupUI(findViewById(R.id.textInputLayout),mAutoResizeEditText);

    }



}
