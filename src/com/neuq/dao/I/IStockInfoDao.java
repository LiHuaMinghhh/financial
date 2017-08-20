package com.neuq.dao.I;

import java.sql.Connection;
import java.util.List;

import com.neuq.bean.*;

public interface IStockInfoDao {
	//��ҳ��ѯ���гֹ���Ϣ
	  public List<StockInfo> SelectAllStock2(int start2,int end2,Connection con) throws Exception;
     //��ѯ�ֹ���Ϣ
	 public StockInfo SelectStockInfo(String username,Connection con)throws Exception;
	 //�½��ֹ���Ϣ
	 public boolean InsertShockInfo(StockInfo si,Connection con)throws Exception;
	 //ɾ���ֹ���Ϣ
	 public boolean DeleteShockInfo(String username,Connection con)throws Exception;
	  //�޸ĳֹ���Ϣ
	 public boolean UpdateShockInfo(String username,Connection con,int totalnumber)throws Exception;
}
