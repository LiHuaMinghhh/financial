package com.neuq.bean;

import java.io.Serializable;

public class User implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public User() {
		// TODO �Զ����ɵĹ��캯�����
	}
	/**
	 * ����������
	 */
	private int id;
	/**
	 * �û���
	 */
	private String username;
	/**
	 * ����
	 */
	private String password;
	/**
	 * Ȩ��
	 */
	private int ru=3;
	/**
	 * ��ͥ���
	 */
	private int familyid;
	/**
	 * �ֻ���
	 */
	private String telephone;
	/**
	 * ����
	 */
	private String email;
	/**
	 * �Ա�
	 */
	private int sex;
	/**
	 * ����˺���
	 */
	private String idcard;
	/**
	 * ��ͥ��ɫ
	 */
	private String role;
	
	
	/**
	 * ��֤��
	 */
	private String randomCode;
	
	
	/**
	 * @param id ����
	 * @param username �û���
	 * @param password ����
	 * @param ru Ȩ��
	 * @param familyid ��ͥ���
	 * @param telephone �ֻ���
	 * @param email ����
	 * @param sex �Ա�
	 * @param idcard ���֤����
	 * @param role ��ͥ��ɫ
	 */
	public User(String username, String password,  int familyid, String telephone, String email, int sex,
			String idcard, String role) {
		super();
		//this.id = id;
		this.username = username;
		this.password = password;
		//this.ru = ru;
		this.familyid = familyid;
		this.telephone = telephone;
		this.email = email;
		this.sex = sex;
		this.idcard = idcard;
		this.role = role;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getRu() {
		return ru;
	}
	public void setRu(int ru) {
		this.ru = ru;
	}
	public int getFamilyid() {
		return familyid;
	}
	public void setFamilyid(int familyid) {
		this.familyid = familyid;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public String getIdcard() {
		return idcard;
	}
	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	public String getRandomCode() {
		return randomCode;
	}
	public void setRandomCode(String randomCode) {
		this.randomCode = randomCode;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", ru=" + ru + ", familyid="
				+ familyid + ", telephone=" + telephone + ", email=" + email + ", sex=" + sex + ", idcard=" + idcard
				+ ", role=" + role + "]";
	}
	
}
