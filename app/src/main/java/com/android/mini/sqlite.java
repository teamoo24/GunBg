package com.android.mini;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

public class sqlite {
	static DataBase m_helper;
	
	static Cursor gold_cursor;
	static Cursor map_cursor;
	static Cursor farm_cursor;
	static Cursor meat_cursor;
	static Cursor medi_cursor;
	static Cursor ddong_cursor;
	static Cursor mon1_shurui_cursor;
	static Cursor mon1_level_cursor;
	static Cursor mon1_state_cursor;
	static Cursor mon1_live_cursor;
	static Cursor mon1_leveltime_cursor;
	static Cursor mon1_birthtime_cursor;
	static Cursor mon2_shurui_cursor;
	static Cursor mon2_level_cursor;
	static Cursor mon2_state_cursor;
	static Cursor mon2_live_cursor;
	static Cursor mon2_leveltime_cursor;
	static Cursor mon2_birthtime_cursor;
	static Cursor mon3_shurui_cursor;
	static Cursor mon3_level_cursor;
	static Cursor mon3_state_cursor;
	static Cursor mon3_live_cursor;
	static Cursor mon3_leveltime_cursor;
	static Cursor mon3_birthtime_cursor;
	static Cursor mon4_shurui_cursor;
	static Cursor mon4_level_cursor;
	static Cursor mon4_state_cursor;
	static Cursor mon4_live_cursor;
	static Cursor mon4_leveltime_cursor;
	static Cursor mon4_birthtime_cursor;
	
	static int get_gold;
	static int get_map;
	static int get_farm;
	static int get_meat;
	static int get_medi;
	static int get_ddong;
	
	static int get_mon1_shurui;
	static int get_mon1_level;
	static int get_mon1_state;
	static long get_mon1_live[] = new long[9];
	static long get_mon1_leveltime;
	static long get_mon1_birthtime;
	
	static int get_mon2_shurui;
	static int get_mon2_level;
	static int get_mon2_state;
	static long get_mon2_live[] = new long[9];
	static long get_mon2_leveltime;
	static long get_mon2_birthtime;
	
	static int get_mon3_shurui;
	static int get_mon3_level;
	static int get_mon3_state;
	static long get_mon3_live[] = new long[9];
	static long get_mon3_leveltime;
	static long get_mon3_birthtime;
	
	static int get_mon4_shurui;
	static int get_mon4_level;
	static int get_mon4_state;
	static long get_mon4_live[] = new long[9];
	static long get_mon4_leveltime;
	static long get_mon4_birthtime;
	
	public sqlite(Context context)
	{
		super();
		m_helper=new DataBase(context,"save59.db",null,1);
	}
	public static void loaddb()
	{
		SQLiteDatabase db=m_helper.getReadableDatabase();
		
		gold_cursor = db.query("gold",new String[]{"dgold"},null, null, null, null, null);		
		map_cursor	= db.query("map_state",new String[]{"dmap"},null, null, null, null, null);
		farm_cursor	= db.query("farm",new String[]{"dfarm"},null, null, null, null, null);
		meat_cursor	= db.query("meat",new String[]{"dmeat"},null, null, null, null, null);
		medi_cursor	= db.query("medichine",new String[]{"dmedichine"},null, null, null, null, null);
		ddong_cursor= db.query("ddong",new String[]{"dddong"},null, null, null, null, null);
		
		mon1_shurui_cursor= db.query("mon1shurui",new String[]{"shurui1"},null, null, null, null, null);
		mon1_level_cursor= db.query("mon1level",new String[]{"level1"},null, null, null, null, null);
		mon1_state_cursor= db.query("mon1state",new String[]{"state1"},null, null, null, null, null);
		mon1_live_cursor= db.query("mon1live",new String[]{"live1"},null, null, null, null, null);
		mon1_leveltime_cursor= db.query("mon1leveltime",new String[]{"leveltime1"},null, null, null, null, null);
		mon1_birthtime_cursor= db.query("mon1birthtime",new String[]{"birthtime1"},null, null, null, null, null);
		
		mon2_shurui_cursor= db.query("mon2shurui",new String[]{"shurui2"},null, null, null, null, null);
		mon2_level_cursor= db.query("mon2level",new String[]{"level2"},null, null, null, null, null);
		mon2_state_cursor= db.query("mon2state",new String[]{"state2"},null, null, null, null, null);
		mon2_live_cursor= db.query("mon2live",new String[]{"live2"},null, null, null, null, null);
		mon2_leveltime_cursor= db.query("mon2leveltime",new String[]{"leveltime2"},null, null, null, null, null);
		mon2_birthtime_cursor= db.query("mon2birthtime",new String[]{"birthtime2"},null, null, null, null, null);

		mon3_shurui_cursor= db.query("mon3shurui",new String[]{"shurui3"},null, null, null, null, null);
		mon3_level_cursor= db.query("mon3level",new String[]{"level3"},null, null, null, null, null);
		mon3_state_cursor= db.query("mon3state",new String[]{"state3"},null, null, null, null, null);
		mon3_live_cursor= db.query("mon3live",new String[]{"live3"},null, null, null, null, null);
		mon3_leveltime_cursor= db.query("mon3leveltime",new String[]{"leveltime3"},null, null, null, null, null);
		mon3_birthtime_cursor= db.query("mon3birthtime",new String[]{"birthtime3"},null, null, null, null, null);

		mon4_shurui_cursor= db.query("mon4shurui",new String[]{"shurui4"},null, null, null, null, null);
		mon4_level_cursor= db.query("mon4level",new String[]{"level4"},null, null, null, null, null);
		mon4_state_cursor= db.query("mon4state",new String[]{"state4"},null, null, null, null, null);
		mon4_live_cursor= db.query("mon4live",new String[]{"live4"},null, null, null, null, null);
		mon4_leveltime_cursor= db.query("mon4leveltime",new String[]{"leveltime4"},null, null, null, null, null);
		mon4_birthtime_cursor= db.query("mon4birthtime",new String[]{"birthtime4"},null, null, null, null, null);

		
		if(gold_cursor.moveToLast())
		{
			Log.e("test",""+Integer.parseInt(gold_cursor.getString(0)));
			get_gold=Integer.parseInt(gold_cursor.getString(0));
		}
		if(map_cursor.moveToLast())
		{
			Log.e("test1",""+Integer.parseInt(map_cursor.getString(0)));
			get_map=Integer.parseInt(map_cursor.getString(0));
		}
		if(farm_cursor.moveToLast())
		{
			Log.e("test2",""+Integer.parseInt(farm_cursor.getString(0)));
			get_farm=Integer.parseInt(farm_cursor.getString(0));
		}
		if(meat_cursor.moveToLast())
		{
			Log.e("test3",""+Integer.parseInt(meat_cursor.getString(0)));
			get_meat=Integer.parseInt(meat_cursor.getString(0));
		}
		if(medi_cursor.moveToLast())
		{
			Log.e("test4",""+Integer.parseInt(medi_cursor.getString(0)));
			get_medi=Integer.parseInt(medi_cursor.getString(0));
		}
		if(ddong_cursor.moveToLast())
		{
			Log.e("test5",""+Integer.parseInt(ddong_cursor.getString(0)));
			get_ddong=Integer.parseInt(ddong_cursor.getString(0));
		}
		if(mon1_shurui_cursor.moveToLast())
		{
			Log.e("test6",""+Integer.parseInt(mon1_shurui_cursor.getString(0)));
			get_mon1_shurui=Integer.parseInt(mon1_shurui_cursor.getString(0));
		}
		if(mon1_level_cursor.moveToLast())
		{
			Log.e("test7",""+Integer.parseInt(mon1_level_cursor.getString(0)));
			get_mon1_level=Integer.parseInt(mon1_level_cursor.getString(0));
		}
		if(mon1_state_cursor.moveToLast())
		{
			Log.e("test8",""+Integer.parseInt(mon1_state_cursor.getString(0)));
			get_mon1_state=Integer.parseInt(mon1_state_cursor.getString(0));
		}
		
			
		
		for(int i=0; i<9; i++){
			if(mon1_live_cursor.moveToNext())
			{
				Log.e("test91111",""+mon1_live_cursor.getInt(0));	
				get_mon1_live[i]=mon1_live_cursor.getInt(0); 
			}
		}
		
			
			
		
		if(mon1_leveltime_cursor.moveToLast())
		{
			Log.e("test10",""+Long.parseLong(mon1_leveltime_cursor.getString(0)));
			get_mon1_leveltime=Long.parseLong(mon1_leveltime_cursor.getString(0));
		}
		if(mon1_birthtime_cursor.moveToLast())
		{
			Log.e("test11",""+Long.parseLong(mon1_birthtime_cursor.getString(0)));
			get_mon1_birthtime=Long.parseLong(mon1_birthtime_cursor.getString(0));
		}
		////////////////////////////////
		if(mon2_shurui_cursor.moveToLast())
		{
			Log.e("test6",""+Integer.parseInt(mon2_shurui_cursor.getString(0)));
			get_mon2_shurui=Integer.parseInt(mon2_shurui_cursor.getString(0));
		}
		if(mon2_level_cursor.moveToLast())
		{
			Log.e("test7",""+Integer.parseInt(mon2_level_cursor.getString(0)));
			get_mon2_level=Integer.parseInt(mon2_level_cursor.getString(0));
		}
		if(mon2_state_cursor.moveToLast())
		{
			Log.e("test8",""+Integer.parseInt(mon2_state_cursor.getString(0)));
			get_mon2_state=Integer.parseInt(mon2_state_cursor.getString(0));
		}
		
		
		
		for(int i=0; i<9; i++){
			if(mon2_live_cursor.moveToNext())
			{
				Log.e("test91111",""+mon2_live_cursor.getInt(0));	
				get_mon2_live[i]=mon2_live_cursor.getInt(0); 
			}
		}
		
		
		
		if(mon2_leveltime_cursor.moveToLast())
		{
			Log.e("test10",""+Long.parseLong(mon2_leveltime_cursor.getString(0)));
			get_mon2_leveltime=Long.parseLong(mon2_leveltime_cursor.getString(0));
		}
		if(mon2_birthtime_cursor.moveToLast())
		{
			Log.e("test11",""+Long.parseLong(mon2_birthtime_cursor.getString(0)));
			get_mon2_birthtime=Long.parseLong(mon2_birthtime_cursor.getString(0));
		}
		/////////////////////////////////
		if(mon3_shurui_cursor.moveToLast())
		{
			Log.e("test6",""+Integer.parseInt(mon3_shurui_cursor.getString(0)));
			get_mon3_shurui=Integer.parseInt(mon3_shurui_cursor.getString(0));
		}
		if(mon3_level_cursor.moveToLast())
		{
			Log.e("test7",""+Integer.parseInt(mon3_level_cursor.getString(0)));
			get_mon3_level=Integer.parseInt(mon3_level_cursor.getString(0));
		}
		if(mon3_state_cursor.moveToLast())
		{
			Log.e("test8",""+Integer.parseInt(mon3_state_cursor.getString(0)));
			get_mon3_state=Integer.parseInt(mon3_state_cursor.getString(0));
		}
		
		
		
		for(int i=0; i<9; i++){
			if(mon3_live_cursor.moveToNext())
			{
				Log.e("test91111",""+mon3_live_cursor.getInt(0));	
				get_mon3_live[i]=mon3_live_cursor.getInt(0); 
			}
		}
		
		
		
		if(mon3_leveltime_cursor.moveToLast())
		{
			Log.e("test10",""+Long.parseLong(mon3_leveltime_cursor.getString(0)));
			get_mon3_leveltime=Long.parseLong(mon3_leveltime_cursor.getString(0));
		}
		if(mon3_birthtime_cursor.moveToLast())
		{
			Log.e("test11",""+Long.parseLong(mon3_birthtime_cursor.getString(0)));
			get_mon3_birthtime=Long.parseLong(mon3_birthtime_cursor.getString(0));
		}
		//////////////////////////////////
		if(mon4_shurui_cursor.moveToLast())
		{
			Log.e("test6",""+Integer.parseInt(mon4_shurui_cursor.getString(0)));
			get_mon4_shurui=Integer.parseInt(mon4_shurui_cursor.getString(0));
		}
		if(mon4_level_cursor.moveToLast())
		{
			Log.e("test7",""+Integer.parseInt(mon4_level_cursor.getString(0)));
			get_mon4_level=Integer.parseInt(mon4_level_cursor.getString(0));
		}
		if(mon4_state_cursor.moveToLast())
		{
			Log.e("test8",""+Integer.parseInt(mon4_state_cursor.getString(0)));
			get_mon4_state=Integer.parseInt(mon4_state_cursor.getString(0));
		}
		
		
		
		for(int i=0; i<9; i++){
			if(mon4_live_cursor.moveToNext())
			{
				Log.e("test91111",""+mon4_live_cursor.getInt(0));	
				get_mon4_live[i]=mon4_live_cursor.getInt(0); 
			}
		}
		
		
		
		if(mon4_leveltime_cursor.moveToLast())
		{
			Log.e("test10",""+Long.parseLong(mon4_leveltime_cursor.getString(0)));
			get_mon4_leveltime=Long.parseLong(mon4_leveltime_cursor.getString(0));
		}
		if(mon4_birthtime_cursor.moveToLast())
		{
			Log.e("test11",""+Long.parseLong(mon4_birthtime_cursor.getString(0)));
			get_mon4_birthtime=Long.parseLong(mon4_birthtime_cursor.getString(0));
		}
		
		
		db.close();
	}
	public static void goldsave(int db_gold)
	{
		SQLiteDatabase db=m_helper.getWritableDatabase();
		ContentValues row = new ContentValues();
		row.put("dgold",db_gold);

		db.insert("gold",null,row);
		db.close();
	}
	public static void map_save(int db_map)
	{
		SQLiteDatabase db=m_helper.getWritableDatabase();
		ContentValues row = new ContentValues();
		row.put("dmap",db_map);
		
		db.insert("map_state",null,row);
		db.close();
	}
	public static void farm_save(int db_farm)
	{
		SQLiteDatabase db=m_helper.getWritableDatabase();
		ContentValues row = new ContentValues();
		row.put("dfarm",db_farm);
		
		db.insert("farm",null,row);
		db.close();
	}
	public static void meat_save(int db_meat)
	{
		SQLiteDatabase db=m_helper.getWritableDatabase();
		ContentValues row = new ContentValues();
		row.put("dmeat",db_meat);
		
		db.insert("meat",null,row);
		db.close();
	}
	public static void medi_save(int db_medi)
	{
		SQLiteDatabase db=m_helper.getWritableDatabase();
		ContentValues row = new ContentValues();
		row.put("dmedichine",db_medi);
		
		db.insert("medichine",null,row);
		db.close();
	}
	public static void ddong_save(int db_ddong)
	{
		SQLiteDatabase db=m_helper.getWritableDatabase();
		ContentValues row = new ContentValues();
		row.put("dddong",db_ddong);
		
		db.insert("ddong",null,row);
		db.close();
	}
	public static void mon1shurui_save(int db_shurui)
	{
		SQLiteDatabase db=m_helper.getWritableDatabase();
		ContentValues row = new ContentValues();
		Log.i("asdasdasd1","asdasddsda");
		row.put("shurui1",db_shurui);		
		db.insert("mon1shurui",null,row);
		
		db.close();
	}
	public static void mon1level_save(int db_level)
	{
		SQLiteDatabase db=m_helper.getWritableDatabase();
		ContentValues row = new ContentValues();
		Log.i("asdasdasd1","asdasddsda");
		row.put("level1",db_level);		
		db.insert("mon1level",null,row);
		
		db.close();
	}
	public static void mon1state_save(int db_state)
	{
		SQLiteDatabase db=m_helper.getWritableDatabase();
		ContentValues row = new ContentValues();
		Log.i("asdasdasd1","asdasddsda");
		row.put("state1",db_state);		
		db.insert("mon1state",null,row);
		
		db.close();
	}
	public static void mon1live_save(Monster1 db_live[])
	{
		SQLiteDatabase db=m_helper.getWritableDatabase();
		ContentValues row = new ContentValues();
		
		for(int i=0; i<9; i++){
			Log.e("live1-"+i,""+db_live[i].tfcheck);
			row.put("live1",db_live[i].tfcheck);
			//db.update("mon1live", row, "live1=?", null);
			db.update("mon1live", row, "_id=" + i, null);
		}
		
		
		db.close();
	}
	public static void mon1leveltime_save(long db_leveltime)
	{
		SQLiteDatabase db=m_helper.getWritableDatabase();
		ContentValues row = new ContentValues();
		Log.i("asdasdasd1","asdasddsda");
		row.put("leveltime1",db_leveltime);		
		db.insert("mon1leveltime",null,row);
		
		db.close();
	}
	public static void mon1bitrhtime_save(long db_bitrhtime)
	{
		SQLiteDatabase db=m_helper.getWritableDatabase();
		ContentValues row = new ContentValues();
		Log.i("asdasdasd1","asdasddsda");
		row.put("birthtime1",db_bitrhtime);		
		db.insert("mon1birthtime",null,row);
		
		db.close();
	}
	///////////
	public static void mon2shurui_save(int db_shurui)
	{
		SQLiteDatabase db=m_helper.getWritableDatabase();
		ContentValues row = new ContentValues();
		Log.i("asdasdasd2","asdasddsda");
		row.put("shurui2",db_shurui);		
		db.insert("mon2shurui",null,row);
		
		db.close();
	}
	public static void mon2level_save(int db_level)
	{
		SQLiteDatabase db=m_helper.getWritableDatabase();
		ContentValues row = new ContentValues();
		Log.i("asdasdasd2","asdasddsda");
		row.put("level2",db_level);		
		db.insert("mon2level",null,row);
		
		db.close();
	}
	public static void mon2state_save(int db_state)
	{
		SQLiteDatabase db=m_helper.getWritableDatabase();
		ContentValues row = new ContentValues();
		Log.i("asdasdasd2","asdasddsda");
		row.put("state2",db_state);		
		db.insert("mon2state",null,row);
		
		db.close();
	}
	public static void mon2live_save(Monster2 db_live[])
	{
		SQLiteDatabase db=m_helper.getWritableDatabase();
		ContentValues row = new ContentValues();
		for(int i=0; i<9; i++){
			Log.e("live2-"+i,""+db_live[i].tfcheck);
			row.put("live2",db_live[i].tfcheck);
			//db.update("mon1live", row, "live1=?", null);
			db.update("mon2live", row, "_id=" + i, null);
		}
		db.close();
	}
	public static void mon2leveltime_save(long db_leveltime)
	{
		SQLiteDatabase db=m_helper.getWritableDatabase();
		ContentValues row = new ContentValues();
		Log.i("asdasdasd2","asdasddsda");
		row.put("leveltime2",db_leveltime);		
		db.insert("mon2leveltime",null,row);
		
		db.close();
	}
	public static void mon2bitrhtime_save(long db_bitrhtime)
	{
		SQLiteDatabase db=m_helper.getWritableDatabase();
		ContentValues row = new ContentValues();
		Log.i("asdasdasd2","asdasddsda");
		row.put("birthtime2",db_bitrhtime);		
		db.insert("mon2birthtime",null,row);
		
		db.close();
	}
	//////////////////
	public static void mon3shurui_save(int db_shurui)
	{
		SQLiteDatabase db=m_helper.getWritableDatabase();
		ContentValues row = new ContentValues();
		Log.i("asdasdasd3","asdasddsda");
		row.put("shurui3",db_shurui);		
		db.insert("mon3shurui",null,row);
		
		db.close();
	}
	public static void mon3level_save(int db_level)
	{
		SQLiteDatabase db=m_helper.getWritableDatabase();
		ContentValues row = new ContentValues();
		Log.i("asdasdasd3","asdasddsda");
		row.put("level3",db_level);		
		db.insert("mon3level",null,row);
		
		db.close();
	}
	public static void mon3state_save(int db_state)
	{
		SQLiteDatabase db=m_helper.getWritableDatabase();
		ContentValues row = new ContentValues();
		Log.i("asdasdasd3","asdasddsda");
		row.put("state3",db_state);		
		db.insert("mon3state",null,row);
		
		db.close();
	}
	public static void mon3live_save(Monster3 db_live[])
	{
		SQLiteDatabase db=m_helper.getWritableDatabase();
		ContentValues row = new ContentValues();
		for(int i=0; i<9; i++){
			Log.e("live3-"+i,""+db_live[i].tfcheck);
			row.put("live3",db_live[i].tfcheck);
			//db.update("mon1live", row, "live1=?", null);
			db.update("mon3live", row, "_id=" + i, null);
		}
		db.close();
	}
	public static void mon3leveltime_save(long db_leveltime)
	{
		SQLiteDatabase db=m_helper.getWritableDatabase();
		ContentValues row = new ContentValues();
		Log.i("asdasdasd3","asdasddsda");
		row.put("leveltime3",db_leveltime);		
		db.insert("mon3leveltime",null,row);
		
		db.close();
	}
	public static void mon3bitrhtime_save(long db_bitrhtime)
	{
		SQLiteDatabase db=m_helper.getWritableDatabase();
		ContentValues row = new ContentValues();
		Log.i("asdasdasd3","asdasddsda");
		row.put("birthtime3",db_bitrhtime);		
		db.insert("mon3birthtime",null,row);
		
		db.close();
	}
	/////////////////
	public static void mon4shurui_save(int db_shurui)
	{
		SQLiteDatabase db=m_helper.getWritableDatabase();
		ContentValues row = new ContentValues();
		Log.i("asdasdasd4","asdasddsda");
		row.put("shurui4",db_shurui);		
		db.insert("mon4shurui",null,row);
		
		db.close();
	}
	public static void mon4level_save(int db_level)
	{
		SQLiteDatabase db=m_helper.getWritableDatabase();
		ContentValues row = new ContentValues();
		Log.i("asdasdasd4","asdasddsda");
		row.put("level4",db_level);		
		db.insert("mon4level",null,row);
		
		db.close();
	}
	public static void mon4state_save(int db_state)
	{
		SQLiteDatabase db=m_helper.getWritableDatabase();
		ContentValues row = new ContentValues();
		Log.i("asdasdasd4","asdasddsda");
		row.put("state4",db_state);		
		db.insert("mon4state",null,row);
		
		db.close();
	}
	public static void mon4live_save(Monster4 db_live[])
	{
		SQLiteDatabase db=m_helper.getWritableDatabase();
		ContentValues row = new ContentValues();
		for(int i=0; i<9; i++){
			Log.e("live4-"+i,""+db_live[i].tfcheck);
			row.put("live4",db_live[i].tfcheck);
			//db.update("mon1live", row, "live1=?", null);
			db.update("mon4live", row, "_id=" + i, null);
		}
		
		db.close();
	}
	public static void mon4leveltime_save(long db_leveltime)
	{
		SQLiteDatabase db=m_helper.getWritableDatabase();
		ContentValues row = new ContentValues();
		Log.i("asdasdasd4","asdasddsda");
		row.put("leveltime4",db_leveltime);		
		db.insert("mon4leveltime",null,row);
		
		db.close();
	}
	public static void mon4bitrhtime_save(long db_bitrhtime)
	{
		SQLiteDatabase db=m_helper.getWritableDatabase();
		ContentValues row = new ContentValues();
		Log.i("asdasdasd4","asdasddsda");
		row.put("birthtime4",db_bitrhtime);		
		db.insert("mon4birthtime",null,row);

		db.close();
	}
}
