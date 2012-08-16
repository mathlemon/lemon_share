/** 
 * com.lemon.demo.tab.QQWeiboActivity.java
 * WeiFaJue.com
 */
package com.lemon.demo.share;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/** 
 * QQ微博的登陆
 * 
 * @author Lemon
 * create on 2012-7-29 下午6:21:55 @version 1.0
 */
public class QQWeiboActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		//TODO 先显示界面
		// 1. 成功显示界面
		// 2. 完善界面
		// 3. 添加引用bundle
		// 4. 完成登陆后显示数据
		TextView textView = new TextView(this);
		textView.setText("QQ微博登陆界面");
		setContentView(textView);
	}
	
}
