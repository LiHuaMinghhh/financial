package com.neuq.dao.I;



import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.neuq.bean.User;


public interface IUserDao {
	/**
	 * �½��û�
	 * @throws SQLException 
	 */
		public boolean insert(User user,Connection con) throws SQLException;
	/*
	 *ɾ���û�
	 */
		public boolean delete(String name,Connection con) throws SQLException;
	/*
	 * �����û���Ϣ
	 */
		public boolean update(User user,Connection con) throws SQLException;
	/*
	 *��ѯ�����û���Ϣ 
	 */
		public List<User> selectall(Connection con) throws SQLException;
	/*
	 * ��ѯ��ǰ�û���Ϣ
	 */
		public User select(String name,Connection con) throws SQLException;
	/*
	 * ͳ���û�����
	 */
		public int count(Connection con) throws SQLException;
		
		
		/**
		 * �һ�����ʱѰ���û��Ƿ����
		 */
		public User findUser(String username,String email,Connection con)throws SQLException;
	
		
		/**
		 * �û���¼
		 */
		public User login(String username, String pwd,Connection con) throws SQLException;
		
		
		/**
		 * �޸�����
		 * @param username
		 * @param pwd
		 * @param con
		 * @return
		 * @throws SQLException
		 */
		public boolean changePassword(String username, String pwd,Connection con) throws SQLException;
}
