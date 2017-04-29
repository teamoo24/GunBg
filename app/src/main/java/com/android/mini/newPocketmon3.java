package com.android.mini;

public class newPocketmon3 {
	public newPocketmon3 m_instance; 
	public newPocketmon3() {
		m_instance = this;
		}
	public void newPocketmon(int i){
		if (MyGameView.m_instance.mon3[i].itLive == false && MyGameView.m_instance.gold>=10*2 && MyGameView.m_instance.isOK==false) 
		{
			MyGameView.m_instance.mon3[i].birthtime = Long.parseLong(MyGameView.m_instance.dateTime);
				MyGameView.m_instance.mon3[i].itLive = true;
				MyGameView.m_instance.mon3[i].State = 0;
				MyGameView.m_instance.mon3[i].leveltime = 0;
				MyGameView.m_instance.mon3[i].Level = 0;
				MyGameView.m_instance.mon3[i].shurui = 3;
				MyGameView.m_instance.mon3[i].tfcheck=1;
				MyGameView.m_instance.gold -= 10*16;
				MyGameView.m_instance.isOK = true;
		}	
	}
}
