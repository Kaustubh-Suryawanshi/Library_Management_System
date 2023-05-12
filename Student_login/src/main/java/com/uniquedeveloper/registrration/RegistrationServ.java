package com.uniquedeveloper.registrration;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.lang.ClassNotFoundException;
import java.sql.*;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegistrationServlet
 */
@WebServlet("/register")
public class RegistrationServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
//  	
    	String uname=request.getParameter("name");
    	String uemail=request.getParameter("email");
    	String upsd=request.getParameter("pass");
    	
    	String umob=request.getParameter("contact");
    	PrintWriter out=response.getWriter();
    	RequestDispatcher dispatcher=null;
    	Connection con=null;
    	try
    	{
    		//String query="insert into issue_book_details(book_id,book_name,student_id,student_name,issue_date,due_date,status) values(?, ?, ? ,? )";
    		Class.forName("com.mysql.jdbc.Driver");
    		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library_management?useSSL=false","root","");
    		PreparedStatement p=con.prepareStatement("insert into student_users(uname,upsd,uemail,umob) values(?, ?, ? ,? )");
    		p.setString(1, uname);
    		p.setString(2, upsd);
    		p.setString(3, uemail);
    		p.setString(4, umob);
    		int rowCount=p.executeUpdate();
    		dispatcher=request.getRequestDispatcher("login.html");
    		
    		dispatcher.forward(request,response);
    	}
    	catch (Exception e)
    	{
    		e.printStackTrace();
    	}
    	finally
    	{
    		try
    		{
    			con.close();
    		}
    		catch(SQLException e)
    		{
    			e.printStackTrace();
    		}
    	}
    }


}
