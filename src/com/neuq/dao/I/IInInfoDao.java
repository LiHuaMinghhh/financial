package com.neuq.dao.I;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.neuq.bean.InInfo;

public interface IInInfoDao {
	/**
	 * ��ѯȫ���û��������
	 * @return �����б�
	 * @throws SQLException 
	 */
	public List<InInfo> select(Connection con) throws SQLException;
	/**
	 * ��ѯĳһ�û��������
	 * @param username  �û���
	 * @return  �����б�
	 * @throws SQLException 
	 */
	public List<InInfo> select(String username,Connection con) throws SQLException;
	/**
	 * ����һ����¼
	 * @throws SQLException 
	 */
	public boolean insert(InInfo inInfo,Connection con) throws SQLException;
	/**
	 * �޸�һ����¼
	 * @throws SQLException 
	 */
	public boolean update(InInfo inInfo,Connection con) throws SQLException;
	/**
	 * ɾ��ȫ����¼
	 * @throws SQLException 
	 */
	public boolean delete(Connection con) throws SQLException;
	/**
	 * ɾ��ĳһ�û�ȫ����¼
	 * @throws SQLException 
	 */
	public boolean delete(String username,Connection con) throws SQLException;
	/**
	 * ɾ��ĳһ����¼
	 * @throws SQLException 
	 */
	public boolean delete(int id,Connection con) throws SQLException;
}
