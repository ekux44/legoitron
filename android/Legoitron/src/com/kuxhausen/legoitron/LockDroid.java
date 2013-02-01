package com.kuxhausen.legoitron;

import com.lego.minddroid.MINDdroid;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class LockDroid extends MINDdroid implements OnClickListener{

	Button unlockButton;
	
    /**
     * Called when the activity is first created. Inititializes all the
     * graphical views.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.kuxhausen.legoitron.R.layout.lock_page);
        
        unlockButton = (Button) findViewById(R.id.unlockButton);
        unlockButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
		switch (v.getId()) {
		case R.id.unlockButton:
			Log.d("legoitron","unlock button clicked");
			performActionCommand(ACTION_BUTTON_SHORT);
			break;
		}
	}


}
