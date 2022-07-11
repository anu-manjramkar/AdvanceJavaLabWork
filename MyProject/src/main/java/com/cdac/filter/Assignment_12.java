package com.cdac.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Add")
public class Assignment_12 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int number1=Integer.parseInt(request.getParameter("num1"));
		int number2=Integer.parseInt(request.getParameter("num2"));
		int result=number1+number2;
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.write("<html><body>");
		out.write("<p>Addition  : "+ result+"</p>");
		out.write("</body></html>");
		
	}
	

}

