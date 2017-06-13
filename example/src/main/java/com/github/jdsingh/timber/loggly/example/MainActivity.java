package com.github.jdsingh.timber.loggly.example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.github.tony19.timber.loggly.LogglyTree;

import timber.log.Timber;

import static com.github.jdsingh.timber.loggly.example.BuildConfig.LOGGLY_TOKEN;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Plant a LogglyTree for logging with Timber.
        Timber.plant(new LogglyTree(LOGGLY_TOKEN));
        Timber.plant(new Timber.DebugTree());

        Timber.tag("timber-loggly");
        Timber.d("activity created");
        Timber.i("hello world!");
    }
}
