package com.neuq.services.I;


import java.sql.SQLException;
import java.util.List;
import com.neuq.bean.User;


public interface IUserServices {
	/**
	 * �½��û�
	 * @throws SQLException 
	 */
		public boolean insert(User user) throws SQLException;
	/*
	 *ɾ���û�
	 */
		public boolean delete(String name) throws SQLException;
	/*
	 * �����û���Ϣ
	 */
		public boolean update(String name) throws SQLException;
	/*
	 *��ѯ�����û���Ϣ 
	 */
		public List<User> selectall() throws SQLException;
	/*
	 * ��ѯ��ǰ�û���Ϣ
	 */
		public User select(String name) throws SQLException;
	/*
	 * ͳ���û�����
	 */
		public int count() throws SQLException;
	
		/*
		 * ����û���½
		 */
public User login(String username,String password)throws SQLException;



/**
 * Ѱ���û��Ƿ����
 */
public User findUser(String nameOrEmail)throws SQLException;
public void changePassword(String uname, String upsw01) throws SQLException;
}
