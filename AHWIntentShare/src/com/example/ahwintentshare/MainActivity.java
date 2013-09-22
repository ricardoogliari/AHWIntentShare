package com.example.ahwintentshare;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.ShareCompat;
import android.support.v4.app.ShareCompat.IntentBuilder;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

	private TextView edtShare;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		edtShare = (EditText) findViewById(R.id.edtShare);
	}
	
	public void share(View v){
		IntentBuilder shareIntent = ShareCompat.IntentBuilder.from(this);                
		shareIntent.setText(edtShare.getText().toString());
		shareIntent.setType("text/plain");
  
		startActivity(shareIntent.getIntent());
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
