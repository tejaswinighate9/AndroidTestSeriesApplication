package com.example.mahima.demo1;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class OnLog extends AppCompatActivity{
    private TextView t1;
    private Button b1,b2,b3,b4,b5,b6,logout;
    public String str;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_onlog);

            t1 = (TextView) findViewById(R.id.tv);
        b1=(Button)findViewById(R.id.b1);
        b2=(Button)findViewById(R.id.b2);
        b3=(Button)findViewById(R.id.b3);
        b4=(Button)findViewById(R.id.b4);
        b5=(Button)findViewById(R.id.b5);
        b6=(Button)findViewById(R.id.b6);
        logout=(Button)findViewById(R.id.logout);

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(OnLog.this,MainActivity.class);
                startActivity(intent);
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity2();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity3();
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity4();
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity5();
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity6();
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity7();
            }
        });


    }

    public void openActivity2()
    {
        Intent intent=new Intent(OnLog.this,Option.class);
        str="C";
        intent.putExtra("str1",str);

        startActivity(intent);
    }

    public void openActivity3()
    {
        Intent intent=new Intent(OnLog.this,Option.class);
        str="C++";
        intent.putExtra("str1",str);
        startActivity(intent);
    }

    public void openActivity4()
    {
        Intent intent=new Intent(OnLog.this,Option.class);
        str="Python";
        intent.putExtra("str1",str);
        startActivity(intent);
    }

    public void openActivity5()
    {
        Intent intent=new Intent(OnLog.this,Option.class);
        str="Android";
        intent.putExtra("str1",str);
        startActivity(intent);
    }

    public void openActivity6()
    {
        Intent intent=new Intent(OnLog.this,Option.class);
        str="SQL";
        intent.putExtra("str1",str);
        startActivity(intent);
    }

    public void openActivity7()
    {
        Intent intent=new Intent(OnLog.this,Option.class);
        str="Java";
        intent.putExtra("str1",str);
        startActivity(intent);
    }

    public void onClick(View view) {
       finish();
    }

    public void onBackPressed(){

        final AlertDialog.Builder builder=new AlertDialog.Builder(OnLog.this);
        builder.setMessage("Do you want to exit from app?");
        builder.setCancelable(true);
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Intent intent=new Intent(OnLog.this,MainActivity.class);
                startActivity(intent);
                dialogInterface.cancel();
            }
        });
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finishAffinity();
                finish();
            }
        });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

}
