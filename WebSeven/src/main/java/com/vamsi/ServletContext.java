package com.vamsi;

import java.io.IOException;
import java.util.Enumeration;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet(name="SC",urlPatterns = "/context")
public class ServletContext extends GenericServlet {


	private static final long serialVersionUID = 1L;
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
	
		
		 jakarta.servlet.ServletContext sc = getServletContext();
		 
		 String orgValue = sc.getInitParameter("organization");
		 System.out.println(orgValue);
		 
		 String locValue= sc.getInitParameter("location");
		 System.out.println(locValue);
		 
		 Enumeration<String> contextparam = sc.getInitParameterNames();
		 while(contextparam.hasMoreElements()) {
			 System.out.println(contextparam.nextElement());
		 }
	}

}
