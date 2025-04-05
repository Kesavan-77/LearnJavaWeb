package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ResultServlet extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		//session storage
		HttpSession session = req.getSession();
		String name = (String) session.getAttribute("name");
		String password = (String) session.getAttribute("password");
		
		//cookies
		Cookie cookie[] = req.getCookies();
		for(Cookie c : cookie) {
			System.out.println(c.getName() + "---" + c.getValue());
		}
		
//		RequestDispatcher dispatch = req.getRequestDispatcher("result.html");
//		dispatch.include(req, res);
		PrintWriter out = res.getWriter();
		out.println("vandthuten "+ name + " your password: " + password  + " senthuruchu");
	}
}
