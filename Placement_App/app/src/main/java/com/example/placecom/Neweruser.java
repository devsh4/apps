package com.example.placecom;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.app.Activity;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class Neweruser extends ActionBarActivity {
    SQLiteDatabase db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_neweruser);
        Button btn = (Button)findViewById(R.id.Reghere);
        try
        {
            db = openOrCreateDatabase("DB", SQLiteDatabase.CREATE_IF_NECESSARY, null);
            db.execSQL("Create Table Trial1234(Studentid INTEGER PRIMARY KEY,Password VARCHAR,Name VARCHAR,PhoneNo INTEGER,Emailid VARCHAR,Course VARCHAR,Branch VARCHAR,Campus VARCHAR,Tthmarks INTEGER,Tthboard VARCHAR,Twthmarks INTEGER,Twthboard VARCHAR,Fsemgpa INTEGER,Ssemgpa INTEGER,Tsemgpa INTEGER,Fosemgpa INTEGER,Fisemgpa INTEGER,Sisemgpa INTEGER,Sesemgpa INTEGER,Esemgpa INTEGER)");
            Toast.makeText(Neweruser.this, "Database CreaTED", 1000).show();
        }
        catch (SQLException e)
        {
            //Toast.makeText(Neweruser.this, "Database Not Created", 2000).show();
        }

        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                EditText id =(EditText)findViewById(R.id.regid);
                EditText pass =(EditText)findViewById(R.id.regp);
                EditText name =(EditText)findViewById(R.id.regname);// TODO Auto-generated method stub
                ContentValues values = new ContentValues();
                values.put("Studentid", id.getText().toString());
                values.put("Password", pass.getText().toString());
                values.put("Name", name.getText().toString());
                if((db.insert("Trial1234", null, values))!=-1)
                {

                    Toast.makeText(Neweruser.this, "Record Successfully Inserted", 2000).show();
                    Cursor cu=db.rawQuery("SELECT * FROM Trial1234",null);
                    cu.moveToFirst();
                    while(!cu.isAfterLast())
                    {
                        Toast.makeText(Neweruser.this,cu.getString(0)+ " "+cu.getString(1),1000).show();
                        cu.moveToNext();
                    }
                    cu.close();
                }

                else
                {
                    Toast.makeText(Neweruser.this, "Record Already Exists", 2000).show();
                }
            }


        });


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_neweruser, menu);
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
