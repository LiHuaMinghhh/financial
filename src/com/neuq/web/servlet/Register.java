/**��RegisterServlet���������¼���ְ��
1�����տͻ����ύ������˵ı����ݡ�
2��У������ݵĺϷ��ԣ����У��ʧ�����ص�register.jsp�������Դ�����Ϣ��
3�����У��ͨ��������service�������ݿ���ע���û�
*/

package com.neuq.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neuq.bean.User;
import com.neuq.dao.Impl.UserDaoImpl;
import com.neuq.db.DBUtil;

/**
 * Servlet implementation class Register
 */

public class Register extends HttpServlet {

	static Connection con;
	static PreparedStatement ps;
	static ResultSet rs;
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Register() {
		super();
	}

	public void destroy() {
		super.destroy();

	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// ����doPost����
         doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		String username = request.getParameter("username");
		String telephone = request.getParameter("telephone");
		String email = request.getParameter("email");
		String password = request.getParameter("password");

		User u = new User(username, telephone, email, password);
		System.out.println(u.toString());

		String message = null;
		try {
			con = DBUtil.getConnection();
			if (new UserDaoImpl().insert(u, con)) {
				System.out.println("��ͨ�û�ע��ɹ�");
				message = String.format("��ϲ��%s,ע��ɹ�����ҳ����3���������ҳ����<meta http-equiv='refresh' content='3;url=%s'",
						u.getUsername(), request.getContextPath() + "/index.jsp");
			} else {
				System.out.println("ע��ʧ�ܣ�������ע��");
				message = String.format("sorry��%s,ע��ʧ�ܣ���ҳ����3�������ע��ҳ����<meta http-equiv='refresh' content='3;url=%s'",
						u.getUsername(), request.getContextPath() + "/register.jsp");
			}

			request.setAttribute("message", message);
			request.getRequestDispatcher("/message.jsp").forward(request, response);

		} catch (SQLException e) {
			e.printStackTrace();
			//������ת����ҳ����ע��ʧ������
			response.setContentType("text/html; charset=UTF-8");
			PrintWriter out = response.getWriter();
			out.println("<html><head></head><body>");
			out.print("<script type=\"text/javascript\" language=\"javascript\">");
			out.print("alert('�û����������');");
			out.print("window.location='index.jsp';");
			out.print("</script>");
			out.print("</body></html>");

		}
	}


}