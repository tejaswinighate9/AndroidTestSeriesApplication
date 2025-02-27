package com.example.mahima.demo1;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class FinalJava extends AppCompatActivity {
    Button ans1,ans2,ans3,ans4,b1,b2,b3;
    TextView score,question,timer;

    private  QuestionsJava mQuestions=new QuestionsJava();

    private String mAnswer;
    public  int mScore=0,mQuestionNumber=-1,i=1;
    private int mQuestionsLength=mQuestions.mQuestions.length;

    private static final long START_TIME_IN_MILLIS = 300000;
    private CountDownTimer mCountDownTimer;
    private long mTimeLeftInMillis = START_TIME_IN_MILLIS;
    private boolean mTimerRunning;

    String str2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);

        ans1=(Button) findViewById(R.id.ans1);
        ans2=(Button) findViewById(R.id.ans2);
        ans3=(Button) findViewById(R.id.ans3);
        ans4=(Button) findViewById(R.id.ans4);

        b1=(Button) findViewById(R.id.button1);
        b2=(Button) findViewById(R.id.button2);

        b3=(Button) findViewById(R.id.b3);

        question=(TextView) findViewById(R.id.question);
        timer=(TextView) findViewById(R.id.timer);


        startTimer();
        updateQuestion();

        ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),
                        "Option A",Toast.LENGTH_SHORT).show();
                if(i==1) {
                    if (ans1.getText() == mAnswer) {
                        mScore++;
                        i++;
                    }
                }
            }
        });


        ans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),
                        "Option B",Toast.LENGTH_SHORT).show();
                if(i==1) {
                    if (ans2.getText() == mAnswer) {
                        mScore++;
                        i++;
                    }
                }
            }
        });


        ans3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),
                        "Option C",Toast.LENGTH_SHORT).show();
                if(i==1) {
                    if (ans3.getText() == mAnswer) {
                        mScore++;
                        i++;
                    }
                }
            }
        });


        ans4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),
                        "Option D",Toast.LENGTH_SHORT).show();
                if(i==1) {
                    if (ans4.getText() == mAnswer)
                    {
                        mScore++;
                        i++;
                    }
                }
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                prevQuestion();
            }
        });


        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateQuestion();
            }
        });


        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                testOver();

            }
        });

    }

    private void updateQuestion()
    {
        if(mQuestionNumber<mQuestionsLength-1)
        {
            mQuestionNumber++;
            i=1;
            question.setText(mQuestions.getQuestion(mQuestionNumber));
            ans1.setText(mQuestions.getChoice1(mQuestionNumber));
            ans2.setText(mQuestions.getChoice2(mQuestionNumber));
            ans3.setText(mQuestions.getChoice3(mQuestionNumber));
            ans4.setText(mQuestions.getChoice4(mQuestionNumber));

            mAnswer = mQuestions.getCorrectAnswer(mQuestionNumber);
        }
        else
        {
            Toast.makeText(getApplicationContext(),
                    "Question Finished",Toast.LENGTH_SHORT).show();
        }

    }

    private void prevQuestion()
    {
        if(mQuestionNumber>0)
        {
            mQuestionNumber--;
            mScore--;

            i=1;
            question.setText(mQuestions.getQuestion(mQuestionNumber));
            ans1.setText(mQuestions.getChoice1(mQuestionNumber));
            ans2.setText(mQuestions.getChoice2(mQuestionNumber));
            ans3.setText(mQuestions.getChoice3(mQuestionNumber));
            ans4.setText(mQuestions.getChoice4(mQuestionNumber));

            mAnswer = mQuestions.getCorrectAnswer(mQuestionNumber);
        }
        else
        {
            Toast.makeText(getApplicationContext(),
                    "No Previous Question",Toast.LENGTH_SHORT).show();

        }

    }

    private void testOver()
    {
        AlertDialog.Builder alertDialogBuilder=new AlertDialog.Builder(FinalJava.this);
        alertDialogBuilder.setMessage("Test OVER! Your Score is "+ mScore+"/10 points")
                .setCancelable(false)
                .setPositiveButton("NEW TEST", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        startActivity(new Intent(getApplicationContext(),FinalJava.class));
                    }
                })

                .setNegativeButton("EXIT", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent=new Intent(FinalJava.this,Marks.class);

                        intent.putExtra("score",mScore);
                        startActivity(intent);
                    }
                });

        AlertDialog alertDialog=alertDialogBuilder.create();
        alertDialog.show();
    }

    private void startTimer() {
        mCountDownTimer = new CountDownTimer(mTimeLeftInMillis, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                mTimeLeftInMillis = millisUntilFinished;
                updateCountDownText();
            }

            @Override
            public void onFinish() {
                mTimerRunning = false;
            }
        }.start();

        mTimerRunning = true;
    }

    private void updateCountDownText() {
        int minutes = (int) (mTimeLeftInMillis / 1000) / 60;
        int seconds = (int) (mTimeLeftInMillis / 1000) % 60;

        String timeLeftFormatted = String.format(Locale.getDefault(), "Timer:%02d:%02d", minutes, seconds);

        timer.setText(timeLeftFormatted);

        str2="Timer:00:01";
        if(timer.getText().toString().equals("Timer:00:01") && str2.toString().equals("Timer:00:01"))
        {
            testOver();
        }
    }
}

