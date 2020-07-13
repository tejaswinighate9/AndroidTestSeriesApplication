package com.example.mahima.demo1;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Option extends AppCompatActivity{
    private TextView t1;
    private Button b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option);

        t1 = (TextView) findViewById(R.id.tv);
        b1=(Button)findViewById(R.id.b1);
        b2=(Button)findViewById(R.id.button4);

       /* b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });*/

        b1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent intent=getIntent();

                String str1=intent.getStringExtra("str1");

                if(str1.equals("C")){
                    openActivity2();
                }
                else if(str1.equals("C++")){
                    openActivity3();
                }
                else if(str1.equals("Python")){
                    openActivity4();
                }
                else if(str1.equals("Android")){
                    openActivity5();
                }
                else if(str1.equals("SQL")){
                    openActivity6();
                }
                else if(str1.equals("Java")){
                    openActivity7();
                }
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=getIntent();

                String str1=intent.getStringExtra("str1");

                if(str1.equals("C")){
                    openActivity2a();
                }
                else if(str1.equals("C++")){
                    openActivity3a();
                }
                else if(str1.equals("Python")){
                    openActivity4a();
                }
                else if(str1.equals("Android")){
                    openActivity5a();
                }
                else if(str1.equals("SQL")){
                    openActivity6a();
                }
                else if(str1.equals("Java")){
                    openActivity7a();
                }
            }
        });

    }

    public void openActivity2()
    {
        Intent intent=new Intent(Option.this,PracC.class);
        startActivity(intent);
    }

    public void openActivity3()
    {
        Intent intent=new Intent(Option.this,PracCpp.class);
        startActivity(intent);
    }

    public void openActivity4()
    {
        Intent intent=new Intent(Option.this,PracPython.class);
        startActivity(intent);
    }

    public void openActivity5()
    {
        Intent intent=new Intent(Option.this,PracAndroid.class);
        startActivity(intent);
    }

    public void openActivity6()
    {
        Intent intent=new Intent(Option.this,PracSQL.class);
        startActivity(intent);
    }

    public void openActivity7()
    {
        Intent intent=new Intent(Option.this,PracJava.class);
        startActivity(intent);
    }

    public void openActivity2a()
    {
        Intent intent=new Intent(Option.this,FinalC.class);
        startActivity(intent);
    }

    public void openActivity3a()
    {
        Intent intent=new Intent(Option.this,FinalCpp.class);
        startActivity(intent);
    }

    public void openActivity4a()
    {
        Intent intent=new Intent(Option.this,FinalPython.class);
        startActivity(intent);
    }

    public void openActivity5a()
    {
        Intent intent=new Intent(Option.this,FinalAndroid.class);
        startActivity(intent);
    }

    public void openActivity6a()
    {
        Intent intent=new Intent(Option.this,FinalSQL.class);
        startActivity(intent);
    }

    public void openActivity7a()
    {
        Intent intent=new Intent(Option.this,FinalJava.class);
        startActivity(intent);
    }

    public void onClick(View view) {
        finish();
    }

}
