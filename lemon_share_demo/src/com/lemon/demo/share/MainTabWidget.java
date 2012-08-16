/** 
 * com.lemon.demo.tab.MainTabWidget.java
 * WeiFaJue.com
 */
package com.lemon.demo.share;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;

/**
 * 主要的tab处理 这个相对简单，具体难的地方在具体的intent里面
 * 
 * @author mathlemon create on 2012-7-29 下午6:47:05 @version 1.0
 */
public class MainTabWidget extends TabActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		// 界面资源
		// Resources res = getResources();
		// 主界面的tab
		TabHost tabHost = getTabHost();
		// 具体的标签
		TabHost.TabSpec spec;
		// 跳转的界面
		Intent intent;

		// 微博跳转
		intent = new Intent().setClass(this, WeiboActivity.class);
		spec = tabHost.newTabSpec("").setIndicator("微博").setContent(intent);
		tabHost.addTab(spec);

		// QQ微博跳转
		intent = new Intent().setClass(this, QQWeiboActivity.class);
		spec = tabHost.newTabSpec("").setIndicator("QQ微博").setContent(intent);
		tabHost.addTab(spec);

		// 豆瓣跳转
		intent = new Intent().setClass(this, DoubanActivity.class);
		spec = tabHost.newTabSpec("").setIndicator("豆瓣").setContent(intent);
		tabHost.addTab(spec);

		// 微信跳转
		intent = new Intent().setClass(this, WeixinActivity.class);
		spec = tabHost.newTabSpec("").setIndicator("微信").setContent(intent);
		tabHost.addTab(spec);

		// TAB 0 = weibo
		tabHost.setCurrentTab(0);

		// TODO 返回的时候直接退出，而不是返回登录界面

	}

}
