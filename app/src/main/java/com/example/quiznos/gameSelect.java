package com.example.quiznos;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.NavigationView;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class gameSelect extends AppCompatActivity {

    private TextView mTextMessage;


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    Intent home = new Intent(gameSelect.this, MainActivity.class);
                    startActivity(home);
                    return true;
                case R.id.navigation_dashboard:
                    Intent list = new Intent(gameSelect.this, listboard.class);
                    startActivity(list);
                    return true;
                case R.id.navigation_notifications:
                    Intent gear = new Intent(gameSelect.this, settings.class);
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
        setContentView(R.layout.gameselect);
        setNavigationViewListner();

        final Button game = findViewById(R.id.play_game);
        final Button inf = findViewById(R.id.infinite_play);


        game.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SubSwitch(v);
            }
        });
        inf.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                SubSwitch2(v);
            }
        });

    }

    private void SubSwitch(View v) {
        Intent intent = new Intent(this, subject.class);
        startActivity(intent);
    }
    private void SubSwitch2(View v) {
        Intent intent = new Intent(this, inf_play.class);
        startActivity(intent);
    }

}