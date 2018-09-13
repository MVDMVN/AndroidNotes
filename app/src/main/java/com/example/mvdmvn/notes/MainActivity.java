package com.example.mvdmvn.notes;

import android.app.LoaderManager;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.CursorLoader;
import android.content.Intent;
import android.content.Loader;
import android.database.Cursor;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.example.mvdmvn.notes.db.NotesContract;
import com.example.mvdmvn.notes.ui.NotesAdapter;

public class MainActivity extends AppCompatActivity implements LoaderManager.LoaderCallbacks<Cursor>{

    private NotesAdapter notesAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.notes_rv);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        notesAdapter = new NotesAdapter(null);
        recyclerView.setAdapter(notesAdapter);


        getLoaderManager().initLoader(
                0, // Идентификатор загрузчика
                null, // Аргументы
                this // Callback для событий загрузчика
        );

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        findViewById(R.id.create_fab).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CreateNoteActivity.class);
                startActivity(intent);            }
        });

//        insert();
    }
//
//    private int i = 0;
//
//    private void insert() {
//        ContentResolver contentResolver = getContentResolver();
//
//        ContentValues contentValues = new ContentValues();
//
//        while (i<=10) {
//            contentValues.put(NotesContract.Notes.COLUMN_TITLE, "Заголовок заметки");
//            contentValues.put(NotesContract.Notes.COLUMN_NOTE, "Текст заметки");
//            contentValues.put(NotesContract.Notes.COLUMN_CREATED_TS, System.currentTimeMillis());
//            contentValues.put(NotesContract.Notes.COLUMN_UPDATED_TS, System.currentTimeMillis());
//            i++;
//
//        Uri uri = contentResolver.insert(NotesContract.Notes.URI, contentValues);
//        Log.i("Test", "URI: " + uri);
//    }
//}


    @Override
    public Loader<Cursor> onCreateLoader(int id, Bundle args) {
        return new CursorLoader(
                this,  // Контекст
                NotesContract.Notes.URI, // URI
                NotesContract.Notes.LIST_PROJECTION, // Столбцы
                null, // Параметры выборки
                null, // Аргументы выборки
                null // Сортировка по умолчанию
        );
    }

    @Override
    public void onLoadFinished(Loader<Cursor> loader, Cursor cursor) {
        Log.i("Test", "Load finished: " + cursor.getCount());


        notesAdapter.swapCursor(cursor);
    }

    @Override
    public void onLoaderReset(Loader<Cursor> loader) {

    }

}
