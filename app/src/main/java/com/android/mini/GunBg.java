package com.android.mini;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.Display;
import android.view.Window;
import android.view.WindowManager;

public class GunBg extends Activity {
	public static MediaPlayer BackSound[];
	public static Vibrator vibeator;
    /** Called when the activity is first created. */
	public static GunBg m_instance;
	static boolean m_first;
	public Context con;
	//MyGameView mGameView;
	sqlite sqlv;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        sqlv=new sqlite(this);
        BackSound = new MediaPlayer[4];
        vibeator   = (Vibrator)getSystemService(Context.VIBRATOR_SERVICE);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
        		WindowManager.LayoutParams.FLAG_FULLSCREEN);       
        m_instance= this;

        Display display = getWindowManager().getDefaultDisplay();
        int Width = display.getWidth();
        int Height = display.getHeight();
        MyGameView mGameView = new MyGameView(this, Width, Height);
        setContentView(mGameView);
        BackSound[0]= MediaPlayer.create(this, R.raw.space);
        BackSound[0].setVolume(1, 1);
        BackSound[0].setLooping(true);
        BackSound[1]= MediaPlayer.create(this, R.raw.shop);
        BackSound[1].setVolume(1, 1);
        BackSound[1].setLooping(true);
        BackSound[2]= MediaPlayer.create(this, R.raw.hunt);
        BackSound[2].setVolume(1, 1);
        BackSound[2].setLooping(true);
        BackSound[3]= MediaPlayer.create(this, R.raw.menu);
        BackSound[3].setVolume(1, 1);
        BackSound[3].setLooping(true);
    }
    @Override

    public void onBackPressed() {
    	
    }
    @Override
	protected void onResume() {
		// TODO Auto-generated method stub
    	//mGameView.mThread.PauseNResume(false);
		super.onResume();
	}
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		//mGameView.mThread.PauseNResume(true);
		super.onPause();
	}
    
}
