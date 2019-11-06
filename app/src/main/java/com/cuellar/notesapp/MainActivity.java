package com.cuellar.notesapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    EditText user1,pass1;
    Button bentrar, bregistrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user1=(EditText)findViewById(R.id.username_input);
        pass1=(EditText)findViewById(R.id.password_input);
        bentrar=(Button)findViewById(R.id.start1);
        bregistrar=(Button)findViewById(R.id.start2);
        bentrar.setOnClickListener(this);
        bregistrar.setOnClickListener(this);
    }


    public void onClick(View view){

        switch (view.getId()){
            case R.id.start1:
                String u= user1.getText().toString();
                String p=

                break;

            case R.id.start2:
                Intent i=new Intent(MainActivity.this, Registrar.class);
                startActivity(i);
                break;



        }


    }


}
