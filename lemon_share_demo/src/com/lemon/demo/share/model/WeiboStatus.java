/** 
 * com.lemon.demo.share.model.Status.java
 * WeiFaJue.com
 */
package com.lemon.demo.share.model;

import java.util.Date;

/** 
 * 微博
 * 
 * @author mathlemon
 * create on 2012-8-4 上午12:10:37 @version 1.0
 */
public class WeiboStatus {

	private Date createdAt;
	
	private long id;
	
	private long mid;
	
	private String idStr;
	
	private String text;
	
	private String source;
	
	private boolean favorited;
	
	private boolean truncated;
	
	private String idReplyToStatusId;
	
	private String idReplyToUserId;
	
	private String inReplyToSceenName;
	
	private String geo;
	
	private WeiboStatus retweetedStatus;
	
	private int repostsCount;//0
	
	private int commentsCount;//1
	
	private int mlevel;

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getMid() {
		return mid;
	}

	public void setMid(long mid) {
		this.mid = mid;
	}

	public String getIdStr() {
		return idStr;
	}

	public void setIdStr(String idStr) {
		this.idStr = idStr;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public boolean isFavorited() {
		return favorited;
	}

	public void setFavorited(boolean favorited) {
		this.favorited = favorited;
	}

	public boolean isTruncated() {
		return truncated;
	}

	public void setTruncated(boolean truncated) {
		this.truncated = truncated;
	}

	public String getIdReplyToStatusId() {
		return idReplyToStatusId;
	}

	public void setIdReplyToStatusId(String idReplyToStatusId) {
		this.idReplyToStatusId = idReplyToStatusId;
	}

	public String getIdReplyToUserId() {
		return idReplyToUserId;
	}

	public void setIdReplyToUserId(String idReplyToUserId) {
		this.idReplyToUserId = idReplyToUserId;
	}

	public String getInReplyToSceenName() {
		return inReplyToSceenName;
	}

	public void setInReplyToSceenName(String inReplyToSceenName) {
		this.inReplyToSceenName = inReplyToSceenName;
	}

	public String getGeo() {
		return geo;
	}

	public void setGeo(String geo) {
		this.geo = geo;
	}

	public WeiboStatus getRetweetedStatus() {
		return retweetedStatus;
	}

	public void setRetweetedStatus(WeiboStatus retweetedStatus) {
		this.retweetedStatus = retweetedStatus;
	}

	public int getRepostsCount() {
		return repostsCount;
	}

	public void setRepostsCount(int repostsCount) {
		this.repostsCount = repostsCount;
	}

	public int getCommentsCount() {
		return commentsCount;
	}

	public void setCommentsCount(int commentsCount) {
		this.commentsCount = commentsCount;
	}

	public int getMlevel() {
		return mlevel;
	}

	public void setMlevel(int mlevel) {
		this.mlevel = mlevel;
	}
	
}
