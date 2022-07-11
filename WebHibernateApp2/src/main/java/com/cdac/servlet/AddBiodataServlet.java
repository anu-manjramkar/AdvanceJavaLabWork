package com.cdac.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cdac.dao.BiodataDao;
import com.cdac.entity.Biodata;


public class AddBiodataServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Biodata biodata=new Biodata();
		
		biodata.setFullName(request.getParameter("fname"));
		biodata.setMobileNo(request.getParameter("mobno"));
		biodata.setDateofbirth(LocalDate.parse(request.getParameter("dob")));
		
		BiodataDao biodataDao=new BiodataDao();
		biodataDao.add(biodata);
		
		PrintWriter out = response.getWriter();
		out.write("<h1>Record added!</h1>");
	}

}
