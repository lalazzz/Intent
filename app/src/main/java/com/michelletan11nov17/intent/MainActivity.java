package com.michelletan11nov17.intent;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import java.lang.annotation.Target;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v("Mia Tan", "MainActivity OnCreate!");
    }

    public void explicit(View view) {
        Toast.makeText(getApplicationContext(), "Explicit Intent", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(this, SecondActivity.class);
        startActivity(i);


    }

    public void implicit(View view) {
        Toast.makeText(getApplicationContext(), "Implicit Intent", Toast.LENGTH_SHORT).show();
        Intent j = new Intent(Intent.ACTION_VIEW, Uri.parse("http://google.com"));
        startActivity(j);
    }

    public void returndata(View view) {
        Toast.makeText(getApplicationContext(), "Return Data", Toast.LENGTH_SHORT).show();
        //to test the oncreate bundle will save those primitive data
        Intent k = new Intent(this, SecondActivity.class);
        k.putExtra("userid", "Michelle");
        k.putExtra("firsttime",true);
        k.putExtra("credit", 100);
        // startActivity(k);
        //To have the return data from the second activity, 3333 is the request code for second activity to handle at return2main
        startActivityForResult(k,3333); // A method for onActivityResults

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        if (requestCode== 3333 & resultCode == RESULT_OK){
            Toast.makeText(this, "Settings is:" + data.getStringExtra("settings"),Toast.LENGTH_SHORT).show();
            Toast.makeText(this, "Game Credit:" + data.getStringExtra("password"),Toast.LENGTH_SHORT).show();
        }


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

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v("Mia Tan", "MainActivity OnDestroy!");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v("Mia Tan", "MainActivity OnPause!");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.v("Mia Tan", "MainActivity OnRestart!");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v("Mia Tan", "MainActivity OnResume!");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v("Mia Tan", "MainActivity OnStart!");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v("Mia Tan", "MainActivity OnStop !");
    }
}
