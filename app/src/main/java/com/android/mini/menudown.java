package com.android.mini;

import android.content.Context;
import android.util.Log;

public class menudown {
	public menudown m_instance;
	kanri kr = new kanri();
	SoundControl sc = new SoundControl();
	ControlPet cp = new ControlPet();
	int w = 60;
	public menudown(){
		m_instance = this;
	}
	
	public void toFarm(Context mContext){
		sc.m_instance.StopSound(3);
		GameState.GameState_NowState = GameState.GameState_Fram;	
		
		if(MyGameView.m_instance.s_on)
			sc.m_instance.soundinit(0,mContext);
		else if(MyGameView.m_instance.s_on==false)
			sc.m_instance.StopSound(0);
		if (MyGameView.m_instance.v_on == true)
			GunBg.vibeator.vibrate(200);
		else if (MyGameView.m_instance.v_on == false)
			GunBg.vibeator.vibrate(0);
		
		Log.e("asd", "asd");
	}
	public void exit(){
		MyGameView.m_instance.StopGame();
		System.exit(0);
	}
	public void vib(){
		if (MyGameView.m_instance.v_on == true)
			GunBg.vibeator.vibrate(200);
		else if (MyGameView.m_instance.v_on == false)
			GunBg.vibeator.vibrate(0);
	}
	public void pocketmon(){
		if (MyGameView.m_instance.poketY < 650) {
			if (MyGameView.m_instance.poketX < 240) {
				if (MyGameView.m_instance.x1 >= MyGameView.m_instance.poketX && MyGameView.m_instance.x1 <= MyGameView.m_instance.poketX + w
						&& MyGameView.m_instance.y1 >= MyGameView.m_instance.poketY && MyGameView.m_instance.y1 < MyGameView.m_instance.poketY + w) {// ////먹이주기
					// 메뉴
					kr.m_instance.meatmenu();
				} else if (MyGameView.m_instance.x1 >= MyGameView.m_instance.poketX + w
						&& MyGameView.m_instance.x1 <= MyGameView.m_instance.poketX + w * 2 && MyGameView.m_instance.y1 >= MyGameView.m_instance.poketY
						&& MyGameView.m_instance.y1 < MyGameView.m_instance.poketY + w) {// 치료하기 메뉴
					kr.m_instance.medichinemenu();
				} else if (MyGameView.m_instance.x1 >= MyGameView.m_instance.poketX + w * 2
						&& MyGameView.m_instance.x1 <= MyGameView.m_instance.poketX + w * 3 && MyGameView.m_instance.y1 >= MyGameView.m_instance.poketY
						&& MyGameView.m_instance.y1 < MyGameView.m_instance.poketY + w) {// 청소하기 메뉴
					kr.m_instance.ddongmenu();
				} else if (MyGameView.m_instance.x1 >= MyGameView.m_instance.poketX + w * 3
						&& MyGameView.m_instance.x1 <= MyGameView.m_instance.poketX + w * 4 && MyGameView.m_instance.y1 >= MyGameView.m_instance.poketY
						&& MyGameView.m_instance.y1 < MyGameView.m_instance.poketY + w) {
					kr.m_instance.sellmenu();
				}
				else if (MyGameView.m_instance.x1 >= MyGameView.m_instance.poketX && MyGameView.m_instance.x1 <= MyGameView.m_instance.poketX + w
						&& MyGameView.m_instance.y1 >= MyGameView.m_instance.poketY+w && MyGameView.m_instance.y1 < MyGameView.m_instance.poketY + w*2) {// ////먹이주기
					// 메뉴
						{
							for(int i=0;i<9;i++){
								Log.e("asdf", "asdf");
								if(MyGameView.m_instance.mon1[i].isMenu == true)
								cp.m_instance.food1Clear();
								else if(MyGameView.m_instance.mon2[i].isMenu == true)
									cp.m_instance.food2Clear();
								else if(MyGameView.m_instance.mon3[i].isMenu == true)
									cp.m_instance.food3Clear();
								else if(MyGameView.m_instance.mon4[i].isMenu == true)
									cp.m_instance.food4Clear();
							}
						}
					} else if (MyGameView.m_instance.x1 >= MyGameView.m_instance.poketX + w
						&& MyGameView.m_instance.x1 <= MyGameView.m_instance.poketX + w * 2 
						&& MyGameView.m_instance.y1 >= MyGameView.m_instance.poketY+w
						&& MyGameView.m_instance.y1 < MyGameView.m_instance.poketY + w*2) 
					{// 치료하기 메뉴
						for(int i=0;i<9;i++){
							if(MyGameView.m_instance.mon1[i].isMenu == true)
							cp.m_instance.medic1Clear();
							else if(MyGameView.m_instance.mon2[i].isMenu == true)
								cp.m_instance.medic2Clear();
							else if(MyGameView.m_instance.mon3[i].isMenu == true)
								cp.m_instance.medic3Clear();
							else if(MyGameView.m_instance.mon4[i].isMenu == true)
								cp.m_instance.medic4Clear();
							}
				} else if (MyGameView.m_instance.x1 >= MyGameView.m_instance.poketX + w * 2
						&& MyGameView.m_instance.x1 <= MyGameView.m_instance.poketX + w * 3 
						&& MyGameView.m_instance.y1 >= MyGameView.m_instance.poketY+w
						&& MyGameView.m_instance.y1 < MyGameView.m_instance.poketY + w*2) {// 청소하기 메뉴
					
					for(int i=0;i<9;i++){
						if(MyGameView.m_instance.mon1[i].isMenu == true)
						cp.m_instance.ddong1Clear();
						else if(MyGameView.m_instance.mon2[i].isMenu == true)
							cp.m_instance.ddong2Clear();
						else if(MyGameView.m_instance.mon3[i].isMenu == true)
							cp.m_instance.ddong3Clear();
						else if(MyGameView.m_instance.mon4[i].isMenu == true)
							cp.m_instance.ddong4Clear();
						}
				} else if (MyGameView.m_instance.x1 >= MyGameView.m_instance.poketX + w * 3
						&& MyGameView.m_instance.x1 <= MyGameView.m_instance.poketX + w * 4 
						&& MyGameView.m_instance.y1 >= MyGameView.m_instance.poketY +w
						&& MyGameView.m_instance.y1 < MyGameView.m_instance.poketY + w*2) {
					for(int i=0;i<9;i++){
						if(MyGameView.m_instance.mon1[i].isMenu == true)
						cp.m_instance.Sell1Clear();
						else if(MyGameView.m_instance.mon2[i].isMenu == true)
							cp.m_instance.Sell2Clear();
						else if(MyGameView.m_instance.mon3[i].isMenu == true)
							cp.m_instance.Sell3Clear();
						else if(MyGameView.m_instance.mon4[i].isMenu == true)
							cp.m_instance.Sell4Clear();
						}
				} else {
					kr.m_instance.close();
				}
			}// px < (가로/2)보다 작을때
			else {
				if (MyGameView.m_instance.x1 >= MyGameView.m_instance.poketX - w * 4 && MyGameView.m_instance.x1 < MyGameView.m_instance.poketX - w * 3
						&& MyGameView.m_instance.y1 >= MyGameView.m_instance.poketY && MyGameView.m_instance.y1 < MyGameView.m_instance.poketY + w) {
					// ////먹이주기메뉴
					kr.m_instance.meatmenu();
				} else if (MyGameView.m_instance.x1 >= MyGameView.m_instance.poketX - w * 3
						&& MyGameView.m_instance.x1 < MyGameView.m_instance.poketX - w * 2 && MyGameView.m_instance.y1 >= MyGameView.m_instance.poketY
						&& MyGameView.m_instance.y1 < MyGameView.m_instance.poketY + w) {// 치료하기 메뉴
					kr.m_instance.medichinemenu();
				} else if (MyGameView.m_instance.x1 >= MyGameView.m_instance.poketX - w * 2
						&& MyGameView.m_instance.x1 < MyGameView.m_instance.poketX - w && MyGameView.m_instance.y1 >= MyGameView.m_instance.poketY
						&& MyGameView.m_instance.y1 < MyGameView.m_instance.poketY + w) {// 청소하기 메뉴
					kr.m_instance.ddongmenu();
				} 
				else if (MyGameView.m_instance.x1 >= MyGameView.m_instance.poketX - w && MyGameView.m_instance.x1 < MyGameView.m_instance.poketX
						&& MyGameView.m_instance.y1 >= MyGameView.m_instance.poketY && MyGameView.m_instance.y1 < MyGameView.m_instance.poketY + w)
				{
					kr.m_instance.sellmenu();
				}
				else if (MyGameView.m_instance.x1 >= MyGameView.m_instance.poketX - w * 4 
						&& MyGameView.m_instance.x1 < MyGameView.m_instance.poketX - w * 3
						&& MyGameView.m_instance.y1 >= MyGameView.m_instance.poketY +w 
						&& MyGameView.m_instance.y1 < MyGameView.m_instance.poketY + w*2) {
					// ////먹이주기메뉴
					for(int i=0;i<9;i++){
						if(MyGameView.m_instance.mon1[i].isMenu == true)
							cp.m_instance.food1Clear();
						else if(MyGameView.m_instance.mon2[i].isMenu == true)
							cp.m_instance.food2Clear();
						else if(MyGameView.m_instance.mon3[i].isMenu == true)
							cp.m_instance.food3Clear();
						else if(MyGameView.m_instance.mon4[i].isMenu == true)
							cp.m_instance.food4Clear();
								}
				} else if (MyGameView.m_instance.x1 >= MyGameView.m_instance.poketX - w * 3
						&& MyGameView.m_instance.x1 < MyGameView.m_instance.poketX - w * 2
						&& MyGameView.m_instance.y1 >= MyGameView.m_instance.poketY +w
						&& MyGameView.m_instance.y1 < MyGameView.m_instance.poketY + w*2) 
				{// 치료하기 메뉴
					for(int i=0;i<9;i++){
						if(MyGameView.m_instance.mon1[i].isMenu == true)
							cp.m_instance.medic1Clear();
						else if(MyGameView.m_instance.mon2[i].isMenu == true)
							cp.m_instance.medic2Clear();
						else if(MyGameView.m_instance.mon3[i].isMenu == true)
							cp.m_instance.medic3Clear();
						else if(MyGameView.m_instance.mon4[i].isMenu == true)
							cp.m_instance.medic4Clear();
							}
				} else if (MyGameView.m_instance.x1 >= MyGameView.m_instance.poketX - w * 2
						&& MyGameView.m_instance.x1 < MyGameView.m_instance.poketX - w 
						&& MyGameView.m_instance.y1 >= MyGameView.m_instance.poketY +w
						&& MyGameView.m_instance.y1 < MyGameView.m_instance.poketY + w*2) 
				{// 청소하기 메뉴

						for(int i=0;i<9;i++){
								if(MyGameView.m_instance.mon1[i].isMenu == true)
										cp.m_instance.ddong1Clear();
								else if(MyGameView.m_instance.mon2[i].isMenu == true)
										cp.m_instance.ddong2Clear();
								else if(MyGameView.m_instance.mon3[i].isMenu == true)
										cp.m_instance.ddong3Clear();
								else if(MyGameView.m_instance.mon4[i].isMenu == true)
										cp.m_instance.ddong4Clear();
							}
				} else if (MyGameView.m_instance.x1 >= MyGameView.m_instance.poketX - w
						&& MyGameView.m_instance.x1 < MyGameView.m_instance.poketX
						&& MyGameView.m_instance.y1 >= MyGameView.m_instance.poketY +w
						&& MyGameView.m_instance.y1 < MyGameView.m_instance.poketY + w*2)
				{
					for(int i=0;i<9;i++){
						if(MyGameView.m_instance.mon1[i].isMenu == true)
							cp.m_instance.Sell1Clear();
						else if(MyGameView.m_instance.mon2[i].isMenu == true)
							cp.m_instance.Sell2Clear();
						else if(MyGameView.m_instance.mon3[i].isMenu == true)
							cp.m_instance.Sell3Clear();
						else if(MyGameView.m_instance.mon4[i].isMenu == true)
							cp.m_instance.Sell4Clear();
								}
				} 
				else {
					kr.m_instance.close();
				}
			}// px < (가로/2)
		}// py는 650보다 작을때
		else {
			// py는 650보다 클때
			if (MyGameView.m_instance.poketX < 240) {
				if (MyGameView.m_instance.x1 >= MyGameView.m_instance.poketX 
						&& MyGameView.m_instance.x1 <= MyGameView.m_instance.poketX + w
						&& MyGameView.m_instance.y1 >= MyGameView.m_instance.poketY - w*2 
						&& MyGameView.m_instance.y1 < MyGameView.m_instance.poketY-w) {// ////먹이주기
					// 메뉴
					kr.m_instance.meatmenu();
				} else if (MyGameView.m_instance.x1 >= MyGameView.m_instance.poketX + w
						&& MyGameView.m_instance.x1 <= MyGameView.m_instance.poketX + w * 2
						&& MyGameView.m_instance.y1 >= MyGameView.m_instance.poketY - w*2
						&& MyGameView.m_instance.y1 < MyGameView.m_instance.poketY-w) {// 치료하기
					// 메뉴
					kr.m_instance.medichinemenu();
				} else if (MyGameView.m_instance.x1 >= MyGameView.m_instance.poketX + w * 2
						&& MyGameView.m_instance.x1 <= MyGameView.m_instance.poketX + w * 3
						&& MyGameView.m_instance.y1 >= MyGameView.m_instance.poketY - w*2 
						&& MyGameView.m_instance.y1 < MyGameView.m_instance.poketY-w) {// 청소하기
					// 메뉴
					kr.m_instance.ddongmenu();
		
				} else if (MyGameView.m_instance.x1 >= MyGameView.m_instance.poketX + w * 3
						&& MyGameView.m_instance.x1 <= MyGameView.m_instance.poketX + w * 4
						&& MyGameView.m_instance.y1 >= MyGameView.m_instance.poketY - w*2
						&& MyGameView.m_instance.y1 < MyGameView.m_instance.poketY-w) {
					kr.m_instance.sellmenu();
				
				}
				
				else if (MyGameView.m_instance.x1 >= MyGameView.m_instance.poketX 
						&& MyGameView.m_instance.x1 <= MyGameView.m_instance.poketX + w
						&& MyGameView.m_instance.y1 >= MyGameView.m_instance.poketY-w 
						&& MyGameView.m_instance.y1 < MyGameView.m_instance.poketY) {// ////먹이주기
					// 메뉴
					for(int i=0;i<9;i++){
						if(MyGameView.m_instance.mon1[i].isMenu == true)
							cp.m_instance.food1Clear();
						else if(MyGameView.m_instance.mon2[i].isMenu == true)
							cp.m_instance.food2Clear();
						else if(MyGameView.m_instance.mon3[i].isMenu == true)
							cp.m_instance.food3Clear();
						else if(MyGameView.m_instance.mon4[i].isMenu == true)
							cp.m_instance.food4Clear();
								}
					
				} else if (MyGameView.m_instance.x1 >= MyGameView.m_instance.poketX + w
						&& MyGameView.m_instance.x1 <= MyGameView.m_instance.poketX + w * 2
						&& MyGameView.m_instance.y1 >= MyGameView.m_instance.poketY -w 
						&& MyGameView.m_instance.y1 < MyGameView.m_instance.poketY) {// 치료하기
					// 메뉴
					for(int i=0;i<9;i++){
						if(MyGameView.m_instance.mon1[i].isMenu == true)
							cp.m_instance.medic1Clear();
						else if(MyGameView.m_instance.mon2[i].isMenu == true)
							cp.m_instance.medic2Clear();
						else if(MyGameView.m_instance.mon3[i].isMenu == true)
							cp.m_instance.medic3Clear();
						else if(MyGameView.m_instance.mon4[i].isMenu == true)
							cp.m_instance.medic4Clear();
							}
					
				} else if (MyGameView.m_instance.x1 >= MyGameView.m_instance.poketX + w * 2
						&& MyGameView.m_instance.x1 <= MyGameView.m_instance.poketX + w * 3
						&& MyGameView.m_instance.y1 >= MyGameView.m_instance.poketY -w 
						&& MyGameView.m_instance.y1 < MyGameView.m_instance.poketY) {// 청소하기
					// 메뉴
					for(int i=0;i<9;i++){
						if(MyGameView.m_instance.mon1[i].isMenu == true)
							cp.m_instance.ddong1Clear();
						else if(MyGameView.m_instance.mon2[i].isMenu == true)
							cp.m_instance.ddong2Clear();
						else if(MyGameView.m_instance.mon3[i].isMenu == true)
							cp.m_instance.ddong3Clear();
						else if(MyGameView.m_instance.mon4[i].isMenu == true)
							cp.m_instance.ddong4Clear();
							}
				} else if (MyGameView.m_instance.x1 >= MyGameView.m_instance.poketX + w * 3
						&& MyGameView.m_instance.x1 <= MyGameView.m_instance.poketX + w * 4
						&& MyGameView.m_instance.y1 >= MyGameView.m_instance.poketY-w  
						&& MyGameView.m_instance.y1 < MyGameView.m_instance.poketY) {

						for(int i=0;i<9;i++){
							if(MyGameView.m_instance.mon1[i].isMenu == true)
								cp.m_instance.Sell1Clear();
							else if(MyGameView.m_instance.mon2[i].isMenu == true)
								cp.m_instance.Sell2Clear();
							else if(MyGameView.m_instance.mon3[i].isMenu == true)
								cp.m_instance.Sell3Clear();
							else if(MyGameView.m_instance.mon4[i].isMenu == true)
								cp.m_instance.Sell4Clear();
									}
				}
				else {
					kr.m_instance.close();
				}
			}// px < (가로/2)보다 작을때
			else {
				if (MyGameView.m_instance.x1 >= MyGameView.m_instance.poketX - w * 4 
						&& MyGameView.m_instance.x1 < MyGameView.m_instance.poketX - w * 3
						&& MyGameView.m_instance.y1 >= MyGameView.m_instance.poketY - w*2 
						&& MyGameView.m_instance.y1 < MyGameView.m_instance.poketY-w) {// ////먹이주기
					// 메뉴
					kr.m_instance.meatmenu();
				} else if (MyGameView.m_instance.x1 >= MyGameView.m_instance.poketX - w * 3
						&& MyGameView.m_instance.x1 < MyGameView.m_instance.poketX - w * 2
						&& MyGameView.m_instance.y1 >= MyGameView.m_instance.poketY - w*2
						&& MyGameView.m_instance.y1 < MyGameView.m_instance.poketY-w) {// 치료하기
					// 메뉴
					kr.m_instance.medichinemenu();
				} else if (MyGameView.m_instance.x1 >= MyGameView.m_instance.poketX - w * 2
						&& MyGameView.m_instance.x1 < MyGameView.m_instance.poketX - w 
						&& MyGameView.m_instance.y1 >= MyGameView.m_instance.poketY - w*2
						&& MyGameView.m_instance.y1 < MyGameView.m_instance.poketY-w) {// 청소하기 메뉴
					kr.m_instance.ddongmenu();
				} else if (MyGameView.m_instance.x1 >= MyGameView.m_instance.poketX - w
						&& MyGameView.m_instance.x1 < MyGameView.m_instance.poketX
						&& MyGameView.m_instance.y1 >= MyGameView.m_instance.poketY - w*2
						&& MyGameView.m_instance.y1 < MyGameView.m_instance.poketY-w) {
					kr.m_instance.sellmenu();
				}
				if (MyGameView.m_instance.x1 >= MyGameView.m_instance.poketX - w * 4 
						&& MyGameView.m_instance.x1 < MyGameView.m_instance.poketX - w * 3
						&& MyGameView.m_instance.y1 >= MyGameView.m_instance.poketY-w 
						&& MyGameView.m_instance.y1 < MyGameView.m_instance.poketY) {// ////먹이주기
					// 메뉴
					for(int i=0;i<9;i++){
						if(MyGameView.m_instance.mon1[i].isMenu == true)
							cp.m_instance.food1Clear();
						else if(MyGameView.m_instance.mon2[i].isMenu == true)
							cp.m_instance.food2Clear();
						else if(MyGameView.m_instance.mon3[i].isMenu == true)
							cp.m_instance.food3Clear();
						else if(MyGameView.m_instance.mon4[i].isMenu == true)
							cp.m_instance.food4Clear();
								}
				} else if (MyGameView.m_instance.x1 >= MyGameView.m_instance.poketX - w * 3
						&& MyGameView.m_instance.x1 < MyGameView.m_instance.poketX - w * 2
						&& MyGameView.m_instance.y1 >= MyGameView.m_instance.poketY-w
						&& MyGameView.m_instance.y1 < MyGameView.m_instance.poketY) {// 치료하기
					// 메뉴
					for(int i=0;i<9;i++){
						if(MyGameView.m_instance.mon1[i].isMenu == true)
							cp.m_instance.medic1Clear();
						else if(MyGameView.m_instance.mon2[i].isMenu == true)
							cp.m_instance.medic2Clear();
						else if(MyGameView.m_instance.mon3[i].isMenu == true)
							cp.m_instance.medic3Clear();
						else if(MyGameView.m_instance.mon4[i].isMenu == true)
							cp.m_instance.medic4Clear();
							}
					
				} else if (MyGameView.m_instance.x1 >= MyGameView.m_instance.poketX - w * 2
						&& MyGameView.m_instance.x1 < MyGameView.m_instance.poketX - w &&
						MyGameView.m_instance.y1 >= MyGameView.m_instance.poketY-w
						&& MyGameView.m_instance.y1 < MyGameView.m_instance.poketY) {// 청소하기 메뉴
					for(int i=0;i<9;i++){
						if(MyGameView.m_instance.mon1[i].isMenu == true)
							cp.m_instance.ddong1Clear();
						else if(MyGameView.m_instance.mon2[i].isMenu == true)
							cp.m_instance.ddong2Clear();
						else if(MyGameView.m_instance.mon3[i].isMenu == true)
							cp.m_instance.ddong3Clear();
						else if(MyGameView.m_instance.mon4[i].isMenu == true)
							cp.m_instance.ddong4Clear();
							}
				} else if (MyGameView.m_instance.x1 >= MyGameView.m_instance.poketX - w 
						&& MyGameView.m_instance.x1 < MyGameView.m_instance.poketX
						&& MyGameView.m_instance.y1 >= MyGameView.m_instance.poketY-w
						&& MyGameView.m_instance.y1 < MyGameView.m_instance.poketY) {
					for(int i=0;i<9;i++){
						if(MyGameView.m_instance.mon1[i].isMenu == true)
							cp.m_instance.Sell1Clear();
						else if(MyGameView.m_instance.mon2[i].isMenu == true)
							cp.m_instance.Sell2Clear();
						else if(MyGameView.m_instance.mon3[i].isMenu == true)
							cp.m_instance.Sell3Clear();
						else if(MyGameView.m_instance.mon4[i].isMenu == true)
							cp.m_instance.Sell4Clear();
								}
				} else {
					kr.m_instance.close();
				}
			}
		}// py는 650보다 클땐
	}
}
