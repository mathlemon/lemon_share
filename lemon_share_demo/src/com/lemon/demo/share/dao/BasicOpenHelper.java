/** 
 * com.lemon.demo.share.dao.BasicOpenHelper.java
 * WeiFaJue.com
 */
package com.lemon.demo.share.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;


/** 
 * 数据库基本操作
 * 
 * @author mathlemon
 * create on 2012-8-1 上午12:41:34 @version 1.0
 */
public class BasicOpenHelper  extends SQLiteOpenHelper {

	/** weifajue数据库文件   **/
	private static final String WEI_FA_JUE_DB = "lemonshare.db";
	
	/** 版本   **/
	private static final int VERSION = 1;
	
	public BasicOpenHelper(Context context) {
		super(context, WEI_FA_JUE_DB, null, VERSION);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		
		try {
			db.execSQL(OperateSQL.LOGIN_INFO_CREATE_VER1);
		} catch (Exception e) {
			Log.e("weifajue-exception", e.getStackTrace().toString());
		}
		
		
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		
	}

}
