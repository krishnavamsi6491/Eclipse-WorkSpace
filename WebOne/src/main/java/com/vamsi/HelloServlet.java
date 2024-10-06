package com.vamsi;

import java.io.IOException;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class HelloServlet implements Servlet {
	 
	 ServletConfig sc;
	
	
	@Override
	public void init(ServletConfig sc) throws ServletException {
		System.out.println("HelloServlet ServletConfig");
            this.sc=sc;
	}


	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("Helloservlet Service");

	}

	@Override
	public void destroy() {
	 System.out.println("HelloServlet destroy()");

	}

	@Override
	public ServletConfig getServletConfig() {
		System.out.println("Helloservlet getServletConfig");
		return sc;
	}

	@Override
	public String getServletInfo() {
		System.out.println("HelloServlet getServletInfo");
		return "HelloServlet";
	}

	

}
