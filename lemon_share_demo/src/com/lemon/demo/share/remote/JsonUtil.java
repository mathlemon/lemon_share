/** 
 * com.lemon.demo.share.remote.JsonUtil.java
 * WeiFaJue.com
 */
package com.lemon.demo.share.remote;

import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

import android.util.Log;

import com.lemon.demo.share.model.WeiboStatus;

/** 
 * 用于解析json的辅助工具
 * 
 * @author mathlemon
 * create on 2012-8-3 下午11:36:03 @version 1.0
 */
public class JsonUtil {

	public static List<WeiboStatus> buildWeboStatus(String json) throws JSONException {
		
		JSONTokener tokener = new JSONTokener(json); 

		JSONObject jsonTimeline = (JSONObject) tokener.nextValue();
		
		JSONArray jsonStatuses = jsonTimeline.getJSONArray("statuses");
		
		for (int i = 0; i < jsonStatuses.length(); i++) {
			
			JSONObject jsonStatus = (JSONObject) jsonStatuses.getJSONObject(i);
			
			String text = jsonStatus.getString("text");

			
		}
		
		return null;
	}
	
}
