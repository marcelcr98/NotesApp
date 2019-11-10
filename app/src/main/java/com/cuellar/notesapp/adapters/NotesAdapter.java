package com.cuellar.notesapp.adapters;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class NotesAdapter extends RecyclerView.Adapter<NoteAdapter.ViewHolder> {

    private EditText inputNa;
    private EditText inputFull;
    private EditText inputEm;
    private EditText inputPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        inputNa = findViewById(R.id.inputName);
        inputFull = findViewById(R.id.inputFullname);
        inputEm = findViewById(R.id.inputEmail);
        inputPass= findViewById(R.id.inputPassword);
    }

    public void callRegister(View view) {

        String name = inputNa.getText().toString();
        String fullname = inputFull.getText().toString();
        String email = inputEm.getText().toString();
        String password = inputPass.getText().toString();

        if( name.isEmpty() || fullname.isEmpty() || email.isEmpty() || password.isEmpty()){
            Toast.makeText(this, "Complete todos los campos", Toast.LENGTH_SHORT).show();
            return;
        }

        UserRepository.create(name,fullname, email, password);
        Toast.makeText(this, fullname+" se ha registrado correctamente", Toast.LENGTH_SHORT).show();
        finish();

    }
}
