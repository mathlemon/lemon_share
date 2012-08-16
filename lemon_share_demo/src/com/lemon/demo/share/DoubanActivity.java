/** 
 * com.lemon.demo.tab.DoubanActivity.java
 * WeiFaJue.com
 */
package com.lemon.demo.share;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/** 
 * 豆瓣的Activity
 * 
 * @author Lemon
 * create on 2012-7-29 下午6:22:54 @version 1.0
 */
public class DoubanActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		//TODO 先显示界面
		// 1. 成功显示界面
		// 2. 完善界面
		// 3. 添加引用bundle
		// 4. 完成登陆后显示数据
		TextView textView = new TextView(this);
		textView.setText("豆瓣登陆界面");
		setContentView(textView);
	}
	
}
