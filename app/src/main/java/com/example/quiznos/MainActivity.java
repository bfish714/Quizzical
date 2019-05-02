package com.example.quiznos;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends Activity {
    // Splash screen timer
    private static int SPLASH_TIME_OUT = 3000;
    private TextView mTextMessage;


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    Intent home = new Intent(MainActivity.this, MainActivity.class);
                    startActivity(home);
                    return true;
                case R.id.navigation_dashboard:
                    Intent list = new Intent(MainActivity.this, listboard.class);
                    startActivity(list);
                    return true;
                case R.id.navigation_notifications:
                    Intent gear = new Intent(MainActivity.this, settings.class);
                    startActivity(gear);
                    return true;
            }
            return false;
        }
    };
    private void setNavigationViewListner() {
        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }
    public void run() {
        Intent i = new Intent(MainActivity.this,gameSelect.class);
        startActivity(i);
        finish();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        //run();
        new Handler().postDelayed(new Runnable() {

            /*
             * Showing splash screen with a timer. This will be useful when you
             * want to show case your app logo / company
             */

            @Override
            public void run() {
                Intent i = new Intent(MainActivity.this,gameSelect.class);
                startActivity(i);
                finish();
            }
        }, SPLASH_TIME_OUT);
    }

}