package com.redis.conn.entity;

/**
 * 数据库实体
 * @author davis
 *
 */
public class DBConnect {

	private Long id;
	private String dbname;
	private String dbip;
	private String dbpwd;
	private String dbusername;
	private String dbencoding;

	public DBConnect(String dbname, String dbip, String dbpwd, String dbusername, String dbencoding) {
		super();
		this.dbname = dbname;
		this.dbip = dbip;
		this.dbpwd = dbpwd;
		this.dbusername = dbusername;
		this.dbencoding = dbencoding;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDbname() {
		return dbname;
	}

	public void setDbname(String dbname) {
		this.dbname = dbname;
	}

	public String getDbip() {
		return dbip;
	}

	public void setDbip(String dbip) {
		this.dbip = dbip;
	}

	public String getDbpwd() {
		return dbpwd;
	}

	public void setDbpwd(String dbpwd) {
		this.dbpwd = dbpwd;
	}

	public String getDbusername() {
		return dbusername;
	}

	public void setDbusername(String dbusername) {
		this.dbusername = dbusername;
	}

	public String getDbencoding() {
		return dbencoding;
	}

	public void setDbencoding(String dbencoding) {
		this.dbencoding = dbencoding;
	}

}
