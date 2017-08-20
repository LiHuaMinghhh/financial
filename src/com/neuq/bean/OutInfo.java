package com.neuq.bean;

import java.io.Serializable;
import java.util.Date;

public class OutInfo implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public OutInfo () {
		// TODO �Զ����ɵĹ��캯�����
	}
	/**
	 * ���� ������
	 */
	private int id;
	/**
	 * �û���
	 */
	private String username;
	/**
	 * ֧�����
	 */
	private Double outcome;
	/**
	 * ֧�����
	 */
	private String outcometype;
	/**
	 * ֧����;
	 */
	private String outcomeuse;
	/**
	 * ��Ա
	 */
	private String members;
	/**
	 * ʱ��
	 */
	private Date payouttime;
	/**
	 * �տ
	 */
	private String beneficiary;
	/**
	 * ��ע
	 */
	private String information;
	/**
	 * ֧���˻�
	 */
	private String account;
	/**
	 * @param id ����
	 * @param username �û���
	 * @param outcome ֧�����
	 * @param outcometype ֧�����
	 * @param outcomeuse ֧����;
	 * @param members ��Ա
	 * @param payouttime ʱ��
	 * @param beneficiary �տ
	 * @param information ��ע
	 * @param account ֧���˻�
	 */
	public OutInfo(int id, String username, Double outcome, String outcometype, String outcomeuse, String members,
			Date payouttime, String beneficiary, String information, String account) {
		super();
		this.id = id;
		this.username = username;
		this.outcome = outcome;
		this.outcometype = outcometype;
		this.outcomeuse = outcomeuse;
		this.members = members;
		this.payouttime = payouttime;
		this.beneficiary = beneficiary;
		this.information = information;
		this.account = account;
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
	public Double getOutcome() {
		return outcome;
	}
	public void setOutcome(Double outcome) {
		this.outcome = outcome;
	}
	public String getOutcometype() {
		return outcometype;
	}
	public void setOutcometype(String outcometype) {
		this.outcometype = outcometype;
	}
	public String getOutcomeuse() {
		return outcomeuse;
	}
	public void setOutcomeuse(String outcomeuse) {
		this.outcomeuse = outcomeuse;
	}
	public String getMembers() {
		return members;
	}
	public void setMembers(String members) {
		this.members = members;
	}
	public Date getPayouttime() {
		return payouttime;
	}
	public void setPayouttime(Date payouttime) {
		this.payouttime = payouttime;
	}
	public String getBeneficiary() {
		return beneficiary;
	}
	public void setBeneficiary(String beneficiary) {
		this.beneficiary = beneficiary;
	}
	public String getInformation() {
		return information;
	}
	public void setInformation(String information) {
		this.information = information;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	@Override
	public String toString() {
		return "OutInfo [id=" + id + ", username=" + username + ", outcome=" + outcome + ", outcometype=" + outcometype
				+ ", outcomeuse=" + outcomeuse + ", members=" + members + ", payouttime=" + payouttime
				+ ", beneficiary=" + beneficiary + ", information=" + information + ", account=" + account + "]";
	}
	
}
