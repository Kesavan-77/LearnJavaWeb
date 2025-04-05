package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/add")
public class AddServlet extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		String name = req.getParameter("name");
		String password = req.getParameter("password");
		
		//session storage
		HttpSession session = req.getSession();
		session.setAttribute("name", name);
		session.setAttribute("password", password);
		
		int num1 = 128;
		int num2 = 128;
		System.out.println(num1 == num2);
		
		//cookies storage
		res.addCookie(new Cookie("name",name));
		res.addCookie(new Cookie("password",password));
		
		res.sendRedirect("result");
	}
}