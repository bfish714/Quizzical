package com.example.quiznos;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class settings extends AppCompatActivity {

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    Intent home = new Intent(settings.this, MainActivity.class);
                    startActivity(home);
                    return true;
                case R.id.navigation_dashboard:
                    Intent list = new Intent(settings.this,listboard.class);
                    startActivity(list);
                    return true;
                case R.id.navigation_notifications:
                    Intent gear = new Intent(settings.this, settings.class);
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
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        setNavigationViewListner();

    }

}
