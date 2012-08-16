/** 
 * com.lemon.demo.share.model.WeiboTimeline.java
 * WeiFaJue.com
 */
package com.lemon.demo.share.model;

import java.util.List;

/** 
 * 
 * 
 * @author mathlemon
 * create on 2012-8-4 上午1:13:58 @version 1.0
 */
public class WeiboTimeline {

	private List<WeiboStatus> statuses;
	
	private long previousCursor;
	
	private long nextCursor;
	
	private int totalNumber;

	public List<WeiboStatus> getStatuses() {
		return statuses;
	}

	public void setStatuses(List<WeiboStatus> statuses) {
		this.statuses = statuses;
	}

	public long getPreviousCursor() {
		return previousCursor;
	}

	public void setPreviousCursor(long previousCursor) {
		this.previousCursor = previousCursor;
	}

	public long getNextCursor() {
		return nextCursor;
	}

	public void setNextCursor(long nextCursor) {
		this.nextCursor = nextCursor;
	}

	public int getTotalNumber() {
		return totalNumber;
	}

	public void setTotalNumber(int totalNumber) {
		this.totalNumber = totalNumber;
	}
	
	
	
}
