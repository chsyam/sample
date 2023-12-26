package	ComplaintRegisterationServlet;

import java.io.IOException;
import java.net.URLEncoder;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Controller.CustomerController;
import Dao.CustomerDAO;
import Helper.ComplaintHelper;
import Model.Customer;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet
{
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
            // Retrieve form parameters
    	    
            String email = request.getParameter("email");
            String password = request.getParameter("password");
            CustomerController controller = new CustomerController();
            String message="";
            try
            {
            	ResultSet rs = controller.login(email, password);
            	
            	if(rs.next())
            	{
            		int cid = rs.getInt(1);
            		HttpSession session = request.getSession(true);
            		session.setAttribute("cid", cid);
            		session.setAttribute("loginMsg", true);
            		System.out.println(session.getAttribute("cid"));
            		response.sendRedirect("home.jsp");
            		
            	}
            	else{
            		message="Wrong Credentials";
    				response.sendRedirect("login.jsp?message="+URLEncoder.encode(message,"UTF-8"));
            	}
            }
            catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
            	request.getRequestDispatcher("loginError.jsp").forward(request,response);
			}   
    }
}
