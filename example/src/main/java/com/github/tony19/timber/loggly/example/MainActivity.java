package com.github.tony19.timber.loggly.example;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.tony19.timber.loggly.LogglyTree;

import timber.log.Timber;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Plant a LogglyTree for logging with Timber. Use tony19's demo
        // token for testing purposes only. Get your own token from
        // https://www.loggly.com/docs/customer-token-authentication-token/
        final String LOGGLY_TOKEN = "2538a019-900f-4532-b4b3-906e7f82d3e4";
        Timber.plant(new LogglyTree(LOGGLY_TOKEN));
        Timber.plant(new Timber.DebugTree());

        Timber.tag("timber-loggly demo");
        Timber.d("activity created");
        Timber.i("hello world!");
    }
}
