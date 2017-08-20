package com.neuq.web.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neuq.bean.User;
import com.neuq.services.Impl.UserServicesImpl;

import javax.servlet.http.Cookie;


/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {

	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
    }

	public void destroy() {
		super.destroy();

	}
	
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		//����doPost����
	this.doPost(request, response);
		
	}
	
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//���ServletContext����

		String uname=request.getParameter("username");
		String upsw=request.getParameter("password");
		String message1 =null;
		String message2 =null;
	UserServicesImpl service=new UserServicesImpl();
		//�û���¼
		User user=null;
		int r  = 0;
		try {
			System.out.println("�������е�¼���");
			user = service.login(uname, upsw);
		
			System.out.println("��¼������,������ת");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(user != null) {
			r=user.getRu();
	        System.out.print("�û���Ȩ��Ϊ��"+r);
			//��¼�ɹ��󣬾ͽ��û��洢��session��
	        Cookie c1 = new Cookie("username",uname);
	        Cookie c2 = new Cookie("password",upsw);
			response.addCookie(c1);
			response.addCookie(c2);
		}
		else{
			 message1 = String.format(
						"�Բ����û������������󣡣������µ�¼��2���Ϊ���Զ�������¼ҳ�棡");
			 
			 message2 = String.format(
					"<meta http-equiv='refresh' content='0;url=%s'", 
					request.getContextPath()+"/login.jsp");
			request.setAttribute("message1",message1);
			request.setAttribute("message2",message2);
			request.getRequestDispatcher("/message.jsp").forward(request, response);
			return;
		}

		
System.out.println("��¼�û���Ϊ�գ��ж�Ȩ��");

		if (r==1) {
			//��������Ա����
			 message1 = String.format(
						"����Ա��½�ɹ���");
			 message2 = String.format(
						"<meta http-equiv='refresh' content='0;url=%s'", 
						request.getContextPath()+"/admin/index.jsp");
			 			request.getSession().setAttribute("admin",user);

		}
		else if(r==2){
			//������ͥ����Ա����
			 message1 = String.format(
						"��ͥ����Ա��½�ɹ���");
			 message2 = String.format(
						"<meta http-equiv='refresh' content='0;url=%s'", 
						request.getContextPath()+"/familyAdmin/index.jsp");
			
			  request.getSession().setAttribute("family",user);
	}
		else if(r == 3) {
			System.out.println(user.toString());
			System.out.println("������ͨ�û���¼�ɹ�ҳ��");
			//��ת����ͨ�û�ҳ��
			 message1 = String.format(
						"��ͨ�û���½�ɹ���");
			 message2 = String.format(
						"<meta http-equiv='refresh' content='0;url=%s'", 
						request.getContextPath()+"/student/index.jsp");
			
		  request.getSession().setAttribute("normaluser",user);
	}
		request.setAttribute("message2",message2);
		request.setAttribute("message1",message1);
		request.getRequestDispatcher("/message.jsp").forward(request, response);
	}

	}


