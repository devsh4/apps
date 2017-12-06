package com.example.placecom;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Form extends Activity {
    SQLiteDatabase db ;
    String x,l;
    Cursor cu ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        Button btn = (Button)findViewById(R.id.subdet);
        Intent intent = getIntent();
        x = intent.getExtras().getString("abcd");
        Toast.makeText(Form.this, x , 2000).show();
        try
        {
            db = openOrCreateDatabase("DB", SQLiteDatabase.CREATE_IF_NECESSARY, null);
            db.execSQL("Create Table Trial1234(Studentid INTEGER PRIMARY KEY ,Password VARCHAR,Name VARCHAR,PhoneNo INTEGER,Emailid VARCHAR,Course VARCHAR,Branch VARCHAR,Campus VARCHAR,Tthmarks INTEGER,Tthboard VARCHAR,Twthmarks INTEGER,Twthboard VARCHAR,Fsemgpa INTEGER,Ssemgpa INTEGER,Tsemgpa INTEGER,Fosemgpa INTEGER,Fisemgpa INTEGER,Sisemgpa INTEGER,Sesemgpa INTEGER,Esemgpa INTEGER)");
            //Toast.makeText(Form.this, "abc", 2000).show();
        }
        catch (SQLException e)
        {

        }

        String[] po = {x};
        String selection = "Studentid=?";
        try{
            cu=db.query("Trial1234",null,selection,po,null,null,null);
            //Toast.makeText(Form.this, "11111111", 2000).show();
            l =  cu.getString(0);
            TextView sid =(TextView)findViewById(R.id.det1);
            sid.setText(l);
            Toast.makeText(this, l, 2000).show();
            EditText sp =(EditText)findViewById(R.id.det2);
            l = cu.getString(1);
            sp.setText(l);
            Toast.makeText(this, l, 2000).show();
            TextView sname =(TextView)findViewById(R.id.det3);
            l = cu.getString(2);
            sname.setText(l);
            Toast.makeText(this, l, 2000).show();
            EditText sphone =(EditText)findViewById(R.id.det4);
            l = cu.getString(3);
            sphone.setText(l);
            EditText semail =(EditText) findViewById(R.id.det5);
            l=cu.getString(4);
            semail.setText(l);
            EditText stm =(EditText) findViewById(R.id.det9);
            l=cu.getString(8);
            stm.setText(l);
            EditText stwm =(EditText) findViewById(R.id.det11);
            l=cu.getString(10);
            stwm.setText(l);
            EditText fsg =(EditText) findViewById(R.id.det13);
            l=cu.getString(12);
            fsg.setText(l);
            EditText ssg =(EditText) findViewById(R.id.det14);
            l=cu.getString(13);
            ssg.setText(l);
            EditText tsg =(EditText) findViewById(R.id.det15);
            l=cu.getString(14);
            tsg.setText(l);
            EditText fosg =(EditText) findViewById(R.id.det16);
            l=cu.getString(15);
            fosg.setText(l);
            EditText fisg =(EditText) findViewById(R.id.det17);
            l=cu.getString(16);
            fisg.setText(l);
            EditText sisg =(EditText) findViewById(R.id.det18);
            l=cu.getString(17);
            sisg.setText(l);
            EditText sesg =(EditText) findViewById(R.id.det19);
            l=cu.getString(18);
            sesg.setText(l);
            EditText esg =(EditText) findViewById(R.id.det20);
            l=cu.getString(19);
            esg.setText(l);
            startManagingCursor(cu);

        } catch(Exception e){
            e.printStackTrace();
            Toast.makeText(Form.this, "abcdef", 2000).show();

        }




        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                TextView sid =(TextView)findViewById(R.id.det1);
                EditText sp =(EditText)findViewById(R.id.det2);
                TextView sname =(TextView)findViewById(R.id.det3);
                EditText sphone =(EditText)findViewById(R.id.det4);
                EditText semail =(EditText) findViewById(R.id.det5);
                RadioGroup scourse = (RadioGroup)findViewById(R.id.det6);
                String radiovalue1=  ((RadioButton) findViewById(scourse.getCheckedRadioButtonId())).getText().toString();
                String y = "Other" ;
                RadioGroup sbranch = (RadioGroup)findViewById(R.id.det7);
                String radiovalue2=  ((RadioButton) findViewById(sbranch.getCheckedRadioButtonId())).getText().toString();
                RadioGroup scampus = (RadioGroup)findViewById(R.id.det8);
                String radiovalue3=  ((RadioButton) findViewById(scampus.getCheckedRadioButtonId())).getText().toString();
                EditText stm =(EditText) findViewById(R.id.det9);
                RadioGroup stb = (RadioGroup)findViewById(R.id.det10);
                String radiovalue4=  ((RadioButton) findViewById(stb.getCheckedRadioButtonId())).getText().toString();
                if(radiovalue4.equals(y))
                {
                    EditText o = (EditText) findViewById(R.id.editText7);
                    radiovalue4 = o.getText().toString();
                }
                EditText stwm =(EditText) findViewById(R.id.det11);
                RadioGroup stwb = (RadioGroup)findViewById(R.id.det12);
                String radiovalue5=  ((RadioButton) findViewById(stwb.getCheckedRadioButtonId())).getText().toString();
                if(radiovalue5.equals(y))
                {
                    EditText o = (EditText) findViewById(R.id.editText9);
                    radiovalue5 = o.getText().toString();
                }
                EditText fsg =(EditText) findViewById(R.id.det13);
                EditText ssg =(EditText) findViewById(R.id.det14);
                EditText tsg =(EditText) findViewById(R.id.det15);
                EditText fosg =(EditText) findViewById(R.id.det16);
                EditText fisg =(EditText) findViewById(R.id.det17);
                EditText sisg =(EditText) findViewById(R.id.det18);
                EditText sesg =(EditText) findViewById(R.id.det19);
                EditText esg =(EditText) findViewById(R.id.det20);
                ContentValues values=new ContentValues();
                values.put("Studentid", sid.getText().toString());
                values.put("Password", sp.getText().toString());
                values.put("Name", sname.getText().toString());
                values.put("PhoneNo", sphone.getText().toString());
                values.put("Emailid", semail.getText().toString());
                values.put("Course", radiovalue1);
                values.put("Branch", radiovalue2);
                values.put("Campus", radiovalue3);
                values.put("Tthmarks", stm.getText().toString());
                values.put("Tthboard", radiovalue4);
                values.put("Twthmarks", stwm.getText().toString());
                values.put("Twthboard", radiovalue5);
                values.put("Fsemgpa", fsg.getText().toString());
                values.put("Ssemgpa", ssg.getText().toString());
                values.put("Tsemgpa", tsg.getText().toString());
                values.put("Fosemgpa", fosg.getText().toString());
                values.put("Fisemgpa", fisg.getText().toString());
                values.put("Sisemgpa", sisg.getText().toString());
                values.put("Sesemgpa", sesg.getText().toString());
                values.put("Esemgpa", esg.getText().toString());
                if((db.update("Trial1234", values, "Studentid=" +x , null))>0)
                {
                    	Toast.makeText(v.getContext(), "Success", 2000).show();
                }

                else
                {
                    	Toast.makeText(v.getContext(), "Failure", 2000).show();
                }
            }
        });

        Button btn2 = (Button)findViewById(R.id.addnew);
        btn2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String y = "123456";
                if(x.equals(y))
                {
                    Intent i = new Intent(v.getContext(), Neweruser.class);
                    startActivity(i);
                }

                else

                {
                    Toast.makeText(v.getContext(), "Admin only", 2000).show();

                }
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_form, menu);
        return true;
    }



}
