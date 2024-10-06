package com.krishna;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.DispatcherType;
import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletInputStream;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class TestServlet extends GenericServlet {

	private static final long serialVersionUID = 1L;

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

		PrintWriter out = res.getWriter();
		out.println("<h1>HelloWorld</h1>");

		String encoding = req.getCharacterEncoding();
		System.out.println("encoding->" + encoding);

		int contentLength = req.getContentLength();
		System.out.println("contentlenght->" + contentLength);

		String contentType = req.getContentType();
		System.out.println("contentType->" + contentType);

		DispatcherType dispatcherType = req.getDispatcherType();
		System.out.println("Dispatcher type->" + dispatcherType);

		ServletInputStream inputStream = req.getInputStream();
		System.out.println(" inputStream ->" + inputStream);

		String localAddr = req.getLocalAddr();
		System.out.println("localAddr ->" + localAddr);
	}

}
