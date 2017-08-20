package com.neuq.services.I;


import java.util.Date;
import java.util.List;

import com.neuq.bean.StockFlow;

public interface IStockFlowServices {
	  //��ҳ��ѯ����֤ȯ��Ʊ��ˮ��Ϣ
	  public List<StockFlow> SelectAllStock(int start,int end);
	  //����id��ѯ֤ȯ��Ʊ��ˮ��Ϣ
	  public StockFlow SelectStockFlow(String username);
	   //����֤ȯ��Ʊ��ˮ��Ϣ
	  public boolean InsertShockFlow(StockFlow sf );
	    //ɾ��֤ȯ��Ʊ��ˮ��Ϣ
	  public boolean DeleteShockFlow(String username );
	//��ѯһ���ж�����֤ȯ��Ʊ
	  public int  getStockNum( );
	      //�޸�֤ȯ��Ʊ��ˮ��Ϣ
	  public boolean UpdateShockFlow(String username ,int stocknumber,int buyOrsell,Date transactiontime,double transactionprince);
	}
