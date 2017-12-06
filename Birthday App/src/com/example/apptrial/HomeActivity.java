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
import android.content.Intent;
import android.app.Activity;
import android.widget.ImageView;

public class HomeActivity extends Activity {

	ImageView iv,iv2;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fragment_home);
		Thread tmr=new Thread(){
			public void run()
			{
				try
				{
				sleep(1500);
				iv=(ImageView)findViewById(R.id.imageView1);
				iv.setVisibility(0);
				
				iv2=(ImageView)findViewById(R.id.imageView2);
				iv2.setVisibility(0);
				}catch(Exception e)
				{
					
				}
			}
		};
		tmr.start();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.home, menu);
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
			View rootView = inflater.inflate(R.layout.fragment_home, container,
					false);
			return rootView;
		}
	}
	public void open1(View v)
	{
		startActivity(new Intent(this,MsgActivity.class));
	}
	public void open2(View v)
	{
		startActivity(new Intent(this,GallActivity.class));		
	}

}
