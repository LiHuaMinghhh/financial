package com.neuq.web.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neuq.bean.User;

import com.neuq.services.I.IUserServices;
import com.neuq.services.Impl.UserServicesImpl;

import com.neuq.util.EmailUtils;

/**
 * ���������������������
 */
public class ForgotPwdServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userNameOrEmail = request.getParameter("userNameOrEmail");
	IUserServices ius=new UserServicesImpl();
		User user=null;
		try {
			user = ius.findUser(userNameOrEmail);
		} catch (SQLException e) {
			e.printStackTrace();
		}
						
		if (user == null) {
			request.setAttribute("errorMsg", userNameOrEmail + "�������ڣ�");
			request.getRequestDispatcher("/forgotPwd.jsp").forward(request, response);
			return;
		}
		
		// ���������������������
		
		
		EmailUtils.sendResetPasswordEmail(user);
		
		request.setAttribute("sendMailMsg", "�����������ύ�ɹ�����鿴����"+user.getEmail()+"���䡣");
		
		request.getRequestDispatcher("/forgotPwdSuccess.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
