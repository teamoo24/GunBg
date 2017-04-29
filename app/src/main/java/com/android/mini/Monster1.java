package com.android.mini;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;


public class Monster1 {
	
	public static Monster1  m_instance;
	public long tfcheck;
	public int State;
	//���ɸ��ų� ����°ŵ��� üũ
	//0.��һ���
	//1.����°�
	//2.���ɸ���
	//3.�˽Ѱ�
	public long birthtime;
	//�¾ �ð��� int������ üũ
	public long meattime;
	public long byungtime;
	public long ddongtime;
	public int Level;
	//���ϸ��� ��ȭ ���� üũ
	/*
	 Level 0 = ����
	 Level 1 = ���� 1 ¥��
	 Level 2 = ���� 2 ¥��
	 Level 3 = ���� 3 ¥��
	 */
	public long leveltime;
	public boolean itLive;
	//����ִ��� üũ
	public int shurui;
	public boolean isMenu;
	//���Ϳ� ���� �޴� üũ
	public Bitmap[][] now = new Bitmap[3][2];
	//��ȭ���¿� ������ �׸�1,2�� ��Ÿ����.
public Monster1(Context context){
	m_instance = this;
	now[0][0] = BitmapFactory.decodeResource(context.getResources(), R.raw._monster010101);
	now[0][1] = BitmapFactory.decodeResource(context.getResources(), R.raw._monster010102);
	now[1][0] = BitmapFactory.decodeResource(context.getResources(), R.raw._monster010201);
	now[1][1] = BitmapFactory.decodeResource(context.getResources(), R.raw._monster010202);
	now[2][0] = BitmapFactory.decodeResource(context.getResources(), R.raw._monster010301);
	now[2][1] = BitmapFactory.decodeResource(context.getResources(), R.raw._monster010302);
	}
}
