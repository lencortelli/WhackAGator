package com.example.gatorchop;

import java.util.Random;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends Activity {

	int score =0;
	boolean[] vals = new boolean[5];
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		resetImages();
		
		ImageView v = (ImageView)findViewById(R.id.imageView1);
		
		v.setClickable(true);
		v.setOnClickListener(new View.OnClickListener(){

			@Override
			public void onClick(View arg0) {
				if(vals[0] == true)
				{
					resetImages();
					nextSet();
					score+= 15;
				}
				
			}
			
		});
		
		v = (ImageView)findViewById(R.id.imageView2);
		v.setClickable(true);
		v.setOnClickListener(new View.OnClickListener(){

			@Override
			public void onClick(View v) {
				if(vals[1] == true)
				{
					resetImages();
					nextSet();
					score+= 15;
				}
				
			}
			
		});
		
		v = (ImageView)findViewById(R.id.imageView3);
		v.setClickable(true);
		v.setOnClickListener(new View.OnClickListener(){

			@Override
			public void onClick(View v) {
				if(vals[2] == true)
				{
					resetImages();
					nextSet();
					score+= 15;
				}
				
			}
			
		});
		
		v = (ImageView)findViewById(R.id.imageView4);
		v.setClickable(true);
		v.setOnClickListener(new View.OnClickListener(){

			@Override
			public void onClick(View v) {
				if(vals[3] == true)
				{
					resetImages();
					nextSet();
					score+= 15;
				}
				
			}
			
		});
		
		v = (ImageView)findViewById(R.id.imageView5);
		v.setClickable(true);
		v.setOnClickListener(new View.OnClickListener(){

			@Override
			public void onClick(View v) {
				if(vals[4] == true)
				{
					resetImages();
					nextSet();
					score+= 15;
				}
				
			}
			
		});
		
		
		new CountDownTimer(30000, 1000){

			@Override
			public void onFinish() {
				displayScore();
				
			}

			@Override
			public void onTick(long arg0) {
					
				nextSet();
					
			}
			
			
		}.start();
			
		
	}//End of onCreate
	


	public void nextSet()
	{
		int next = 0;
		Random r = new Random();
		ImageView v;
		
		next = r.nextInt(5);
		
		switch(next)
		{
			case 1:	resetImages();
				v = (ImageView)findViewById(R.id.imageView1);
				v.setImageResource(R.drawable.gator);
				vals[0] = true;
				break;
		
			case 2: resetImages();
				v = (ImageView)findViewById(R.id.imageView2);
				v.setImageResource(R.drawable.gator);
				vals[1] = true;
				break;
	

			case 3: resetImages();
				v = (ImageView)findViewById(R.id.imageView3);
				v.setImageResource(R.drawable.gator);
				vals[2] = true;
				break;
		
		
			case 4: resetImages();
				v = (ImageView)findViewById(R.id.imageView4);
				v.setImageResource(R.drawable.gator);
				vals[3] = true;
				break;
		

			case 5: resetImages();
				v = (ImageView)findViewById(R.id.imageView5);
				v.setImageResource(R.drawable.gator);
				vals[4] = true;
				break;
		
			default:	resetImages();
						break;	
		}//End of switch
		
		//Toast.makeText(this, "next Set", Toast.LENGTH_LONG).show();
		
	}
	
	
	public void resetImages()
	{
		ImageView v = (ImageView)findViewById(R.id.imageView1);
		v.setImageResource(R.drawable.ic_launcher);
		
		v = (ImageView)findViewById(R.id.imageView2);
		v.setImageResource(R.drawable.ic_launcher);
		
		v = (ImageView)findViewById(R.id.imageView3);
		v.setImageResource(R.drawable.ic_launcher);
		
		v = (ImageView)findViewById(R.id.imageView4);
		v.setImageResource(R.drawable.ic_launcher);
		
		v = (ImageView)findViewById(R.id.imageView5);
		v.setImageResource(R.drawable.ic_launcher);
		
		for(int i = 0; i < 5; i++)
			vals[i] = false;
	}
	
	
	public void Pause()
	{
		for(int i = 0; i < 10000000; i++);
		//for(int i = 0; i < 1000000000; i++);
	
	}
	
	public void onClickListener1(View v)
	{
		
		if(vals[0] == true)
			{
				resetImages();
				nextSet();
				score+= 15;
			}
		
	}
	
	
	public void onClickListener2(View v)
	{
		if(vals[1] == true)
		{
			resetImages();
			nextSet();
			score+= 15;
		}
	
	}
	
	public void onClickListener3(View v)
	{
		if(vals[2] == true)
		{
			resetImages();
			nextSet();
			score+= 15;
		}
	
	}

	public void onClickListener4(View v)
	{
		if(vals[3] == true)
		{
			resetImages();
			nextSet();
			score+= 15;
		}
	
	}
	
	public void onLickListener5(View v)
	{
		if(vals[4] == true)
		{
			resetImages();
			nextSet();
			score+= 15;
		}
		
	}
	
	public void displayScore()
	{
		
		final AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
		builder1.setMessage("Your final score is: " + score);
		builder1.setCancelable(true);
		builder1.setPositiveButton("Ok", new OnClickListener(){ public void onClick(DialogInterface dialog, int id){dialog.cancel();}});
		builder1.setNegativeButton("", new OnClickListener(){public void onClick(DialogInterface dialog, int id){dialog.cancel();}});
		builder1.show();
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
