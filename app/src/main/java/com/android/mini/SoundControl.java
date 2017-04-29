package com.android.mini;

import android.content.Context;
import android.media.MediaPlayer;

public class SoundControl {
	public SoundControl m_instance;
	public SoundControl(){
		m_instance = this;
	}
	public void soundinit(int m,Context mContext) {
		switch (m) {
		case 0:
			GunBg.BackSound[m] = MediaPlayer.create(mContext, R.raw.space);
			GunBg.BackSound[m].setVolume(1, 1);
			GunBg.BackSound[m].setLooping(true);
			break;
		case 1:
			GunBg.BackSound[m] = MediaPlayer.create(mContext, R.raw.shop);
			GunBg.BackSound[m].setVolume(1, 1);
			GunBg.BackSound[m].setLooping(true);
			break;
		case 2:
			GunBg.BackSound[m] = MediaPlayer.create(mContext, R.raw.hunt);
			GunBg.BackSound[m].setVolume(1, 1);
			GunBg.BackSound[m].setLooping(true);
			break;
		case 3:
			GunBg.BackSound[m] = MediaPlayer.create(mContext, R.raw.menu);
			GunBg.BackSound[m].setVolume(1, 1);
			GunBg.BackSound[m].setLooping(true);
			break;
		}
	}
	
	public void StopSound(int m) {
		GunBg.BackSound[m].stop();
		GunBg.BackSound[m].reset();
	}

}
