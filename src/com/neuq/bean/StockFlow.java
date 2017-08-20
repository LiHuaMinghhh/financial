package com.neuq.bean;

import java.util.Date;
import java.io.Serializable;

public class StockFlow implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8861357652455425621L;
	/**
	 * id ���� username �û��� stockcode ���й�Ʊ���� stockname ��Ʊ���� stocknumber ��Ʊ����
	 * buyOrsell ����/���� transactiontime ����ʱ�� transactionprince ���׵���
	 */
	public int id;
	public String username;
	public int stockcode;
	public String stockname;
	public int stocknumber;
	public int buyOrsell;
	public Date transactiontime;
	public double transactionprince;

	/**
	 * @paramid ����
	 * @param username
	 *            �û���
	 * @param stockcode
	 *            ���й�Ʊ����
	 * @param stockname
	 *            ��Ʊ����
	 * @param stocknumber
	 *            ��Ʊ����
	 * @param buyOrsell
	 *            ����/����
	 * @param transactiontime
	 *            ����ʱ��
	 * @param transactionprince
	 *            ���׵���
	 */
	public StockFlow(int id, String username, int stockcode, String stockname, int stocknumber, int buyOrsell,
			Date transactiontime, double transactionprince) {
		super();
		this.id = id;
		this.username = username;
		this.stockcode = stockcode;
		this.stockname = stockname;
		this.stocknumber = stocknumber;
		this.buyOrsell = buyOrsell;
		this.transactiontime = transactiontime;
		this.transactionprince = transactionprince;
	}

	public StockFlow() {

	}

	public String toString() {
		return "StockFlow [id=" + id + ", username=" + username + ", stockcode=" + stockcode + ", stockname="
				+ stockname + ", stocknumber=" + stocknumber + ", buyOrsell=" + buyOrsell + ", transactiontime="
				+ transactiontime + ", transactionprince=" + transactionprince + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return username;
	}

	public void setUserName(String username) {
		this.username = username;
	}

	public int getStockCode() {
		return stockcode;
	}

	public void setStockCode(int stockcode) {
		this.stockcode = stockcode;
	}

	public String getStockName() {
		return stockname;
	}

	public void setStockName(String stockname) {
		this.stockname = stockname;
	}

	public int getStockNumber() {
		return stocknumber;
	}

	public void setStockNumber(int stocknumber) {
		this.stocknumber = stocknumber;
	}

	public int getBuyOrSell() {
		return buyOrsell;
	}

	public void setBuyOrSell(int buyOrsell) {
		this.buyOrsell = buyOrsell;
	}

	public Date getTransactionTime() {
		return transactiontime;
	}

	public void setTransactionTime(Date transactiontime) {
		this.transactiontime = transactiontime;
	}

	public double getTransactionPrince() {
		return transactionprince;
	}

	public void setTransactionPrince(double transactionprince) {
		this.transactionprince = transactionprince;
	}

}
