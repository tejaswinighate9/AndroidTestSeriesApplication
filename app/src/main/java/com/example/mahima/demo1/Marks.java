package com.example.mahima.demo1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/*public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}*/

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class Marks extends AppCompatActivity  {
    Button b1;

    TextView tx1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marks);

        b1 = (Button)findViewById(R.id.b1);

        tx1 = (TextView)findViewById(R.id.tx1);
        tx1.setVisibility(View.GONE);


        Intent intent=getIntent();
        int score=intent.getIntExtra("score",0);

        tx1.setVisibility(View.VISIBLE);
        tx1.setBackgroundColor(Color.RED);

        tx1.setText(""+score);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Marks.this,OnLog.class);
                startActivity(intent);
            }
        });
    }
}
