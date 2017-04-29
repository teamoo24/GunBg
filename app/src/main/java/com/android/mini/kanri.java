package com.android.mini;





public class kanri {
	public kanri m_instance;

	public kanri(){
		m_instance = this;
	}

	public void close(boolean a,boolean b){
		a=b=false;

	}

	public void meatmenu() {
		if (MyGameView.m_instance.mon1[MyGameView.m_instance.x].State == 1 && 
				MyGameView.m_instance.meat > 0 && MyGameView.m_instance.mon1[MyGameView.m_instance.x].isMenu)
			meat(1);
		else if (MyGameView.m_instance.mon2[MyGameView.m_instance.x].State == 1 && MyGameView.m_instance.meat > 0 && 
				MyGameView.m_instance.mon2[MyGameView.m_instance.x].isMenu)
			meat(2);
		else if (MyGameView.m_instance.mon3[MyGameView.m_instance.x].State == 1 && MyGameView.m_instance.meat > 0 
				&& MyGameView.m_instance.mon3[MyGameView.m_instance.x].isMenu)
			meat(3);
		else if (MyGameView.m_instance.mon4[MyGameView.m_instance.x].State == 1 &&
				MyGameView.m_instance.meat > 0 && MyGameView.m_instance.mon4[MyGameView.m_instance.x].isMenu)
			meat(4);
		else
			close();
	}

	public void medichinemenu() {
		if (MyGameView.m_instance.mon1[MyGameView.m_instance.x].State == 2 
				&& MyGameView.m_instance.medichine > 0 && MyGameView.m_instance.mon1[MyGameView.m_instance.x].isMenu)
			medichine(1);
		else if (MyGameView.m_instance.mon2[MyGameView.m_instance.x].State == 2 
				&& MyGameView.m_instance.medichine > 0 && MyGameView.m_instance.mon2[MyGameView.m_instance.x].isMenu)
			medichine(2);
		else if (MyGameView.m_instance.mon3[MyGameView.m_instance.x].State == 2 && MyGameView.m_instance.medichine > 0 
				&& MyGameView.m_instance.mon3[MyGameView.m_instance.x].isMenu)
			medichine(3);
		else if (MyGameView.m_instance.mon4[MyGameView.m_instance.x].State == 2 
				&& MyGameView.m_instance.medichine > 0 && MyGameView.m_instance.mon4[MyGameView.m_instance.x].isMenu)
			medichine(4);
		else
			close();
	}

	public void ddongmenu() {
		if (MyGameView.m_instance.mon1[MyGameView.m_instance.x].State == 3 
				&& MyGameView.m_instance.ddong > 0 && MyGameView.m_instance.mon1[MyGameView.m_instance.x].isMenu)
			ddong(1);
		else if (MyGameView.m_instance.mon2[MyGameView.m_instance.x].State == 3 
				&& MyGameView.m_instance.ddong > 0 && MyGameView.m_instance.mon2[MyGameView.m_instance.x].isMenu)
			ddong(2);
		else if (MyGameView.m_instance.mon3[MyGameView.m_instance.x].State == 3 
				&& MyGameView.m_instance.ddong > 0 && MyGameView.m_instance.mon3[MyGameView.m_instance.x].isMenu)
			ddong(3);
		else if (MyGameView.m_instance.mon4[MyGameView.m_instance.x].State == 3 
				&& MyGameView.m_instance.ddong > 0 && MyGameView.m_instance.mon4[MyGameView.m_instance.x].isMenu)
			ddong(4);
		else
			close();
	}

	public void sellmenu() {
		if (MyGameView.m_instance.mon1[MyGameView.m_instance.x].isMenu)
			menu(1);
		if (MyGameView.m_instance.mon2[MyGameView.m_instance.x].isMenu)
			menu(2);
		if (MyGameView.m_instance.mon3[MyGameView.m_instance.x].isMenu)
			menu(3);
		if (MyGameView.m_instance.mon4[MyGameView.m_instance.x].isMenu)
			menu(4);

		MyGameView.m_instance.hmenustate =false;
	}

	public void meat(int num){
		if(num==1)
		{
			MyGameView.m_instance.mon1[MyGameView.m_instance.x].State = 0;
			MyGameView.m_instance.meat--;
			MyGameView.m_instance.mon1[MyGameView.m_instance.x].isMenu = false;
			MyGameView.m_instance.mon1[MyGameView.m_instance.x].meattime = 0;
			MyGameView.m_instance.hmenustate = false;

		}
		else if(num==2){
			MyGameView.m_instance.mon2[MyGameView.m_instance.x].State = 0;
			MyGameView.m_instance.meat--;
			MyGameView.m_instance.mon2[MyGameView.m_instance.x].isMenu = false;
			MyGameView.m_instance.mon2[MyGameView.m_instance.x].meattime = 0;
			MyGameView.m_instance.hmenustate = false;

		}
		else if(num==3){
			MyGameView.m_instance.mon3[MyGameView.m_instance.x].State = 0;
			MyGameView.m_instance.meat--;
			MyGameView.m_instance.mon3[MyGameView.m_instance.x].isMenu = false;
			MyGameView.m_instance.mon3[MyGameView.m_instance.x].meattime = 0;
			MyGameView.m_instance.hmenustate = false;

		}
		else if(num==4){
			MyGameView.m_instance.mon4[MyGameView.m_instance.x].State = 0;
			MyGameView.m_instance.meat--;
			MyGameView.m_instance.mon4[MyGameView.m_instance.x].isMenu = false;
			MyGameView.m_instance.mon4[MyGameView.m_instance.x].meattime = 0;
			MyGameView.m_instance.hmenustate = false;
		}
	}
	public void medichine(int num)
	{
		if(num == 1){
			MyGameView.m_instance.mon1[MyGameView.m_instance.x].State = 0;
			MyGameView.m_instance.medichine--;
			MyGameView.m_instance.mon1[MyGameView.m_instance.x].isMenu = false;
			MyGameView.m_instance.mon1[MyGameView.m_instance.x].byungtime = 0;
			MyGameView.m_instance.hmenustate = false;
		}
		if(num == 2)
		{	
			MyGameView.m_instance.mon2[MyGameView.m_instance.x].State = 0;
			MyGameView.m_instance.medichine--;
			MyGameView.m_instance.mon2[MyGameView.m_instance.x].isMenu = false;
			MyGameView.m_instance.mon2[MyGameView.m_instance.x].byungtime = 0;
			MyGameView.m_instance.hmenustate = false;
		}
		if(num == 3)
		{		
			MyGameView.m_instance.mon3[MyGameView.m_instance.x].State = 0;
			MyGameView.m_instance.medichine--;
			MyGameView.m_instance.mon3[MyGameView.m_instance.x].isMenu = false;
			MyGameView.m_instance.mon3[MyGameView.m_instance.x].byungtime = 0;
			MyGameView.m_instance.hmenustate = false;
		}	
		if(num == 4)
		{	
			MyGameView.m_instance.mon4[MyGameView.m_instance.x].State = 0;
			MyGameView.m_instance.medichine--;
			MyGameView.m_instance.mon4[MyGameView.m_instance.x].isMenu = false;
			MyGameView.m_instance.mon4[MyGameView.m_instance.x].byungtime = 0;
			MyGameView.m_instance.hmenustate = false;
		}
	}
	public void ddong(int num)
	{
		if(num == 1){
			MyGameView.m_instance.mon1[MyGameView.m_instance.x].State = 0;
			MyGameView.m_instance.ddong--;
			MyGameView.m_instance.mon1[MyGameView.m_instance.x].isMenu = false;
			MyGameView.m_instance.mon1[MyGameView.m_instance.x].ddongtime = 0;
			MyGameView.m_instance.hmenustate = false;
		}
		if(num == 2){
			MyGameView.m_instance.mon2[MyGameView.m_instance.x].State = 0;
			MyGameView.m_instance.ddong--;
			MyGameView.m_instance.mon2[MyGameView.m_instance.x].isMenu = false;
			MyGameView.m_instance.mon2[MyGameView.m_instance.x].ddongtime = 0;
			MyGameView.m_instance.hmenustate = false;
		}
		if(num == 3){
			MyGameView.m_instance.mon3[MyGameView.m_instance.x].State = 0;
			MyGameView.m_instance.ddong--;
			MyGameView.m_instance.mon3[MyGameView.m_instance.x].isMenu = false;
			MyGameView.m_instance.mon3[MyGameView.m_instance.x].ddongtime = 0;
			MyGameView.m_instance.hmenustate = false;
		}
		if(num == 4){
			MyGameView.m_instance.mon4[MyGameView.m_instance.x].State = 0;
			MyGameView.m_instance.ddong--;
			MyGameView.m_instance.mon4[MyGameView.m_instance.x].isMenu = false;
			MyGameView.m_instance.mon4[MyGameView.m_instance.x].ddongtime = 0;
			MyGameView.m_instance.hmenustate = false;
		}
	}
	public void menu(int num)
	{
	if(num==1)	
		{
		MyGameView.m_instance.mon1[MyGameView.m_instance.x].itLive = false;
		MyGameView.m_instance.mon1[MyGameView.m_instance.x].isMenu = false;
		MyGameView.m_instance.mon1[MyGameView.m_instance.x].State = 0;
		MyGameView.m_instance.gold += 10*
				MyGameView.m_instance.mon1[MyGameView.m_instance.x].Level*
				MyGameView.m_instance.mon1[MyGameView.m_instance.x].Level*
				(MyGameView.m_instance.mon1[MyGameView.m_instance.x].shurui+1)*
				(MyGameView.m_instance.mon1[MyGameView.m_instance.x].shurui+1)*2;
		}
	if(num==2)	
	{
	MyGameView.m_instance.mon2[MyGameView.m_instance.x].itLive = false;
	MyGameView.m_instance.mon2[MyGameView.m_instance.x].isMenu = false;
	MyGameView.m_instance.mon2[MyGameView.m_instance.x].State = 0;
	MyGameView.m_instance.gold += 10*
			MyGameView.m_instance.mon2[MyGameView.m_instance.x].Level*
			MyGameView.m_instance.mon2[MyGameView.m_instance.x].Level*
			(MyGameView.m_instance.mon2[MyGameView.m_instance.x].shurui+1)*
			(MyGameView.m_instance.mon2[MyGameView.m_instance.x].shurui+1)*2;
	}
	if(num==3)	
	{
	MyGameView.m_instance.mon3[MyGameView.m_instance.x].itLive = false;
	MyGameView.m_instance.mon3[MyGameView.m_instance.x].isMenu = false;
	MyGameView.m_instance.mon3[MyGameView.m_instance.x].State = 0;
	MyGameView.m_instance.gold += 10*
			MyGameView.m_instance.mon3[MyGameView.m_instance.x].Level*
			MyGameView.m_instance.mon3[MyGameView.m_instance.x].Level*
			(MyGameView.m_instance.mon3[MyGameView.m_instance.x].shurui+1)*
			(MyGameView.m_instance.mon3[MyGameView.m_instance.x].shurui+1)*2;
	MyGameView.m_instance.mon3[MyGameView.m_instance.x].Level = 0;
	}
	if(num==4)	
	{
	MyGameView.m_instance.mon4[MyGameView.m_instance.x].itLive = false;
	MyGameView.m_instance.mon4[MyGameView.m_instance.x].isMenu = false;
	MyGameView.m_instance.mon4[MyGameView.m_instance.x].State = 0;
	MyGameView.m_instance.gold += 10*
			MyGameView.m_instance.mon4[MyGameView.m_instance.x].Level*
			MyGameView.m_instance.mon4[MyGameView.m_instance.x].Level*
			(MyGameView.m_instance.mon4[MyGameView.m_instance.x].shurui+1)*
			(MyGameView.m_instance.mon4[MyGameView.m_instance.x].shurui+1)*2;

	}
	}
	public void close()
	{
		MyGameView.m_instance.mon1[MyGameView.m_instance.x].isMenu
		=MyGameView.m_instance.mon2[MyGameView.m_instance.x].isMenu
		=MyGameView.m_instance.mon3[MyGameView.m_instance.x].isMenu
		=MyGameView.m_instance.mon4[MyGameView.m_instance.x].isMenu
		=MyGameView.m_instance.hmenustate =false;
	}
	public void effectkanri(){
		
	}
}
