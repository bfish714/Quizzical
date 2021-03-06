package com.example.quiznos;


import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by acer on 06-Apr-16.
 */
public class QuestionActivity extends Activity {
    List<question> quesList;
    int score = 0;
    int qid = 0;
    int old_qid;
String subject = "";
    //String subject ;
    question currentQ;
    TextView txtQuestion, times;
    Button button1, button2, button3, button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Bundle b = getIntent().getExtras();
        int sub = b.getInt("sub");
        QuizHelper db = new QuizHelper(this); // my question bank class
        if(sub == 1 || sub == 6) {
            //qid = 1;
            quesList = db.getAllQuestions();// this will fetch all quetonall questions
        }
        else if(sub == 2) {
            qid = 21;
            old_qid = qid;
            quesList = db.getAllQuestions(); // this will fetch all quetonall questions
        }
        else if(sub == 3) {
            qid = 31;
            old_qid = qid;
            quesList = db.getAllQuestions(); // this will fetch all quetonall questions
        }
        else if(sub == 4) {
            qid = 41;
            old_qid = qid;
            quesList = db.getAllQuestions(); // this will fetch all quetonall questions
        }
        else if(sub == 5) {
            qid = 51;
            old_qid = qid;
            quesList = db.getAllQuestions(); // this will fetch all quetonall questions
        }


        //Collections.shuffle(quesList);
        currentQ = quesList.get(qid); // the current question
        txtQuestion = (TextView) findViewById(R.id.question);
// the textview in which the question will be displayed
// the three buttons,
// the idea is to set the text of three buttons with the options from question bank
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);

// the textview in which score will be displayed
        //scored = (TextView) findViewById(R.id.score);
// the timer
       // times = (TextView) findViewById(R.id.timers);
// method which will set the things up for our game
        setQuestionView();
        //times.setText("00:02:00");
// A timer of 60 seconds to play for, with an interval of 1 second (1000 milliseconds)
        //CounterClass timer = new CounterClass(60000, 1000);
       // timer.start();
// button click listeners
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
// passing the button text to other method
// to check whether the anser is correct or not
// same for all three buttons
                getAnswer(button1.getText().toString());
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getAnswer(button2.getText().toString());
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getAnswer(button3.getText().toString());
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getAnswer(button4.getText().toString());
            }
        });
    }
    public void getAnswer(String AnswerString) {
        if (currentQ.getANSWER().equals(AnswerString)) {
// if conditions matches increase the int (score) by 1
// and set the text of the score view
            score++;
           // scored.setText("Score : " + score);
        }
        if (old_qid + 10 > qid ) {
// if questions are not over then do this
            currentQ = quesList.get(qid);
            setQuestionView();
        } else {
// if over do this
            Intent intent = new Intent(QuestionActivity.this,
                    ResultActivity.class);
            Bundle b = new Bundle();
            b.putInt("score", score); // Your score
            intent.putExtras(b); // Put your score to your next
            startActivity(intent);
            finish();
        }
    }
    @TargetApi(Build.VERSION_CODES.GINGERBREAD)
    @SuppressLint("NewApi")
    public class CounterClass extends CountDownTimer {
        public CounterClass(long millisInFuture, long countDownInterval) {
            super(millisInFuture, countDownInterval);
// TODO Auto-generated constructor stub
        }
        @Override
        public void onFinish() {
            times.setText("Time is up");
            Intent intent = new Intent(QuestionActivity.this,
                    ResultActivity.class);
            Bundle b = new Bundle();
            b.putInt("score", score); // Your score
            intent.putExtras(b); // Put your score to your next
            Bundle c = new Bundle();
            b.putInt("qid", qid); // Your score
            intent.putExtras(c);
            startActivity(intent);
            finish();
        }
        @Override
        public void onTick(long millisUntilFinished) {
// TODO Auto-generated method stub
            long millis = millisUntilFinished;
            String hms = String.format(
                    "%02d:%02d:%02d",
                    TimeUnit.MILLISECONDS.toHours(millis),
                    TimeUnit.MILLISECONDS.toMinutes(millis)
                            - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS
                            .toHours(millis)),
                    TimeUnit.MILLISECONDS.toSeconds(millis)
                            - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS
                            .toMinutes(millis)));
            System.out.println(hms);
            times.setText(hms);
        }
    }
    private void setQuestionView() {
// the method which will put all things together
        txtQuestion.setText(currentQ.getQUESTION());
        button1.setText(currentQ.getopt1());
        button2.setText(currentQ.getopt2());
        button3.setText(currentQ.getopt3());
        button4.setText(currentQ.getopt4());

        qid++;
    }
}