package com.gyuone.test01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		String user_id = request.getParameter("user_id"); /* 입력 안에 있는 nameparameter 서버랑 attribute를 맞춘다.*/
		String user_pw = request.getParameter("user_pw");
		System.out.println("아이디: " + user_id);
		System.out.println("패스워드: " + user_pw);
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.setCharacterEncoding("utf-8");
		String user_id = req.getParameter("user_id"); /* 입력 안에 있는 nameparameter 서버랑 attribute를 맞춘다.*/
		String user_pw = req.getParameter("user_pw");
		
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = resp.getWriter();
		
		StringBuffer sb = new StringBuffer();
		sb.append("<html>");
		sb.append("<body>");
		sb.append("아이디 : ");
		sb.append(user_id);
		sb.append("<br>");
		sb.append("비밀번호 : ");
		sb.append(user_pw);
		sb.append("</body>");
		sb.append("</html>");	
		out.print(sb.toString());
	}
}
