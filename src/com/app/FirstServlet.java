package com.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req,HttpServletResponse res)
	throws ServletException,IOException
	{
		String name=req.getParameter("name");
		int age=Integer.parseInt(req.getParameter("age"));	
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		RequestDispatcher rd=req.getRequestDispatcher("xyz");
		rd.include(req,res);
		
		pw.println("Student name:"+name);
		pw.println("Student age:"+age);
		
		
	}
	
	public void doPost(HttpServletRequest req,HttpServletResponse res)
	throws ServletException,IOException
	{
		doGet(req,res);
	}

}
