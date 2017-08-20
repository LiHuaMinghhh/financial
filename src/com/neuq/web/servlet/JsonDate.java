package com.neuq.web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import java.io.BufferedReader;  
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.URL;  
import java.net.URLConnection;  
 
/**
 * Servlet implementation class JsonDate
 */

public class JsonDate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JsonDate() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//��ӿ�·��  
		
		String number=request.getParameter("stock");
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
        String urlStr="http://hq.sinajs.cn/list=sh"+number;                          
        //����URL  
        URL url=new URL(urlStr);  
        //���ؽ����  
        StringBuffer document = new StringBuffer();  
        //��������  
       URLConnection conn = url.openConnection();  
       //��ȡ���ؽ����  
       BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream(),"utf-8"));  
       String line = null;  
       while ((line = reader.readLine()) != null){  
             document.append(line);  
       }     
           reader.close();  
       System.out.println(document);    
       String docu=document.toString().substring(29);
       System.out.println(docu);
       
       
       OutputStream os=response.getOutputStream();  
           os.write(docu.getBytes());  
     
       os.flush();
       os.close();
       String s[]=docu.split(",");
       int i=0;
       System.out.println("���տ��̼�"+s[i++]);
       System.out.println("�������̼�"+s[i++]);
       System.out.println("��ǰ�۸�"+s[i++]);
       System.out.println("������߼�"+s[i++]);
       System.out.println("������ͼ�"+s[i++]);
       System.out.println("����ۣ�������һ������"+s[i++]);
       System.out.println("�����ۣ�������һ������"+s[i++]);
       System.out.println("�ɽ��Ĺ�Ʊ��"+s[i++]);
       System.out.println("�ɽ�����λΪ��Ԫ��"+s[i++]);
       
       System.out.println("����һ�������Ʊ����"+s[i++]);
       System.out.println("����һ������"+s[i++]);
    
       
       System.out.println("������������Ʊ����"+s[i++]);
       System.out.println("�����������"+s[i++]);
       
       System.out.println("�������������Ʊ����"+s[i++]);
       System.out.println("������������"+s[i++]);
       
       System.out.println("�����ġ������Ʊ����"+s[i++]);
       System.out.println("�����ġ�����"+s[i++]);
       
       System.out.println("�����塱�����Ʊ����"+s[i++]);
       System.out.println("�����塱����"+s[i++]);
       
       System.out.println("����һ�������Ʊ����"+s[i++]);
       System.out.println("����һ������"+s[i++]);
    
       
       System.out.println("�������������Ʊ����"+s[i++]);
       System.out.println("������������"+s[i++]);
       
       System.out.println("�������������Ʊ����"+s[i++]);
       System.out.println("������������"+s[i++]);
       
       System.out.println("�����ġ������Ʊ����"+s[i++]);
       System.out.println("�����ġ�����"+s[i++]);
       
       System.out.println("�����塱�����Ʊ����"+s[i++]);
       System.out.println("�����塱����"+s[i++]);
       
       System.out.println("����"+s[i++]);
       System.out.println("ʱ��"+s[i++]);
       
     //  JSONObject json =JSONObject.fromObject(document.toString().substring(19));  
       //�鿴json��ʽ  
      // System.out.println(json.toString());  
       //��ȡjson��ĳ������  
   //    JSONObject obj = (JSONObject) json.get("weatherinfo");  
   //    System.out.println(obj.toString());  
       //��ȡ������ĳ�����Ե�ֵ  
      // String val = obj.getString("city");  
    //   System.out.println(val);  
     //  request.getSession().setAttribute("test",json.toString());
       
    //   JSONObject object=new JSONObject();
      // object.put(key, value)
       
      // request.getRequestDispatcher("index.jsp").forward(request, response);
   }  
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
