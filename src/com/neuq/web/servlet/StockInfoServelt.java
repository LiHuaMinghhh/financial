package com.neuq.web.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import com.neuq.bean.Paging2;

import com.neuq.bean.StockInfo;
import com.neuq.services.I.IStockFlowServices;
import com.neuq.services.I.IStockInfoServices;
import com.neuq.services.Impl.StockFlowServicesImpl;
import com.neuq.services.Impl.StockInfoServicesImpl;



public class StockInfoServelt extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public StockInfoServelt() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		HttpSession session=request.getSession();
		String methodName=request.getParameter("methodName");
	    int method=Integer.parseInt(methodName); //���ַ���תΪ��ֵ
	    String methodName2=request.getParameter("methodName2");
	    int method2=Integer.parseInt(methodName2);
		IStockInfoServices isis=new StockInfoServicesImpl();
		
		if(method==0){ //��ʽ1�ǲ�ѯ
			StockInfo si=new StockInfo();
			String username=request.getParameter("username");
			si=isis.SelectStockInfo(username);
			session.setAttribute("StockInfo", si); //�鵽ֵ����session
			response.sendRedirect("");
		}
		else if(method==1){ //��ʽ1�������Ϣ
			boolean b=false;
			String ida=request.getParameter("id");
			int id=Integer.parseInt(ida);
			String username=request.getParameter("username");
			String stockcodea=request.getParameter("stockcode");  
			int stockcode=Integer.parseInt(stockcodea);
			String stockname=request.getParameter("stockname");
			String totalnumbera=request.getParameter("totalnumber");
			int totalnumber=Integer.parseInt(totalnumbera);
			
			StockInfo si=new StockInfo();
			si.setId(id);
			si.setUserName(username);
			si.setStockCode(stockcode);
			si.setStockName(stockname);
			si.setTotalNumber(totalnumber);
			b=isis.InsertShockInfo(si);
			session.setAttribute("check", b); //�����Ƿ��Ѳ���
			response.sendRedirect("");
		}
		else if(method==2){//��ʽ2��ɾ��
			boolean b=false;
			String username=request.getParameter("username");
			b=isis.DeleteShockInfo(username);
			session.setAttribute("check", b); //�����Ƿ���ɾ��
			response.sendRedirect("");
		}
		else if(method==3){ //��ʽ3�Ǹ���
			boolean b=false;
			String username=request.getParameter("username");
			String totalnumbera=request.getParameter("totalnumber");
			int totalnumber=Integer.parseInt(totalnumbera);
			b=isis.UpdateShockInfo(username, totalnumber);
			session.setAttribute("check", b); //�����Ƿ��Ѹ���
			response.sendRedirect("");
		}
		
		
			IStockFlowServices isfs=new StockFlowServicesImpl();
		    //��һҳ��ҳ�߼��Ĵ���, ������ֽ�paging����p��������
		    Paging2 p2=new Paging2(isfs.getStockNum(),4);  //�����ǣ���������ÿҳ��ʾ���� ;isfs����biz�㷽��������֤ȯ�ɷ�����; paging����������ҳ��
		    p2.doPaging2(1);  //1Ϊ��ǰ�����ҳ��reqPage;dopaging���� ����start��end
		    //������֤ȯ��Ʊ����Ϣ��ѯ����
		    List<StockInfo> list2=isis.SelectAllStock2(p2.getStart2(), p2.getEnd2());
		    session.setAttribute("SelectAll2",list2);
		    session.setAttribute("paging2", p2);
		    session.setAttribute("currentPage2",1);//��ǰҳ����1
		    if(method2==0){
		    response.sendRedirect("familyAdmin/buying.jsp"); //��Ӧ�����ض���
		    }
		    else if(method2==1){
		    response.sendRedirect("familyAdmin/selling.jsp");
		    }
	  }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
 


//��������⣬�ȴ�һ���źŽ������������ҳ�棬��������ź�ִ�з�ҳ��ת����ͬҳ��