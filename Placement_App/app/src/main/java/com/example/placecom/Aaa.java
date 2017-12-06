package com.example.placecom;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class Aaa extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aaa);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_aaa, menu);
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



    public void hoho(View view)
    {

        String[] x= {"devshah.nmims@gmail.com, akashmehta.nmims@gmail.com"};
        Intent intent = new Intent(Intent.ACTION_SEND);

        intent.setType("message/rfc882");
        intent.putExtra(Intent.EXTRA_EMAIL, x);
        intent.putExtra(Intent.EXTRA_SUBJECT, "Hello Placement Season Starts... ");
        intent.putExtra(Intent.EXTRA_TEXT, "Start preparing !");

        startActivity(Intent.createChooser(intent, "Send Email"));
    }
}
