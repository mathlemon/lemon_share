/** 
 * com.lemon.demo.share.WeixinActivity.java
 * WeiFaJue.com
 */
package com.lemon.demo.share;

import com.tencent.mm.sdk.openapi.IWXAPI;
import com.tencent.mm.sdk.openapi.SendMessageToWX;
import com.tencent.mm.sdk.openapi.WXAPIFactory;
import com.tencent.mm.sdk.openapi.WXMediaMessage;
import com.tencent.mm.sdk.openapi.WXTextObject;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/** 
 * 微信界面
 * 
 * @author mathlemon
 * create on 2012-8-8 下午11:28:27 @version 1.0
 */
public class WeixinActivity extends Activity {

	private static final String APP_ID = "";
	
	private IWXAPI api;

	private void regToWx() {
		api = WXAPIFactory.createWXAPI(this, APP_ID, true);
		api.registerApp(APP_ID);
	}
	
	private void sendToWx() {
		WXTextObject textObj = new WXTextObject();
		textObj.text = "test";
		
		WXMediaMessage msg = new WXMediaMessage();
		msg.mediaObject = textObj;
		msg.description = "test";
		
		SendMessageToWX.Req req = new SendMessageToWX.Req();
		req.transaction = String.valueOf(System.currentTimeMillis());
		req.message = msg;
		
		api.sendReq(req);
	}
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		//TODO 先显示界面
		// 1. 成功显示界面
		// 2. 完善界面
		// 3. 添加引用bundle
		// 4. 完成登陆后显示数据
		TextView textView = new TextView(this);
		textView.setText("微信界面");
		setContentView(textView);
	}
	
}
