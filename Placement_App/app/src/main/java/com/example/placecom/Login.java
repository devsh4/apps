package com.example.placecom;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.database.SQLException;
import android.widget.Toast;

public class Login extends ActionBarActivity {
    SQLiteDatabase db;
    Cursor cu ;
    String l,m, o,x ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        final EditText name=(EditText) findViewById(R.id.Textid);
        final EditText password=(EditText)findViewById(R.id.Textpass);
        Button btnAdd = (Button) findViewById(R.id.click);
            try
             {
            db = openOrCreateDatabase("DB", SQLiteDatabase.CREATE_IF_NECESSARY, null);
            db.execSQL("Create Table Trial1234(Studentid INTEGER PRIMARY KEY ,Password VARCHAR,Name VARCHAR,PhoneNo INTEGER,Emailid VARCHAR,Course VARCHAR,Branch VARCHAR,Campus VARCHAR,Tthmarks INTEGER,Tthboard VARCHAR,Twthmarks INTEGER,Twthboard VARCHAR,Fsemgpa INTEGER,Ssemgpa INTEGER,Tsemgpa INTEGER,Fosemgpa INTEGER,Fisemgpa INTEGER,Sisemgpa INTEGER,Sesemgpa INTEGER,Esemgpa INTEGER)");
            }
            catch (SQLException e)
        {

        }

        btnAdd.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                o = name.getText().toString();
                x = password.getText().toString();
                String[] po = {o, x};
                String selection = "Studentid=? AND Password=?";


                try {
                    cu = db.query("Trial1234", null, selection, po, null, null, null);
                    l = cu.getString(0);
                    m = cu.getString(1);
                    startManagingCursor(cu);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                int numberOfRows = cu.getCount();
                if (numberOfRows <= 0) {
                    Toast.makeText(getApplicationContext(), "Invalid Username Or Password", Toast.LENGTH_SHORT).show();
                    name.setText("");
                    password.setText("");
                } else {
                    Intent intent = new Intent(v.getContext(), Home.class);
                    intent.putExtra("abcd", o);
                    startActivity(intent);
                }

            }

        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_login, menu);
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


    public void asap(View view)
    {

        Intent i = new Intent(this,Neweruser.class);
        startActivity(i);

    }
}
