package com.example.loksevasaw_mill;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHandler extends SQLiteOpenHelper{
public static final String Quantity="qty";
public static final String Length="len";
public static final String Width="wid";
public static final String Breadth="bre";
public static final String DBname="order";
public final String Tablename="order1";
public static final int version=1;
SQLiteDatabase db;
public DatabaseHandler(Context baseContext) {
		// TODO Auto-generated constructor stub
	super(baseContext,DBname,null,version);
	
	}

	public DatabaseHandler Open() {
		// TODO Auto-generated method stub
		db=getWritableDatabase();
		return this;
	}

	public void insertdata(int qty,int len,int wid,int bre) {
		// TODO Auto-generated method stub
		try{
		ContentValues cv=new ContentValues();
		cv.put("qty", qty);
		cv.put("len", len);
		cv.put("wid", wid);
		cv.put("bre", bre);
		db.insert(Tablename, null, cv);
		}
		catch(Exception e)
		{
				
		}		
	}
	
	public void closedata() {
		// TODO Auto-generated method stub
		db.close();
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		db.execSQL("create table order1(Quantity not null,Length not null,Width not null,Breadth not null);");
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int arg1, int arg2) {
		// TODO Auto-generated method stub
		db.execSQL("drop table if exist order;");
	}

}
