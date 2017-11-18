package com.michelletan11nov17.intent;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.v("Mia Tan", "SecondActivity OnCreate !");

        // to get the bundle data
        Bundle extras = getIntent().getExtras();
        //Check to see the data retrieve anot
        if (extras !=null) {
            Toast.makeText(this, "Welcome Back " + extras.getString("userid"), Toast.LENGTH_SHORT).show();
            Toast.makeText(this, "Games Credit " + Integer.toString(extras.getInt("credit"),0), Toast.LENGTH_SHORT).show();
        }


    }  // End of OnCreate

    public void return2main(View view) {
        Toast.makeText(getApplicationContext(), "Back to Main", Toast.LENGTH_SHORT).show();
        finish();


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_second, menu);
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


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v("Mia Tan", "SecondActivity OnDestroy!");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v("Mia Tan", "SecondActivity OnPause!");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.v("Mia Tan", "SecondActivity OnRestart!");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v("Mia Tan", "SecondActivity OnResume!");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v("Mia Tan", "SecondActivity OnStart!");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v("Mia Tan", "SecondActivity OnStop !");
    }
}
