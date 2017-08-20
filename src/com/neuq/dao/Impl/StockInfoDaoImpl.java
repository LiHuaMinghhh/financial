package com.neuq.dao.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


import com.neuq.bean.StockInfo;
import com.neuq.dao.I.IStockInfoDao;

public class StockInfoDaoImpl implements IStockInfoDao{

	//�����û�����ѯ�ֹ���Ϣ
	public StockInfo SelectStockInfo(String username, Connection con) throws Exception {
		PreparedStatement pr=null;
		ResultSet rs=null;
		StockInfo si=new StockInfo();
		String sql="Select * from StockInfo where username=?";
	    pr=con.prepareStatement(sql); //��ȡpreparestatement
		pr.setString(1, username);  //��SQL���ĵ�һ��ռλ����ֵ
		rs=pr.executeQuery();  //����SQL��䣬ִ�в�ѯ���������ؽ����
		if(rs.next()){
			si.setId(rs.getInt(1));
			si.setUserName(rs.getString(2));
			si.setStockCode(rs.getInt(3));
			si.setStockName(rs.getString(4));
			si.setTotalNumber(rs.getInt(5));
		}
		    rs.close();
			pr.close();
			return si;
	}

	//�½��ֹ���Ϣ
	public boolean InsertShockInfo(StockInfo si, Connection con) throws Exception {
		 PreparedStatement pr=null;
		 String sql="INSERT INTO StockInfo VALUES (id.nextval,?,?,?,?)";
		 boolean b=false;
		 pr=con.prepareStatement(sql);
		 pr.setInt(1,si.getId() );
		 pr.setString(2,si.getUserName());
		 pr.setInt(3, si.getStockCode());
		 pr.setString(4, si.getStockName());
		 pr.setInt(5, si.getTotalNumber());
		 int n=pr.executeUpdate();
			if(n>0)
		    b=true;
		 pr.close();
		 return b;
	 }

	//�����û���ɾ���ֹ���Ϣ
	public boolean DeleteShockInfo(String username, Connection con) throws Exception {
		PreparedStatement pr=null;
		boolean b=false;
		String sql="Delete from StockInfo where username=?"; //ɾ����
	    pr=con.prepareStatement(sql); 
		pr.setString(1, username); 
		int n=pr.executeUpdate(); 
		if(n>0)
		    b=true;
        pr.close();  
		return b; 
     }

	//�����û����޸ĳֹ���Ϣ
	public boolean UpdateShockInfo(String username, Connection con, int totalnumber) throws Exception {
		 PreparedStatement pr=null;
		 boolean b=false;
		 String sql="UPDATE StockInfo SET totalnumber=? WHERE username=?";  
		 pr=con.prepareStatement(sql);
		 pr.setInt(1,totalnumber);
		 pr.setString(2, username);
		 int n=pr.executeUpdate();//����SQL��䣬ִ�в�ѯ���������ؽ����
		 if(n>0){	
				b=true;
				}
		 pr.close( );	
		 return b;
	}

	//��ҳ��ѯ����֤ȯ��Ʊ��ˮ��Ϣ
	public List<StockInfo> SelectAllStock2(int start2, int end2, Connection con) throws Exception {
		PreparedStatement pr=null;
		ResultSet rs=null; 
		pr=con.prepareStatement("select * from(select rownum as rn,StockInfo.* from StockInfo)where rn>=? and rn<=?");
		pr.setInt(1, start2);
		pr.setInt(2, end2);
		rs=pr.executeQuery();
		List<StockInfo> list2=new ArrayList<StockInfo>();
		while(rs.next()){
			StockInfo si=new StockInfo();
			si.setId(rs.getInt(1));
			si.setUserName(rs.getString(2));
			si.setStockCode(rs.getInt(3));
			si.setStockName(rs.getString(4));
			si.setTotalNumber(rs.getInt(5));
			list2.add(si);
		}
		rs.close();
		 pr.close();
		 return list2;
	}

}
