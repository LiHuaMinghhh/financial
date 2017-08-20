package com.neuq.bean;

import java.io.Serializable;

/**
 * ���п���Ϣ��
 */
public  class BankCardInfo implements Serializable{

	private static final long serialVersionUID = 1L;
	
	protected int id;
	protected String username;
	protected String banknumber;
	protected String bankname;
	/**
	 * @param id 		   ���п�id 
	 * @param username   �û���
	 * @param banknumber ���п���
	 * @param bankname   ��������
	 */
	public BankCardInfo(int id, String username, String banknumber, String bankname) {
		super();
		this.id = id;
		this.username = username;
		this.banknumber = banknumber;
		this.bankname = bankname;
	}
	
	public BankCardInfo(){
		
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "BankCardInfo [id=" + id + ", username=" + username + ", banknumber=" + banknumber + ", bankname="
				+ bankname + "]";
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return the banknumber
	 */
	public String getBanknumber() {
		return banknumber;
	}
	/**
	 * @param banknumber the banknumber to set
	 */
	public void setBanknumber(String banknumber) {
		this.banknumber = banknumber;
	}
	/**
	 * @return the bankname
	 */
	public String getBankname() {
		return bankname;
	}
	/**
	 * @param bankname the bankname to set
	 */
	public void setBankname(String bankname) {
		this.bankname = bankname;
	}
	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
