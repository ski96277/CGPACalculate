package com.example.imran.cgpacalculate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class seeallcredit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seeallcredit);
    }
    //Add menu bar
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }// menu bar add complete

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.about:
//                Intent intent = new Intent(MainActivity.this,);
                break;

            case R.id.help:

//                Intent intent2 = new Intent(MainActivity.this,);
                break;

        }
        return super.onOptionsItemSelected(item);
    }
}
