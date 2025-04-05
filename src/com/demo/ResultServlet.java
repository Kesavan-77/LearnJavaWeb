package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ResultServlet extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		RequestDispatcher dispatch = req.getRequestDispatcher("result.html");
		dispatch.include(req, res);
//		PrintWriter out = res.getWriter();
//		out.println("vandthuten "+ req.getAttribute("name") + " your password: " + req.getAttribute("password")  + " senthuruchu");
	}
}
