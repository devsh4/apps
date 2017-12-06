package com.example.apptrial;



import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;
import android.app.ListActivity;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;
import android.content.Intent;

public class MsgActivity extends ActionBarActivity {
ListView lv1;
Intent next;
int pos=0;
	String arr[]={"Sanjuktha","Yutika","Vidisha","Riddhi","Yashesh","Shreeram","Ekta","Ketan","Adarsh"};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fragment_msg);
		ListAdapter a=new ArrayAdapter<String>(this,R.layout.lv,arr);
		lv1=(ListView)findViewById(R.id.wishList1);
		lv1.setAdapter(a);
		
		lv1.setOnItemClickListener(
				new OnItemClickListener() {
					@Override
					public void onItemClick(AdapterView<?> arg,View v,int position,long id)
					{
						String ob= lv1.getItemAtPosition(position).toString();
						pos=position;
						try
						{
						goTo();
						}catch(Exception e)
						{
							
						}
					}
				}
				
				);
		
	}

	public void goTo()
	{
		try
		{
		next= new Intent(this,DetailsActivity.class);
		next.putExtra("as",pos+"");
		startActivity(next);
		}catch(Exception e)
		{
			
		}
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.msg, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	/**
	 * A placeholder fragment containing a simple view.
	 */
	public static class PlaceholderFragment extends Fragment {

		public PlaceholderFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_msg, container,
					false);
			return rootView;
		}
	}

}
