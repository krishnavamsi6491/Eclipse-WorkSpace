package com.vamsi;

import java.io.IOException;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet(name="ts",urlPatterns = "/test")
public class TestServlet extends GenericServlet {


	private static final long serialVersionUID = 1L;

	
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		
		  String Username =req.getParameter("username");
		  String Password =req.getParameter("password");
		   
		   System.out.println(Username + "->" + Password);

	}

}
