package com.neuq.services.I;

import java.sql.SQLException;
import java.util.List;

import com.neuq.bean.SecuritiesAccount;

public interface ISecuritiesAccountServices {
	/*
	 * ����֤ȯ�˻���Ϣ
	 */
	public boolean insert(SecuritiesAccount sa) throws SQLException;
	/*
	 * ɾ��֤ȯ�˻���Ϣ
	 */
	public boolean delete(String name) throws SQLException;
	/*
	 * �޸�֤ȯ�˻���Ϣ
	 */
	public boolean update(String name) throws SQLException;
	/*
	 * ��ѯ֤ȯ�˻���Ϣ
	 */
	public List<SecuritiesAccount> selectall() throws SQLException;
}
