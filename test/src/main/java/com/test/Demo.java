package com.test;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Demo extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public Demo() {
       System.out.println("In demo constructor");
        
    }

	@Override
	public void destroy() {
		System.out.println("In destroy Method");
	}
	
	@Override
	public void init() {
		System.out.println(" in init Method");
	}
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("in service method");
		PrintWriter out = response.getWriter();
		out.print("<h1>This is the first Servlet.....</h1>");
	}

}
