package com.example.quiznos;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class subject extends AppCompatActivity {

    private TextView mTextMessage;
    public String subject ="";

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    Intent home = new Intent(subject.this, MainActivity.class);
                    startActivity(home);
                    return true;
                case R.id.navigation_dashboard:
                    Intent list = new Intent(subject.this, listboard.class);
                    startActivity(list);
                    return true;
                case R.id.navigation_notifications:
                    Intent gear = new Intent(subject.this, settings.class);
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
        setContentView(R.layout.subject_select);
        setNavigationViewListner();

        final Button history = findViewById(R.id.history);
        final Button math = findViewById(R.id.math);
        final Button geography = findViewById(R.id.geography);
        final Button pop = findViewById(R.id.pop);
        final Button science = findViewById(R.id.science);
        final Button all = findViewById(R.id.all);



        history.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { SubSwitchHistory(v);
            }
        });
        math.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                SubSwitchMath(v);
            }
        });
        geography.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { SubSwitchGeo(v);
            }
        });
        pop.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                SubSwitchPop(v);
            }
        });
        science.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { SubSwitchSci(v);
            }
        });
        all.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                SubSwitchAll(v);
            }
        });
    }
    private void SubSwitchMath(View v) {
        Intent intent = new Intent(this, QuestionActivity.class);
        Bundle b = new Bundle();
        b.putInt("sub", 1); // Your score
        intent.putExtras(b);
        startActivity(intent);
        finish();
    }
    private void SubSwitchHistory(View v) {
        Intent intent = new Intent(this, QuestionActivity.class);
        Bundle b = new Bundle();
        b.putInt("sub", 2); // Your score
        intent.putExtras(b);
        startActivity(intent);
        finish();
    }

    private void SubSwitchGeo(View v) {
        Intent intent = new Intent(this, QuestionActivity.class);
        Bundle b = new Bundle();
        b.putInt("sub", 3); // Your score
        intent.putExtras(b);
        startActivity(intent);
        finish();
    }
    private void SubSwitchPop(View v) {
        Intent intent = new Intent(this, QuestionActivity.class);
        Bundle b = new Bundle();
        b.putInt("sub", 4); // Your score
        intent.putExtras(b);
        startActivity(intent);
        finish();
    }
    private void SubSwitchSci(View v) {
        Intent intent = new Intent(this, QuestionActivity.class);
        Bundle b = new Bundle();
        b.putInt("sub", 5); // Your score
        intent.putExtras(b);
        startActivity(intent);
        finish();
    }
    private void SubSwitchAll(View v) {
        Intent intent = new Intent(this, QuestionActivity.class);
        Bundle b = new Bundle();
        b.putInt("sub", 6); // Your score
        intent.putExtras(b);
        startActivity(intent);
        finish();
    }
}
