package com.example.gatorchop;

import java.util.Random;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ImageView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Random r = new Random();
		
		ImageView v;
		
		int next = r.nextInt(6);
		
		int counter = 0;
		
		resetImages();
		
		//while(counter < 50)
		//{
			switch(next)
			{
				case 1:	resetImages();
					v = (ImageView)findViewById(R.id.imageView1);
					v.setImageResource(R.drawable.gator);
					break;
			
				case 2: resetImages();
					v = (ImageView)findViewById(R.id.imageView2);
					v.setImageResource(R.drawable.gator);
					break;
		

				case 3: resetImages();
					v = (ImageView)findViewById(R.id.imageView3);
					v.setImageResource(R.drawable.gator);
					break;
			
			
				case 4: resetImages();
					v = (ImageView)findViewById(R.id.imageView4);
					v.setImageResource(R.drawable.gator);
					break;
			

				case 5: resetImages();
					v = (ImageView)findViewById(R.id.imageView5);
					v.setImageResource(R.drawable.gator);
					break;
			
				default:	resetImages();
							break;	
			}//End of switch
			
			counter++;
			next = r.nextInt(6);
			Pause();
		//}//End of while
		
		
		
		
	}//End of onCreate
	
	
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
		
		
	}
	
	
	public void Pause()
	{
		for(int i = 0; i < 1000000000; i++);
		for(int i = 0; i < 1000000000; i++);
	
	}
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
