package com.geetha;

import java.io.IOException;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet(name = "ls",urlPatterns = "/login")
public class LoginServlet extends GenericServlet {

	private static final long serialVersionUID = 1L;

	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		    String username = req.getParameter("username");
		    String password = req.getParameter("password");
		    
		    System.out.println(username + " -> " + password);
		    

	}

}
