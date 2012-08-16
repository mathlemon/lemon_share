/** 
 * com.lemon.demo.share.model.LoginInfo.java
 * WeiFaJue.com
 */
package com.lemon.demo.share.model;

import java.io.Serializable;

/**
 * 用户登录信息
 * 
 * @author mathlemon create on 2012-7-30 上午2:05:03 @version 1.0
 */
public class LoginInfo implements Serializable {

	/** serialVersionUID **/
	private static final long serialVersionUID = -940480313541936915L;

	/** 唯一ID **/
	private int id;

	/**
	 * 登陆类型：二进制表示 0000 : 0表示没登陆，1表示登陆 最后一位是默认登陆，用户名密码 倒数第二位是微博登陆 倒数第三位是QQ微博
	 * 倒数第四位是豆瓣
	 * **/
	private int loginType;

	/** 是否已经登陆 **/
	private boolean isLogin;

	/** 登陆用户 **/
	private String loginUser;

	/** 登陆密码 **/
	private String password;

	/** 微博密令 **/
	private String weiboToken;

	/** 微博密令过期 **/
	private String weiboExpire;

	/** 豆瓣密令 **/
	private String doubanToken;

	/** QQ微博密令 **/
	private String qqWeiboToken;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getLoginType() {
		return loginType;
	}

	public void setLoginType(int loginType) {
		this.loginType = loginType;
	}

	public boolean isLogin() {
		return isLogin;
	}

	public void setLogin(boolean isLogin) {
		this.isLogin = isLogin;
	}

	public String getLoginUser() {
		return loginUser;
	}

	public void setLoginUser(String loginUser) {
		this.loginUser = loginUser;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getWeiboToken() {
		return weiboToken;
	}

	public void setWeiboToken(String weiboToken) {
		this.weiboToken = weiboToken;
	}

	public String getWeiboExpire() {
		return weiboExpire;
	}

	public void setWeiboExpire(String weiboExpire) {
		this.weiboExpire = weiboExpire;
	}

	public String getDoubanToken() {
		return doubanToken;
	}

	public void setDoubanToken(String doubanToken) {
		this.doubanToken = doubanToken;
	}

	public String getQqWeiboToken() {
		return qqWeiboToken;
	}

	public void setQqWeiboToken(String qqWeiboToken) {
		this.qqWeiboToken = qqWeiboToken;
	}

}
