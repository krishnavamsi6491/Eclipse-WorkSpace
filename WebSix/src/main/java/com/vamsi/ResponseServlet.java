package com.vamsi;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet(name = "RS",urlPatterns = "/response")
public class ResponseServlet extends GenericServlet {

	
	private static final long serialVersionUID = 1L;

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		System.out.println("BufferSize ->" +res.getBufferSize());
		System.out.println("CharacterEncoding ->" +res.getCharacterEncoding());
		System.out.println("contenttype ->" + res.getContentType());
		System.out.println("locale ->" + res.getLocale());
		
		res.setBufferSize(8192*2);
		System.out.println("new buffer size ->" + res.getBufferSize());
		System.out.println(res.isCommitted());
		//res.flushBuffer();
		
		System.out.println(res.isCommitted());
		
		res.setContentType("text/plain");
		
		PrintWriter out=res.getWriter();
		out.println("<h1>HelloWorld</h1>");
		
		//res.resetBuffer();
		res.reset();
		res.setContentType("text/html");
		///out.println("<h2>Hello Vamsi</h2>");
		
		ServletOutputStream sout = res.getOutputStream();
		sout.println("Hello Servlet");
	}

}
