package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		String name = req.getParameter("name");
		String password = req.getParameter("password");
		req.setAttribute("name", name);
		req.setAttribute("password", password);
//		RequestDispatcher dispatch = req.getRequestDispatcher("result");
//		dispatch.forward(req, res);
		res.sendRedirect("result");
	}
}