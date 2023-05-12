package com.uniquedeveloper.registrration;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.Statement;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;



/**
 * Servlet implementation class Login
 */
@WebServlet("/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private LoginDao loginDao;

    public void init() {
        loginDao = new LoginDao();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    	PrintWriter out=response.getWriter();
        String uname = request.getParameter("username");
        String upsd = request.getParameter("password");
        LoginBean loginBean = new LoginBean();
        loginBean.setUsername(uname);
        loginBean.setPassword(upsd);
        ResultSet resultset;

        try {
            if (loginDao.validate(loginBean)) {
                //HttpSession session = request.getSession();
                // session.setAttribute("username",username);
            	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/library_management?useSSL=false","root","");
                PreparedStatement statement = connection.prepareStatement("select * from issue_book_details where student_name =?");
                statement.setString(1,uname);
                //String s= statement.executeQuery("select uname from student_users").toString();
                //PreparedStatement pst=connection.prepareStatement("select * from issue_book_details where student_name = ?");
                resultset =statement.executeQuery();
                
                if(!resultset.next())
                {
                	out.println("<h1>No data in record</h1>");
                }
                else
                {
                	
                //pst.setString(1,s);
                //response.sendRedirect("details1.jsp");
            	out.println("<html>\r\n"
            			+ "       <head>\r\n"
            			+ "       <title>Student details</title>\r\n"
            			+ "       </head>\r\n"
            			+ "       <body BGCOLOR=\"cyan\">\r\n"
            			+ "            <h1>Here are your details</h1><table BORDER=\"1\">\r\n"
            			+ "           <tr>\r\n"
            			+ "                \r\n"
            			+ "                 <th>id</th>\r\n"
            			+ "                 <th>book id</th>\r\n"
            			+ "                 <th>book name</th>\r\n"
            			+ "                 <th>student id</th>\r\n"
            			+ "                 <th>student name</th>\r\n"
            			+ "                  <th>issue_date</th>\r\n"
            			+ "                   <th>due_date</th>\r\n"
            			+ "                    <th>status</th>\r\n"
            			+ "                \r\n"
            			+ "          </tr>");
            	out.println("<tr>\r\n"
        		 		+ "                <td>"+resultset.getString(1)+"</td>\r\n"
        		 		+ "                <td> "+resultset.getString(2)+"</td>\r\n"
        		 		+ "                <td> "+resultset.getString(3)+"</td>\r\n"
        		 		+ "                <td> "+resultset.getString(4)+"</td>\r\n"
        		 		+ "                <td> "+resultset.getString(5)+"</td>\r\n"
        		 		+ "                <td> "+resultset.getString(6)+"</td>\r\n"
        		 		+ "                <td> "+resultset.getString(7)+"</td>\r\n"
        		 		+ "                <td> "+resultset.getString(8)+"</td>\r\n"
        		 		+ "              \r\n"
        		 		+ "          </tr>");
            	 while(resultset.next()) {
            		 out.println("<tr>\r\n"
            		 		+ "                <td>"+resultset.getString(1)+"</td>\r\n"
            		 		+ "                <td> "+resultset.getString(2)+"</td>\r\n"
            		 		+ "                <td> "+resultset.getString(3)+"</td>\r\n"
            		 		+ "                <td> "+resultset.getString(4)+"</td>\r\n"
            		 		+ "                <td> "+resultset.getString(5)+"</td>\r\n"
            		 		+ "                <td> "+resultset.getString(6)+"</td>\r\n"
            		 		+ "                <td> "+resultset.getString(7)+"</td>\r\n"
            		 		+ "                <td> "+resultset.getString(8)+"</td>\r\n"
            		 		+ "              \r\n"
            		 		+ "          </tr></table>");
            		 
            	 }
            	 out.println("<form action='"+"login.html"+"'><input type='"+"submit"+"' value='"+"Log out"+"'></form>");
            	 out.println("</body>\r\n"
            	 		+ "</html>");
            	 
            	 
            }
            	
            } else {
                HttpSession session = request.getSession();
               out.println("<h2>Wrong details</h2>");
                session.setAttribute("user", uname);
                response.sendRedirect("login.html");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}