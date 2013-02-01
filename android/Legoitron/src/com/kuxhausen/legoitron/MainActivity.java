package com.kuxhausen.legoitron;

import com.lego.minddroid.MINDdroid;
import com.lego.minddroid.SplashMenu;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		// startActivity(new Intent(this, MINDdroid.class));
		startActivity(new Intent(this, LockDroid.class));
		// startActivity(new Intent(this, SplashMenu.class));
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
