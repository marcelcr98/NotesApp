package com.cuellar.notesapp.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class ArchivedsFragment extends Fragment {
    private RecyclerView notList;

    public ArchivedsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_archiveds, container, false);
        notList = view.findViewById(R.id.notesList);
        notList.setLayoutManager(new LinearLayoutManager(getContext()));

        List<Note> notes = NoteRepository.listArchived();
        notList.setAdapter(new NoteAdapter(notes));

        return view;
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        NoteAdapter adapter = (NoteAdapter)notList.getAdapter();
        List<Note> notes = NoteRepository.listArchived();

        adapter.setNotes(notes);
        adapter.notifyDataSetChanged();
    }

}

