package com.neuq.bean;

public class Checkpwd {
private String username;
private String checkcode;


public Checkpwd() {
	// TODO �Զ����ɵĹ��캯�����
}

/**
 * @param username
 * @param checkcode
 */
public Checkpwd(String username, String checkcode) {
	super();
	this.username = username;
	this.checkcode = checkcode;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getCheckcode() {
	return checkcode;
}
public void setCheckcode(String checkcode) {
	this.checkcode = checkcode;
}
}
