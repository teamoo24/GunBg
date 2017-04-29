package com.android.mini;

public class newPocketmon4 {
	public newPocketmon4 m_instance; 
	public newPocketmon4() {
		m_instance = this;
	}
	public void newPocketmon(int m){
		if (MyGameView.m_instance.mon4[m].itLive == false && MyGameView.m_instance.gold>=10*2 && MyGameView.m_instance.isOK==false) 
		{
			MyGameView.m_instance.mon4[m].birthtime = Long.parseLong(MyGameView.m_instance.dateTime);
				MyGameView.m_instance.mon4[m].itLive = true;
				MyGameView.m_instance.mon4[m].State = 0;
				MyGameView.m_instance.mon4[m].leveltime = 0;
				MyGameView.m_instance.mon4[m].Level = 0;
				MyGameView.m_instance.mon4[m].tfcheck=1;
				MyGameView.m_instance.mon4[m].shurui = 4;
				MyGameView.m_instance.gold -= 10*25;
				MyGameView.m_instance.isOK = true;
		}	
	}
}
