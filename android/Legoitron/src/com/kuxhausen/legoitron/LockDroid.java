package com.kuxhausen.legoitron;

import com.lego.minddroid.BTCommunicator;
import com.lego.minddroid.MINDdroid;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class LockDroid extends MINDdroid implements OnClickListener{

	Button unlockButton, lockButton;
    public static final int ACTION_UNLOCK = 0;
    public static final int ACTION_LOCK = 1;
	
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
        lockButton = (Button) findViewById(R.id.lockButton);
        lockButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
		switch (v.getId()) {
		case R.id.unlockButton:
			Log.d("legoitron","unlock button clicked");
			performActionCommand(ACTION_UNLOCK);
			break;
		
	    case R.id.lockButton:
			Log.d("legoitron","lock button clicked");
			performActionCommand(ACTION_LOCK);
			break;
		
		}
	}

    @Override
    /**
     * Does something special depending on the robot-type.
     * @param buttonMode short, long or other press types.
     */
    public void performActionCommand(int buttonMode) {
        	//84 degrees
      
    	switch (buttonMode) {
		case ACTION_UNLOCK:
			Log.d("legoitron","unlock button clicked");
			sendBTCmessage(BTCommunicator.NO_DELAY, BTCommunicator.MOTOR_A, 
				    -86, 0);
			sendBTCmessage(1000, BTCommunicator.MOTOR_A, 0, 0);
			break;
		
	    case ACTION_LOCK:
			Log.d("legoitron","lock button clicked");
			sendBTCmessage(BTCommunicator.NO_DELAY, BTCommunicator.MOTOR_A, 
				    86, 0);
			sendBTCmessage(1000, BTCommunicator.MOTOR_A, 0, 0);
			break;
		
		}
    	
		
    }
}
