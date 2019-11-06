package com.cuellar.notesapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Registrar extends AppCompatActivity implements View.OnClickListener {
EditText us,pas,nom,em;
Button reg, can;
daoUsuario dao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar);
        us=(EditText)findViewById(R.id.user);
        nom=(EditText)findViewById(R.id.name);
        em =(EditText)findViewById(R.id.email);
        pas=(EditText)findViewById(R.id.pass2);

        reg=(Button)findViewById(R.id.registrar);
        reg.setOnClickListener(this);
        dao=new daoUsuario(this);



    }

    @Override
    public void onClick(View v) {

        switch(v.getId()){
            case R.id.registrar:
                Usuario u =new Usuario();
                u.setUsuariom(us.getText().toString());
                u.setNombre(nom.getText().toString());
                u.setCorreo(em.getText().toString());
                u.setPassword(pas.getText().toString());

                if(!u.isNull()){
                    Toast.makeText(this,"ERROR: Campos vacios",Toast.LENGTH_LONG).show();
                }else if(dao.insertUsuario(u)){
                    Toast.makeText(this,"Registro Exitoso",Toast.LENGTH_LONG).show();
                    Intent i=new Intent(Registrar.this, MainActivity.class);
                    startActivity(i);
                    break;
                }else{
                    Toast.makeText(this,"Usuario ya registrado!!",Toast.LENGTH_LONG).show();
                }

            break;


        }

    }
}
