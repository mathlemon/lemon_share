/** 
 * com.lemon.demo.tab.WeiboActivity.java
 * WeiFaJue.com
 */
package com.lemon.demo.share;

import java.io.IOException;
import java.net.MalformedURLException;

import org.json.JSONException;

import com.lemon.demo.share.remote.JsonUtil;
import com.weibo.net.Weibo;
import com.weibo.net.WeiboException;
import com.weibo.net.WeiboParameters;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

/**
 * 微博登陆界面
 * 
 * @author mathlemon create on 2012-7-29 下午6:11:14 @version 1.0
 */
public class WeiboActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		// TODO 先显示界面
		// 1. 成功显示界面
		// 2. 完善界面
		// 3. 添加引用bundle
		// 4. 完成登陆后显示数据
		TextView textView = new TextView(this);
		textView.setText("微博登陆界面");
		setContentView(textView);

		setContentView(R.layout.view_weibo);

		Weibo weibo = Weibo.getInstance();
		String result = "";
		try {
//			result = getPublicTimeline(weibo);
			result = getFriendsTimeline();
			Log.d("WeiboActivity", result);
			try {
				JsonUtil.buildWeboStatus(result);
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
//		} catch (MalformedURLException e) {
//			Log.e("WeiboActivity", e.toString());
//			e.printStackTrace();
//		} catch (IOException e) {
//			Log.e("WeiboActivity", e.toString());
//			e.printStackTrace();
		} catch (WeiboException e) {
			Log.e("WeiboActivity", e.toString());
			e.printStackTrace();
		}

		textView = (TextView) this.findViewById(R.id.tv_weibo_result);
		textView.setText(result);
		
		
	}

	private String getPublicTimeline(Weibo weibo) throws MalformedURLException,
			IOException, WeiboException {
		String url = Weibo.SERVER + "statuses/public_timeline.json";
		WeiboParameters bundle = new WeiboParameters();
		bundle.add("source", Weibo.getAppKey());
		String rlt = weibo.request(this, url, bundle, "GET",
				weibo.getAccessToken());
		return rlt;
	}
	
	private String getFriendsTimeline() throws WeiboException {
		String url = Weibo.SERVER + "statuses/friends_timeline.json";
		WeiboParameters bundle = new WeiboParameters();
		bundle.add("source", Weibo.getAppKey());
		Weibo weibo = Weibo.getInstance();
		String rlt = weibo.request(this, url, bundle, "GET",
				weibo.getAccessToken());
		return rlt;
	}
}
