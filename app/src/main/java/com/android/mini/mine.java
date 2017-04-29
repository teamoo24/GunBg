package com.android.mini;

import java.util.Random;

public class mine {
	public mine m_instance;
	public mine(){
		m_instance = this;
	}
	public void CreateEnemy() {
		Random mRandom = new Random();
		MyGameView.m_instance.xx = (mRandom.nextInt(11) * 41);
		MyGameView.m_instance.yy = (mRandom.nextInt(18) * 35);
		if (MyGameView.m_instance.drawcheck == true) {
			if (MyGameView.m_instance.mGameCnt % 30 == 0) {
				MyGameView.m_instance.alpha += 20;
				MyGameView.m_instance.mEnemy.add(new Enemy(MyGameView.m_instance.xx, MyGameView.m_instance.yy));
			}
		}
	}

	public void CreateCoin() {
		Random mRandom = new Random();
		MyGameView.m_instance.xx = (mRandom.nextInt(11) * 41);
		MyGameView.m_instance.yy = (mRandom.nextInt(18) * 35);

		if (MyGameView.m_instance.drawcheck == true) {
			if (MyGameView.m_instance.mGameCnt % 30 == 0) {
				MyGameView.m_instance.alpha += 20;
				MyGameView.m_instance.mGold.add(new Gold(MyGameView.m_instance.xx, MyGameView.m_instance.yy));
			}
		}
	}
}
