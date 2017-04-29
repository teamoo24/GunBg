package com.android.mini;
public class newPocketmon1 {
	public newPocketmon1 m_instance; 
	
	public newPocketmon1(){
		m_instance = this;
	}
	public void newPocketmon(int i) {
			if (MyGameView.m_instance.mon1[i].itLive == false && MyGameView.m_instance.gold>=10*2 && MyGameView.m_instance.isOK==false) 
			{
					MyGameView.m_instance.mon1[i].birthtime = Long.parseLong(MyGameView.m_instance.dateTime);
					MyGameView.m_instance.mon1[i].leveltime = 0;
					MyGameView.m_instance.mon1[i].itLive = true;
					MyGameView.m_instance.mon1[i].State = 0;
					MyGameView.m_instance.mon1[i].Level = 0;
					MyGameView.m_instance.mon1[i].shurui = 1;
					MyGameView.m_instance.mon1[i].tfcheck=1;
					MyGameView.m_instance.gold -= 10*4;
					MyGameView.m_instance.isOK = true;
			}
	}
}
