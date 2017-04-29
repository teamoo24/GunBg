package com.android.mini;

public class newPocketmon2 {
	public newPocketmon2 m_instance; 
	public newPocketmon2() {
		m_instance = this;
		}
	public void newPocketmon(int i){
		if (MyGameView.m_instance.mon2[i].itLive == false && MyGameView.m_instance.gold>=10*2 && MyGameView.m_instance.isOK==false) 
			{
			MyGameView.m_instance.mon2[i].birthtime = Long.parseLong(MyGameView.m_instance.dateTime);
				MyGameView.m_instance.mon2[i].itLive = true;
				MyGameView.m_instance.mon2[i].State = 0;
				MyGameView.m_instance.mon2[i].leveltime = 0;
				MyGameView.m_instance.mon2[i].Level = 0;
				MyGameView.m_instance.mon2[i].shurui = 2;
				MyGameView.m_instance.mon2[i].tfcheck=1;
				MyGameView.m_instance.gold -= 10*9;
				MyGameView.m_instance.isOK = true;
			}	
		}
}
