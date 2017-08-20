package com.neuq.services.I;

import java.sql.SQLException;
import java.util.List;

import com.neuq.bean.InInfo;

public interface IInInfoServices {
	/**
	 * ��ѯȫ���û��������
	 * @return �����б�
	 * @throws SQLException 
	 */
	public List<InInfo> select() throws SQLException;
	/**
	 * ��ѯĳһ�û��������
	 * @param username  �û���
	 * @return  �����б�
	 * @throws SQLException 
	 */
	public List<InInfo> select(String username) throws SQLException;
	/**
	 * ����һ����¼
	 * @throws SQLException 
	 */
	public boolean insert(InInfo inInfo) throws SQLException;
	/**
	 * �޸�һ����¼
	 * @throws SQLException 
	 */
	public boolean update(InInfo inInfo) throws SQLException;
	/**
	 * ɾ��ȫ����¼
	 * @throws SQLException 
	 */
	public boolean delete() throws SQLException;
	/**
	 * ɾ��ĳһ�û�ȫ����¼
	 * @throws SQLException 
	 */
	public boolean delete(String username) throws SQLException;
	/**
	 * ɾ��ĳһ����¼
	 * @throws SQLException 
	 */
	public boolean delete(int id) throws SQLException;
}
