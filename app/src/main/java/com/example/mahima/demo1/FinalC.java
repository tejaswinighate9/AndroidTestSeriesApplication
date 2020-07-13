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

public class FinalC extends AppCompatActivity {
    Button ans1,ans2,ans3,ans4,b1,b2,b3;
    TextView score,question,timer;

    private  Questions mQuestions=new Questions();

    private String mAnswer;
    public  int mScore=0,mQuestionNumber=-1,i=1,q,i2;
    private int mQuestionsLength=mQuestions.mQuestions.length;

    private static final long START_TIME_IN_MILLIS = 300000;
    private CountDownTimer mCountDownTimer;
    private long mTimeLeftInMillis = START_TIME_IN_MILLIS;
    private boolean mTimerRunning;

    String str1,str2;
    // Random r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);

        // r=new Random();


        ans1=(Button) findViewById(R.id.ans1);
        ans2=(Button) findViewById(R.id.ans2);
        ans3=(Button) findViewById(R.id.ans3);
        ans4=(Button) findViewById(R.id.ans4);

        b1=(Button) findViewById(R.id.button1);
        b2=(Button) findViewById(R.id.button2);

        b3=(Button) findViewById(R.id.b3);

       // score=(TextView) findViewById(R.id.score);
        question=(TextView) findViewById(R.id.question);
        timer=(TextView) findViewById(R.id.timer);

        //score.setText("Score:"+mScore);

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
                        /*score.setText("Score:" + mScore);
                        //updateQuestion();
                        Toast.makeText(getApplicationContext(),
                                "Correct",Toast.LENGTH_SHORT).show();*/
                    }
                   /* else
                    {
                        Toast.makeText(getApplicationContext(),
                                "Wrong",Toast.LENGTH_SHORT).show();
                    }*/
                }
                // else
                //{
                //  gameOver();
                //}
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
                        //score.setText("Score:" + mScore);
                        /*Toast.makeText(getApplicationContext(),
                                "Correct",Toast.LENGTH_SHORT).show();*/
                        // updateQuestion();
                    }
                   /* else
                    {
                        Toast.makeText(getApplicationContext(),
                                "Wrong",Toast.LENGTH_SHORT).show();
                    }*/
                }
                // else
                //{
                // gameOver();
                //}
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
                        //score.setText("Score:" + mScore);
                        //updateQuestion();
                        /*Toast.makeText(getApplicationContext(),
                                "Correct",Toast.LENGTH_SHORT).show();*/
                    }
                   /* else
                    {
                        Toast.makeText(getApplicationContext(),
                                "Wrong",Toast.LENGTH_SHORT).show();
                    }*/
                }
                /*else
                {
                    gameOver();
                }*/
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
                        //score.setText("Score:" + mScore);
                       // Toast.makeText(getApplicationContext(),
                           //     "Correct",Toast.LENGTH_SHORT).show();
                        //updateQuestion();
                    }
                    else
                    {
                        //Toast.makeText(getApplicationContext(),
                          //      "Wrong",Toast.LENGTH_SHORT).show();
                    }
                }
                /*else
                {
                    gameOver();
                }*/
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*if (ans1.getText()==mAnswer)
                {
                    mScore++;
                    score.setText("Score:"+mScore);
                    updateQuestion(r.nextInt(mQuestionsLength));
                }*/
                //else
                //{
                //   gameOver();
                //}
                prevQuestion();
            }
        });


        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              /*  if (ans2.getText()==mAnswer)
                {
                    mScore++;
                    score.setText("Score:"+mScore);
                    updateQuestion(r.nextInt(mQuestionsLength));
                }*/
                // else
                //{
                //  gameOver();
                //}
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
        //return mQuestionNumber;
    }

    private void prevQuestion()
    {
        if(mQuestionNumber>0)
        {
            mQuestionNumber--;
            mScore--;
            //score.setText("Score:" + mScore);
            i=1;
            question.setText(mQuestions.getQuestion(mQuestionNumber));
            ans1.setText(mQuestions.getChoice1(mQuestionNumber));
            ans2.setText(mQuestions.getChoice2(mQuestionNumber));
            ans3.setText(mQuestions.getChoice3(mQuestionNumber));
            ans4.setText(mQuestions.getChoice4(mQuestionNumber));

            mAnswer = mQuestions.getCorrectAnswer(mQuestionNumber);

            // mQuestionNumber++;
        }
        else
        {
            Toast.makeText(getApplicationContext(),
                    "No Previous Question",Toast.LENGTH_SHORT).show();
            //gameOver();
        }

        //  return i;

    }

    private void testOver()
    {
        AlertDialog.Builder alertDialogBuilder=new AlertDialog.Builder(FinalC.this);
        alertDialogBuilder.setMessage("Test OVER! Your Score is "+ mScore+"/10 points")
                .setCancelable(false)
                .setPositiveButton("NEW TEST", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        startActivity(new Intent(getApplicationContext(),FinalC.class));
                    }
                })

                .setNegativeButton("EXIT", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent=new Intent(FinalC.this,Marks.class);
                        //startActivity(new Intent(getApplicationContext(),Marks.class));
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
                // mButtonStartPause.setText("Start");
                //mButtonStartPause.setVisibility(View.INVISIBLE);
                //mButtonReset.setVisibility(View.VISIBLE);
            }
        }.start();

        mTimerRunning = true;
        // mButtonStartPause.setText("pause");
        //mButtonReset.setVisibility(View.INVISIBLE);
    }

    private void updateCountDownText() {
        int minutes = (int) (mTimeLeftInMillis / 1000) / 60;
        int seconds = (int) (mTimeLeftInMillis / 1000) % 60;

        String timeLeftFormatted = String.format(Locale.getDefault(), "Timer:%02d:%02d", minutes, seconds);

        timer.setText(timeLeftFormatted);
        // str=timer.getText().toString();
        str2="Timer:00:01";
        if(timer.getText().toString().equals("Timer:00:01") && str2.toString().equals("Timer:00:01"))
        {
            testOver();
        }
    }
}

