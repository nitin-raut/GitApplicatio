package com.example.nitinraut.gitapplicationdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.e("","");
           }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("","");
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onRestart() {
        super.onRestart();


    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
