package com.example.placecom;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Rules1 extends Activity{

    ListView lv ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rules1);

        // Get ListView object from xml
        lv = (ListView) findViewById(R.id.list);

        // Defined Array values to show in ListView    
        String[] values= new String[]
                { "Placement Cell's activities requires 100% attendance.",
                        "Misbehavior of any sort will not be tolerated. ",
                        "Students must comply to all the conditions stated by the placement cell during the recruitment process.",
                        "Students must keep all their documents up to date for the placement process (i.e. marksheets, proofs etc.)",
                        "Student once recruited by a mass recruiter company, will not be eligible to sit for other mass recruiter",
                        "Students if at all, arrive late for placement activities will be given a warning. ",
                        "Students must fill the entire form created for their information."
                        ,"CV of the students should hold true by certificates/marksheets.",
                        "Recruitee if once gets a niche job offer, is considered out of placements.",
                        "Students which opt out of placements, cannot be considered again for placement process.",
                        "Recruitees having KT's/YD's should explicitly state so in their form.",
                        "Profiles offered by the company are subject to changes year after year.",
                        "Preferences given by students for job location will be taken into consideration, & will not be iron clad.",
                        "For some recruiters there might be conditions:- students having more than one offer cannot sit.",
                        "Students attendance is compulsory for company presentations and their process if student is eligible.",
                        "Students consistently in defaulters will be forced out of the placements.",
                        "Package,profile,location details and offer letters may come till late March/April.",
                        "Recruiters will have eligibility criteria which is strict.",
                        "Students if apply from outside should inform the placement cell."


                };

        // Define a new Adapter
        // First parameter - Context
        // Second parameter - Layout for the row
        // Third parameter - ID of the TextView to which the data is written
        // Forth - the Array of data
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);


        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                // ListView Clicked item index
                int itemPosition     = position;

                // ListView Clicked item value
                String  itemValue    = (String) lv.getItemAtPosition(position);

                // Show Alert
                Toast.makeText(getApplicationContext(),
                        "Rule #"+itemPosition+"--> " +itemValue , Toast.LENGTH_LONG)
                        .show();

            }

        });

    }
}
 