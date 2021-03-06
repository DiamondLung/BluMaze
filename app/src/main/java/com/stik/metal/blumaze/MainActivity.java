package com.stik.metal.blumaze;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
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
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Log.e("MainActivity", "this is from the main activity, hooray!");

        Log.e("MainActivity", "another comment out.");

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        final Button button = (Button) findViewById(R.id.buttonSend);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                EditText editSend = (EditText) findViewById(R.id.editSend);
                EditText traceOut = (EditText) findViewById(R.id.editTrace);
                traceOut.setText("click was pressed with text:\n" + editSend.getText());
            }
        });
    }

    public String getTextToSend() {
        EditText editSend = (EditText) findViewById(R.id.editSend);
        return editSend.getText().toString();
    }

    public void setTextReceived(String textReceived) {
        EditText editReceived = (EditText) findViewById(R.id.editReceive);
        editReceived.setText(textReceived);
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
}
