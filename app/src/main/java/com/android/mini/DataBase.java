package com.android.mini;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class DataBase extends SQLiteOpenHelper
{

	public DataBase(Context context, String name, CursorFactory factory,
			int version) {
		super(context, name, factory, version);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		db.execSQL("CREATE TABLE gold(dgold INTEGER);");
		db.execSQL("INSERT INTO gold VALUES(90000);");
		
		db.execSQL("CREATE TABLE map_state(dmap INTEGER);");
		db.execSQL("INSERT INTO map_state VALUES(1);");
		
		db.execSQL("CREATE TABLE farm(dfarm INTEGER);");
		db.execSQL("INSERT INTO farm VALUES(1);");
		
		db.execSQL("CREATE TABLE meat(dmeat INTEGER);");
		db.execSQL("INSERT INTO meat VALUES(1);");
		
		db.execSQL("CREATE TABLE medichine(dmedichine INTEGER);");
		db.execSQL("INSERT INTO medichine VALUES(1);");
		
		db.execSQL("CREATE TABLE ddong(dddong INTEGER);");
		db.execSQL("INSERT INTO ddong VALUES(1);");
		
		///////////////////
		db.execSQL("CREATE TABLE mon1shurui(shurui1 INTEGER);");
		db.execSQL("INSERT INTO mon1shurui VALUES(0);");
		
		db.execSQL("CREATE TABLE mon1level(level1 INTEGER);");
		db.execSQL("INSERT INTO mon1level VALUES(0);");
		
		db.execSQL("CREATE TABLE mon1state(state1 INTEGER);");
		db.execSQL("INSERT INTO mon1state VALUES(0);");
		
		db.execSQL("CREATE TABLE mon1live(_id INTEGER, live1 INTEGER);");
		for(int i=0; i<9; i++){
		db.execSQL("INSERT INTO mon1live VALUES("+i+" , 0);");
		}
		
		db.execSQL("CREATE TABLE mon1leveltime(leveltime1 INTEGER);");
		db.execSQL("INSERT INTO mon1leveltime VALUES(0);");
		
		db.execSQL("CREATE TABLE mon1birthtime(birthtime1 INTEGER);");
		db.execSQL("INSERT INTO mon1birthtime VALUES(0);");
		///////////////
		db.execSQL("CREATE TABLE mon2shurui(shurui2 INTEGER);");
		db.execSQL("INSERT INTO mon2shurui VALUES(0);");
		
		db.execSQL("CREATE TABLE mon2level(level2 INTEGER);");
		db.execSQL("INSERT INTO mon2level VALUES(0);");
		
		db.execSQL("CREATE TABLE mon2state(state2 INTEGER);");
		db.execSQL("INSERT INTO mon2state VALUES(0);");
		
		db.execSQL("CREATE TABLE mon2live(_id INTEGER, live2 INTEGER);");
		for(int i=0; i<9; i++){
		db.execSQL("INSERT INTO mon2live VALUES("+i+" , 0);");
		}
		
		db.execSQL("CREATE TABLE mon2leveltime(leveltime2 INTEGER);");
		db.execSQL("INSERT INTO mon2leveltime VALUES(0);");
		
		db.execSQL("CREATE TABLE mon2birthtime(birthtime2 INTEGER);");
		db.execSQL("INSERT INTO mon2birthtime VALUES(0);");
		////////////////////
		db.execSQL("CREATE TABLE mon3shurui(shurui3 INTEGER);");
		db.execSQL("INSERT INTO mon3shurui VALUES(0);");
		
		db.execSQL("CREATE TABLE mon3level(level3 INTEGER);");
		db.execSQL("INSERT INTO mon3level VALUES(0);");
		
		db.execSQL("CREATE TABLE mon3state(state3 INTEGER);");
		db.execSQL("INSERT INTO mon3state VALUES(0);");
		
		db.execSQL("CREATE TABLE mon3live(_id INTEGER, live3 INTEGER);");
		for(int i=0; i<9; i++){
		db.execSQL("INSERT INTO mon3live VALUES("+i+" , 0);");
		}
		
		db.execSQL("CREATE TABLE mon3leveltime(leveltime3 INTEGER);");
		db.execSQL("INSERT INTO mon3leveltime VALUES(0);");
		
		db.execSQL("CREATE TABLE mon3birthtime(birthtime3 INTEGER);");
		db.execSQL("INSERT INTO mon3birthtime VALUES(0);");
		////////////////////////
		db.execSQL("CREATE TABLE mon4shurui(shurui4 INTEGER);");
		db.execSQL("INSERT INTO mon4shurui VALUES(0);");
		
		db.execSQL("CREATE TABLE mon4level(level4 INTEGER);");
		db.execSQL("INSERT INTO mon4level VALUES(0);");
		
		db.execSQL("CREATE TABLE mon4state(state4 INTEGER);");
		db.execSQL("INSERT INTO mon4state VALUES(0);");
		
		db.execSQL("CREATE TABLE mon4live(_id INTEGER, live4 INTEGER);");
		for(int i=0; i<9; i++){
		db.execSQL("INSERT INTO mon4live VALUES("+i+" , 0);");
		}
		
		db.execSQL("CREATE TABLE mon4leveltime(leveltime4 INTEGER);");
		db.execSQL("INSERT INTO mon4leveltime VALUES(0);");
		
		db.execSQL("CREATE TABLE mon4birthtime(birthtime4 INTEGER);");
		db.execSQL("INSERT INTO mon4birthtime VALUES(0);");
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		
	}
	
}
