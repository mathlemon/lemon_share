/** 
 * com.lemon.demo.share.dao.LoginInfoDao.java
 * WeiFaJue.com
 */
package com.lemon.demo.share.dao;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.lemon.demo.share.model.LoginInfo;

/**
 * 登陆操作
 * 
 * @author mathlemon create on 2012-8-1 上午12:42:55 @version 1.0
 */
public class LoginInfoDao {

	/** 数据操作 **/
	private BasicOpenHelper helper;

	/** 数据库 **/
	private SQLiteDatabase db;

	public LoginInfoDao(Context context) {

		helper = new BasicOpenHelper(context);
		db = helper.getWritableDatabase();
	}

	/**
	 * 插入数据
	 * 
	 * @param like
	 */
	public void insert(LoginInfo loginInfo) {

		db.beginTransaction();

		try {

			db.execSQL(OperateSQL.LOGIN_INFO_INSERT_VER1, new Object[] {
					loginInfo.getLoginType(), loginInfo.getWeiboToken(),
					loginInfo.getWeiboExpire(), loginInfo.getLoginUser() });
			db.setTransactionSuccessful();
		} finally {
			db.endTransaction();
		}
	}

	/**
	 * 查询所有数据
	 * 
	 * @return 所有数据
	 */
	public List<LoginInfo> queryAll() {
		ArrayList<LoginInfo> loginInfos = new ArrayList<LoginInfo>();
		Cursor c = db.rawQuery(OperateSQL.LOGIN_INFO_SELECT_VER1, null);
		while (c.moveToNext()) {

			LoginInfo loginInfo = new LoginInfo();
			loginInfo.setId(c.getInt(c.getColumnIndex("id")));

			loginInfo.setLoginType(c.getInt(c.getColumnIndex("login_type")));
			loginInfo
					.setWeiboToken(c.getString(c.getColumnIndex("weibo_token")));
			loginInfo.setWeiboExpire(c.getString(c
					.getColumnIndex("weibo_expire")));
			loginInfo
					.setLoginUser(c.getString(c.getColumnIndex("login_user")));

			loginInfos.add(loginInfo);
		}
		return loginInfos;
	}

	/**
	 * 关闭数据库
	 */
	public void closeDB() {
		// TODO 这里引用的地方有待商榷
		try {
			db.close();
		} catch (Exception e) {
			Log.e("weifajue-exception", e.getStackTrace().toString());
		}
	}

}
