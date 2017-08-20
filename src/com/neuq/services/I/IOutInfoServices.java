package com.neuq.services.I;

import java.sql.SQLException;
import java.util.List;

import com.neuq.bean.OutInfo;

public interface IOutInfoServices {
	/**
	 * ��ѯȫ���û���֧����
	 * @return ֧���б�
	 * @throws SQLException 
	 */
	public List<OutInfo> select() throws SQLException;
	/**
	 * ��ѯĳһ�û���֧����
	 * @param username  �û���
	 * @return  ֧���б�
	 * @throws SQLException 
	 */
	public List<OutInfo> select(String username) throws SQLException;
	/**
	 * ����һ����¼
	 * @throws SQLException 
	 */
	public boolean insert(OutInfo outInfo) throws SQLException;
	/**
	 * �޸�һ����¼
	 * @throws SQLException 
	 */
	public boolean update(OutInfo outInfo) throws SQLException;
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
