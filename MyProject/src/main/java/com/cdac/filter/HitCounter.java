package com.cdac.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HitCounter
 */
@WebFilter("/*")
public class HitCounter extends HttpFilter {
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// place your code here
		ServletContext sCtx = request.getServletContext();
		Integer hitCounter = (Integer) sCtx.getAttribute("hitCounter");
		if(hitCounter == null)
			hitCounter = 0;
		hitCounter ++;
		sCtx.setAttribute("hitCounter", hitCounter);
		// pass the request along the filter chain
		chain.doFilter(request, response);
	}

}
