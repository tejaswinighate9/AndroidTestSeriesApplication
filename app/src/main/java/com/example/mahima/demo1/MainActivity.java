

        package com.example.mahima.demo1;

        import android.content.DialogInterface;
        import android.content.Intent;
        import android.support.v7.app.AlertDialog;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.Menu;
        import android.view.MenuItem;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.Toast;


        public class MainActivity extends AppCompatActivity {

            EditText ed1, ed2;
            Button b1,b2;
            String login_name,login_pass;

            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);
                ed1 = (EditText)findViewById(R.id.editText1);
                ed2 = (EditText)findViewById(R.id.editText2);

                b1 = (Button) findViewById(R.id.button1);
                b2 = (Button) findViewById(R.id.button2);


                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                                OnLogin(v);
                        }
                   // }
                });

                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        OpenReg(v);
                    }
                    // }
                });

            }

            public void OnLogin(View view) {
                String username = ed1.getText().toString();
                String password = ed2.getText().toString();
                String type = "login";
                BackgroundWorker backgroundWorker = new BackgroundWorker(this);
                backgroundWorker.execute(type, username, password);

                startActivity(new Intent(MainActivity.this,OnLog.class));
            }


            public void OpenReg(View view) {
                startActivity(new Intent(MainActivity.this,Register.class));
            }

            public void onBackPressed(){

                final AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
                builder.setMessage("Do you want to exit from app?");
                builder.setCancelable(true);
                builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent=new Intent(MainActivity.this,MainActivity.class);
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
