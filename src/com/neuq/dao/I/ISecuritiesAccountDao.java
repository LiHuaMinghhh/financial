package com.neuq.dao.I;

import java.sql.Connection;
import java.sql.SQLException;


import com.neuq.bean.SecuritiesAccount;


public interface ISecuritiesAccountDao {
	/*
	 * ����֤ȯ�˻���Ϣ
	 */
	public boolean insert(SecuritiesAccount sa,Connection con) throws SQLException;
	/*
	 * ɾ��֤ȯ�˻���Ϣ
	 */
	public boolean delete(String name,Connection con) throws SQLException;
	/*
	 * �޸�֤ȯ�˻���Ϣ
	 */
	public boolean update(String name,Connection con) throws SQLException;
	/*
	 * ��ѯ֤ȯ�˻���Ϣ
	 */
	public java.util.List<SecuritiesAccount> selectall(Connection con) throws SQLException;

}
