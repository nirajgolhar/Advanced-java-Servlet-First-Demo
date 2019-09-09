package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.*;

@SuppressWarnings({ "unused", "serial" })
public class Sevlet1 extends HttpServlet {
	
@Override
public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String FirstName = req.getParameter("Fname");
	String LastName = req.getParameter("Lname");
	String FullName = FirstName+LastName;
	// this is getWriter method for printing user input to browser.
	//first we created its object and then called it for printing our name.
	PrintWriter writer = resp.getWriter();
	writer.println("Full Name"+FullName);

}	
}
