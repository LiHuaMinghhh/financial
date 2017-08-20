package com.neuq.dao.Impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.neuq.bean.StockFlow;
import com.neuq.dao.I.IStockFlowDao;

	
	

public class StockFlowDaoImpl implements IStockFlowDao{

	//�����û�����ѯ֤ȯ��Ʊ��ˮ��Ϣ
	  public StockFlow SelectStockFlow(String username,Connection con)throws Exception{
		  PreparedStatement pr=null;
		  ResultSet rs=null;
		  StockFlow sf=new StockFlow();
		  String sql="Select * from StockFlow where username=?";
		  pr=con.prepareStatement(sql);
		  pr.setString(1, username);
		  rs=pr.executeQuery();//����statement�ķ������ؽ����
		 
		  if(rs.next()){
			  sf.setId(rs.getInt(1)); //sf������и��ַ�����rs�а��������ͺ�λ����ȡ���ݵķ���
			  sf.setUserName(rs.getString(2));
			  sf.setStockCode(rs.getInt(3));
			  sf.setStockName(rs.getString(4));
			  sf.setStockNumber(rs.getInt(5));
			  sf.setBuyOrSell(rs.getInt(6));
			  sf.setTransactionTime(rs.getDate(7));
			  sf.setTransactionPrince(rs.getDouble(8));
		  }
		    rs.close();
			pr.close();
			return sf;
	  }
	   //����֤ȯ��Ʊ��ˮ��Ϣ ���Ǹ���username����ӣ���
	  public boolean InsertShockFlow(StockFlow sf,Connection con)throws Exception{
		  PreparedStatement pr=null;
		  String sql="INSERT INTO StockFlow VALUES (id.nextval,?,?,?,?,?,?,?)";
		  boolean b=false;
		  pr=con.prepareStatement(sql);
		  pr.setInt(1, sf.getId());  //�Ͳ�ѯ������������෴���˴������ݿ�������ݣ���������Ϊ��
		  pr.setString(2, sf.getUserName());
		  pr.setInt(3, sf.getStockCode());
		  pr.setString(4, sf.getStockName());
		  pr.setInt(5, sf.getStockNumber());
		  pr.setInt(6, sf.getBuyOrSell());
		  pr.setDate(7, (Date) sf.getTransactionTime());
		  pr.setDouble(8, sf.getTransactionPrince());
		  int n=pr.executeUpdate(); 
			if(n>0)
				b=true;
			pr.close();
			return b;
	  }
	    //�����û���ɾ��֤ȯ��Ʊ��ˮ��Ϣ
	  public boolean DeleteShockFlow(String username,Connection con)throws Exception{
		  PreparedStatement pr=null;
		  boolean b=false;
		  String sql="Delete from StockFlow where username=?";
		  pr=con.prepareStatement(sql); // ��ȡPreparedStatement  
		  pr.setString(1, username);// ��SQL����еĵ�һ��ռλ����ֵ
		  int n=pr.executeUpdate();// ִ��ɾ������
		  if(n>0)
				b=true;
          pr.close();  // �ر�PreparedStatement
		  return b;
	  }
	      
	  
	  //�����û����޸�֤ȯ��Ʊ��ˮ��Ϣ
      public boolean UpdateShockFlow
      (String username,Connection con,int stocknumber,int buyOrsell,java.util.Date transactiontime,double transactionprince)throws Exception{  
    	  PreparedStatement pr=null;
		  boolean b=false;
		  String sql="UPDATE StockFlow SET stocknumber=?,buyOrsell=?,transactiontime=?,transactionprince=? WHERE username=?";  
		  pr=con.prepareStatement(sql);
	      pr.setInt(1, stocknumber);
	      pr.setInt(2, buyOrsell);
	      pr.setDate(3, (Date) transactiontime);
	      pr.setDouble(4, transactionprince);
	      pr.setString(5, username);
	     
	      int n=pr.executeUpdate();
	      if(n>0){	
				b=true;
				}
		  pr.close( );	
		  return b;
		  
	      }
      
      
      //��ҳ��ѯ����֤ȯ��Ʊ��ˮ��Ϣ
	public List<StockFlow> SelectAllStock(int start, int end, Connection con) throws Exception{
		PreparedStatement pr=null;
		ResultSet rs=null;
		List<StockFlow> list=new ArrayList<StockFlow>();
		pr=con.prepareStatement("select * from (select rownum as  rn,StockFlow.*from StockFlow) where rownum>=? and rownum<=?");
		pr.setInt(1, start);
		pr.setInt(2, end);
		rs=pr.executeQuery();
		while(rs.next()){
			 StockFlow sf=new StockFlow();
			 sf.setId(rs.getInt(1)); //sf������и��ַ�����rs�а��������ͺ�λ����ȡ���ݵķ���
			  sf.setUserName(rs.getString(2));
			  sf.setStockCode(rs.getInt(3));
			  sf.setStockName(rs.getString(4));
			  sf.setStockNumber(rs.getInt(5));
			  sf.setBuyOrSell(rs.getInt(6));
			  sf.setTransactionTime(rs.getDate(7));
			  sf.setTransactionPrince(rs.getDouble(8));
			  list.add(sf);
	}
		 rs.close();
		 pr.close();
		 return list;
	}
	 //��ѯһ���ж�����֤ȯ��Ʊ
	public int getStockNum(Connection con) throws Exception {
		PreparedStatement pr=null;
		ResultSet rs=null;
		int num=0;
		pr=con.prepareStatement("select count(*) from StockFlow");
		rs=pr.executeQuery();
		if(rs.next())
			num=rs.getInt(1);
		rs.close();
		pr.close();
		return num;
	}
}


