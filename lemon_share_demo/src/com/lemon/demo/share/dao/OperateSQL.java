/** 
 * com.lemon.demo.share.dao.OperateSQL.java
 * WeiFaJue.com
 */
package com.lemon.demo.share.dao;

/** 
 * 操作的SQL
 * 
 * @author mathlemon
 * create on 2012-8-1 上午12:46:28 @version 1.0
 */
public class OperateSQL {

	/** 创建 用户 数据库 **/
	public static final String LOGIN_INFO_CREATE_VER1 = "CREATE TABLE IF NOT EXISTS login_info_table " +
			"( id INTEGER PRIMARY KEY AUTOINCREMENT, " +
			"  login_type INTEGER, " +
			"  weibo_token NVARCHAR(20), " +
			"  weibo_expire NVARCHAR(20), " +
			"  login_user NVARCHAR(20))";

	/** 插入  用户 数据 **/
	public static final String LOGIN_INFO_INSERT_VER1 = "INSERT INTO login_info_table VALUES(null, ?, ?, ?, ?)";

	/** 查询所有  用户  数据   **/
	public static final String LOGIN_INFO_SELECT_VER1 = "SELECT * FROM login_info_table";
	
}
