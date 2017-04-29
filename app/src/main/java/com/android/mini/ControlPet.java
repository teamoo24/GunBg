package com.android.mini;

import android.graphics.Canvas;

public class ControlPet {
	
	public ControlPet m_instance; 

	public ControlPet(){
		m_instance = this;
	}
	
	public void CheckPocketmon(int State) {
		for (int i = 0; i < 9; i++) {
			if (MyGameView.m_instance.mon1[i].itLive == true) {
				if ((Long.parseLong(MyGameView.m_instance.dateTime) - MyGameView.m_instance.mon1[i].birthtime) % 1000 == 0) 
				if(Long.parseLong(MyGameView.m_instance.dateTime)!=MyGameView.m_instance.mon1[i].birthtime) {
					if (MyGameView.m_instance.mon1[i].State == 0) {
						MyGameView.m_instance.mon1[i].State = 1;
						MyGameView.m_instance.mon1[i].meattime = Long.parseLong(MyGameView.m_instance.dateTime);

					}
				}
				if ((Long.parseLong(MyGameView.m_instance.dateTime) - MyGameView.m_instance.mon1[i].birthtime) % 1500 == 0) {
					if(Long.parseLong(MyGameView.m_instance.dateTime)!=MyGameView.m_instance.mon1[i].birthtime)
					if (MyGameView.m_instance.mon1[i].State == 0) {
						MyGameView.m_instance.mon1[i].State = 3;
						MyGameView.m_instance.mon1[i].ddongtime = Long.parseLong(MyGameView.m_instance.dateTime);
					}
				}
				if ((Long.parseLong(MyGameView.m_instance.dateTime) - MyGameView.m_instance.mon1[i].meattime) % 500 == 0) {
					if(Long.parseLong(MyGameView.m_instance.dateTime)!=MyGameView.m_instance.mon1[i].meattime)

					if (MyGameView.m_instance.mon1[i].meattime != 0)
						if (MyGameView.m_instance.mon1[i].State == 1) {
							MyGameView.m_instance.mon1[i].State = 2;
							MyGameView.m_instance.mon1[i].byungtime = Long.parseLong(MyGameView.m_instance.dateTime);
						}
				}
				if ((Long.parseLong(MyGameView.m_instance.dateTime) - MyGameView.m_instance.mon1[i].ddongtime) % 500 == 0) {
					if(Long.parseLong(MyGameView.m_instance.dateTime)!=MyGameView.m_instance.mon1[i].ddongtime)

					if (MyGameView.m_instance.mon1[i].ddongtime != 0)
						if (MyGameView.m_instance.mon1[i].State == 3) {
							MyGameView.m_instance.mon1[i].State = 2;
							MyGameView.m_instance.mon1[i].byungtime = Long.parseLong(MyGameView.m_instance.dateTime);

						}
				}
				if ((Long.parseLong(MyGameView.m_instance.dateTime) - MyGameView.m_instance.mon1[i].byungtime) % 500 == 0) {
					if(Long.parseLong(MyGameView.m_instance.dateTime)!=MyGameView.m_instance.mon1[i].byungtime)
					if (MyGameView.m_instance.mon1[i].byungtime != 0) {
						MyGameView.m_instance.mon1[i].itLive = false;
						MyGameView.m_instance.mon1[i].byungtime = 0;
						MyGameView.m_instance.mon1[i].ddongtime = 0;
						MyGameView.m_instance.mon1[i].meattime = 0;
					}
				}
			}

			if (MyGameView.m_instance.mon2[i].itLive == true) {
				if ((Long.parseLong(MyGameView.m_instance.dateTime) - MyGameView.m_instance.mon2[i].birthtime) % 1000 == 0) 
					if (Long.parseLong(MyGameView.m_instance.dateTime)!=MyGameView.m_instance.mon2[i].birthtime) 
				{	

					if (MyGameView.m_instance.mon2[i].State == 0) {
						MyGameView.m_instance.mon2[i].State = 1;
						MyGameView.m_instance.mon2[i].meattime = Long.parseLong(MyGameView.m_instance.dateTime);
					}
				}
				if ((Long.parseLong(MyGameView.m_instance.dateTime) - MyGameView.m_instance.mon2[i].birthtime) % 1500 == 0) {
					if (Long.parseLong(MyGameView.m_instance.dateTime)!=MyGameView.m_instance.mon2[i].birthtime) 

					if (MyGameView.m_instance.mon2[i].State == 0) {
						MyGameView.m_instance.mon2[i].State = 3;
						MyGameView.m_instance.mon2[i].ddongtime = Long.parseLong(MyGameView.m_instance.dateTime);
					}
				}
				if ((Long.parseLong(MyGameView.m_instance.dateTime) - MyGameView.m_instance.mon2[i].meattime) % 500 == 0) {

					if (MyGameView.m_instance.mon2[i].meattime != 0)
						if (MyGameView.m_instance.mon2[i].State == 1) {
							MyGameView.m_instance.mon2[i].State = 2;
							MyGameView.m_instance.mon2[i].byungtime = Long.parseLong(MyGameView.m_instance.dateTime);
						}
				}
				if ((Long.parseLong(MyGameView.m_instance.dateTime) - MyGameView.m_instance.mon2[i].ddongtime) % 500 == 0) {

					if (MyGameView.m_instance.mon2[i].ddongtime != 0)
						if (MyGameView.m_instance.mon2[i].State == 3) {
							MyGameView.m_instance.mon2[i].State = 2;
							MyGameView.m_instance.mon2[i].byungtime = Long.parseLong(MyGameView.m_instance.dateTime);

						}
				}
				if ((Long.parseLong(MyGameView.m_instance.dateTime) - MyGameView.m_instance.mon2[i].byungtime) % 500 == 0) {
					if (MyGameView.m_instance.mon2[i].byungtime != 0) {
						MyGameView.m_instance.mon2[i].itLive = false;
						MyGameView.m_instance.mon2[i].byungtime = 0;
						MyGameView.m_instance.mon2[i].ddongtime = 0;
						MyGameView.m_instance.mon2[i].meattime = 0;
					}
				}
			}

			if (MyGameView.m_instance.mon3[i].itLive == true) {
				if ((Long.parseLong(MyGameView.m_instance.dateTime) - MyGameView.m_instance.mon3[i].birthtime) % 1000 == 0) {
					if(Long.parseLong(MyGameView.m_instance.dateTime)!=MyGameView.m_instance.mon3[i].birthtime) 

					if (MyGameView.m_instance.mon3[i].State == 0) {
						MyGameView.m_instance.mon3[i].State = 1;
						MyGameView.m_instance.mon3[i].meattime = Long.parseLong(MyGameView.m_instance.dateTime);
					}
				}
				if ((Long.parseLong(MyGameView.m_instance.dateTime) - MyGameView.m_instance.mon3[i].birthtime) % 1500 == 0) {
					if(Long.parseLong(MyGameView.m_instance.dateTime)!=MyGameView.m_instance.mon3[i].birthtime) // 30�ʿ� �ѹ��� �谡 ����
					if (MyGameView.m_instance.mon3[i].State == 0) {
						MyGameView.m_instance.mon3[i].State = 3;
						MyGameView.m_instance.mon3[i].ddongtime = Long.parseLong(MyGameView.m_instance.dateTime);
					}
				}
				if ((Long.parseLong(MyGameView.m_instance.dateTime) - MyGameView.m_instance.mon3[i].meattime) % 500 == 0) {

					if (MyGameView.m_instance.mon3[i].meattime != 0)
						if (MyGameView.m_instance.mon3[i].State == 1) {
							MyGameView.m_instance.mon3[i].State = 2;
							MyGameView.m_instance.mon3[i].byungtime = Long.parseLong(MyGameView.m_instance.dateTime);
						}
				}
				if ((Long.parseLong(MyGameView.m_instance.dateTime) - MyGameView.m_instance.mon3[i].ddongtime) % 500 == 0) {

					if (MyGameView.m_instance.mon3[i].ddongtime != 0)
						if (MyGameView.m_instance.mon3[i].State == 3) {
							MyGameView.m_instance.mon3[i].State = 2;
							MyGameView.m_instance.mon3[i].byungtime = Long.parseLong(MyGameView.m_instance.dateTime);

						}
				}
				if ((Long.parseLong(MyGameView.m_instance.dateTime) - MyGameView.m_instance.mon3[i].byungtime) % 500 == 0) {
					if (MyGameView.m_instance.mon3[i].byungtime != 0) {
						MyGameView.m_instance.mon3[i].itLive = false;
						MyGameView.m_instance.mon3[i].byungtime = 0;
						MyGameView.m_instance.mon3[i].ddongtime = 0;
						MyGameView.m_instance.mon3[i].meattime = 0;
					}
				}
			}

			if (MyGameView.m_instance.mon4[i].itLive == true) {
				if ((Long.parseLong(MyGameView.m_instance.dateTime) - MyGameView.m_instance.mon4[i].birthtime) % 1000 == 0) {
					if(Long.parseLong(MyGameView.m_instance.dateTime)!=MyGameView.m_instance.mon4[i].birthtime)

					if (MyGameView.m_instance.mon4[i].State == 0) {
						MyGameView.m_instance.mon4[i].State = 1;
						MyGameView.m_instance.mon4[i].meattime = Long.parseLong(MyGameView.m_instance.dateTime);
					}
				}
				if ((Long.parseLong(MyGameView.m_instance.dateTime) - MyGameView.m_instance.mon4[i].birthtime) % 1500 == 0) {
					if(Long.parseLong(MyGameView.m_instance.dateTime)!=MyGameView.m_instance.mon4[i].birthtime)
					// 30�ʿ� �ѹ��� �谡 ����
					if (MyGameView.m_instance.mon4[i].State == 0) {
						MyGameView.m_instance.mon4[i].State = 3;
						MyGameView.m_instance.mon4[i].ddongtime = Long.parseLong(MyGameView.m_instance.dateTime);
					}
				}// �˽Ѱ�
				if ((Long.parseLong(MyGameView.m_instance.dateTime) - MyGameView.m_instance.mon4[i].meattime) % 500 == 0) {
					// ������� �������� 10�ʰ� ������
					if (MyGameView.m_instance.mon4[i].meattime != 0)
						if (MyGameView.m_instance.mon4[i].State == 1) {
							MyGameView.m_instance.mon4[i].State = 2;
							MyGameView.m_instance.mon4[i].byungtime = Long.parseLong(MyGameView.m_instance.dateTime);
						}
				}// ����ļ�������
				if ((Long.parseLong(MyGameView.m_instance.dateTime) - MyGameView.m_instance.mon4[i].ddongtime) % 500 == 0) {
					// �˽��� 10�ʰ� ������
					if (MyGameView.m_instance.mon4[i].ddongtime != 0)
						if (MyGameView.m_instance.mon4[i].State == 3) {
							MyGameView.m_instance.mon4[i].State = 2;
							MyGameView.m_instance.mon4[i].byungtime = Long.parseLong(MyGameView.m_instance.dateTime);

						}
				}// �𷯹���������
				if ((Long.parseLong(MyGameView.m_instance.dateTime) - MyGameView.m_instance.mon4[i].byungtime) % 500 == 0) {
					if (MyGameView.m_instance.mon4[i].byungtime != 0) {
						MyGameView.m_instance.mon4[i].itLive = false;
						MyGameView.m_instance.mon4[i].byungtime = 0;
						MyGameView.m_instance.mon4[i].ddongtime = 0;
						MyGameView.m_instance.mon4[i].meattime = 0;
					}
				}
			}// ��ü������ ������ üũ

		}
		// ////////////////////////////////���������üũ////////////////////////////////
	}
	public void ControlPocketmon(Canvas canvas, int State, int n) {
		for (int i = 0; i < 9; i++) {
			if (MyGameView.m_instance.mon1[i].itLive == true) {
				if (Long.parseLong(MyGameView.m_instance.dateTime)-MyGameView.m_instance.mon1[i].birthtime>=1000)
				{
					// ���� �ð����κ��� �¾ �ð��� ���� 10�� ���ϸ������򸦼�ȯ
					MyGameView.m_instance.mon1[i].Level = 1;
					MyGameView.m_instance.mon1[i].leveltime = Long.parseLong(MyGameView.m_instance.dateTime);
				} 
				else if (Long.parseLong(MyGameView.m_instance.dateTime)-MyGameView.m_instance.mon1[i].leveltime>=1000) { // ����
					if(MyGameView.m_instance.mon1[i].Level!=0)
					MyGameView.m_instance.mon1[i].Level = 2;
				}
			}
			if (MyGameView.m_instance.mon2[i].itLive == true) {
				if (Long.parseLong(MyGameView.m_instance.dateTime)-MyGameView.m_instance.mon2[i].birthtime>=1500){
					// ���� �ð����κ��� �¾ �ð��� ���� 10�� ���ϸ������򸦼�ȯ
					MyGameView.m_instance.mon2[i].Level = 1;
					MyGameView.m_instance.mon2[i].leveltime = Long.parseLong(MyGameView.m_instance.dateTime);
				} 
				else if (Long.parseLong(MyGameView.m_instance.dateTime)-MyGameView.m_instance.mon2[i].leveltime>=1000){ // ����
					if(MyGameView.m_instance.mon2[i].Level!=0)
					MyGameView.m_instance.mon2[i].Level = 2;
				}
			}
			if (MyGameView.m_instance.mon3[i].itLive == true) {
				if (Long.parseLong(MyGameView.m_instance.dateTime)-MyGameView.m_instance.mon3[i].birthtime>=2000){
					// ���� �ð����κ��� �¾ �ð��� ���� 10�� ���ϸ������򸦼�ȯ
					MyGameView.m_instance.mon3[i].Level = 1;
					MyGameView.m_instance.mon3[i].leveltime = Long.parseLong(MyGameView.m_instance.dateTime);
				} 
				else if (Long.parseLong(MyGameView.m_instance.dateTime)-MyGameView.m_instance.mon3[i].leveltime>=2000) { // ����
					if(MyGameView.m_instance.mon3[i].Level!=0)
					MyGameView.m_instance.mon3[i].Level = 2;
				}
			}
			if (MyGameView.m_instance.mon4[i].itLive == true) {
				if (Long.parseLong(MyGameView.m_instance.dateTime)-MyGameView.m_instance.mon4[i].birthtime>=2500) {
					// ���� �ð����κ��� �¾ �ð��� ���� 10�� ���ϸ������򸦼�ȯ
					MyGameView.m_instance.mon4[i].Level = 1;
					MyGameView.m_instance.mon4[i].leveltime = Long.parseLong(MyGameView.m_instance.dateTime);
				} 
				else if (Long.parseLong(MyGameView.m_instance.dateTime)-MyGameView.m_instance.mon4[i].leveltime>=2500) { // ����
					if(MyGameView.m_instance.mon4[i].Level!=0)
						MyGameView.m_instance.mon4[i].Level = 2;
				}
			}
		}
	}

	public void sinkapocketmon(Canvas canvas, int i) {
		if (MyGameView.m_instance.mon1[i].itLive) {
			canvas.drawBitmap(MyGameView.m_instance.mon1[i].now[MyGameView.m_instance.mon1[i].Level][MyGameView.m_instance.n], 20 + (100 * i)
					+ MyGameView.m_instance.drawx, 300 + 130 * 0 + MyGameView.m_instance.drawy + MyGameView.m_instance.height+MyGameView.m_instance.buyu[i%2], null);
			if (MyGameView.m_instance.mon1[i].State != 0)
				canvas.drawBitmap(MyGameView.m_instance.think[MyGameView.m_instance.mon1[i].State - 1], 30 + (100 * i)
						+ MyGameView.m_instance.drawx, 300 + 130 * 0 + MyGameView.m_instance.drawy - 20 + MyGameView.m_instance.height, null);
		}
		if (MyGameView.m_instance.mon2[i].itLive) {
			canvas.drawBitmap(MyGameView.m_instance.mon2[i].now[MyGameView.m_instance.mon2[i].Level][MyGameView.m_instance.n], 20 + (100 * i)
					+ MyGameView.m_instance.drawx, 300 + 130 * 1 + MyGameView.m_instance.drawy + MyGameView.m_instance.height+MyGameView.m_instance.buyu[i%2], null);
			if (MyGameView.m_instance.mon2[i].State != 0)
				canvas.drawBitmap(MyGameView.m_instance.think[MyGameView.m_instance.mon2[i].State - 1], 30 + (100 * i)
						+ MyGameView.m_instance.drawx, 300 + 130 * 1 + MyGameView.m_instance.drawy - 20 + MyGameView.m_instance.height, null);
		}
		if (MyGameView.m_instance.mon3[i].itLive) {
			canvas.drawBitmap(MyGameView.m_instance.mon3[i].now[MyGameView.m_instance.mon3[i].Level][MyGameView.m_instance.n], 20 + (100 * i)
					+ MyGameView.m_instance.drawx, 300 + 130 * 2 + MyGameView.m_instance.drawy + MyGameView.m_instance.height+MyGameView.m_instance.buyu[i%2], null);
			if (MyGameView.m_instance.mon3[i].State != 0)
				canvas.drawBitmap(MyGameView.m_instance.think[MyGameView.m_instance.mon3[i].State - 1], 30 + (100 * i)
						+ MyGameView.m_instance.drawx, 300 + 130 * 2 + MyGameView.m_instance.drawy - 20 + MyGameView.m_instance.height, null);
		}
		if (MyGameView.m_instance.mon4[i].itLive) {
			canvas.drawBitmap(MyGameView.m_instance.mon4[i].now[MyGameView.m_instance.mon4[i].Level][MyGameView.m_instance.n], 20 + (100 * i)
					+ MyGameView.m_instance.drawx, 300 + 130 * 3 + MyGameView.m_instance.drawy + MyGameView.m_instance.height+MyGameView.m_instance.buyu[i%2], null);
			if (MyGameView.m_instance.mon4[i].State != 0)
				canvas.drawBitmap(MyGameView.m_instance.think[MyGameView.m_instance.mon4[i].State - 1], 30 + (100 * i)
						+ MyGameView.m_instance.drawx, 300 + 130 * 3 + MyGameView.m_instance.drawy - 20 + MyGameView.m_instance.height, null);
		}
	}
	public void food1Clear(){
		for(int i = 0; i<9;i++){
			if(MyGameView.m_instance.mon1[i].State  == 1 && MyGameView.m_instance.meat>0 
			&& MyGameView.m_instance.mon1[i].itLive == true)
			{
				MyGameView.m_instance.mon1[i].State = 0;
				MyGameView.m_instance.meat--;
				MyGameView.m_instance.mon1[i].meattime = 0;
				MyGameView.m_instance.mon1[i].isMenu = false;
				MyGameView.m_instance.hmenustate = false;
				}
			else
			{
				MyGameView.m_instance.mon1[i].isMenu = false;
				MyGameView.m_instance.hmenustate = false;
			}
		}
	}
	public void food2Clear(){
		for(int i = 0; i<9;i++){
			if(MyGameView.m_instance.mon2[i].State  == 1 && MyGameView.m_instance.meat>0 &&
					MyGameView.m_instance.mon2[i].itLive == true)
			{
				MyGameView.m_instance.mon2[i].State = 0;
				MyGameView.m_instance.meat--;
				MyGameView.m_instance.mon2[i].meattime = 0;
				MyGameView.m_instance.mon2[i].isMenu = false;
				MyGameView.m_instance.hmenustate = false;
				
			}
			else
			{
				MyGameView.m_instance.mon2[i].isMenu = false;
				MyGameView.m_instance.hmenustate = false;
			}
			}
	}
	public void food3Clear(){
		for(int i = 0; i<9;i++){
			if(MyGameView.m_instance.mon3[i].State  == 1 && MyGameView.m_instance.meat>0
					&&MyGameView.m_instance.mon3[i].itLive == true)
			{
				MyGameView.m_instance.mon3[i].State = 0;
				MyGameView.m_instance.meat--;
				MyGameView.m_instance.mon3[i].meattime = 0;
				MyGameView.m_instance.mon3[i].isMenu = false;
				MyGameView.m_instance.hmenustate = false;
			}
			else
			{
				MyGameView.m_instance.mon3[i].isMenu = false;
				MyGameView.m_instance.hmenustate = false;
			}
			}
	}
	public void food4Clear(){
		for(int i = 0; i<9;i++){
			if(MyGameView.m_instance.mon4[i].State  == 1 && MyGameView.m_instance.meat>0
					&&MyGameView.m_instance.mon4[i].itLive == true)
			{
				MyGameView.m_instance.mon4[i].State = 0;
				MyGameView.m_instance.meat--;
				MyGameView.m_instance.mon4[i].meattime = 0;
				MyGameView.m_instance.mon4[i].isMenu = false;
				MyGameView.m_instance.hmenustate = false;
			}
			else
			{
				MyGameView.m_instance.mon4[i].isMenu = false;
				MyGameView.m_instance.hmenustate = false;
			}
		}
	}
	public void foodAllClear(){
		food1Clear();
		food2Clear();
		food3Clear();
		food4Clear();
	}
	public void medic1Clear(){
		for(int i = 0; i<9;i++){
			if(MyGameView.m_instance.mon1[i].State  == 2 && MyGameView.m_instance.medichine>0
					&&MyGameView.m_instance.mon1[i].itLive == true)
				{
				MyGameView.m_instance.mon1[i].State = 0;
				MyGameView.m_instance.medichine--;
				MyGameView.m_instance.mon1[i].byungtime = 0;
				MyGameView.m_instance.mon1[i].isMenu = false;
				MyGameView.m_instance.hmenustate = false;
				}
			else
			{
				MyGameView.m_instance.mon1[i].isMenu = false;
				MyGameView.m_instance.hmenustate = false;
			}
			}
	}
	public void medic2Clear(){
		for(int i = 0; i<9;i++){
			if(MyGameView.m_instance.mon2[i].State  == 2 && MyGameView.m_instance.medichine>0
					&&MyGameView.m_instance.mon2[i].itLive == true)
			{
				MyGameView.m_instance.mon2[i].State = 0;
				MyGameView.m_instance.medichine--;
				MyGameView.m_instance.mon2[i].byungtime = 0;
				MyGameView.m_instance.mon2[i].isMenu = false;
				MyGameView.m_instance.hmenustate = false;
				}
			else
			{
				MyGameView.m_instance.mon2[i].isMenu = false;
				MyGameView.m_instance.hmenustate = false;
			}
			}
	}
	public void medic3Clear(){
		for(int i = 0; i<9;i++){
			if(MyGameView.m_instance.mon3[i].State  == 2 && MyGameView.m_instance.medichine>0
					&&MyGameView.m_instance.mon3[i].itLive == true)
			{
				MyGameView.m_instance.mon3[i].State = 0;
				MyGameView.m_instance.medichine--;
				MyGameView.m_instance.mon3[i].byungtime = 0;
				MyGameView.m_instance.mon3[i].isMenu = false;
				MyGameView.m_instance.hmenustate = false;
				}
			else
			{
				MyGameView.m_instance.mon3[i].isMenu = false;
				MyGameView.m_instance.hmenustate = false;
			}
			}
	}
	public void medic4Clear(){
		for(int i = 0; i<9;i++){
			if(MyGameView.m_instance.mon4[i].State  == 2 && MyGameView.m_instance.medichine>0
					&&MyGameView.m_instance.mon4[i].itLive == true)
			{	
				MyGameView.m_instance.mon4[i].State = 0;
				MyGameView.m_instance.medichine--;
				MyGameView.m_instance.mon4[i].byungtime = 0;
				MyGameView.m_instance.mon4[i].isMenu = false;
				MyGameView.m_instance.hmenustate = false;
				}
			else
			{
				MyGameView.m_instance.mon4[i].isMenu = false;
				MyGameView.m_instance.hmenustate = false;
			}
			}
	}
	public void medicAllClear(){
		medic1Clear();
		medic2Clear();
		medic3Clear();
		medic4Clear();
	}
	public void ddong1Clear(){
		for(int i = 0; i<9;i++){
			
			if(MyGameView.m_instance.mon1[i].State  == 3 && MyGameView.m_instance.ddong>0
					&&MyGameView.m_instance.mon1[i].itLive == true)
			{				
				MyGameView.m_instance.mon1[i].State = 0;
				MyGameView.m_instance.ddong--;
				MyGameView.m_instance.mon1[i].ddongtime = 0;
				MyGameView.m_instance.mon1[i].isMenu = false;
				MyGameView.m_instance.hmenustate = false;
			}else
			{
				MyGameView.m_instance.mon1[i].isMenu = false;
				MyGameView.m_instance.hmenustate = false;
			}
		}
	}
	public void ddong2Clear(){
		for(int i = 0; i<9;i++){
			if(MyGameView.m_instance.mon2[i].State  == 3 && MyGameView.m_instance.ddong>0
					&&MyGameView.m_instance.mon2[i].itLive == true)
			{
				MyGameView.m_instance.mon2[i].State = 0;
				MyGameView.m_instance.ddong--;
				MyGameView.m_instance.mon2[i].ddongtime = 0;
				MyGameView.m_instance.mon2[i].isMenu = false;
				MyGameView.m_instance.hmenustate = false;
				}
			else
			{
				MyGameView.m_instance.mon2[i].isMenu = false;
				MyGameView.m_instance.hmenustate = false;
			}
			}
	}
	public void ddong3Clear(){
		for(int i = 0; i<9;i++){
			if(MyGameView.m_instance.mon3[i].State  == 3 && MyGameView.m_instance.ddong>0
					&&MyGameView.m_instance.mon3[i].itLive == true)
			{
				MyGameView.m_instance.mon3[i].State = 0;
				MyGameView.m_instance.ddong--;
				MyGameView.m_instance.mon3[i].ddongtime = 0;
				MyGameView.m_instance.mon3[i].isMenu = false;
				MyGameView.m_instance.hmenustate = false;
				}
			else
			{
				MyGameView.m_instance.mon3[i].isMenu = false;
				MyGameView.m_instance.hmenustate = false;
			}
			}
	}
	public void ddong4Clear(){
		for(int i = 0; i<9;i++){
			if(MyGameView.m_instance.mon4[i].State  == 3 && MyGameView.m_instance.ddong>0
					&&MyGameView.m_instance.mon4[i].itLive == true)
			{
				MyGameView.m_instance.mon4[i].State = 0;
				MyGameView.m_instance.ddong--;
				MyGameView.m_instance.mon4[i].ddongtime = 0;
				MyGameView.m_instance.mon4[i].isMenu = false;
				MyGameView.m_instance.hmenustate = false;
				}
			else
			{
				MyGameView.m_instance.mon4[i].isMenu = false;
				MyGameView.m_instance.hmenustate = false;
			}
			}
	}
	public void ddongAllClear(){
		ddong1Clear();
		ddong2Clear();
		ddong3Clear();
		ddong4Clear();
	}
	public void Sell1Clear(){
		for(int i=0;i<9;i++){
			if(MyGameView.m_instance.mon1[i].itLive == true){
				MyGameView.m_instance.mon1[i].itLive = false;
				MyGameView.m_instance.mon1[i].State = 0;
				MyGameView.m_instance.gold += 10*
						MyGameView.m_instance.mon1[i].Level*
						MyGameView.m_instance.mon1[i].Level*
						(MyGameView.m_instance.mon1[i].shurui+1)*
						(MyGameView.m_instance.mon1[i].shurui+1)*3;
				MyGameView.m_instance.mon1[i].isMenu = false;
				MyGameView.m_instance.hmenustate = false;
				}
			else
			{
				MyGameView.m_instance.mon1[i].isMenu = false;
				MyGameView.m_instance.hmenustate = false;
			}
		}
	}
	public void Sell2Clear(){
		for(int i=0;i<9;i++){
			if(MyGameView.m_instance.mon2[i].itLive == true){
				MyGameView.m_instance.mon2[i].itLive = false;
				MyGameView.m_instance.mon2[i].State = 0;
				MyGameView.m_instance.gold += 10*
						MyGameView.m_instance.mon2[i].Level*
						MyGameView.m_instance.mon2[i].Level*
						(MyGameView.m_instance.mon2[i].shurui+1)*
						(MyGameView.m_instance.mon2[i].shurui+1)*3;
				MyGameView.m_instance.mon2[i].isMenu = false;
				MyGameView.m_instance.hmenustate = false;
			}
			else
			{
				MyGameView.m_instance.mon2[i].isMenu = false;
				MyGameView.m_instance.hmenustate = false;
			}
		}
	}
	public void Sell3Clear(){
		for(int i=0;i<9;i++){
			if(MyGameView.m_instance.mon3[i].itLive == true){
				MyGameView.m_instance.mon3[i].itLive = false;
				MyGameView.m_instance.mon3[i].State = 0;
				MyGameView.m_instance.gold += 10*
						MyGameView.m_instance.mon3[i].Level*
						MyGameView.m_instance.mon3[i].Level*
						(MyGameView.m_instance.mon3[i].shurui+1)*
						(MyGameView.m_instance.mon3[i].shurui+1)*3;
				MyGameView.m_instance.mon3[i].isMenu = false;
				MyGameView.m_instance.hmenustate = false;
				}
			else
			{
				MyGameView.m_instance.mon3[i].isMenu = false;
				MyGameView.m_instance.hmenustate = false;
			}
		}
	}
	public void Sell4Clear(){
		for(int i=0;i<9;i++){
			if(MyGameView.m_instance.mon4[i].itLive == true){
				MyGameView.m_instance.mon4[i].itLive = false;
				MyGameView.m_instance.mon4[i].State = 0;
				MyGameView.m_instance.gold += 10*
						MyGameView.m_instance.mon4[i].Level*
						MyGameView.m_instance.mon4[i].Level*
						(MyGameView.m_instance.mon4[i].shurui+1)*
						(MyGameView.m_instance.mon4[i].shurui+1)*3;
				MyGameView.m_instance.mon4[i].isMenu = false;
				MyGameView.m_instance.hmenustate = false;
			}
			else
			{
				MyGameView.m_instance.mon4[i].isMenu = false;
				MyGameView.m_instance.hmenustate = false;
			}
		}
	}
	public void SellAllClear(){
		Sell1Clear();
		Sell2Clear();
		Sell3Clear();
		Sell4Clear();
	}
}
