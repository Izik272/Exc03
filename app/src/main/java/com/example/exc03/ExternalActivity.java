package com.example.exc03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ExternalActivity extends MasterActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_external);
    }
}