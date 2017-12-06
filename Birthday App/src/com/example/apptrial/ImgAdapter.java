package com.example.apptrial;

import android.view.View;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.SpinnerAdapter;
import android.widget.ImageView;
import android.widget.Gallery;

public class ImgAdapter extends BaseAdapter implements SpinnerAdapter {

	public static int[] images={R.drawable.nikhil4,R.drawable.nikhil5,R.drawable.nikhil6,R.drawable.nikhil7,R.drawable.nikhil8,R.drawable.nikhil9,R.drawable.nikhil10,R.drawable.nikhil11,R.drawable.nikhil12,R.drawable.nikhil13,R.drawable.nikhil14,R.drawable.nikhil15,R.drawable.nikhil16,R.drawable.nikhil17,R.drawable.nikhil18,R.drawable.nikhil19,R.drawable.nikhil20,R.drawable.nikhil21,R.drawable.nikhil22,R.drawable.nikhil1,R.drawable.nikhil2,R.drawable.nikhil3};
			Context ct;
	public ImgAdapter(Context c)
	{
	ct=c;
	}
	
	
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return images.length;
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		
		ImageView iv=null;
		if(convertView==null)
		{
			iv=new ImageView(ct);
			iv.setLayoutParams(new Gallery.LayoutParams(300, 400));
			iv.setPadding(10, 10, 10, 10);
			
		}
		else
		{
			iv=(ImageView)convertView;
		}
		iv.setImageResource(images[position]);
		
		return iv;
	}

}
