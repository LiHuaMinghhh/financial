package com.neuq.web.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.bind.ParseConversionEvent;

import com.neuq.bean.Paging;
import com.neuq.bean.StockFlow;
import com.neuq.services.I.IStockFlowServices;
import com.neuq.services.Impl.StockFlowServicesImpl;

    public class StockFlowServelt extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public StockFlowServelt() {
        super();
        
    }

	
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		response.getWriter().append("Served at: ").append(request.getContextPath());
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		HttpSession session=request.getSession();
		String methodName=request.getParameter("methodName");
	    int method=Integer.parseInt(methodName); //���ַ���תΪ��ֵ
		IStockFlowServices isfs=new StockFlowServicesImpl();
		
		if(method==0){ //��ʽ1�ǲ�ѯ
			StockFlow sf=new StockFlow();
			String username=request.getParameter("username");
			sf=isfs.SelectStockFlow(username); //����services���ѯ��Ϣ������ֵ�Ƕ���
			session.setAttribute("StockFlow", sf); //�鵽ֵ����session
			response.sendRedirect("");           //����ת��
		 }
		else if (method==1) { //��ʽ1�������Ϣ
			boolean b=false;
			String ida=request.getParameter("id");
			int id=Integer.parseInt(ida);
			String username=request.getParameter("username");
			String stockcodea=request.getParameter("stockcode");  
			int stockcode=Integer.parseInt(stockcodea);
			String stockname=request.getParameter("stockname");
			String stocknumbera=request.getParameter("stocknumber");  
			int stocknumber=Integer.parseInt(stocknumbera);
			String buyOrsella=request.getParameter("buyOrsell");  
			int buyOrsell=Integer.parseInt(buyOrsella);
			String transactiontimea=request.getParameter("transactiontime");
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy.mm.dd");//SimpleDateFormat�е�parse������string�ַ���ת���ض���ʽ��date����
			Date transactiontime = null;
			try {
				transactiontime = sdf.parse(transactiontimea);
			} catch (ParseException e) {
			    e.printStackTrace();
			}
		    String transactionprincea=request.getParameter("transactionprince");
			double transactionprince=Double.parseDouble(transactionprincea);
			
			StockFlow sf=new StockFlow();
			sf.setId(id);
			sf.setUserName(username);
			sf.setStockCode(stockcode);
			sf.setStockName(stockname);
			sf.setStockNumber(stocknumber);
			sf.setBuyOrSell(buyOrsell);
			sf.setTransactionTime(transactiontime);
			sf.setTransactionPrince(transactionprince);
			b=isfs.InsertShockFlow(sf); //����services��Ĳ��뷽��
			session.setAttribute("check", b); //�����Ƿ��Ѳ���
			response.sendRedirect("");
		}
		else if(method==2){//��ʽ2��ɾ��
			boolean b=false;
			String username=request.getParameter("username");
			b=isfs.DeleteShockFlow(username);
			session.setAttribute("check", b); //�����Ƿ���ɾ��
			response.sendRedirect("");
		}
		else if(method==3){ //��ʽ3�Ǹ���
			boolean b=false;
			String username=request.getParameter("username");
			String stocknumbera=request.getParameter("stocknumber");  
			int stocknumber=Integer.parseInt(stocknumbera);
			String buyOrsella=request.getParameter("buyOrsell");  
			int buyOrsell=Integer.parseInt(buyOrsella);
			String transactiontimea=request.getParameter("transactiontime");
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy.mm.dd");//SimpleDateFormat�е�parse������string�ַ���ת���ض���ʽ��date����
			Date transactiontime = null;
			try {
				transactiontime = sdf.parse(transactiontimea);
			} catch (ParseException e) {
			    e.printStackTrace();
			}
		    String transactionprincea=request.getParameter("transactionprince");
			double transactionprince=Double.parseDouble(transactionprincea);
			b=isfs.UpdateShockFlow(username, stocknumber, buyOrsell, transactiontime, transactionprince);
			session.setAttribute("check", b); //�����Ƿ��Ѹ���
			response.sendRedirect("");
		}
		else{
			//��һҳ��ҳ�߼��Ĵ���, ������ֽ�paging����p��������
		    Paging p=new Paging(isfs.getStockNum(),4);  //�����ǣ���������ÿҳ��ʾ���� ;isfs����biz�㷽��������֤ȯ�ɷ�����; paging����������ҳ��
		    p.doPaging(1);  //1Ϊ��ǰ�����ҳ��reqPage=repP;dopaging���� ����start��end
		    
		    //������֤ȯ��Ʊ����Ϣ��ѯ����
		    List<StockFlow> list=isfs.SelectAllStock(p.getStart(), p.getEnd());
		    session.setAttribute("SelectAll",list);
		    session.setAttribute("paging", p);
		    session.setAttribute("currentPage",1);   //��ǰҳ����1
		    response.sendRedirect("familyAdmin/flow.jsp"); //��Ӧ�����ض���
		}
    }

	
	 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		doGet(request, response);
	}


    }
  

