package com.cuellar.notesapp.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.cuellar.notesapp.R;

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

                if( user.isEmpty()  || pass.isEmpty()){
                    Toast.makeText(this, "Complete todos los campos", Toast.LENGTH_SHORT).show();
                    return;
                }

                User usuario;

                usuario = UserRepository.Login(user,pass);

                break;

            case R.id.start2:
                Intent i=new Intent(MainActivity.this, Registrar.class);
                startActivity(i);
                break;



        }


    }


}
