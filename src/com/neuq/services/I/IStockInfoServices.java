package com.neuq.services.I;


import java.util.List;

import com.neuq.bean.StockInfo;

public interface IStockInfoServices {
	     //��ҳ��ѯ���гֹ���Ϣ
	     public List<StockInfo> SelectAllStock2(int start2,int end2);
	     //�����û�����ѯ�ֹ���Ϣ
		 public StockInfo SelectStockInfo(String username ) ;
		 //�½��ֹ���Ϣ
		 public boolean InsertShockInfo(StockInfo si ) ;
		 //�����û���ɾ���ֹ���Ϣ
		 public boolean DeleteShockInfo(String username ) ;
		 //�����û����޸ĳֹ���Ϣ
		 public boolean UpdateShockInfo(String username ,int totalnumber) ;
}
