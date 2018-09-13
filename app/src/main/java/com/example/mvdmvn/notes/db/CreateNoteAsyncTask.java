package com.example.mvdmvn.notes.db;

import android.content.ContentValues;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.Toast;

import com.example.mvdmvn.notes.R;

import java.util.List;

public class CreateNoteAsyncTask extends AsyncTask<String, Void, Void> {
    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }


    @Override
    protected Void doInBackground(String... strings) {

//        for (String str : strings) {
//            Log.i("Array", str);
//        }
        for(int i = 0; i<= strings.length; i++){
           Log.i("Array", String.valueOf(strings));
        }
//
//            ContentValues contentValues = new ContentValues();
//            contentValues.put(NotesContract.Notes.COLUMN_TITLE, str[]);
//            contentValues.put(NotesContract.Notes.COLUMN_NOTE, strings(i+1));
//            contentValues.put(NotesContract.Notes.COLUMN_CREATED_TS, currentTime);
//            contentValues.put(NotesContract.Notes.COLUMN_UPDATED_TS, currentTime);
//            getContentResolver().insert(NotesContract.Notes.URI, contentValues);

        return null;
    }

//    @Override
//    protected void onPostExecute(Void result) {
//        super.onPostExecute(result);
//    }
}
