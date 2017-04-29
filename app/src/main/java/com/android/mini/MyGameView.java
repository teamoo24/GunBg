package com.android.mini;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Random;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.media.AudioManager;
import android.media.SoundPool;
import android.util.Log;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;

public class MyGameView extends SurfaceView implements Callback {
	public static MyGameView m_instance;
	GameThread mThread; // ������Ŭ����
	SurfaceHolder mHolder;
	Context mContext;
	ArrayList<Enemy> mEnemy = new ArrayList<Enemy>(); // �̴ϰ��ӿ� ������ ���� �迭����Ʈ
	ArrayList<Gold> mGold = new ArrayList<Gold>();
	SoundPool sound; // ����
	int sounds[] = new int[3];
	long k;
	int logo_alpha = 0; // �ΰ� ����
	int logo_alpha2 = 255; // �ΰ� ����
	boolean logo_alpha_ok = false;
	boolean logo_alpha2_ok = false;
	int alpha = 2;
	int lifecheck = 3;
	int buyu[] = new int[2];
	int x;
	int x1, y1 = 0; // //��ġ x ��ǥ��ġ y ��ǥ
	int xx, yy; // ���� x,y �������޴� ����
	int cw, ch; // ��ġ ����Ʈ ���μ��� ũ�⺯��
	int gold = 1500; // ��庯��
	int goldiv[] = new int[6]; // ��� �ڸ��� ������ ����
	int level = 1; // ��������
	boolean mFlag = false; // �ȻѸ�
	int lifeCnt = 0;
	int mGameCnt = 0; // �������̿��� ���� ī��Ʈ
	int EffectCnt = 0; // ����Ʈ ī��Ʈ
	int EnemyCnt = 0; // �̳ʹ� ī��Ʈ
	int count = 0; // ���� �ø��� �ʿ��� ����ġ ����
	boolean UpCheck = false; // ��ġ�� üũ����
	Random random = new Random(); // ���� �Լ�
	String str = ""; // �ؽ�Ʈ �ѷ��� ����
	long text_time; // �ð� �޾ƿͼ� �ؽ�Ʈ �ѷ��ִ°� �����ϴ� ����
	boolean drawcheck = false; // ���� ���� üũ����
	boolean gamecheck = false; // ���� �����ߴ��� ���ߴ��� üũ ����
	int nowword = 0; // ���ڻѷ��ٶ� �ѱ��ھ� üũ
	int nowline = 0; // ��¥�ѷ��ٶ� ���پ� üũ
	boolean menucheck = false;
	int poketX, poketY;
	// ���ϸ��� Ŭ�������� �� ��ǥ�� �������ش�.
	boolean hmenustate;
	// �޴��� �����ִ°��� üũ�Ҷ� ���

	boolean isOK;
	// ���� ������ �����Ҷ� ���
	int meat2[] = new int[2];
	int medichine2[] = new int[2];
	int ddong2[] = new int[2];
	int State;
	// ���� ����� ����
	int width = 480;
	int height = 800;
	int div;
	int remaintime=100000;
	mine mi = new mine();
	Monster1 sample1;
	Monster2 sample2;
	Monster3 sample3;
	Monster4 sample4;
	Bitmap Gauge[] = new Bitmap[2];
	Bitmap jouhou[] = new Bitmap[6];
	Bitmap tem[] = new Bitmap[3];

	kanri kr = new kanri();
	menudown md = new menudown();
	SoundControl sc = new SoundControl();
	/*
	 * State ������ ���� 1 : �������� 2 : 1�� ���� 3 : 2�� ���� 4 : 3������ 5 : ������
	 */
	int farmlevel;
	// ���� ���� ��������
	int meat;
	// �����Ǽ�
	int medichine;
	// ���Ǽ�
	int ddong;
	boolean up;
	int n;
	int n2;

	int monstergap;
	Monster1[] mon1 = new Monster1[10];
	Monster2[] mon2 = new Monster2[10];
	Monster3[] mon3 = new Monster3[10];
	Monster4[] mon4 = new Monster4[10];
	boolean check = true;
	boolean threadcheck;
	boolean canRun = true;
	boolean isWait = false;
	boolean s_on = true;
	boolean v_on = true;
	// ġ����ִ¼�
	GregorianCalendar calender;
	SimpleDateFormat dateFormat;
	String dateTime;
	// ���ں�Ʈ��
	Bitmap Backside[] = new Bitmap[2];
	newPocketmon1 np1 = new newPocketmon1();
	newPocketmon2 np2 = new newPocketmon2();
	newPocketmon3 np3 = new newPocketmon3();
	newPocketmon4 np4 = new newPocketmon4();
	Bitmap po[] = new Bitmap[4];
	// ĳ������ ��Ʈ�� �̹���
	Bitmap Menu;
	// �޴� ��Ʈ��
	Bitmap think[] = new Bitmap[3];
	Bitmap mine;
	Bitmap store;
	Bitmap arrow;
	Bitmap number;
	Bitmap numbers;
	Bitmap money;

	Bitmap effect[] = new Bitmap[9];
	Bitmap enemy[] = new Bitmap[2];
	Bitmap mgold[] = new Bitmap[2];
	Bitmap minetext;
	Bitmap life[] = new Bitmap[2];
	Bitmap menu;
	Bitmap logo;
	Bitmap info[] = new Bitmap[3];
	Bitmap option_on;
	Bitmap option_off;
	Bitmap option;
	Bitmap space;
	//Bitmap hoshi[] = new Bitmap[2];
	InitAll init = new InitAll();
	ControlPet cr = new ControlPet();
	int dx1, dy1;
	// down�������� ��ǥ
	int dx2, dy2;
	// move�Ҷ��� ��ǥ
	int mx, my;
	// �����̸鼭 ��ũ�� ���ִ� ����� �������ش�.
	int drawx, drawy;
	int InfoCnt = 0;

	private int dived;

	String gametext = "�������� �������� �ذ��� óġ�Ͽ� Gold�� ȹ�� �ؾ��Ѵ�!!";
	int imsi = 100;
	int line = 15;
	String text[] = new String[(gametext.length() / line) + 1];

	public MyGameView(Context context) {
		super(context);
		m_instance = this;
		SurfaceHolder holder = getHolder();
		holder.addCallback(this);

		mHolder = holder;
		mContext = context;
		mThread = new GameThread(holder, context);

		for (int i = 0; i < text.length; i++) {
			text[i] = "";
		}

	}

	public void surfaceChanged(SurfaceHolder holder, int format, int width,
			int height) {
	}

	public void surfaceCreated(SurfaceHolder holder) {
		// TODO Auto-generated method stub
		sound = new SoundPool(5, AudioManager.STREAM_MUSIC, 0);
		sounds[0] = sound.load(GunBg.m_instance, R.raw.attack, 1);
		sounds[1] = sound.load(GunBg.m_instance, R.raw.collision, 1);
		sounds[2] = sound.load(GunBg.m_instance, R.raw.coinn, 1);


//////////////������ ���̽� ////////////////////////
	sqlite.loaddb();
	gold = sqlite.get_gold;
	farmlevel = sqlite.get_map;
	State = sqlite.get_farm;
	meat = sqlite.get_meat;
	medichine = sqlite.get_medi;
	ddong = sqlite.get_ddong;
	for(int i=0;i<9;i++)
	{
		Log.i("get_mon1_shurui",""+sqlite.get_mon1_shurui);
		mon1[i].shurui = sqlite.get_mon1_shurui;
		
		Log.i("get_mon1_level",""+sqlite.get_mon1_level);
		mon1[i].Level = sqlite.get_mon1_level;
		
		Log.i("get_mon1_state",""+sqlite.get_mon1_state);
		mon1[i].State = sqlite.get_mon1_state;
		
		Log.i("get_mon1_live",""+sqlite.get_mon1_live);
		mon1[i].tfcheck = sqlite.get_mon1_live[i];
		
		Log.i("get_mon1_leveltime",""+sqlite.get_mon1_leveltime);
		mon1[i].leveltime = sqlite.get_mon1_leveltime;
		
		Log.i("get_mon1_birthtime",""+sqlite.get_mon1_birthtime);
		mon1[i].birthtime = sqlite.get_mon1_birthtime;
///////////////////////////////////////////////////////////////////
		Log.i("get_mon2_shurui",""+sqlite.get_mon2_shurui);
		mon2[i].shurui = sqlite.get_mon2_shurui;
		
		Log.i("get_mon2_level",""+sqlite.get_mon2_level);
		mon2[i].Level = sqlite.get_mon2_level;
		
		Log.i("get_mon2_state",""+sqlite.get_mon2_state);
		mon2[i].State = sqlite.get_mon2_state;
		
		Log.i("get_mon2_live",""+sqlite.get_mon2_live);
		mon2[i].tfcheck = sqlite.get_mon2_live[i];
		
		Log.i("get_mon2_leveltime",""+sqlite.get_mon2_leveltime);
		mon2[i].leveltime = sqlite.get_mon2_leveltime;
		
		Log.i("get_mon2_birthtime",""+sqlite.get_mon2_birthtime);
		mon2[i].birthtime = sqlite.get_mon2_birthtime;
/////////////////////////////////////////////////////////////////////
		Log.i("get_mon3_shurui",""+sqlite.get_mon3_shurui);
		mon3[i].shurui = sqlite.get_mon3_shurui;
		
		Log.i("get_mon3_level",""+sqlite.get_mon3_level);
		mon3[i].Level = sqlite.get_mon3_level;
		
		Log.i("get_mon3_state",""+sqlite.get_mon3_state);
		mon3[i].State = sqlite.get_mon3_state;
		
		Log.i("get_mon3_live",""+sqlite.get_mon3_live);
		mon3[i].tfcheck = sqlite.get_mon3_live[i];
		
		Log.i("get_mon3_leveltime",""+sqlite.get_mon3_leveltime);
		mon3[i].leveltime = sqlite.get_mon3_leveltime;

		Log.i("get_mon3_birthtime",""+sqlite.get_mon3_birthtime);
		mon3[i].birthtime = sqlite.get_mon3_birthtime;
/////////////////////////////////////////////////////////////////////
		Log.i("get_mon4_shurui",""+sqlite.get_mon4_shurui);
		mon4[i].shurui = sqlite.get_mon4_shurui;
		
		Log.i("get_mon4_level",""+sqlite.get_mon4_level);
		mon4[i].Level = sqlite.get_mon4_level;
		
		Log.i("get_mon4_state",""+sqlite.get_mon4_state);
		mon4[i].State = sqlite.get_mon4_state;
		
		Log.i("get_mon4_live",""+sqlite.get_mon4_live);
		mon4[i].tfcheck = sqlite.get_mon4_live[i];
		
		Log.i("get_mon4_leveltime",""+sqlite.get_mon4_leveltime);
		mon4[i].leveltime = sqlite.get_mon4_leveltime;
		
		Log.i("get_mon4_birthtime",""+sqlite.get_mon4_birthtime);
		mon4[i].birthtime = sqlite.get_mon4_birthtime;
/////////////////////////////////////////////////////////////////////			
		if(mon1[i].tfcheck==1)
		{
			Log.i("321tfcheck1",""+mon1[i].tfcheck);
			mon1[i].itLive=true;
		}
		else if(mon1[i].tfcheck==0)
		{
			Log.i("123tfcheck1",""+mon1[i].tfcheck);
			mon1[i].itLive=false;
		}
		
		if(mon2[i].tfcheck==1)
		{Log.i("tfcheck2",""+mon2[i].tfcheck);
			mon2[i].itLive=true;
		}
		else if(mon2[i].tfcheck==0)
		{Log.i("tfcheck2",""+mon2[i].tfcheck);
			mon2[i].itLive=false;
		}
		
		if(mon3[i].tfcheck==1)
		{Log.i("tfcheck3",""+mon3[i].tfcheck);
			mon3[i].itLive=true;
		}
		else if(mon3[i].tfcheck==0)
		{Log.i("tfcheck3",""+mon3[i].tfcheck);
			mon3[i].itLive=false;
		}
		
		if(mon4[i].tfcheck==1)
		{Log.i("tfcheck4",""+mon4[i].tfcheck);
			mon4[i].itLive=true;
		}
		else if(mon4[i].tfcheck==0)
		{Log.i("tfcheck4",""+mon4[i].tfcheck);
			mon4[i].itLive=false;
		}
	}
//////////////������ ���̽� ////////////////////////
		canRun = true;
		if (GunBg.m_first == false) {
			GunBg.m_first = true;
			Log.e("m_first", "true");
			mThread.start();
		} else {
			Log.e("m_first", "false");
			mThread = null;
			mThread = new GameThread(holder, getContext());
			mThread.start();
		}
	}

	public void surfaceDestroyed(SurfaceHolder holder) {

	}

	public void StopGame() {
//////////////������ ���̽� ////////////////////////
	Log.i("stopgold", "" + sqlite.get_gold);
	sqlite.goldsave(gold);
	sqlite.map_save(farmlevel);
	sqlite.farm_save(State);
	sqlite.meat_save(meat);
	sqlite.medi_save(medichine);
	sqlite.ddong_save(ddong);
	

	for(int i=0;i<9;i++)
	{
		if(mon1[i].itLive)
		{
			Log.i("tfcheck1",""+mon1[i].itLive);
			mon1[i].tfcheck=1;
		}
		else if(mon1[i].itLive==false)
		{
			Log.i("tfcheck1",""+mon1[i].itLive);
			mon1[i].tfcheck=0;
		}
		
		if(mon2[i].itLive)
		{
			Log.i("tfcheck2",""+mon2[i].itLive);
			mon2[i].tfcheck=1;
		}
		else if(mon2[i].itLive==false)
		{
			Log.i("tfcheck2",""+mon2[i].itLive);
			mon2[i].tfcheck=0;
		}
		
		if(mon3[i].itLive)
		{
			Log.i("tfcheck3",""+mon3[i].itLive);
			mon3[i].tfcheck=1;
		}
		else if(mon3[i].itLive==false)
		{
			Log.i("tfcheck3",""+mon3[i].itLive);
			mon3[i].tfcheck=0;
		}
		
		if(mon4[i].itLive)
		{
			Log.i("tfcheck4",""+mon4[i].itLive);
			mon4[i].tfcheck=1;
		}
		else if(mon4[i].itLive==false)
		{
			Log.i("tfcheck4",""+mon4[i].itLive);
			mon4[i].tfcheck=0;
		}

		if(mon1[i].itLive)
		{
			Log.i("shurui1",""+mon1[i].shurui);
			sqlite.mon1shurui_save(mon1[i].shurui);
			Log.i("Level1",""+mon1[i].Level);
			sqlite.mon1level_save(mon1[i].Level);
			Log.i("state1",""+mon1[i].State);
			sqlite.mon1state_save(mon1[i].State);
			//Log.i("live1",""+mon1[i].tfcheck);
			
			Log.i("leveltime1",""+mon1[i].leveltime);
			sqlite.mon1leveltime_save(mon1[i].leveltime);
			Log.i("birthtime1",""+mon1[i].birthtime);
			sqlite.mon1bitrhtime_save(mon1[i].birthtime);
		}
		if(mon2[i].itLive)
		{
			Log.i("shurui2",""+mon2[i].shurui);
			sqlite.mon2shurui_save(mon2[i].shurui);
			Log.i("Level2",""+mon2[i].Level);
			sqlite.mon2level_save(mon2[i].Level);
			Log.i("state2",""+mon2[i].State);
			sqlite.mon2state_save(mon2[i].State);
			//Log.i("live2",""+mon2[i].tfcheck);
			//sqlite.mon2live_save(mon2[i].tfcheck);
			Log.i("leveltime2",""+mon2[i].leveltime);
			sqlite.mon2leveltime_save(mon2[i].leveltime);
			Log.i("birthtime2",""+mon2[i].birthtime);
			sqlite.mon2bitrhtime_save(mon2[i].birthtime);
		}
		if(mon3[i].itLive)
		{
			Log.i("shurui3",""+mon3[i].shurui);
			sqlite.mon3shurui_save(mon3[i].shurui);
			Log.i("Level3",""+mon3[i].Level);
			sqlite.mon3level_save(mon3[i].Level);
			Log.i("state3",""+mon3[i].State);
			sqlite.mon3state_save(mon3[i].State);
			//Log.i("live3",""+mon3[i].tfcheck);
			//sqlite.mon3live_save(mon3[i].tfcheck);
			Log.i("leveltime3",""+mon3[i].leveltime);
			sqlite.mon3leveltime_save(mon3[i].leveltime);
			Log.i("birthtime3",""+mon3[i].birthtime);
			sqlite.mon3bitrhtime_save(mon3[i].birthtime);
		}
		if(mon4[i].itLive)
		{
			Log.i("shurui4",""+mon4[i].shurui);
			sqlite.mon4shurui_save(mon4[i].shurui);
			Log.i("Level4",""+mon4[i].Level);
			sqlite.mon4level_save(mon4[i].Level);
			Log.i("state4",""+mon4[i].State);
			sqlite.mon4state_save(mon4[i].State);
			//Log.i("live4",""+mon4[i].tfcheck);
			//sqlite.mon4live_save(mon4[i].tfcheck);
			Log.i("leveltime4",""+mon4[i].leveltime);
			sqlite.mon4leveltime_save(mon4[i].leveltime);
			Log.i("birthtime4",""+mon4[i].birthtime);
			sqlite.mon4bitrhtime_save(mon4[i].birthtime);
		}
	}
	sqlite.mon1live_save(mon1);
	sqlite.mon2live_save(mon2);
	sqlite.mon3live_save(mon3);
	sqlite.mon4live_save(mon4);

//////////////������ ���̽� ////////////////////////
		mThread.StopThread();
	}

	public void PauseGame() {
		mThread.PauseNResume(true);
	}

	public void ResumeGame() {

		mThread.PauseNResume(false);
	}

	public void RestartGame() {
		mThread.StopThread();
		mThread = null;
		mThread = new GameThread(mHolder, mContext);
		mThread.start();
	}

	// ------------������----------------
	class GameThread extends Thread {
		SurfaceHolder mHolder;

		public GameThread(SurfaceHolder holder, Context context) {
			calender = new GregorianCalendar();
			dateFormat = new SimpleDateFormat("yyyyMMddhhmmss");
			dateFormat.format(calender.getTime());
			mHolder = holder;
			Score(MyGameView.m_instance.gold);
			mi.m_instance.CreateEnemy();
			init.m_instance.mapinit(mContext);
		}

		public void run() {
			Canvas canvas = null;
			while (canRun) {
				if (mHolder == null) {
					Log.e("mHolder", "null");
				}
				canvas = mHolder.lockCanvas();
				try {
					synchronized (mHolder) {

						Update();
						DRAW(canvas);
						Control();
						Score(gold);
						if (up == true) {
							buyu[0]++;
							buyu[1]--;
						} else {
							buyu[0]--;
							buyu[1]++;
						}
						if (buyu[0] == 20)
							up = false;
						if (buyu[0] == 0)
							up = true;

						mGameCnt++;
						if (GameState.GameState_NowState == GameState.GameState_Fram) {
							n = mGameCnt % 20 / 10;
							n2 = mGameCnt % 100 / 50;
							
							for (int i = 0; i < 9; i++)
								cr.m_instance.ControlPocketmon(canvas, i, n);
							if (State < 5)// ���� �ȿ�������
							{
								if(s_on == true)
									GunBg.BackSound[0].start();
								canvas.drawBitmap(Backside[0], drawx, drawy,null);
								//canvas.drawBitmap(hoshi[n2], drawx, drawy, null);
								canvas.drawBitmap(store, 50 + drawx, 40 + drawy
										+ buyu[0] - imsi, null);
								canvas.drawBitmap(space, 450 + drawx, 140
										+ drawy + buyu[1] - imsi, null);
								for (int i = 0; i < 9; i++)
									cr.m_instance.sinkapocketmon(canvas, i);
								for (int i = 0; i < 9; i++)
									cr.m_instance.CheckPocketmon(i);

								// ////////////////////////////////////////////////////���ϸ�
								// �ʱ�ȭ ����

								if (hmenustate == true) {
									drawmenu(canvas);
								}
								//////////meat�� ����////////////////////////////////////////////////////
								canvas.drawBitmap(tem[2], 350,0,null);
								for (int i = 0; i < meat2.length; i++) {
									canvas.drawBitmap(numbers,new Rect(meat2[i] * 36, 0, meat2[i]
											* 36 + numbers.getWidth()/ 10, 47),	new Rect(
													420+ (i + 1)* (numbers.getWidth() / 20),0,
													(420+ (i + 1)* (numbers.getWidth() / 20) + numbers
															.getWidth() / 20),0 + 47), null);
								}
								canvas.drawBitmap(tem[1], 350,70,null);
								for (int i = 0; i < medichine2.length; i++) {
									canvas.drawBitmap(
											numbers,new Rect(medichine2[i] * 36, 0,medichine2[i]
													* 36+ numbers.getWidth()/ 10, 47),new Rect(420
															+ (i + 1)* (numbers.getWidth() / 20),70,(420
																	+ (i + 1)* (numbers.getWidth() / 20) + numbers
																	.getWidth() / 20),70 + 47), null);
								}
								canvas.drawBitmap(tem[0], 350,140,null);
								for (int i = 0; i < ddong2.length; i++) {
									canvas.drawBitmap(numbers,new Rect(ddong2[i] * 36, 0,ddong2[i]* 36+ numbers
											.getWidth()/ 10, 47),new Rect(420+ (i + 1)
													* (numbers.getWidth() / 20),140,(420+ (i + 1)
															* (numbers.getWidth() / 20) + numbers
															.getWidth() / 20),140 + 47), null);
								}
								///////////////////////////////////////////////////////////////////////////////////////////	
							}

							else if (State == 5)// ������ �� ����
							{
								sc.m_instance.StopSound(0);
								if(s_on==true)
									GunBg.BackSound[1].start();
								canvas.drawBitmap(Backside[1], 0, 0, null);
								// ���̼� ����
								for (int i = 0; i < meat2.length; i++) {
									canvas.drawBitmap(numbers,new Rect(meat2[i] * 36, 0, meat2[i]
											* 36 + numbers.getWidth()/ 10, 47),	new Rect(
													410+ (i + 1)* (numbers.getWidth() / 20),620,
													(410+ (i + 1)* (numbers.getWidth() / 20) + numbers
															.getWidth() / 20),620 + 47), null);
								}
								canvas.drawBitmap(jouhou[4], 400,590,null);

								for (int i = 0; i < medichine2.length; i++) {
									canvas.drawBitmap(
											numbers,new Rect(medichine2[i] * 36, 0,medichine2[i]
													* 36+ numbers.getWidth()/ 10, 47),new Rect(310
															+ (i + 1)* (numbers.getWidth() / 20),590,(310
																	+ (i + 1)* (numbers.getWidth() / 20) + numbers
																	.getWidth() / 20),590 + 47), null);
								}
								canvas.drawBitmap(jouhou[5], 300,560,null);
								for (int i = 0; i < ddong2.length; i++) {
									canvas.drawBitmap(numbers,new Rect(ddong2[i] * 36, 0,ddong2[i]* 36+ numbers
											.getWidth()/ 10, 47),new Rect(230+ (i + 1)
													* (numbers.getWidth() / 20),520,(230+ (i + 1)
															* (numbers.getWidth() / 20) + numbers
															.getWidth() / 20),520 + 47), null);
								}
								canvas.drawBitmap(jouhou[4], 220,490,null);
								if (farmlevel == 1) {
									canvas.drawBitmap(sample1.now[0][n], 100,
											340, null);
									canvas.drawBitmap(jouhou[0], 105,400,null);

									canvas.drawBitmap(Gauge[1], 350 - 118, 15,
											null);
									canvas.drawBitmap(Gauge[0], 350 - 118, 45,
											null);
									canvas.drawBitmap(Gauge[0], 350 - 118, 75,
											null);
									canvas.drawBitmap(Gauge[0], 350 - 118, 105,
											null);
									canvas.drawBitmap(Gauge[1], 350 - 27, 15,
											null);
									canvas.drawBitmap(Gauge[0], 350 - 27, 45,
											null);
									canvas.drawBitmap(Gauge[0], 350 - 27, 75,
											null);
									canvas.drawBitmap(Gauge[0], 350 - 27, 105,
											null);
									for (int j = 0; j < 9; j++)
										if (mon1[j].itLive == true)
											canvas.drawBitmap(po[0],
													355 + (23 * (j)) - 118,
													18 + (30 * 0), null);
								} else if (farmlevel == 2) {
									canvas.drawBitmap(sample1.now[0][n], 100,
											340, null);
									canvas.drawBitmap(jouhou[0], 105,400,null);

									canvas.drawBitmap(sample2.now[0][n], 70,
											445, null);
									canvas.drawBitmap(jouhou[1], 75,505,null);

									canvas.drawBitmap(Gauge[1], 350 - 118, 15,
											null);
									canvas.drawBitmap(Gauge[1], 350 - 118, 45,
											null);
									canvas.drawBitmap(Gauge[0], 350 - 118, 75,
											null);
									canvas.drawBitmap(Gauge[0], 350 - 118, 105,
											null);
									canvas.drawBitmap(Gauge[1], 350 - 27, 15,
											null);
									canvas.drawBitmap(Gauge[1], 350 - 27, 45,
											null);
									canvas.drawBitmap(Gauge[0], 350 - 27, 75,
											null);
									canvas.drawBitmap(Gauge[0], 350 - 27, 105,
											null);
									for (int j = 0; j < 9; j++) {
										if (mon1[j].itLive == true)
											canvas.drawBitmap(po[0],
													355 + (23 * (j)) - 118,
													18 + (30 * 0), null);
										if (mon2[j].itLive == true)
											canvas.drawBitmap(po[1],
													355 + (23 * (j)) - 118,
													18 + (30 * 1), null);
									}
								} else if (farmlevel == 3) {
									canvas.drawBitmap(sample1.now[0][n], 100,
											340, null);
									canvas.drawBitmap(jouhou[0], 105,400,null);

									canvas.drawBitmap(sample2.now[0][n], 70,
											445, null);
									canvas.drawBitmap(jouhou[1], 75,505,null);

									canvas.drawBitmap(sample3.now[0][n], 155,
											555, null);
									canvas.drawBitmap(jouhou[2], 160,615,null);

									canvas.drawBitmap(Gauge[1], 350 - 118, 15,
											null);
									canvas.drawBitmap(Gauge[1], 350 - 118, 45,
											null);
									canvas.drawBitmap(Gauge[1], 350 - 118, 75,
											null);
									canvas.drawBitmap(Gauge[0], 350 - 118, 105,
											null);
									canvas.drawBitmap(Gauge[1], 350 - 27, 15,
											null);
									canvas.drawBitmap(Gauge[1], 350 - 27, 45,
											null);
									canvas.drawBitmap(Gauge[1], 350 - 27, 75,
											null);
									canvas.drawBitmap(Gauge[0], 350 - 27, 105,
											null);
									for (int j = 0; j < 9; j++) {
										if (mon1[j].itLive == true)
											canvas.drawBitmap(po[0],
													355 + (23 * (j)) - 118,
													18 + (30 * 0), null);
										if (mon2[j].itLive == true)
											canvas.drawBitmap(po[1],
													355 + (23 * (j)) - 118,
													18 + (30 * 1), null);
										if (mon3[j].itLive == true)
											canvas.drawBitmap(po[2],
													355 + (23 * (j)) - 118,
													18 + (30 * 2), null);
									}
								} else if (farmlevel == 4) {
									canvas.drawBitmap(sample1.now[0][n], 100,
											340, null);
									canvas.drawBitmap(jouhou[0], 105,400,null);

									canvas.drawBitmap(sample2.now[0][n], 70,
											445, null);
									canvas.drawBitmap(jouhou[1], 75,505,null);

									canvas.drawBitmap(sample3.now[0][n], 155,
											555, null);
									canvas.drawBitmap(jouhou[2], 160,615,null);

									canvas.drawBitmap(sample4.now[0][n], 212,
											675, null);
									canvas.drawBitmap(jouhou[3], 217,735,null);

									canvas.drawBitmap(Gauge[1], 350 - 118, 15,
											null);
									canvas.drawBitmap(Gauge[1], 350 - 118, 45,
											null);
									canvas.drawBitmap(Gauge[1], 350 - 118, 75,
											null);
									canvas.drawBitmap(Gauge[1], 350 - 118, 105,
											null);
									canvas.drawBitmap(Gauge[1], 350 - 27, 15,
											null);
									canvas.drawBitmap(Gauge[1], 350 - 27, 45,
											null);
									canvas.drawBitmap(Gauge[1], 350 - 27, 75,
											null);
									canvas.drawBitmap(Gauge[1], 350 - 27, 105,
											null);
									for (int j = 0; j < 9; j++) {
										if (mon1[j].itLive == true)
											canvas.drawBitmap(po[0],
													355 + (23 * (j)) - 118,
													18 + (30 * 0), null);
										if (mon2[j].itLive == true)
											canvas.drawBitmap(po[1],
													355 + (23 * (j)) - 118,
													18 + (30 * 1), null);
										if (mon3[j].itLive == true)
											canvas.drawBitmap(po[2],
													355 + (23 * (j)) - 118,
													18 + (30 * 2), null);
										if (mon4[j].itLive == true)
											canvas.drawBitmap(po[3],
													355 + (23 * (j)) - 118,
													18 + (30 * 3), null);
									}
								}
								for (int i = 0; i < 9; i++) {
									cr.m_instance.CheckPocketmon(i);
								}

							}

							

							meatscore(meat);
							medichinescore(medichine);
							ddongscore(ddong);
							canvas.drawBitmap(money, 0, 0,null);
							Paint pp = new Paint();
							pp.setTextSize(30);
							pp.setColor(Color.YELLOW);
							pp.setStyle(Paint.Style.STROKE);
							canvas.drawText(""+gold, 50, 30, pp);
						}
						if (mGameCnt == 1000000)
							mGameCnt = 0;
						if (mGameCnt % 25 == 0) {
							if (lifeCnt != life.length - 1)
								lifeCnt++;
							else
								lifeCnt = 0;
						}


					}
				} finally {
					if (canvas != null)
						mHolder.unlockCanvasAndPost(canvas);
				}
				synchronized (this) {
					if (isWait)
						try {

						} catch (Exception e) {
						}
				}
			}
		}

		public void StopThread() {
			boolean retry = true;
			canRun = false;
			while (retry) {
				try {
					this.join();
					retry = false;
				} catch (InterruptedException e) {
					e.getStackTrace();
				}
			}
		}

		public void PauseNResume(boolean value) {
			isWait = value;
			synchronized (this) {
				this.notify();
			}
		}

		// ��� ��ü ����
		public void RelaseAll() {
			BitmapRecycle(mine);
			BitmapRecycle(arrow);
			BitmapRecycle(number);
			BitmapRecycle(numbers);
			BitmapRecycle(minetext);
			BitmapRecycle(menu);
			for (int i = 0; i < effect.length; i++) {
				BitmapRecycle(effect[i]);
			}
			for (int i = 0; i < enemy.length; i++) {
				BitmapRecycle(enemy[i]);
				BitmapRecycle(life[i]);
				BitmapRecycle(mgold[i]);
			}

			for (int i = mEnemy.size() - 1; i >= 0; i--)
				mEnemy.remove(i);

			for (int i = mGold.size() - 1; i >= 0; i--)
				mGold.remove(i);

		}

		// Gold �ڸ��� ���ϱ�
		public void Score(int score) {
			score = gold;
			dived = 100000;

			for (int i = 0; i < goldiv.length; i++) {
				goldiv[i] = score / dived;
				score -= goldiv[i] * dived;
				dived /= 10;
			}
		}

		// ===============�̹��� �׷��ֱ�====================
		public void DRAW(Canvas canvas) {
			Paint p = new Paint();
			p.setTextSize(20);
			p.setColor(Color.WHITE);
			p.setStyle(Paint.Style.STROKE);

			Paint paint = new Paint();
			paint.setTextSize(45);
			paint.setColor(Color.WHITE);
			paint.setStyle(Paint.Style.STROKE);

			if (GameState.GameState_NowState == GameState.GameState_Option) {
				canvas.drawBitmap(option, 0, 0, null);
				if (s_on) {
					canvas.drawBitmap(option_on, 300, 150, null);
				}
				if (v_on) {
					canvas.drawBitmap(option_on, 300, 265, null);
				}
				if (s_on == false) {
					canvas.drawBitmap(option_off, 300, 150, null);
				}
				if (v_on == false) {
					canvas.drawBitmap(option_off, 300, 265, null);
				}

			}
			if (GameState.GameState_NowState == GameState.GameState_Info) {
				for (int i = 0; i < info.length; i++) {
					canvas.drawBitmap(info[InfoCnt], 0, 0, null);
				}
			}
			if (GameState.GameState_NowState == GameState.GameState_Logo) {
				canvas.drawColor(Color.BLACK);
				canvas.drawARGB(logo_alpha, 255, 255, 255);

				if (logo_alpha_ok == true) {
					canvas.drawBitmap(logo, 0, 0, null);
					canvas.drawARGB(logo_alpha2, 255, 255, 255);
				}
			}

			if ((GameState.GameState_NowState == GameState.GameState_MenuState)) {
				if(s_on==true)
					GunBg.BackSound[3].start();
				canvas.drawBitmap(menu, 0, 0, null);
			}

			if ((GameState.GameState_NowState == GameState.GameState_mText)
					|| (GameState.GameState_NowState == GameState.GameState_Mine)) {
				canvas.drawBitmap(mine, 0, 0, null);
				canvas.drawText("Life ", 30, 65, paint);
				canvas.drawText("��ġ��ǥ x:" + x1 + "y:" + y1, 30, 100, p);
				canvas.drawText("remaintime : "+remaintime ,30, 150, p);
				remaintime -= level;
				// ������ �Ѹ���
				for (int i = 0; i < lifecheck; i++) {
					canvas.drawBitmap(life[lifeCnt], 120 + i * 50, 25, null);
				}

				// -------------------------------
				// �����Ѹ���
				for (int i = 0; i < 1; i++) {
					if (drawcheck == true) {
						canvas.drawBitmap(
								number,
								new Rect(level * 12, 0, level * 12
										+ number.getWidth() / 10, 22),
										new Rect(
												90 + (i + 1) * (number.getWidth() / 10),
												740,
												(90 + (i + 1)
														* (number.getWidth() / 10) + number
														.getWidth() / 10), 740 + 22),
														null);

					}
				}
				// ���Ѹ���
				for (int i = 0; i < goldiv.length; i++) {
					if (drawcheck == true) {
						canvas.drawBitmap(
								number,
								new Rect(goldiv[i] * 12, 0, goldiv[i] * 12
										+ number.getWidth() / 10, 22),
										new Rect(
												230 + (i + 1)
												* (number.getWidth() / 10),
												740,
												(230 + (i + 1)
														* (number.getWidth() / 10) + number
														.getWidth() / 10), 740 + 22),
														null);
					}
				}

				// ����Ʈ �Ѹ���
				if (mFlag && drawcheck) {
					canvas.drawBitmap(effect[EffectCnt], x1 - cw, y1 - ch, null);
				}

				// ��ȭȹ�� �ؽ�Ʈ �Ѹ���
				if (System.currentTimeMillis() - text_time < 3000
						&& UpCheck == false) {
					canvas.drawText("" + str, 150, 660, p);
				} else {
					str = "";
					UpCheck = false;
				}

				// ��Ʈ(����)�Ѹ���
				Paint p2 = new Paint();
				for (int i = 0; i < mEnemy.size(); i++) {
					if (mEnemy.get(i).IsLive) {
						p2.setAlpha(mEnemy.get(i).getAlpha());
						canvas.drawBitmap(enemy[0], mEnemy.get(i).getX(),
								mEnemy.get(i).getY(), p2);
					}
				}
				// ���� �Ѹ���
				for (int i = 0; i < mGold.size(); i++) {
					if (mGold.get(i).IsLive) {
						p2.setAlpha(mGold.get(i).getAlpha());
						canvas.drawBitmap(mgold[0], mGold.get(i).getX(), mGold
								.get(i).getY(), p2);
					}
				}

			}
			if ((GameState.GameState_NowState == GameState.GameState_mText)) {
				canvas.drawBitmap(minetext, 0, 0, null);

				for (int i = 0; i <= nowline; i++) {
					Log.e("text[i]", "" + text[i]);
					canvas.drawText(text[i], 100, 670 + (i * 20), p);
				}
			}
		}
		// ������Ʈ �Լ�
		public void Update() {
			if (GameState.GameState_NowState == GameState.GameState_Logo) {
				if (logo_alpha < 255) {
					logo_alpha += 4;
				}
				if (logo_alpha >= 255) {
					logo_alpha = 255;
					logo_alpha_ok = true;
				}

				if (logo_alpha_ok == true && logo_alpha2_ok == false) {
					if (logo_alpha2 > 0) {
						logo_alpha2 -= 4;
					}
					if (logo_alpha2 <= 0) {
						logo_alpha2 = 0;
						logo_alpha2_ok = true;
					}
				} else if (logo_alpha_ok == true && logo_alpha2_ok == true) {
					if (logo_alpha2 <= 255) {
						logo_alpha2 += 4;
					}
					if (logo_alpha2 >= 255) {
						logo_alpha2 = 255;

						GameState.GameState_NowState = GameState.GameState_MenuState;
					}
				}
			}

			if (GameState.GameState_NowState == GameState.GameState_mText
					|| (GameState.GameState_NowState == GameState.GameState_Mine)) {
				mi.m_instance.CreateEnemy();
				mi.m_instance.CreateCoin();

				if (GameState.GameState_NowState == GameState.GameState_mText) {
					if (nowline < text.length - 1) {
						if (nowword < line - 1) {
							nowword++;
						} else {
							nowword = 0;
							nowline++;
						}
					} else if (nowline >= text.length - 1
							&& nowword <= text[nowline].length() - 1) {
						if (nowword < line - 1)
							nowword++;
						nowline = text.length - 1;
						Log.e("nowword", "" + nowword);

						if (nowword >= gametext.length() % (line * nowline)) {
							nowword = gametext.length() % (line * nowline) - 1;
						}

					}

					if (nowline < text.length) {
						text[nowline] = gametext.substring(nowline * line,
								(nowline * line) + nowword + 1);
					}
				}
			}
			// //////////////////////////////////////////////////////////////�ڵ鷯����
			// ����//////////////////
			calender = new GregorianCalendar();
			dateFormat = new SimpleDateFormat("yyyyMMddhhmmss");
			dateFormat.format(calender.getTime());
			dateTime = dateFormat.format(calender.getTime());
		}

		// ���� �����


		// �ִϸ��̼� ���
		public void Control() {
			if (mGameCnt % 5 == 0 && mFlag) {
				if (EffectCnt != effect.length - 1) {
					EffectCnt++;
				} else if (EffectCnt == effect.length - 1) {
					EffectCnt = 0;
					mFlag = false;
				}
			}

			for (int i = 0; i < mEnemy.size(); i++) {
				if (mEnemy.get(i).IsLive == false) {
					mEnemy.remove(i);
				} else {
					if (mGameCnt % 5 == 0)
						mEnemy.get(i).function_alpha();
				}
			}
			for (int i = 0; i < mGold.size(); i++) {
				if (mGold.get(i).IsLive == false) {
					mGold.remove(i);
				} else {
					if (mGameCnt % 5 == 0)
						mGold.get(i).function_alpha();
				}
			}
		}
	}
	// ================��ġ�̺�Ʈ=================

	@Override
	public boolean onTouchEvent(MotionEvent event) {
		GunBg.m_instance.onTouchEvent(event);

		int getgol = 1;
		getgol = random.nextInt(50) * level + 1;

		if (event.getAction() == MotionEvent.ACTION_DOWN) {
			mFlag = true;
			x1 = (int) event.getX();
			y1 = (int) event.getY();

			dx1 = (int) event.getX();
			dy1 = (int) event.getY();

			if (GameState.GameState_NowState == GameState.GameState_MenuState) {
				///////////////////////////////////////�޴������϶�
				if (new Rect(80, 360, 400, 430).contains(x1, y1)) {
					md.m_instance.toFarm(mContext);
				}

				if (new Rect(80, 660, 400, 730).contains(x1, y1)) {
					md.m_instance.exit();
				}

				if (new Rect(80, 450, 400, 530).contains(x1, y1)) {
					GameState.GameState_NowState = GameState.GameState_Info;
					md.m_instance.vib();
				}
				if (new Rect(80, 550, 400, 630).contains(x1, y1)) {
					GameState.GameState_NowState = GameState.GameState_Option;
					md.m_instance.vib();
				}
			}
			if (GameState.GameState_NowState == GameState.GameState_Option) {
				if (new Rect(175, 710, 315, 765).contains(x1, y1)) {				
					GameState.GameState_NowState = GameState.GameState_MenuState;
				}
				if (new Rect(300, 150, 440, 200).contains(x1, y1)) {
					if (s_on) {
						s_on = false;
						sc.m_instance.StopSound(3);
					} else {
						s_on = true;
						sc.m_instance.soundinit(3,mContext);
						GunBg.BackSound[3].start();
					}
				}
				if (new Rect(300, 260, 440, 310).contains(x1, y1)) {
					if (v_on) {
						v_on = false;
					} else {
						GunBg.vibeator.vibrate(200);
						v_on = true;
					}
				}
			}
			if (GameState.GameState_NowState == GameState.GameState_Info) {
				if (new Rect(20, 730, 110, 770).contains(x1, y1)) {
					if (InfoCnt == 0) {
						InfoCnt = info.length - 1;
					} else
						InfoCnt--;
				} else if (new Rect(380, 730, 460, 770).contains(x1, y1)) {
					InfoCnt++;
					if (InfoCnt >= info.length) {
						InfoCnt = 0;
					}
				} else if (new Rect(175, 710, 315, 765).contains(x1, y1)) {

					GameState.GameState_NowState = GameState.GameState_MenuState;
					InfoCnt = 0;
				}
			} else if (GameState.GameState_NowState == GameState.GameState_mText) {		
				
				GameState.GameState_NowState = GameState.GameState_Mine;
				if(s_on==true)
				{
					sc.m_instance.soundinit(2, mContext);
					GunBg.BackSound[2].start();
				}
				drawcheck = true;
				UpCheck = true;
			} else if (GameState.GameState_NowState == GameState.GameState_Mine) {
				mFlag = true;
				if ((EffectCnt != effect.length - 1)) {
					EffectCnt = 0;
				}
				for (int i = 0; i < mEnemy.size(); i++) {
					if (new Rect(mEnemy.get(i).x, mEnemy.get(i).y,
							mEnemy.get(i).x + 75, mEnemy.get(i).y + 75)
					.contains(x1, y1)) {
						mEnemy.get(i).IsLive = false;

						if (s_on == true)
							sound.play(sounds[1], 1, 1, 0, 0, 1);
						else if (s_on == false)
							sound.pause(sounds[1]);
						lifecheck--;
						md.m_instance.vib();
						if (lifecheck <= 0) {
							lifecheck = 3;
							UpCheck = false;
							menucheck = false;
							drawcheck = false;
							
							level = 1;
							count = 0;
							sc.m_instance.StopSound(2);
							sc.m_instance.soundinit(0,mContext);
							drawx = 0;
							drawy = -800;
							GameState.GameState_NowState = GameState.GameState_Fram;
						}
					}
				}
				for (int i = 0; i < mGold.size(); i++) {
					if (new Rect(mGold.get(i).x, mGold.get(i).y,
							mGold.get(i).x + 75, mGold.get(i).y + 75).contains(
									x1, y1)) {
						// ������ ������
						// �κ�///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
						if(s_on==true)
							sound.play(sounds[2], 1, 0, 1, 0, 1);

						mGold.get(i).IsLive = false;
						gold += getgol;
						str = String.format("%d Gold ȹ��!", getgol);
					}
				}
				if (menucheck == false && drawcheck == false) {
					for (int i = 0; i < mEnemy.size(); i++) {
						mEnemy.get(i).IsLive = false;
					}
					for (int i = 0; i < mGold.size(); i++) {
						mGold.get(i).IsLive = false;
					}
				}
				menucheck = true;
				if (new Rect(20, 20, 410, 680).contains(x1, y1)
						&& drawcheck == true) {
					if(s_on==true)
						sound.play(sounds[0], 1, 1, 0, 0, 1);
					count++;
					if (count >= level * 10) {
						count = 0;
						remaintime =100000;
						level++;
						if (level >= 100) {
							level = 100;
						}
					}
				}
			}
			if (GameState.GameState_NowState == GameState.GameState_Fram) {
				if (State < 5) {// ���� ���� ���� �ۿ� �ִٸ�

					if (hmenustate == false)// �޴��� �ȶ�������
					{
						if (GameState.GameState_NowState == GameState.GameState_mText) {
							GameState.GameState_NowState = GameState.GameState_Mine;
							drawcheck = true;
							UpCheck = true;
						} else if (new Rect(50 + drawx, 40 + drawy - imsi,
								270 + drawx, 380 + drawy - imsi).contains(x1,
										y1)) {
							// �����ۿ� ������ ������ ������
							sc.m_instance.soundinit(1,mContext);
							State = 5;
							// ������ ����
						}

						for (int i = 0; i < 9; i++) {
							poketX = x1;
							// ���ϸ��� ���������� x��ǥ
							poketY = y1;
							CallMenu(i);
						}
						// ���� �׿ܿ� ���ϸ��� ������ �׺κп� �޴��� �ҷ��´�.
					}

					else// ���� �޴��� ���ִٸ�
					{
						md.m_instance.pocketmon();
					}
				} else {// �����̰ų� ���� �����ϰ��
					if (State == 5) {
						// �����϶� ���� ������·� �����ش�.
						if (new Rect(140, 190, 240, 280).contains(x1, y1)) {
							// ���� ������ ����
							State = farmlevel;
							sc.m_instance.StopSound(1);
							sc.m_instance.soundinit(0,mContext);
						}
						if (new Rect(0, 650, 140, 800).contains(x1, y1)) {
							if (farmlevel < 4 && gold >= 5000) {
								farmlevel++;
								gold -= 5000;
								// �����°� ����
							}
						}
						if (new Rect(410, 550, 460, 620).contains(x1, y1)) {
							if (meat < 99 && gold >= 20) {
								gold -= 20;
								meat++;
								// ���߰� ����
							}
						}
						if (new Rect(310, 520, 360, 590).contains(x1, y1)) {
							if (medichine < 99 && gold >= 100) {
								gold -= 100;
								medichine++;
								// ���߰� ����
							}
						}
						if (new Rect(230, 450, 280, 520).contains(x1, y1)) {
							if (ddong < 99 && gold >= 20) {
								gold -= 20;
								ddong++;
								// ��ġ��� ����
							}
						}
						if (new Rect(120, 350, 210, 430).contains(x1, y1)) {// ���ϸ�
							// //����
							// //����]
							isOK = false;
							if (farmlevel >= 1) {// ���ϸ� ���� ����
								for (int i = 0; i < 9; i++) {
									np1.m_instance.newPocketmon(i);
								}
							}
						}
						if (new Rect(95, 445, 150, 520).contains(x1, y1)) {
							isOK = false;
							if (farmlevel >= 2) {// ���ϸ� ���� ����
								for (int i = 0; i < 9; i++)
									np2.m_instance.newPocketmon(i);
							}
						}
						if (new Rect(175, 575, 250, 650).contains(x1, y1)) {
							isOK = false;
							if (farmlevel >= 3) {
								for (int i = 0; i < 9; i++)
									np3.m_instance.newPocketmon(i);
							}
						}
						if (new Rect(230, 690, 300, 750).contains(x1, y1)) {
							isOK = false;
							if (farmlevel >= 4) {// ���ϸ� ���� ����
								for (int i = 0; i < 9; i++)
									np4.m_instance.newPocketmon(i);
							}
							// ���ϸ� �츮�� ����
						}
					}
				}
			}
			return true;
		}
		if (event.getAction() == MotionEvent.ACTION_MOVE) {
			if (GameState.GameState_NowState == GameState.GameState_Fram) {
				dx2 = (int) event.getX();
				dy2 = (int) event.getY();

				mx = dx2 - dx1;
				my = dy2 - dy1;
				if (drawx >= -480 && drawx <= 0)
					drawx += mx / 10;
				if (drawy >= -800 && drawy <= 0)
					drawy += my / 10;
				if (drawx < -480)
					drawx = -480;
				if (drawx > 0)
					drawx = 0;
				if (drawy < -800)
					drawy = -800;
				if (drawy > 0)
					drawy = 0;	
			}
			if (Math.abs(mx) >= 10 && Math.abs(my) >= 10)
			kr.m_instance.close();
		}
		if (event.getAction() == MotionEvent.ACTION_UP) {
			if (GameState.GameState_NowState == GameState.GameState_Fram) {
				if (State < 5) {// ���� ���� ���� �ۿ� �ִٸ�
					if (hmenustate == false)// �޴��� �ȶ�������
					{
						if (Math.abs(mx) <= 10 && Math.abs(my) <= 10)
							if (new Rect(165 + drawx, 590 + drawy, 790 + drawx,
									900 + drawy).contains(x1, y1)) {		
								sc.m_instance.StopSound(0);								
									GameState.GameState_NowState = GameState.GameState_mText;
							}
						if (Math.abs(mx) <= 10 && Math.abs(my) <= 10)
							if (new Rect(450 + drawx, 140 + drawy - imsi, 990 + drawx, 560
									+ drawy - imsi * 2).contains(x1, y1)) {
								// Fram���� �޴���
								sc.m_instance.StopSound(0);
								sc.m_instance.soundinit(3,mContext);

								GameState.GameState_NowState = GameState.GameState_MenuState;
								drawx = 0;
								drawy = 0;
							}
			
					}
				}
			}

			if (GameState.GameState_NowState == GameState.GameState_Mine) {
				x1 = (int) event.getX();
				y1 = (int) event.getY();
				if (new Rect(340, 710, 450, 790).contains(x1, y1)) {
					lifecheck = 3;
					UpCheck = false;
					menucheck = false;
					drawcheck = false;
					level = 1;
					count = 0;
					sc.m_instance.StopSound(2);
					sc.m_instance.soundinit(0,mContext);
					GameState.GameState_NowState = GameState.GameState_Fram;
				}
				for (int i = 0; i < mEnemy.size(); i++) {
					if (new Rect(mEnemy.get(i).x, mEnemy.get(i).y,
							mEnemy.get(i).x + 75, mEnemy.get(i).y + 75)
					.contains(x1, y1)) {
						mEnemy.get(i).IsLive = false;
						lifecheck--;
						if (lifecheck <= 0) {
							lifecheck = 3;
							UpCheck = false;
							menucheck = false;
							drawcheck = false;
							level = 1;
							count = 0;
							sc.m_instance.StopSound(2);
							sc.m_instance.soundinit(0,mContext);
							GameState.GameState_NowState = GameState.GameState_Fram;
						}
					}
				}
				for (int i = 0; i < mGold.size(); i++) {
					if (new Rect(mGold.get(i).x, mGold.get(i).y,
							mGold.get(i).x + 75, mGold.get(i).y + 75).contains(
									x1, y1)) {
						mGold.get(i).IsLive = false;
						gold += getgol;
						str = String.format("%d Gold ȹ��!", getgol);
					}
				}
				if (menucheck == false && drawcheck == false) {
					for (int i = 0; i < mEnemy.size(); i++) {
						mEnemy.get(i).IsLive = false;
					}
					for (int i = 0; i < mGold.size(); i++) {
						mGold.get(i).IsLive = false;
					}
				}
				menucheck = true;
			}
			// //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			sound.stop(sounds[0]);
			text_time = System.currentTimeMillis();

			if (GameState.GameState_NowState == GameState.GameState_Mine) {

				for (int i = 0; i < mEnemy.size(); i++) {
					if (new Rect(mEnemy.get(i).x, mEnemy.get(i).y,
							mEnemy.get(i).x + 75, mEnemy.get(i).y + 75)
					.contains(x1, y1)) {
						if (lifecheck <= 0) {
							mEnemy.get(i).IsLive = true;
							menucheck = false;
							drawcheck = false;
						}
					}

				}
				for (int i = 0; i < mGold.size(); i++) {
					if (new Rect(mGold.get(i).x, mGold.get(i).y,
							mGold.get(i).x + 60, mGold.get(i).y + 60).contains(
									x1, y1)) {
						mGold.get(i).IsLive = true;
					}
				}
			}
			mx = my = 0;
			return true;
		}// up�̺�Ʈ ����

		return false;
	}// ��ġ�̺�Ʈ ����
	// ==============================================================================
	// ==============================================================================

	public void CallMenu(int n) {
		if (mon1[n].itLive == true)
			if (x1 >= 20 + (100 * n) + drawx && x1 <= 120 + 120 * n + drawx
			&& y1 >= 290 + 0 * 130 + height + drawy
			&& y1 <= 390 + 0 * 130 + height + drawy) {
				mon1[n].isMenu = true;
				hmenustate = true;
				x = n;
			}
		if (mon2[n].itLive == true)
			if (x1 >= 20 + 100 * n + drawx && x1 <= 120 + 120 * n + drawx
			&& y1 >= 290 + 1 * 130 + height + drawy
			&& y1 <= 390 + 1 * 130 + height + drawy) {
				mon2[n].isMenu = true;
				hmenustate = true;
				x = n;
			}
		if (mon3[n].itLive == true)
			if (x1 >= 20 + 100 * n + drawx && x1 <= 120 + 120 * n + drawx
			&& y1 >= 290 + 2 * 130 + height + drawy
			&& y1 <= 390 + 2 * 130 + height + drawy) {
				mon3[n].isMenu = true;
				hmenustate = true;
				x = n;
			}
		if (mon4[n].itLive == true)
			if (x1 >= 20 + 100 * n + drawx && x1 <= 120 + 120 * n + drawx
			&& y1 >= 290 + 3 * 130 + height + drawy
			&& y1 <= 390 + 3 * 130 + height + drawy) {
				mon4[n].isMenu = true;
				hmenustate = true;
				x = n;
			}
	}
	public void meatscore(int score) {
		score = meat;
		div = 10;
		for (int i = 0; i < meat2.length; i++) {
			meat2[i] = score / div;
			score -= meat2[i] * div;
			div /= 10;
		}
	}
	public void medichinescore(int score) {
		score = medichine;
		div = 10;
		for (int i = 0; i < medichine2.length; i++) {
			medichine2[i] = score / div;
			score -= medichine2[i] * div;
			div /= 10;
		}
	}
	public void ddongscore(int score) {
		score = ddong;
		div = 10;
		for (int i = 0; i < ddong2.length; i++) {
			ddong2[i] = score / div;
			score -= ddong2[i] * div;
			div /= 10;
		}
	}
	private void BitmapRecycle(Bitmap _bit) {
		// TODO Auto-generated method stub
		_bit.recycle();
		_bit = null;
	}
	public void drawmenu(Canvas canvas) {
		if (y1 < 650) {
			if (x1 <= 240)
				canvas.drawBitmap(Menu, x1, y1, null);
			else
				canvas.drawBitmap(Menu, x1 - 240, y1, null);
		}// ����° �ٱ��� üũ�Ҷ� �׷��ִ°�
		else {
			if (x1 <= 240)
				canvas.drawBitmap(Menu, x1, y1 - 120, null);
			else
				canvas.drawBitmap(Menu, x1 - 240, y1 - 120, null);
		}
	}
}