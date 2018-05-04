package com.example.o3ric.softwaretesting;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .show();
            }
        });

        Button btn1 = findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("hi", "Bye");
                TextInputEditText word = findViewById(R.id.textInput1);
                if(word.getText().toString().isEmpty()) {
                    Snackbar.make(view, "Please, type a word in the field!", Snackbar.LENGTH_LONG)
                            .show();
                } else {
                    boolean result = false;
                    try {
                        result = isPalindrome(word.getText().toString());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    if(result) {
                        Snackbar.make(view,"That's a palindrome!", Snackbar.LENGTH_LONG)
                                .show();
                    } else {
                        Snackbar.make(view,"Hey, that's not a palindrome!", Snackbar.LENGTH_LONG)
                                .show();
                    }

                }
            }

        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public boolean isPalindrome(String word) throws Exception {
        if (word.isEmpty()) throw new Exception();
        else if (new StringBuilder(word).reverse().toString().equals(word))
            return true;
        return false;
    }
}
