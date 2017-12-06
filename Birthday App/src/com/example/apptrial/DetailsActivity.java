package com.example.apptrial;



import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.content.res.*;
import android.app.Activity;
import android.widget.Button;
import android.content.*;

public class DetailsActivity extends Activity {

	int toggler=0;
	Button b;
	TextView tv;
  View rlay;
  Intent a;
  int position=0;
  Wishes obj;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fragment_details);
		obj=new Wishes();
b=(Button)findViewById(R.id.viewDet);		
 rlay=(View)findViewById(R.id.backLayout);
		
		
		tv=(TextView)findViewById(R.id.msgData);
		a=getIntent();
		position=Integer.parseInt(a.getStringExtra("as"));
		rlay.setBackgroundResource(obj.photo[position]);	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.details, menu);
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
			View rootView = inflater.inflate(R.layout.fragment_details,
					container, false);
			return rootView;
		}
	}
	public void viewMsg(View v)
	{
		
		if(toggler==0)
		{
		tv.setEnabled(true);
		tv.setText(obj.message[position]);
		
		//tv.setText("lsadsaldjas asodhaskdbalkbdskf lasdkfhsalkdjfbldajskbf asdksajfsdakjfb;asjldfbsdajkb lisadhfasodjhfasdjhflakjsdhflkjdsahflkjsadhflkjsadhfkjhadskfjdhsakjfhaskdjhf jasdhfkldsjahfkajsdhf dsjakfhalkjsdhflkjsadhfkjasdhflkjsahd kadksjdhkas lkajdshakjs lkasdjfhakjsdhkajhdkla alksjdhaksjhdkajshlda lakjsdhaskjlhdaksj lkajsdhkajhda lkajsdhakjshd aklsjdhaklsjfkasdjbgakrgbkrbf kjfbakfjbkajsb hgdhgfmjfk kjgkjgjhgjhgjkh kghgkjgjhg jhgkjhgvjhgjh kgjhgjhgjhgjh khgjhgjhgjhgjh kjygkjhgjhgjhgkjgj jhgjhgjhgj v jgjhgh uygugkjhgjhgjhgjhgkjhg jhgjhgkjgkjhgjgh jhggjgjhgjgkjhgjhgjhg jhgkjgjhgkjhgjhgkjgjhgkjjfkjckjkgj jhfjkfjhgkjhgkjgjkhgkjfkyjgfjhgjh kyfkfjhfjkgjkhgjgkhgjhkjfkujh kfjfjhgjkgjkhffkg jkfkufhjfjkfjh aksjdhiajshdbsdhasbbaskdhbashsabjkasbdkja aishdabjkasbbsadsadjabskdjbaskdbasdjkasbdasbdkjasbkdjbaksjdbaksjdbjabsdj abdasdasjbdjkabdja abdajsbdakjsbdjasbd abdajskbkjasdbjkabdkjfas ihsdabfkjasdbfjkasbjdasb dfbdasjbjakdbkjadsbjdasbjasd ilsadhbfsdafjdsabjfasbdjf akbdlasb aklsbdkasbas klsjdfakdsbdkbabdaskba lkadsbklasbdkbasfbsdlhfbs lkhdabfsadkbfksdhbfkadkabdskfsa dkljbfdsakbfdkasbfdaksbfkdsabklfda daslkjbfsdkjbfsdakbdksajf ddkasfbkdsbfksa lkdjsabfkdsjbfkjsabkfsdkjs lfkdjbdskjabfkjasbkfdas lkdjsbfkasdjbfaksbfkasjdbfkajsbkfjdasb kjadsbfkjsdabfkjsadbkdajsblaksdjbfksdajb sadkljfskdajfsdjfkdnaslkfndaslknfkdas dskljafnaskdjnflkasjdnflkajsndlkfjansdlkfnadslkjfnlksadnlkfasnlknadsf   kasKSJNdkajs askljdsakjdnksajndkas dalkjdnskjnksaljndlkjsandlkjnasd lskajdnalks");
		b.setText("Minimise Text");
		toggler=1;
		}
		else
		{
			tv.setText("");
			tv.setEnabled(false);
			b.setText("View Message");
			toggler=0;
		}
	}

}
