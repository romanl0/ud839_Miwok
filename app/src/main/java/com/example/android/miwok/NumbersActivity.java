package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("one", "lutti"));
        words.add(new Word("two", "otiiko"));
        words.add(new Word("three", "tolookosu"));
        words.add(new Word("four", "oyyisa"));
        words.add(new Word("five", "massokka"));
        words.add(new Word("six", "temmokka"));
        words.add(new Word("seven", "kenekaku"));
        words.add(new Word("eight", "kawinta"));
        words.add(new Word("nine", "wo’e"));
        words.add(new Word("ten", "na’aacha"));

        Log.v("NumbersActivity", "Word at index 0: " + words.get(0));
        Log.v("NumbersActivity", "Word at index 1: " + words.get(0));
        Log.v("NumbersActivity", "Word at index 2: " + words.get(0));
        Log.v("NumbersActivity", "Word at index 3: " + words.get(0));
        Log.v("NumbersActivity", "Word at index 4: " + words.get(0));
        Log.v("NumbersActivity", "Word at index 5: " + words.get(0));
        Log.v("NumbersActivity", "Word at index 6: " + words.get(0));
        Log.v("NumbersActivity", "Word at index 7: " + words.get(0));
        Log.v("NumbersActivity", "Word at index 8: " + words.get(0));
        Log.v("NumbersActivity", "Word at index 9: " + words.get(0));

        /*
        LinearLayout rootView = (LinearLayout) findViewById(R.id.rootVew);
         Primer ejercicio con Textview
        TextView wordView = new TextView(this);
        wordView.setText(words.get(0));
        rootView.addView(wordView);
        */

        /* Primer ejercicio con un bucle para crear los TextViews.
        for (int index = 0; index < words.size(); index+=1) {
            TextView t = new TextView(this);
            t.setText(words.get(index));
            rootView.addView(t);

        }
        */

        ArrayAdapter<Word> itemsAdapter = new ArrayAdapter<Word>(this, R.layout.list_item, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

    }
}
