package com.android.mini;

import android.content.Context;
import android.graphics.BitmapFactory;


public class InitAll {
	public InitAll m_instance; 
	
	public InitAll (){

		m_instance = this;
	}
	
	public void mapinit(Context context)
	{
		MyGameView.m_instance.mine = BitmapFactory
			.decodeResource(context.getResources(), R.raw._mine);
		MyGameView.m_instance.info[0] = BitmapFactory.decodeResource(context.getResources(),
			R.raw._information1);
		MyGameView.m_instance.info[1] = BitmapFactory.decodeResource(context.getResources(),
			R.raw._information2);
		MyGameView.m_instance.info[2] = BitmapFactory.decodeResource(context.getResources(),
			R.raw._information3);
		MyGameView.m_instance.logo = BitmapFactory
			.decodeResource(context.getResources(), R.raw._logo);
		MyGameView.m_instance.minetext = BitmapFactory.decodeResource(context.getResources(),
			R.raw._minetext);
		MyGameView.m_instance.numbers = BitmapFactory.decodeResource(context.getResources(),
			R.raw._numbers);
		MyGameView.m_instance.number = BitmapFactory.decodeResource(context.getResources(),
			R.raw._number);
		MyGameView.m_instance.effect[0] = BitmapFactory.decodeResource(context.getResources(),
			R.raw._red5);
		MyGameView.m_instance.effect[1] = BitmapFactory.decodeResource(context.getResources(),
			R.raw._red4);
		MyGameView.m_instance.effect[2] = BitmapFactory.decodeResource(context.getResources(),
			R.raw._red3);
		MyGameView.m_instance.effect[3] = BitmapFactory.decodeResource(context.getResources(),
			R.raw._red2);
		MyGameView.m_instance.effect[4] = BitmapFactory.decodeResource(context.getResources(),
			R.raw._red1);
		MyGameView.m_instance.effect[5] = BitmapFactory.decodeResource(context.getResources(),
			R.raw._red2);
		MyGameView.m_instance.effect[6] = BitmapFactory.decodeResource(context.getResources(),
			R.raw._red3);
		MyGameView.m_instance.effect[7] = BitmapFactory.decodeResource(context.getResources(),
			R.raw._red4);
		MyGameView.m_instance.effect[8] = BitmapFactory.decodeResource(context.getResources(),
			R.raw._red5);
		MyGameView.m_instance.enemy[0] = BitmapFactory.decodeResource(context.getResources(),
			R.raw._aa);
		MyGameView.m_instance.mgold[0] = BitmapFactory.decodeResource(context.getResources(),
			R.raw._coin);
		MyGameView.m_instance.mgold[1] = BitmapFactory.decodeResource(context.getResources(),
			R.raw._coin);
		MyGameView.m_instance.life[0] = BitmapFactory.decodeResource(context.getResources(),
			R.raw._life1);
		MyGameView.m_instance.life[1] = BitmapFactory.decodeResource(context.getResources(),
			R.raw._life2);
		MyGameView.m_instance.menu = BitmapFactory.decodeResource(context.getResources(),
			R.raw._menu1);
		MyGameView.m_instance.option = BitmapFactory.decodeResource(context.getResources(),
			R.raw._option);
		MyGameView.m_instance.option_on = BitmapFactory.decodeResource(context.getResources(),
			R.raw._on);
		MyGameView.m_instance.option_off = BitmapFactory.decodeResource(context.getResources(),
			R.raw._off);
		MyGameView.m_instance.store = BitmapFactory.decodeResource(context.getResources(),
			R.raw._store);
		MyGameView.m_instance.Gauge[0] = BitmapFactory.decodeResource(context.getResources(),
			R.raw._guage1);
		MyGameView.m_instance.Gauge[1] = BitmapFactory.decodeResource(context.getResources(),
			R.raw._guage2);
		MyGameView.m_instance.jouhou[0] = BitmapFactory
			.decodeResource(context.getResources(), R.raw._pocket1);
		MyGameView.m_instance.jouhou[1] = BitmapFactory
			.decodeResource(context.getResources(), R.raw._pocket2);
		MyGameView.m_instance.jouhou[2] = BitmapFactory
			.decodeResource(context.getResources(), R.raw._pocket3);
		MyGameView.m_instance.jouhou[3] = BitmapFactory
			.decodeResource(context.getResources(), R.raw._pocket4);
		MyGameView.m_instance.jouhou[4] = BitmapFactory
			.decodeResource(context.getResources(), R.raw._tem1);
		MyGameView.m_instance.jouhou[5] = BitmapFactory
			.decodeResource(context.getResources(), R.raw._tem2);
		MyGameView.m_instance.space = BitmapFactory.decodeResource(context.getResources(),
			R.raw._space);
		MyGameView.m_instance.tem[0] = BitmapFactory.decodeResource(context.getResources(),
				R.raw._ddong);
		MyGameView.m_instance.tem[1] = BitmapFactory.decodeResource(context.getResources(),
				R.raw._medichine);
		MyGameView.m_instance.tem[2] = BitmapFactory.decodeResource(context.getResources(),
				R.raw._meat);
		MyGameView.m_instance.money = BitmapFactory.decodeResource(context.getResources(), R.raw._money);

		MyGameView.m_instance.sample1 = new Monster1(context);
		MyGameView.m_instance.sample2 = new Monster2(context);
		MyGameView.m_instance.sample3 = new Monster3(context);
		MyGameView.m_instance.sample4 = new Monster4(context);
//		for (int i = 0; i < 9; i++) {
//			MyGameView.m_instance.mon1[i] = new Monster1(context);
//			MyGameView.m_instance.mon1[i].isMenu = false;
//			MyGameView.m_instance.mon1[i].itLive = false;
//			MyGameView.m_instance.mon1[i].State = 0;
//			MyGameView.m_instance.mon2[i] = new Monster2(context);
//			MyGameView.m_instance.mon2[i].isMenu = false;
//			MyGameView.m_instance.mon2[i].itLive = false;
//			MyGameView.m_instance.mon2[i].State = 0;
//			MyGameView.m_instance.mon3[i] = new Monster3(context);
//			MyGameView.m_instance.mon3[i].isMenu = false;
//			MyGameView.m_instance.mon3[i].itLive = false;
//			MyGameView.m_instance.mon3[i].State = 0;
//			MyGameView.m_instance.mon4[i] = new Monster4(context);
//			MyGameView.m_instance.mon4[i].isMenu = false;
//			MyGameView.m_instance.mon4[i].itLive = false;
//			MyGameView.m_instance.mon4[i].State = 0;
//		}
		MyGameView.m_instance.hmenustate = false;
		// ���� �迭�� �ʱ�ȭ ���ִ� �Լ�
		// ĳ������ ���� y��ġ
		MyGameView.m_instance.meat = 00;
		MyGameView.m_instance.medichine = 00;
		MyGameView.m_instance.ddong = 00;
		MyGameView.m_instance.State = 1;
		MyGameView.m_instance.mx = 0;
		MyGameView.m_instance.my = 0;
		MyGameView.m_instance.drawx = MyGameView.m_instance.drawy = 0;
		MyGameView.m_instance.hmenustate = false;
		MyGameView.m_instance.isOK = false;
		MyGameView.m_instance.buyu[0] = 0;
		MyGameView.m_instance.buyu[1] = 20;		
		MyGameView.m_instance.cw =MyGameView.m_instance. effect[0].getWidth() / 2;
		MyGameView.m_instance.ch = MyGameView.m_instance.effect[0].getHeight() / 2;
		MyGameView.m_instance.up = true;
	}

}