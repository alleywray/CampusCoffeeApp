package com.example.campuscoffeeapp;
 
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

	ImageButton imageButton;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		addListenerOnButtonJohnnie(); 
		addListenerOnButtonClemens();
	}
	
	public void addListenerOnButtonJohnnie(){
		imageButton = (ImageButton) findViewById(R.id.johnnie_java_button);
		
		imageButton.setOnClickListener(new OnClickListener(){
			
			@Override
			public void onClick(View arg0){
				Toast.makeText(MainActivity.this,
						"ImageButton is clicked!", Toast.LENGTH_SHORT).show();
			}});

	}
	
	public void addListenerOnButtonClemens(){
		imageButton = (ImageButton) findViewById(R.id.clemens_perk);
		
		imageButton.setOnClickListener(new OnClickListener(){
			
			@Override
			public void onClick(View arg0){
				Toast.makeText(MainActivity.this,
						"ImageButton is clicked!", Toast.LENGTH_SHORT).show();
			}});

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
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
}
