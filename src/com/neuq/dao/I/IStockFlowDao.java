package com.neuq.dao.I;

import java.sql.Connection;
import java.util.Date;
import java.util.List;

import com.neuq.bean.*;

public interface IStockFlowDao {
	//��ҳ��ѯ����֤ȯ��Ʊ��ˮ��Ϣ
  public List<StockFlow> SelectAllStock(int start,int end,Connection con) throws Exception;
  //�����û�����ѯ֤ȯ��Ʊ��ˮ��Ϣ
  public StockFlow SelectStockFlow(String username,Connection con)throws Exception;
   //����֤ȯ��Ʊ��ˮ��Ϣ
  public boolean InsertShockFlow(StockFlow sf,Connection con)throws Exception;
    //�����û���ɾ��֤ȯ��Ʊ��ˮ��Ϣ
  public boolean DeleteShockFlow(String username,Connection con)throws Exception;
//��ѯһ���ж�����֤ȯ��Ʊ
	public int getStockNum(Connection con) throws Exception;
    //�����û����޸�֤ȯ��Ʊ��ˮ��Ϣ
  public boolean UpdateShockFlow(String username,Connection con,int stocknumber,int buyOrsell,Date transactiontime,double transactionprince)throws Exception;
}
