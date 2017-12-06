package com.example.placecom;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class Home extends ActionBarActivity {
String x ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Intent i = getIntent();
        x = i.getExtras().getString("abcd");

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_home, menu);
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


    public void not(View view)
    {
        Intent i = new Intent(this,Notices.class);
        startActivity(i);
    }


    public void rec(View view)
    {
        Intent i = new Intent(this,Xyz.class);
        startActivity(i);
    }

    public void bang(View view)
    {
        Intent i = new Intent(this,Defaulter.class);
        startActivity(i);
    }



    public void tot(View view)
    {
        Intent i = new Intent(this,Form.class);
        i.putExtra("abcd", x);
        startActivity(i);
    }



    public void len(View view)
    {
        Intent i = new Intent(this,Rules.class);
        startActivity(i);
    }



    public void alloca(View view)
    {
        Intent i = new Intent(this,Alloc.class);
        startActivity(i);
    }

    public void animal(View view)
    {
     String y = "123456";
    if (x.equals(y))
    {
        Intent i = new Intent(this,Modify.class);
        startActivity(i);
    }
    else
    {Toast.makeText(view.getContext(), "Admin only", 2000).show();}
}

    public void ata(View view)
    {
        Intent i= new Intent(this,Calendar.class);
        startActivity(i);


    }

}
