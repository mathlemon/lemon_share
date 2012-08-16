/** 
 * com.lemon.demo.tab.LoginActivity.java
 * WeiFaJue.com
 */
package com.lemon.demo.share;

import java.util.List;

import com.lemon.demo.share.dao.LoginInfoDao;
import com.lemon.demo.share.model.LoginInfo;
import com.weibo.net.AccessToken;
import com.weibo.net.DialogError;
import com.weibo.net.Weibo;
import com.weibo.net.WeiboDialogListener;
import com.weibo.net.WeiboException;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

/**
 * 登陆主界面
 * 
 * @author mathlemon create on 2012-7-29 下午9:11:31 @version 1.0
 */
public class LoginActivity extends Activity {

	private static final String CONSUMER_KEY = "469992719";
	private static final String CONSUMER_SECRET = "3f1e55635fbb9b1e75958a1fee04a943";
	private static final String REDIRECT_URL = "http://www.weibo.com";

	public static final String LOGIN_INFO = "loginInfo";
	
	private LoginInfoDao loginInfoDao; 
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		// TODO 先显示界面
		// 1. 成功显示界面
		// 2. 完善界面
		// 3. 添加引用bundle
		// 4. 完成登陆后显示数据

		setContentView(R.layout.view_main_login);
		loginInfoDao = new LoginInfoDao(this);
	}

	public void linkToWeb(View view) {

		Log.d("WeiboActivity", "链接到网络");
	}

	public void mainLogin(View view) {

		Log.d("WeiboActivity", "登录");
	}

	public void noLogin(View view) {

		Log.d("WeiboActivity", "不登录进入");
		Intent intent = new Intent(LoginActivity.this, MainTabWidget.class);

		LoginInfo loginInfo = new LoginInfo();
		loginInfo.setLoginType(1);
		intent.putExtra(LOGIN_INFO, loginInfo);
		
		this.startActivity(intent);
	}

	public void weiboLogin(View view) {

		Log.d("WeiboActivity", "微博登陆");

		List<LoginInfo> loginInfoList = loginInfoDao.queryAll();
		
		for(LoginInfo info : loginInfoList) {
			if(info.getLoginType() == 2) {
				Intent intent = new Intent();
				intent.setClass(LoginActivity.this, MainTabWidget.class);
				intent.putExtra(LOGIN_INFO, info);
				AccessToken accessToken = new AccessToken(info.getWeiboToken(), CONSUMER_SECRET);
				accessToken.setExpiresIn(info.getWeiboExpire());
				Weibo.getInstance().setAccessToken(accessToken);
				startActivity(intent);
			}
		}
		
		Weibo weibo = Weibo.getInstance();
		weibo.setupConsumerConfig(CONSUMER_KEY, CONSUMER_SECRET);

		// Oauth2.0
		// 隐式授权认证方式
		weibo.setRedirectUrl(REDIRECT_URL);// 此处回调页内容应该替换为与appkey对应的应用回调页

		weibo.authorize(LoginActivity.this, new AuthDialogListener());
	}

	class AuthDialogListener implements WeiboDialogListener {

		@Override
		public void onComplete(Bundle values) {

			String token = values.getString("access_token");
			String expires_in = values.getString("expires_in");

			AccessToken accessToken = new AccessToken(token, CONSUMER_SECRET);
			accessToken.setExpiresIn(expires_in);
			Weibo.getInstance().setAccessToken(accessToken);

			// 登陆进入主界面
			Intent intent = new Intent();
			intent.setClass(LoginActivity.this, MainTabWidget.class);

			LoginInfo loginInfo = new LoginInfo();
			loginInfo.setWeiboToken(token);
			loginInfo.setWeiboExpire(expires_in);
			loginInfo.setLoginType(2);
			intent.putExtra(LOGIN_INFO, loginInfo);

			// TODO 保存token
			loginInfoDao.insert(loginInfo);

			startActivity(intent);
		}

		@Override
		public void onError(DialogError e) {
			Toast.makeText(getApplicationContext(),
					"Auth error : " + e.getMessage(), Toast.LENGTH_LONG).show();
		}

		@Override
		public void onCancel() {
			Toast.makeText(getApplicationContext(), "Auth cancel",
					Toast.LENGTH_LONG).show();
		}

		@Override
		public void onWeiboException(WeiboException e) {
			Toast.makeText(getApplicationContext(),
					"Auth exception : " + e.getMessage(), Toast.LENGTH_LONG)
					.show();
		}

	}
}
