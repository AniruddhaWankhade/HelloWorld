package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.POJO.User;
 
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String user=request.getParameter("usrname");
		String password=request.getParameter("password");
		
		User obj=new User();
		   
		   obj.setUsername(user);
		   obj.setPassword(password);
		   
		   boolean valid=obj.CheckUser();
		   
		   if(valid)
		   {
	       out.print("Welcome User!!!"); 
		   }
		   else
		   {
		    out.print("Invalid Username or Password!!!");    
		   }
		 
	}

}
